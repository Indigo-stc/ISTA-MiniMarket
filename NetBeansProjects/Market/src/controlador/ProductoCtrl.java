package controlador;

import java.awt.Image;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import modelo.Categoria;
import modelo.IProductoDAO;
import vista.PanelProducto;
import modelo.ICategoriaDAO;
import modelo.IProveedorDAO;
import modelo.Producto;
import modelo.Proveedor;

public class ProductoCtrl implements FocusListener, KeyListener, MouseListener {

    File imagen;
    PanelProducto viewPdt = new PanelProducto();

    public ProductoCtrl() {
        cbCatgrModel();
        cbProdrModel();
        spinnerModel();
        viewPdt.btnRegistrar.addActionListener((e) -> {
            if (e.getSource() == viewPdt.btnRegistrar) {
                Producto prodt = new Producto(viewPdt.txtNombre.getText(),
                        Double.parseDouble(viewPdt.txtPrecio.getText()),
                        Integer.parseInt(viewPdt.spnStock.getValue().toString()),
                        getImagen(imagen), viewPdt.tfDesc.getText(),
                        viewPdt.cbProdr.getSelectedItem().toString(),
                        viewPdt.cbCatgr.getSelectedItem().toString());
                IProductoDAO p = new IProductoDAO();
                if (p.insert(prodt)) {
                    JOptionPane.showMessageDialog(null, "Producto ingresado");
                }
            }
        });
        viewPdt.lblImagen.addMouseListener(this);
        viewPdt.txtPrecio.addKeyListener(this);
    }

    private void spinnerModel() {
        SpinnerNumberModel model = new SpinnerNumberModel();
        model.setMinimum(0);
        model.setStepSize(500);
        viewPdt.spnStock.setModel(model);
    }

    private void cbProdrModel() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        Proveedor pvr = new Proveedor("1", "Seleccionar", "", "");
        model.addElement(pvr.getNombre());
        IProveedorDAO c = new IProveedorDAO();
        if (!c.registros().isEmpty()) {
            for (Proveedor r : c.registros()) {
                model.addElement(r.getNombre());
                System.out.println(r.getNombre());
            }
        }
        viewPdt.cbProdr.setModel(model);
    }

    private void cbCatgrModel() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        Categoria ctg = new Categoria("1", "Seleccionar");
        model.addElement(ctg.getTitulo());
        ICategoriaDAO c = new ICategoriaDAO();
        if (!c.registros().isEmpty()) {
            for (Categoria r : c.registros()) {
                model.addElement(r.getTitulo());
            }
        }
        viewPdt.cbCatgr.setModel(model);
    }

    private void tblModel(String search) {
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 2 || column == 3 || column == 4 || column == 5
                        || column == 6 || column == 7 || column == 8;
            }
        };

        modelo.addColumn("ID Producto");
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        modelo.addColumn("imagen");
        modelo.addColumn("descripcion");
        modelo.addColumn("Categoria");
        modelo.addColumn("Proveedor");

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
        char c = e.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)
                && (c != '.')) {
            e.consume();
        }
        if (c == '.' && viewPdt.txtPrecio.getText().contains(".")) {
            e.consume();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
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

}

//class test {
//    public static void main(String[] args) {
//        ProductoCtrl s = new ProductoCtrl();
//    }
//}

