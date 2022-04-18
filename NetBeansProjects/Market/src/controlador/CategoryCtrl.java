package controlador;

import connection.ICategoriaDAO;
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
import modelo.Categoria;
import vista.VCategoria;

public class CategoryCtrl implements ActionListener, KeyListener,
        MouseListener {

    VCategoria vc = new VCategoria();

    public CategoryCtrl() {
        tblBuscar(vc.tblBuscar, "");
        vc.btnInserr.addActionListener(this);
        vc.btnSalir.addActionListener(this);
        vc.txtBuscar.addKeyListener(this);
        vc.tblBuscar.addMouseListener(this);
        vc.setVisible(true);
    }

    void tblBuscar(JTable table, String search) {
        table.setDefaultRenderer(Object.class, new RenderTabla());
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return (column == 1);
            }
        };

        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("");
        model.addColumn("");
        table.setModel(model);

        table.getColumnModel().getColumn(2).setPreferredWidth(1);
        table.getColumnModel().getColumn(3).setPreferredWidth(1);
        table.setRowHeight(20);

        ICategoriaDAO sql = new ICategoriaDAO();
        ArrayList<Categoria> pvds = sql.buscar(search);
        JButton update = new JButton();
        update.setName("U");
        JButton delete = new JButton();
        delete.setName("D");
        if (!pvds.isEmpty()) {
            for (Categoria tcg : pvds) {
                Object[] fila = {tcg.getCategoria_id(), tcg.getTitulo(),
                    update, delete};
                model.addRow(fila);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vc.btnInserr) {
            Categoria cyg = new Categoria(vc.txtNom.getText());
            ICategoriaDAO sql = new ICategoriaDAO();
            if ("".equals(cyg.getTitulo().trim())) {
                JOptionPane.showMessageDialog(null, "Llenar todos los campos!!!");
            } else if (sql.existCtg(cyg)) {
                JOptionPane.showMessageDialog(null, "Categoría existente!!!");
                vc.txtNom.setText(null);
            } else if (sql.insert(cyg)) {
                JOptionPane.showMessageDialog(null, "Categoría registrada");
                tblBuscar(vc.tblBuscar, "");
                vc.txtNom.setText(null);
            }
        } else if (e.getSource() == vc.btnSalir) {
            vc.dispose();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == vc.txtBuscar) {
            tblBuscar(vc.tblBuscar, vc.txtBuscar.getText());
        }
    }

//    @Override
//    public void mouseClicked(MouseEvent e) {
//        if (e.getSource() == vc.tblBuscar) {
//            int column = vc.tblBuscar.getColumnModel().getColumnIndexAtX(e.getX());
//            int row = e.getY() / vc.tblBuscar.getRowHeight();
//
//            if (row < vc.tblBuscar.getRowCount() && row >= 0
//                    && column < vc.tblBuscar.getColumnCount() && column >= 0) {
//                Object value = vc.tblBuscar.getValueAt(row, column);
//                String id = vc.tblBuscar.getValueAt(row, 0).toString();
//                String name = vc.tblBuscar.getValueAt(row, 1).toString();
//                Categoria ctg = new Categoria(id, name);
//                ICategoriaDAO sql = new ICategoriaDAO();
//                if (value instanceof JButton 
//                    jb
//                
//                    ) {
//                    jb.doClick();
//                    System.out.println(jb.getName());
//                    if (jb.getName().equals("U")) {
//                        sql.update(ctg);
//                        tblBuscar(vc.tblBuscar, "");
//                    } else if (jb.getName().equals("D")) {
//                        sql.delete(ctg.getCategoria_id());
//                        tblBuscar(vc.tblBuscar, "");
//                    }
//                }
//            }
//        }
//    }

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
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class test {

    public static void main(String[] args) {
        CategoryCtrl pd = new CategoryCtrl();
    }
}
