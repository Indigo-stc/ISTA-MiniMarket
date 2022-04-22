package controlador;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

class RenderTabla extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        setHorizontalAlignment(CENTER);
        table.setShowGrid(false);
        table.setShowHorizontalLines(true);
        table.setIntercellSpacing(new Dimension(0, 0));
        JTableHeader tableHeader = table.getTableHeader();
        DefaultCellEditor singleclick = new DefaultCellEditor(new JTextField());
        singleclick.setClickCountToStart(1);
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.setDefaultEditor(table.getColumnClass(i), singleclick);
        }

        if (value instanceof JButton ) {
            JButton jb = new JButton();
            jb.setBackground(Color.WHITE);
            return jb;
        } else if (value instanceof JLabel) {
            JLabel jl = new JLabel();
            return jl;
        } else if (value instanceof JComboBox) {
            JComboBox jcb = new JComboBox();
            return jcb;
        } else if (value instanceof JTextField) {
            JTextField jt = new JTextField();
            return jt;
        }
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}