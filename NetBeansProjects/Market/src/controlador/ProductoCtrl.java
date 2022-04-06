package controlador;

import java.awt.Component;
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
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import modelo.Categoria;
import modelo.IProductoDAO;
import vista.PanelProducto;
import modelo.ICategoriaDAO;
import modelo.IProveedorDAO;
import modelo.Producto;
import modelo.Proveedor;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductoCtrl implements FocusListener, KeyListener, MouseListener, ActionListener {

    File imagen;
    PanelProducto viewPdt = new PanelProducto();

    public ProductoCtrl() {
        tblModel("");
        cbCatgrModel();
        cbProdrModel();
        spinnerModel();
        viewPdt.btnRegistrar.addActionListener(this);
        viewPdt.lblImagen.addMouseListener(this);
        viewPdt.txtPrecio.addKeyListener(this);
        viewPdt.txtBuscar.addKeyListener(this);
        System.out.println("ALERTAAAAA!!!!!!");
    }

    private void spinnerModel() {
        SpinnerNumberModel model = new SpinnerNumberModel();
        model.setMinimum(0);
        viewPdt.spnStock.setModel(model);
    }

    private void cbProdrModel() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        Proveedor pvr = new Proveedor("1", "Seleccionar", "", "");
        model.addElement(pvr);
        IProveedorDAO c = new IProveedorDAO();
        if (!c.registros().isEmpty()) {
            for (Proveedor r : c.registros()) {
                model.addElement(r);
            }
        }
        viewPdt.cbProdr.setModel(model);
    }

    private void cbCatgrModel() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        Categoria ctg = new Categoria("1", "Seleccionar");
        model.addElement(ctg);
        ICategoriaDAO c = new ICategoriaDAO();
        if (!c.registros().isEmpty()) {
            for (Categoria r : c.registros()) {
                model.addElement(r);
            }
        }
        viewPdt.cbCatgr.setModel(model);
        
    }

    private void tblModel(String search) {
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public Class getColumnClass(int column){
                return switch (column) {
                    case 0 -> Object.class;
                    case 1 -> Object.class;
                    case 2 -> Object.class;
                    case 3 -> Object.class;
                    case 4 -> ImageIcon.class;
                    case 5 -> Object.class;
                    case 6 -> Object.class;
                    default -> Object.class;
                };
            }
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 1 || column == 2 || column == 3 || column == 4 || column == 5
                        || column == 6;
            }
        };
        viewPdt.tblProd.setModel(modelo);
        viewPdt.tblProd.setRowHeight(70);
        
        modelo.addColumn("ID Producto");
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        modelo.addColumn("Imagen");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Categoria");
        modelo.addColumn("Proveedor");
        IProductoDAO dao = new IProductoDAO();
        ResultSet registros = dao.buscar(search);
        try {
            Object[] fila = new Object[8];
            while(registros.next()) {
                fila[0] = registros.getString(1);
                fila[1] = registros.getString(2);
                fila[2] = registros.getDouble(3);
                fila[3] = registros.getInt(4);
                try {
                    byte[] im = registros.getBytes(5);
                    BufferedImage bufferedImage = null;
                    InputStream inputStream = new ByteArrayInputStream(im);
                    bufferedImage = ImageIO.read(inputStream);
                    ImageIcon mIcono = new ImageIcon(bufferedImage.getScaledInstance(60, 60, 0));
                    fila[4] = mIcono;
                } catch (IOException ex) {
                    System.out.println("No hya imagen");
                }
                fila[5] = registros.getString(6);
                fila[6] = registros.getString(7);
                fila[7] = registros.getString(8);
                modelo.addRow(fila);
            }           
        } catch (SQLException ex) {
            Logger.getLogger(ProductoCtrl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public class RenderImagen extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
            boolean hasFocus, int row, int column) {
        if (value instanceof JLabel) {
            JLabel lbl = (JLabel) value;
            return lbl;
        }
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
    
}

    public byte[] getImagen(File imagen) {
        byte[] fileContent;
        try {
            fileContent = Files.readAllBytes(imagen.toPath());
            return fileContent;
        } catch (IOException ex) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }


    @Override
    public void focusGained(FocusEvent e) {
    }

    @Override
    public void focusLost(FocusEvent e) {

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
            tblModel(viewPdt.txtBuscar.getText());
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
        if (e.getSource() == viewPdt.btnRegistrar) {
            Proveedor pvd = (Proveedor) viewPdt.cbProdr.getSelectedItem();
            Categoria ctg = (Categoria) viewPdt.cbCatgr.getSelectedItem();
            Producto prodt = new Producto(viewPdt.txtNombre.getText(),
                    Double.parseDouble(viewPdt.txtPrecio.getText()),
                    Integer.parseInt(viewPdt.spnStock.getValue().toString()),
                    imagen, viewPdt.tfDesc.getText(),
                    pvd.getProveedor_id(), ctg.getCategoria_id());
            IProductoDAO p = new IProductoDAO();
            if (p.insert(prodt)) {
                tblModel("");
                JOptionPane.showMessageDialog(null, "Producto ingresado");
            }
        }
    }

}

//class test {
//    public static void main(String[] args) {
//        ProductoCtrl s = new ProductoCtrl();
//    }
//}

