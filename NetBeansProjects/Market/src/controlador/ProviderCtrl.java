package controlador;

import connection.IProveedorDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Proveedor;
import vista.VProveedor;

public class ProviderCtrl implements MouseListener, ActionListener, KeyListener {

    private VProveedor vp = new VProveedor();

    public ProviderCtrl() {
        tblBuscar(vp.tblBuscar, "");
        vp.txtBuscar.addKeyListener(this);
        vp.btnInserr.addActionListener(this);
        vp.btnSalir.addActionListener(this);
        vp.tblBuscar.addMouseListener(this);
        vp.txtTlf.addKeyListener(this);
        vp.setVisible(true);
    }

    void tblBuscar(JTable tabla, String search) {
        tabla.setDefaultRenderer(Object.class, new RenderTabla());
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return (column == 3 || column == 1 || column == 2);
            }
        };

        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Telefono");
        model.addColumn("Descripción");
        model.addColumn("");
        tabla.setModel(model);

        tabla.getColumnModel().getColumn(4).setPreferredWidth(1);
        tabla.setRowHeight(20);

        IProveedorDAO sql = new IProveedorDAO();
        ArrayList<Proveedor> pvds = sql.buscar(search);
        JButton update = new JButton();
        update.setName("U");
        if (!pvds.isEmpty()) {
            for (Proveedor pvd : pvds) {
                Object[] fila = {pvd.getProveedor_id(), pvd.getNombre(),
                    pvd.getTelefono(), pvd.getDireccion(),
                    update};
                model.addRow(fila);
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int column = vp.tblBuscar.getColumnModel().getColumnIndexAtX(e.getX());
        int row = e.getY() / vp.tblBuscar.getRowHeight();

        if (row < vp.tblBuscar.getRowCount() && row >= 0
                && column < vp.tblBuscar.getColumnCount() && column >= 0) {
            Object value = vp.tblBuscar.getValueAt(row, column);
            String id = vp.tblBuscar.getValueAt(row, 0).toString();
            String name = vp.tblBuscar.getValueAt(row, 1).toString();
            String phone = vp.tblBuscar.getValueAt(row, 2).toString();
            String address = vp.tblBuscar.getValueAt(row, 3).toString();
            Proveedor pvd = new Proveedor(id, name, phone, address);
            IProveedorDAO sql = new IProveedorDAO();
            if (value instanceof JButton jb) {
                jb.doClick();
                System.out.println(jb.getName());
                if (jb.getName().equals("U")) {
                    sql.update(pvd);
                    JOptionPane.showMessageDialog(null, "Modificado");
                    tblBuscar(vp.tblBuscar, "");
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
        if (e.getSource() == vp.btnInserr) {
            Proveedor pvd = new Proveedor(vp.txtNom.getText(),
                    vp.txtTlf.getText(), vp.txtDir.getText());
            IProveedorDAO sql = new IProveedorDAO();
            if ("".equals(pvd.getNombre().trim())
                    || "".equals(pvd.getTelefono().trim())
                    || "".equals(pvd.getDireccion().trim())) {
                JOptionPane.showMessageDialog(null, "Llenar todos los campos!!!");
            } else if (sql.existPvd(pvd)) {
                JOptionPane.showMessageDialog(null, "Proveedor existente!!!");
                clean();
            } else if (sql.insert(pvd)) {
                JOptionPane.showMessageDialog(null, "Proveedor registrado");
                clean();
                tblBuscar(vp.tblBuscar, "");
            }
        } else if (e.getSource() == vp.btnSalir) {
            vp.dispose();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getSource() == vp.txtTlf) {
            char c = e.getKeyChar();
            if (((c < '0') || (c > '9'))) {
                e.consume();
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        tblBuscar(vp.tblBuscar, vp.txtBuscar.getText());
    }

    void clean() {
        vp.txtDir.setText(null);
        vp.txtNom.setText(null);
        vp.txtTlf.setText(null);
    }
    
}