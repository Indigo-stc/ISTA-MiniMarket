package controlador;

import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;

class RenderTabla extends DefaultTableCellRenderer {
//    @Override
//    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
//        setHorizontalAlignment(CENTER);
//        table.setShowGrid(false);
//        DefaultCellEditor singleclick = new DefaultCellEditor(new JTextField());
//        singleclick.setClickCountToStart(1);
//        for (int i = 0; i < table.getColumnCount(); i++) {
//            table.setDefaultEditor(table.getColumnClass(i), singleclick);
//        }
//
//        if (value instanceof JButton jb) {
//            jb.setBackground(Color.WHITE);
//            return jb;
//        } else if (value instanceof JLabel jl) {
//            return jl;
//        } else if (value instanceof JComboBox jcb) {
//            return jcb;
//        } else if (value instanceof JTextField jt) {
//            return jt;
//        }
//        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
//    }
}