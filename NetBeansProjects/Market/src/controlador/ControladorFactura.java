package controlador;


import connection.ComprobanteDAO;
import connection.Conexion;
import connection.EncabezadoDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import java.util.Date;
import modelo.Comprobante;
import modelo.Encabezado;
import connection.IProductoDAO;
import java.text.DateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import vista.Factura;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Producto;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import vista.MenuPricpal;

public class ControladorFactura implements ActionListener, FocusListener {

    Factura viewFact = new Factura();
    Cliente cli = null;
    Date fechaActualF = new Date();
    DateFormat fechaActual = DateFormat.getDateInstance(DateFormat.FULL);
    ArrayList<Comprobante> listafact = new ArrayList();
    int cantidad = 0;
    int contador = 1;

    public ControladorFactura() {
        spinnerModelFa();
        viewFact.btn_agregar.addActionListener(this);
        viewFact.btn_cancelar.addActionListener(this);
        viewFact.btn_quitar.addActionListener(this);
        viewFact.btn_imprimir.addActionListener(this);
        viewFact.txt_cedula.addFocusListener(this);
        viewFact.lblfechaV.setText(fechaActual.format(fechaActualF));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == viewFact.btn_agregar) {
            IProductoDAO DAOpro = new IProductoDAO();
            Producto rs = DAOpro.produ(viewFact.txt_idproducto.getText());
            if (rs != null) {
                int cant = Integer.parseInt(viewFact.spinnetcant.getValue().toString());
                if (listafact.isEmpty()) {
                    if (viewFact.txt_idproducto.getText() != null) {
                        System.out.println("entrando");
                        Comprobante compro = new Comprobante(viewFact.txt_idproducto.getText(),
                                cant,
                                rs.getPrecio() * cant,
                                rs.getPrecio() * cant * 0.12,
                                rs.getPrecio() * cant * 1.12, "");
                        listafact.add(compro);
                        tblmodelfact();
                        totales();
                        //limpiarProd();
                    }
                } else {
                    for (int i = 0; i < listafact.size(); i++) {
                        if (viewFact.txt_idproducto.getText().equals(listafact.get(i).getProductoID())) {
                            listafact.get(i).setCantidadProducto(listafact.get(i).getCantidadProducto() + cant);
                            listafact.get(i).setSubTotal(listafact.get(i).getSubTotal() + rs.getPrecio() * listafact.get(i).getCantidadProducto());
                            listafact.get(i).setIVA(listafact.get(i).getIVA() + listafact.get(i).getSubTotal() * 0.12 + listafact.get(i).getIVA());
                            listafact.get(i).setTotal(listafact.get(i).getTotal() + listafact.get(i).getSubTotal() * 1.12 + listafact.get(i).getTotal());
                            tblmodelfact();
                            //limpiarProd();
                            break;
                        } else {
                            Comprobante compro = new Comprobante(viewFact.txt_idproducto.getText(),
                                    cant,
                                    rs.getPrecio() * cant,
                                    rs.getPrecio() * cant * 0.12,
                                    rs.getPrecio() * cant * 1.12, "");
                            listafact.add(compro);
                            totales();
                            tblmodelfact();
                            //limpiarProd();
                            System.out.println(compro.getProductoID() + "valio!");
                            break;
                        }
                    }
                    
                    
                    
                    for (Comprobante comprobante : listafact) {
                        if (viewFact.txt_idproducto.getText().equals(comprobante.getProductoID())) {
                            comprobante.setCantidadProducto(comprobante.getCantidadProducto() + cant);
                            comprobante.setSubTotal(comprobante.getSubTotal() + rs.getPrecio() * comprobante.getCantidadProducto());
                            comprobante.setIVA(comprobante.getIVA() + comprobante.getSubTotal() * 0.12 + comprobante.getIVA());
                            comprobante.setTotal(comprobante.getTotal() + comprobante.getSubTotal() * 1.12 + comprobante.getTotal());
                            tblmodelfact();
                            //limpiarProd();
                            break;
                        } else {
                            Comprobante compro = new Comprobante(viewFact.txt_idproducto.getText(),
                                    cant,
                                    rs.getPrecio() * cant,
                                    rs.getPrecio() * cant * 0.12,
                                    rs.getPrecio() * cant * 1.12, "");
                            listafact.add(compro);
                            totales();
                            tblmodelfact();
//                            limpiarProd();
                            System.out.println(compro.getProductoID() + "valio!");
                            break;
                        }
                    }

                }
            } else {
                JOptionPane.showMessageDialog(viewFact, "Producto no existente");
            }

        } else if (e.getSource() == viewFact.btn_cancelar) {
            Cancelar();
        } else if (e.getSource() == viewFact.btn_imprimir) {
            btnimprimir();
        } else if (e.getSource() == viewFact.btn_quitar) {
            quitardetabla();
        } 
    }

    private void tblmodelfact() {
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
            IProductoDAO vari = new IProductoDAO();
            Producto product = vari.produ(compro.getProductoID());
            fila[0] = compro.getProductoID();
            fila[1] = product.getNombre();
            fila[2] = compro.getCantidadProducto();
            fila[3] = product.getPrecio();
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

    private void spinnerModelFa() {
        SpinnerNumberModel model = new SpinnerNumberModel();
        model.setMinimum(1);
        viewFact.spinnetcant.setModel(model);
        JFormattedTextField tf = ((JSpinner.DefaultEditor) viewFact.spinnetcant.getEditor()).getTextField();
        tf.setEditable(false);
    }

    public void limpiarProd() {
        viewFact.txt_idproducto.setText(null);
        viewFact.spinnetcant.setValue(0);
    }

    public void Cancelar() {
        int i = 0;
        while (i < listafact.size()) {
            for (int j = 0; j < listafact.size(); j++) {
                listafact.remove(j);
            }
            i++;
        }
        int k = 0;
        while (k < listafact.size()) {
            for (int j = 0; j < listafact.size(); j++) {
                listafact.remove(j);            }
            k++;
        }
        if (listafact.isEmpty()) {
            viewFact.getTxt_cedula().setText("");
            viewFact.getTxt_nombres().setText("");
            viewFact.getTxt_telefono().setText("");
            viewFact.getTxt_subtotal().setText("");
            viewFact.getTxt_iva().setText("");
            viewFact.getTxt_total().setText("");
            vaciartabla();
        }
    }

    public void vaciartabla() {
        DefaultTableModel tblModel;
        tblModel = (DefaultTableModel) viewFact.getTbl_factura().getModel();
        tblModel.setNumRows(0); // limpio las filas de la tabla
        Double sum = 0.0;
        System.out.println("Llenar tabla " + listafact.size());

        listafact.stream().forEach(p1 -> {
            IProductoDAO vari = new IProductoDAO();
            Producto product = vari.produ(p1.getProductoID());
            String[] prod = {p1.getProductoID() + "", product.getNombre(), p1.getCantidadProducto() + "", product.getPrecio() + ""};
            tblModel.addRow(prod);
        });
        for (int i = 0; i < listafact.size(); i++) {
            Comprobante pr = listafact.get(i);
            IProductoDAO vari = new IProductoDAO();
            Producto product = vari.produ(pr.getProductoID());
            sum = sum + product.getPrecio();
            viewFact.getTxt_subtotal().setText(sum + "");
        }
        if (listafact.isEmpty()) {
            viewFact.getTxt_subtotal().setText("0.0");
        }
        Double iva = sum * 0.12;
        viewFact.getTxt_iva().setText(iva + "");
        viewFact.getTxt_total().setText((sum + iva) + "");
        limpiarProd();
    }

    public void quitardetabla() {
        DefaultTableModel tblventas = (DefaultTableModel) viewFact.getTbl_factura().getModel();
        int fila = viewFact.getTbl_factura().getSelectedRow();
        if (fila != -1) {
            String idpro = tblventas.getValueAt(fila, 0).toString();
            for (int i = 0; i < listafact.size(); i++) {
                Comprobante prod = listafact.get(i);
                if (idpro.equalsIgnoreCase(prod.getProductoID() + "")) {
                    JOptionPane.showConfirmDialog(viewFact, "Esta seguro de quitar este producto?");
                    listafact.remove(i);
                    tblmodelfact();
                    vaciartabla();
                }
            }
        } else {
            JOptionPane.showMessageDialog(viewFact, "Seleccione el producto a quitar");
        }
    }

    public void btnimprimir() {
        Date fechaAct = new Date();
        ComprobanteDAO comDao = new ComprobanteDAO();
        EncabezadoDAO conDao = new EncabezadoDAO();
        
        Encabezado enca = new Encabezado(cli.getIdCliente() == null ? "XXXXXXXXXX" : cli.getIdCliente(), fechaAct);
        conDao.encabezadoinsert(enca);
        String ecd = enca.getCodigoEncabezado();
        System.out.println(ecd + " id refe1");
        for (int i = 0; i < listafact.size(); i++) {
            listafact.get(i).setCodigoEncabezado(enca.getCodigoEncabezado());
            if (comDao.insertarCompro(listafact.get(i))) {
                System.out.println("Ingresaron");
                System.out.println(enca.getCodigoEncabezado());
                System.out.println(listafact.get(i).getProductoID());
                Cancelar();
            }
        }
        JOptionPane.showMessageDialog(viewFact, "Ingresada exitosamente!");
        ImprimirFactura(ecd);

    }

    @Override
    public void focusGained(FocusEvent e) {
    }

    @Override
    public void focusLost(FocusEvent e) {
        EncabezadoDAO encdao = new EncabezadoDAO();
        cli = encdao.clienteEnca(viewFact.txt_cedula.getText());
        if (cli == null) {
            ControladorC cliente = new ControladorC();
            viewFact.Panel.removeAll();
            viewFact.Panel.add(cliente.vista);
            viewFact.Panel.repaint();
            viewFact.Panel.revalidate();
        } else {
            viewFact.txt_nombres.setText(cli.getNombre());
            viewFact.txt_telefono.setText(cli.getNumero_telefono());
        }
    }

    public void insCliente() {
        ControladorC cliente = new ControladorC();
        MenuPricpal venta = new MenuPricpal();
        venta.getPANELCAR().removeAll();
        venta.getPANELCAR().add(cliente.vista);
        venta.getPANELCAR().repaint();
        venta.getPANELCAR().revalidate();
    }

    private void ImprimirFactura(String idEnca) {
        Conexion conexion = new Conexion();
        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/vista/viewReportes/asdf.jasper"));
            Map<String, Object> parametros = new HashMap<>();
            parametros.put("id_enca", idEnca);
            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, conexion.getCon());
            JasperViewer jv = new JasperViewer(jp, false);
            JasperViewer.viewReport(jp);
            jv.setVisible(true);
        } catch (JRException ex) {
            System.out.println("Infrese en catch");
            Logger.getLogger(ControladorFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}