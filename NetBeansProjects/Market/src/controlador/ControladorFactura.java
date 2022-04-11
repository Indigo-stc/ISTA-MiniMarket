package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import java.util.Date;
import modelo.Comprobante;
import modelo.Encabezado;
import modelo.IProductoDAO;
import vista.Factura;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ControladorFactura implements ActionListener, FocusListener {

    Factura viewFact = new Factura();
    ArrayList<Comprobante> listafact = new ArrayList();

    public ControladorFactura() {

        viewFact.btn_agregar.addActionListener(this);
        viewFact.btn_cancelar.addActionListener(this);
        viewFact.btn_buscar.addActionListener(this);
        viewFact.btn_guardar.addActionListener(this);
        viewFact.btn_imprimir.addActionListener(this);
        viewFact.btn_quitar.addActionListener(this);
        viewFact.btnConsumidorF.addActionListener(this);
        viewFact.txt_cedula.addActionListener(this);
        

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == viewFact.btn_agregar) {
            Date fechaAct = new Date();
            IProductoDAO DAOpro = new IProductoDAO();
            ResultSet rs = DAOpro.pk(viewFact.txt_idproducto.getText());
            Encabezado enca = new Encabezado(viewFact.txt_cedula.getText(), fechaAct);
            try {
                if (rs.next()) {
                    Comprobante compro = new Comprobante(viewFact.txt_idproducto.getText(),
                            Integer.parseInt(viewFact.spinnetcant.getValue().toString()), rs.getDouble(3),
                            rs.getDouble(3) * Integer.parseInt(viewFact.spinnetcant.getValue().toString()),
                            rs.getDouble(3) * Integer.parseInt(viewFact.spinnetcant.getValue().toString()) * 0.12,
                            rs.getDouble(3) * Integer.parseInt(viewFact.spinnetcant.getValue().toString()) * 1.12, enca.getCodigoEncabezado());
                    listafact.add(compro);
                    tblmodelfact(compro, rs.getString(2),rs.getDouble(3));
                    totales();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ControladorFactura.class.getName()).log(Level.SEVERE, null, ex);

            }

        } else if (e.getSource() == viewFact.btn_cancelar) {

        } else if (e.getSource() == viewFact.btn_buscar) {

        } else if (e.getSource() == viewFact.btn_guardar) {

        } else if (e.getSource() == viewFact.btn_imprimir) {

        } else if (e.getSource() == viewFact.btn_quitar) {

        } else if (e.getSource() == viewFact.btnConsumidorF) {

        }

    }

    private void tblmodelfact(Comprobante com, String id, Double precio) {
        DefaultTableModel modelo = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 1 || column == 2 || column == 3 || column == 4;
            }
        };

        viewFact.tbl_factura.setModel(modelo);

        modelo.addColumn("Código");
        modelo.addColumn("Nombre");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");

        Object[] fila = new Object[5];
        for (Comprobante compro : listafact) {
            
                    fila[0] = id;
                    fila[1] = precio.toString();
                    fila[2] = compro.getCantidadProducto();
                    fila[3] = compro.getPrecio();
                    modelo.addRow(fila);
                
           

        }

    }

    public void totales() {

        Double subtotal = 0.0;
        Double iva = 0.0;
        Double total = 0.0;

        for (Comprobante comprobante : listafact) {

            subtotal = subtotal + comprobante.getSubTotal();
            iva = iva + comprobante.getIVA();
            total = total + comprobante.getTotal();
            
            viewFact.txt_subtotal.setText(subtotal.toString());
            viewFact.txt_iva.setText(iva.toString());
            viewFact.txt_total.setText(total.toString());

        }

    }

    @Override
    public void focusGained(FocusEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void focusLost(FocusEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
