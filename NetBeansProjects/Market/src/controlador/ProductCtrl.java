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
import java.io.File;
import java.io.IOException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import modelo.Categoria;
import connection.IProductoDAO;
import vista.PanelProducto;
import connection.ICategoriaDAO;
import connection.IProveedorDAO;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import modelo.Producto;
import modelo.Proveedor;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.TableColumn;

public final class ProductCtrl implements FocusListener, KeyListener, MouseListener,
        ActionListener {

    PanelProducto viewPdt = new PanelProducto();
    ICategoriaDAO sqlc = new ICategoriaDAO();
    IProveedorDAO sqlp = new IProveedorDAO();
    IProductoDAO sqlPt = new IProductoDAO();

    public ProductCtrl() {
        tblModel("", viewPdt.tblProd);
        spinnerModel();
        viewPdt.btnRegistrar.addActionListener(this);
        viewPdt.btnModificar.addActionListener(this);
        viewPdt.btnCtg.addActionListener(this);
        viewPdt.btnPvdr.addActionListener(this);
        viewPdt.txtNombre.addActionListener(this);
        viewPdt.txtPrecio.addActionListener(this);
        viewPdt.cbCatgr.addActionListener(this);
        viewPdt.cbProdr.addActionListener(this);
        viewPdt.lblImagen.addMouseListener(this);
        viewPdt.txtPrecio.addKeyListener(this);
        viewPdt.txtBuscar.addKeyListener(this);
        viewPdt.tblProd.addMouseListener(this);
        viewPdt.txtNombre.addFocusListener(this);
        viewPdt.txtPrecio.addFocusListener(this);
        viewPdt.lblImagen.addFocusListener(this);
        cbCatgrModel(viewPdt.cbCatgr);
        cbProdrModel(viewPdt.cbProdr);
    }

    void spinnerModel() {
        SpinnerNumberModel model = new SpinnerNumberModel();
        model.setMinimum(0);
        viewPdt.spnStock.setModel(model);
        JFormattedTextField tf = ((JSpinner.DefaultEditor) viewPdt.spnStock.getEditor()).getTextField();
        tf.setEditable(false);
    }

    void cbProdrModel(JComboBox cb) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        model.addElement("Seleccionar");
        ArrayList<Proveedor> pvrs = sqlp.registros();
        if (!pvrs.isEmpty()) {
            for (Proveedor r : pvrs) {
                model.addElement(r.getNombre());
            }
        }
        cb.setModel(model);
    }

    void cbCatgrModel(JComboBox cb) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        model.addElement("Seleccionar");
        ArrayList<Categoria> ctgs = sqlc.registros();
        if (!ctgs.isEmpty()) {
            for (Categoria r : ctgs) {
                model.addElement(r.getTitulo());
            }
        }
        cb.setModel(model);
    }

    private void tblModel(String search, JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 1 || column == 2 || column == 3 || column == 5
                        || column == 6 || column == 7;
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
                    fila[4] = new JLabel(mIcono);
                } catch (IOException ex) {
                    System.out.println("No hay imagen");
                }
                fila[5] = pdt.getDescripcion();
                fila[6] = pdt.getCategoria_id();
                fila[7] = pdt.getProveedor_id();
                modelo.addRow(fila);
            }

            JTextField txtPrecio = new JTextField();
            TableColumn col2 = tabla.getColumnModel().getColumn(2);
            col2.setCellEditor(new DefaultCellEditor(txtPrecio));
            txtPrecio.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    char c = e.getKeyChar();
                    if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)
                            && (c != '.')) {
                        e.consume();
                    } else if (c == '.' && txtPrecio.getText().contains(".")) {
                        e.consume();
                    }
                }
            });

            JTextField txtStock = new JTextField();
            TableColumn clo3 = tabla.getColumnModel().getColumn(3);
            clo3.setCellEditor(new DefaultCellEditor(txtStock));
            txtStock.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    char c = e.getKeyChar();
                    if (!Character.isDigit(c) && e.getKeyChar() != KeyEvent.VK_BACK_SPACE) {
                        e.consume();
                    }
                }
            });

            JComboBox cbPdt = new JComboBox();
            cbProdrModel(cbPdt);
            TableColumn col7 = tabla.getColumnModel().getColumn(7);
            col7.setCellEditor(new DefaultCellEditor(cbPdt));

            JComboBox cbCtg = new JComboBox();
            cbCatgrModel(cbCtg);
            TableColumn col6 = tabla.getColumnModel().getColumn(6);
            col6.setCellEditor(new DefaultCellEditor(cbCtg));

            ListSelectionModel mod = tabla.getSelectionModel();
            mod.addListSelectionListener((ListSelectionEvent e) -> {
                if (tabla.getSelectedColumn() == 4) {
                    JLabel lbl = new JLabel();
                    File imagen;
                    FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG", "jpg", "png");
                    JFileChooser fc = new JFileChooser();
                    fc.setFileFilter(filtro);
                    fc.setMultiSelectionEnabled(false);
                    fc.setDialogTitle("Busacar imagen");
                    fc.setVisible(true);
                    if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                        imagen = fc.getSelectedFile();
                        ImageIcon icon = new ImageIcon(imagen.toString());
                        Icon icono = new ImageIcon(icon.getImage().
                                getScaledInstance(60, 60, 60));
                        int row = mod.getMinSelectionIndex();
                        tabla.setValueAt(new JLabel(icono), row, 4);
                    }
                }
            });

            viewPdt.tblProd.setDefaultRenderer(Object.class, new RenderTabla());
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
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
            if ((viewPdt.cbCatgr.getSelectedItem() == null)) {
                viewPdt.lblCtg.setText("Campo Obligatorio!!!");
            } else {
                viewPdt.lblCtg.setText(null);
            }
        } else if (e.getSource() == viewPdt.cbProdr) {
            if ((viewPdt.cbProdr.getSelectedItem() == null)) {
                viewPdt.lblPvdr.setText("Campo Obligatorio!!!");
            } else {
                viewPdt.lblPvdr.setText(null);
            }
        } else if (e.getSource() == viewPdt.lblImagen) {
            if (viewPdt.lblImagen.getIcon() == null) {
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
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == viewPdt.lblImagen) {
            File imagen;
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
        if (e.getSource() == viewPdt.btnRegistrar) {
            if ("".equals(viewPdt.txtNombre.getText().trim())
                    || "".equals(viewPdt.txtPrecio.getText())
                    || (viewPdt.cbCatgr.getSelectedIndex() == 0)
                    || (viewPdt.cbProdr.getSelectedIndex() == 0)
                    || (viewPdt.lblImagen.getIcon() == null)) {
                JOptionPane.showMessageDialog(null, "Llenar campos Obligatorios");
                cautionMsg();
            } else if (sqlPt.existPdt(viewPdt.txtNombre.getText())) {
                JOptionPane.showMessageDialog(null, "Producto existene.");
            } else {
                Categoria cat = sqlc.idCtg(viewPdt.cbCatgr.getSelectedItem().toString());
                Proveedor pdv = sqlp.idPvd(viewPdt.cbProdr.getSelectedItem().toString());
                Producto prodt = new Producto(viewPdt.txtNombre.getText(),
                        Double.parseDouble(viewPdt.txtPrecio.getText()),
                        Integer.parseInt(viewPdt.spnStock.getValue().toString()),
                        toBytea(viewPdt.lblImagen.getIcon()),
                        (viewPdt.tfDesc.getText() == null) ? "" : viewPdt.tfDesc.getText(),
                        pdv.getProveedor_id(), cat.getCategoria_id());

                if (sqlPt.insert(prodt)) {
                    tblModel("", viewPdt.tblProd);
                    clean();
                    JOptionPane.showMessageDialog(null, "Producto ingresado");
                } else {
                    JOptionPane.showMessageDialog(null, "Verificar los campos");
                }
            }
        } else if (e.getSource() == viewPdt.btnModificar) {
            int row = viewPdt.tblProd.getSelectedRow();
            String id = viewPdt.tblProd.getValueAt(row, 0).toString();
            String nombre = viewPdt.tblProd.getValueAt(row, 1).toString();
            String precio = viewPdt.tblProd.getValueAt(row, 2).toString();
            String stock = viewPdt.tblProd.getValueAt(row, 3).toString();
            Icon imag = ((JLabel) viewPdt.tblProd.getValueAt(row, 4)).getIcon();
            String desc = viewPdt.tblProd.getValueAt(row, 5).toString();
            String cbC = viewPdt.tblProd.getValueAt(row, 6).toString();
            String cbP = viewPdt.tblProd.getValueAt(row, 7).toString();

            if ("".equals(nombre)
                    || "Seleccionar".equals(cbC)
                    || "Seleccionar".equals(cbC)
                    || "".equals(precio)
                    || "".equals(stock)
                    || "".equals(cbC)
                    || "".equals(cbP)) {
                JOptionPane.showMessageDialog(null, "Verificar los campos");
                tblModel("", viewPdt.tblProd);
            } else {
                Categoria cat = sqlc.idCtg(cbC);
                Proveedor pdv = sqlp.idPvd(cbP);
                Producto prodt = new Producto(id, nombre,
                        Double.parseDouble(precio),
                        Integer.parseInt(stock),
                        toBytea(imag),
                        (desc == null) ? "" : desc,
                        pdv.getProveedor_id(), cat.getCategoria_id());
                if (sqlPt.update(prodt)) {
                    tblModel("", viewPdt.tblProd);
                    clean();
                    JOptionPane.showMessageDialog(null, "Producto modificado");
                } else {
                    JOptionPane.showMessageDialog(null, "Verificar los campos");
                }
            }

        } else if (e.getSource() == viewPdt.btnCtg) {
            CategoryCtrl frd = new CategoryCtrl();
        } else if (e.getSource() == viewPdt.btnPvdr) {
            ProviderCtrl asd = new ProviderCtrl();
        }
    }

    void cautionMsg() {
        if ("".equals(viewPdt.txtNombre.getText().trim())) {
            viewPdt.lblNom.setText("Campo Obligatorio!!!");
            viewPdt.txtNombre.setBackground(Color.red);
        } else {
            viewPdt.lblNom.setText(null);
        }
        if ("".equals(viewPdt.txtPrecio.getText())) {
            viewPdt.lblPrecio.setText("Campo obligatorio!!!");
        } else {
            viewPdt.lblPrecio.setText(null);
        }
        if ((viewPdt.cbCatgr.getSelectedIndex() == 0)) {
            viewPdt.lblCtg.setText("Campo Obligatorio!!!");
        } else {
            viewPdt.lblCtg.setText(null);
        }
        if ((viewPdt.cbProdr.getSelectedIndex() == 0)) {
            viewPdt.lblPvdr.setText("Campo Obligatorio!!!");
        } else {
            viewPdt.lblPvdr.setText(null);
        }
        if (viewPdt.lblImagen.getIcon() == null) {
            viewPdt.lblImg.setText("Campo Obligatorio!!!");
        } else {
            viewPdt.lblImg.setText(null);
        }
    }

    void clean() {
        viewPdt.txtNombre.setText(null);
        viewPdt.txtPrecio.setText(null);
        viewPdt.tfDesc.setText(null);
        viewPdt.cbProdr.setSelectedIndex(0);
        viewPdt.cbCatgr.setSelectedIndex(0);
        viewPdt.lblImagen.setIcon(null);
        viewPdt.lblImagen.setText(null);
    }

    byte[] toBytea(Icon icon) {
        BufferedImage img = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = img.createGraphics();
        icon.paintIcon(null, g2d, 0, 0);
        g2d.dispose();
        try ( ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            ImageOutputStream ios = ImageIO.createImageOutputStream(baos);
            try {
                ImageIO.write(img, "png", ios);
            } finally {
                ios.close();
            }
            return baos.toByteArray();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
