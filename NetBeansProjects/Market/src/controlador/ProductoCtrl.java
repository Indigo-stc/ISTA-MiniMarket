package controlador;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import modelo.Categoria;
import conection.IProductoDAO;
import vista.PanelProducto;
import conection.ICategoriaDAO;
import conection.IProveedorDAO;
import java.awt.Component;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import modelo.Producto;
import modelo.Proveedor;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;

public class ProductoCtrl implements FocusListener, KeyListener, MouseListener,
        ActionListener {

    File imagen;
    PanelProducto viewPdt = new PanelProducto();
    String c, p;

    public ProductoCtrl() {
        tblModel("", viewPdt.tblProd);
        spinnerModel();
        viewPdt.btnRegistrar.addActionListener(this);
        viewPdt.txtNombre.addActionListener(this);
        viewPdt.txtPrecio.addActionListener(this);
        viewPdt.cbCatgr.addActionListener(this);
        viewPdt.cbProdr.addActionListener(this);
        viewPdt.lblImagen.addMouseListener(this);
        viewPdt.txtPrecio.addKeyListener(this);
        viewPdt.txtBuscar.addKeyListener(this);
        viewPdt.tblProd.addKeyListener(this);
        viewPdt.txtNombre.addFocusListener(this);
        viewPdt.txtPrecio.addFocusListener(this);
        viewPdt.cbCatgr.addFocusListener(this);
        viewPdt.cbProdr.addFocusListener(this);
        viewPdt.lblImagen.addFocusListener(this);
        viewPdt.cbCatgr.addFocusListener(this);
        viewPdt.cbProdr.addFocusListener(this);
    }

    private void spinnerModel() {
        SpinnerNumberModel model = new SpinnerNumberModel();
        model.setMinimum(0);
        viewPdt.spnStock.setModel(model);
        JFormattedTextField tf = ((JSpinner.DefaultEditor) viewPdt.spnStock.getEditor()).getTextField();
        tf.setEditable(false);
    }

    private void cbProdrModel(JComboBox cb) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        IProveedorDAO c = new IProveedorDAO();
        ArrayList<Proveedor> pvrs = c.registros();
        if (!pvrs.isEmpty()) {
            for (Proveedor r : pvrs) {
                model.addElement(r);
            }
        }
        cb.setModel(model);
    }

    private void cbCatgrModel(JComboBox cb) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        ICategoriaDAO c = new ICategoriaDAO();
        ArrayList<Categoria> ctgs = c.registros();
        if (!ctgs.isEmpty()) {
            for (Categoria r : ctgs) {
                model.addElement(r);
            }
        }
        cb.setModel(model);
    }

    private void tblModel(String search, JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 1 || column == 2 || column == 3 || column == 5
                        || column == 6 || column == 7 || column == 4;
            }
        };
        tabla.setModel(modelo);
        tabla.setRowHeight(70);

        modelo.addColumn("ID Producto");
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        modelo.addColumn("Imagen");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Categoria");
        modelo.addColumn("Proveedor");

        IProductoDAO dao = new IProductoDAO();
        ArrayList<Producto> registros = dao.buscar(search);
        if (!registros.isEmpty()) {
            Object[] fila = new Object[8];
            JLabel lbl = new JLabel();
            for (Producto pdt : registros) {
                fila[0] = pdt.getProducto_id();
                fila[1] = pdt.getNombre();
                fila[2] = pdt.getPrecio();
                fila[3] = pdt.getStock();
                try {
                    byte[] im = pdt.getImagen();
                    BufferedImage bufferedImage = null;
                    InputStream inputStream = new ByteArrayInputStream(im);
                    bufferedImage = ImageIO.read(inputStream);
                    ImageIcon mIcono = new ImageIcon(bufferedImage.getScaledInstance(60, 60, 60));
                    Icon icono = new ImageIcon(mIcono.getImage().
                            getScaledInstance(60, 60, Image.SCALE_DEFAULT));

                    byte[] ima = pdt.getImagen();
                    Image img = Toolkit.getDefaultToolkit().createImage(ima);
                    ImageIcon icone = new ImageIcon(img);
                    lbl.setIcon(icone);
                    fila[4] = lbl;
                } catch (IOException ex) {
                    System.out.println("No hay imagen");
                }
                fila[5] = pdt.getDescripcion();
                fila[6] = pdt.getCategoria_id();
                fila[7] = pdt.getProveedor_id();
                modelo.addRow(fila);
            }

            MouseListener mause = new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    
                    
                    
                    FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG", "jpg", "png");
                    JFileChooser fc = new JFileChooser();
                    fc.setFileFilter(filtro);
                    fc.setMultiSelectionEnabled(false);
                    fc.setDialogTitle("Busacar imagen");
                    fc.setVisible(true);
                    if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                        imagen = fc.getSelectedFile();
                        try {
                            ImageIcon icon = new ImageIcon(imagen.toString());
                            Icon icono = new ImageIcon(icon.getImage().
                                    getScaledInstance(lbl.getWidth(), lbl.getHeight(),
                                            Image.SCALE_DEFAULT));
                            lbl.setText(null);
                            lbl.setIcon(icono);
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "Error abriendo la imagen " + ex);
                        }
                    }
                    System.out.println("adios");
                }

                @Override
                public void mousePressed(MouseEvent e) {}

                @Override
                public void mouseReleased(MouseEvent e) {}

                @Override
                public void mouseEntered(MouseEvent e) {}

                @Override
                public void mouseExited(MouseEvent e) {}
            };
            lbl.addMouseListener(mause);

            JComboBox cbPdt = new JComboBox();
            cbProdrModel(cbPdt);
            TableColumn col7 = tabla.getColumnModel().getColumn(7);
            col7.setCellEditor(new DefaultCellEditor(cbPdt));
            cbPdt.addActionListener((e) -> {
                if (e.getSource() == cbPdt) {
                    Proveedor pvdr = (Proveedor) cbPdt.getSelectedItem();
                    p = pvdr.getProveedor_id();
                    System.out.println(p);
                }
            });

            JComboBox cbCtg = new JComboBox();
            cbCatgrModel(cbCtg);
            TableColumn col6 = tabla.getColumnModel().getColumn(6);
            col6.setCellEditor(new DefaultCellEditor(cbCtg));
            cbCtg.addActionListener((e) -> {
                if (e.getSource() == cbCtg) {
                    Categoria ctg = (Categoria) cbCtg.getSelectedItem();
                    c = ctg.getCategoria_id();
                    System.out.println(c);
                }
            });

            viewPdt.tblProd.setDefaultRenderer(Object.class, new Render());
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
        if (e.getSource() == viewPdt.cbCatgr) {
            cbCatgrModel(viewPdt.cbCatgr);
        } else if (e.getSource() == viewPdt.cbProdr) {
            cbProdrModel(viewPdt.cbProdr);
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (e.getSource() == viewPdt.txtNombre) {
            if ("".equals(viewPdt.txtNombre.getText().trim())) {
                viewPdt.lblNom.setText("Campo Obligatorio!!!");
            } else {
                viewPdt.lblNom.setText(null);
            }
        } else if (e.getSource() == viewPdt.txtPrecio) {
            if ("".equals(viewPdt.txtPrecio.getText())) {
                viewPdt.lblPrecio.setText("Campo obligatorio!!!");
            } else {
                viewPdt.lblPrecio.setText(null);
            }
        } else if (e.getSource() == viewPdt.spnStock) {
//            if (Integer.parseInt(viewPdt.spnStock.getValue().toString()) == 0) {
//                viewPdt.lblPrecio.setText("Cantidad !!!");
//            } 
        } else if (e.getSource() == viewPdt.cbCatgr) {
            Categoria ctg = (Categoria) viewPdt.cbCatgr.getSelectedItem();
            if ((viewPdt.cbCatgr.getSelectedItem() == null)) {
                viewPdt.lblCtg.setText("Campo Obligatorio!!!");
            } else {
                viewPdt.lblCtg.setText(null);
            }
        } else if (e.getSource() == viewPdt.cbProdr) {
            Proveedor pvdr = (Proveedor) viewPdt.cbProdr.getSelectedItem();
            if ((viewPdt.cbProdr.getSelectedItem() == null)) {
                viewPdt.lblPvdr.setText("Campo Obligatorio!!!");
            } else {
                viewPdt.lblPvdr.setText(null);
            }
        } else if (e.getSource() == viewPdt.lblImagen) {
            if (viewPdt.lblImagen == null) {
                viewPdt.lblImg.setText("Campo Obligatorio!!!");
            } else {
                viewPdt.lblImg.setText(null);
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getSource() == viewPdt.txtPrecio) {
            char c = e.getKeyChar();
            if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)
                    && (c != '.')) {
                e.consume();
            }
            if (c == '.' && viewPdt.txtPrecio.getText().contains(".")) {
                e.consume();
            }
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == viewPdt.txtBuscar) {
            tblModel(viewPdt.txtBuscar.getText(), viewPdt.tblProd);
        } else if (e.getSource() == viewPdt.tblProd) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                String id = viewPdt.tblProd.getValueAt(viewPdt.tblProd.getSelectedRow(), 0).toString();
                String nombre = viewPdt.tblProd.getValueAt(viewPdt.tblProd.getSelectedRow(), 1).toString();
                Double precio = (Double) viewPdt.tblProd.getValueAt(viewPdt.tblProd.getSelectedRow(), 2);
                int stock = (Integer) viewPdt.tblProd.getValueAt(viewPdt.tblProd.getSelectedRow(), 3);
                Icon imag = ((JLabel) viewPdt.tblProd.getValueAt(viewPdt.tblProd.getSelectedRow(), 4)).getIcon();
                String desc = viewPdt.tblProd.getValueAt(viewPdt.tblProd.getSelectedRow(), 5).toString();
                if (!"".equals(nombre.trim())
                        && !"".equals(precio)
                        && !(c == null)
                        && !(p == null)
                        && !(imag == null)) {
                    Producto prodt = new Producto(viewPdt.txtNombre.getText(),
                            Double.parseDouble(viewPdt.txtPrecio.getText()),
                            Integer.parseInt(viewPdt.spnStock.getValue().toString()),
                            convertir(imagen),
                            (viewPdt.tfDesc.getText() == null) ? "" : viewPdt.tfDesc.getText(),
                            c, p);
                    IProductoDAO p = new IProductoDAO();
                    if (p.update(prodt)) {
                        tblModel("", viewPdt.tblProd);
                        JOptionPane.showMessageDialog(null, "Producto Modificado");
                    } else {
                        JOptionPane.showMessageDialog(null, "Verificar los campos");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Llenar campos Obligatorios");
                }
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == viewPdt.lblImagen) {
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG", "jpg", "png");
            JFileChooser fc = new JFileChooser();
            fc.setFileFilter(filtro);
            fc.setMultiSelectionEnabled(false);
            fc.setDialogTitle("Busacar imagen");
            if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                imagen = fc.getSelectedFile();
                try {
                    ImageIcon icon = new ImageIcon(imagen.toString());
                    Icon icono = new ImageIcon(icon.getImage().
                            getScaledInstance(viewPdt.lblImagen.getWidth(), viewPdt.lblImagen.getHeight(),
                                    Image.SCALE_DEFAULT));
                    viewPdt.lblImagen.setText(null);
                    viewPdt.lblImagen.setIcon(icono);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error abriendo la imagen " + ex);
                }
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Categoria ctg = (Categoria) viewPdt.cbCatgr.getSelectedItem();
        Proveedor pvdr = (Proveedor) viewPdt.cbProdr.getSelectedItem();
        if (e.getSource() == viewPdt.btnRegistrar) {
            if (!"".equals(viewPdt.txtNombre.getText().trim())
                    && !"".equals(viewPdt.txtPrecio.getText())
                    && !(viewPdt.cbCatgr.getSelectedItem() == null)
                    && !(viewPdt.cbProdr.getSelectedItem() == null)
                    && !(viewPdt.lblImagen == null)) {
                Producto prodt = new Producto(viewPdt.txtNombre.getText(),
                        Double.parseDouble(viewPdt.txtPrecio.getText()),
                        Integer.parseInt(viewPdt.spnStock.getValue().toString()),
                        convertir(imagen),
                        (viewPdt.tfDesc.getText() == null) ? "" : viewPdt.tfDesc.getText(),
                        pvdr.getProveedor_id(), ctg.getCategoria_id());
                IProductoDAO p = new IProductoDAO();
                if (p.insert(prodt)) {
                    tblModel("", viewPdt.tblProd);
                    JOptionPane.showMessageDialog(null, "Producto ingresado");
                } else {
                    JOptionPane.showMessageDialog(null, "Verificar los campos");
                }
            } else {
                if ("".equals(viewPdt.txtNombre.getText().trim())) {
                    viewPdt.lblNom.setText("Campo Obligatorio!!!");
                } else {
                    viewPdt.lblNom.setText(null);
                }
                if ("".equals(viewPdt.txtPrecio.getText())) {
                    viewPdt.lblPrecio.setText("Campo obligatorio!!!");
                } else {
                    viewPdt.lblPrecio.setText(null);
                }
                if ((viewPdt.cbCatgr.getSelectedItem() == null)) {
                    viewPdt.lblCtg.setText("Campo Obligatorio!!!");
                } else {
                    viewPdt.lblCtg.setText(null);
                }
                if ((viewPdt.cbProdr.getSelectedItem() == null)) {
                    viewPdt.lblPvdr.setText("Campo Obligatorio!!!");
                } else {
                    viewPdt.lblPvdr.setText(null);
                }
                if (viewPdt.lblImagen == null) {
                    viewPdt.lblImg.setText("Campo Obligatorio!!!");
                } else {
                    viewPdt.lblImg.setText(null);
                }
                JOptionPane.showMessageDialog(null, "Llenar campos Obligatorios");
            }
        }
    }

    public byte[] convertir(File imagen) {
        FileInputStream fl;
        try {
            fl = new FileInputStream(imagen);
            byte[] arr = new byte[(int) imagen.length()];
            fl.read(arr);
            fl.close();
            return arr;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProductoCtrl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException e) {
            System.out.println("Error con la imagen");
        }
        return null;
    }
}

class Render extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        switch (value) {
            case JComboBox cb -> {
                return cb;
            }
            case JLabel lbl -> {
                return lbl;
            }
            case default -> {
            }
        }
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}

//class test {
//    public static void main(String[] args) {
//        ProductoCtrl s = new ProductoCtrl();
//    }
//}

