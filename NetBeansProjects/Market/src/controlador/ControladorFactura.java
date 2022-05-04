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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import vista.Factura;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Producto;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class ControladorFactura implements ActionListener, FocusListener, KeyListener {

    Factura viewFact = new Factura();
    Cliente cli = null;
    Date fechaActualF = new Date();
    DateFormat fechaActual = DateFormat.getDateInstance(DateFormat.FULL);
    ArrayList<Comprobante> listafact = new ArrayList();
    int cantidad = 0;
    int contador = 1;

    public ControladorFactura() {
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
                        limpiarProd();
                    }
                } else {
                    for (int i = 0; i < listafact.size(); i++) {
                        if (viewFact.txt_idproducto.getText().equals(listafact.get(i).getProductoID().trim())) {
                            listafact.get(i).setCantidadProducto(listafact.get(i).getCantidadProducto() + cant);
                            listafact.get(i).setSubTotal(listafact.get(i).getSubTotal() + rs.getPrecio() * listafact.get(i).getCantidadProducto());
                            listafact.get(i).setIVA(listafact.get(i).getIVA() + listafact.get(i).getSubTotal() * 0.12 + listafact.get(i).getIVA());
                            listafact.get(i).setTotal(listafact.get(i).getTotal() + listafact.get(i).getSubTotal() * 1.12 + listafact.get(i).getTotal());
                            tblmodelfact();
                            totales();
                            limpiarProd();
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
                            limpiarProd();
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
            Math.ceil(subtotal);
            Math.ceil(iva);
            Math.ceil(total);
            viewFact.txt_subtotal.setText(subtotal.toString());
            viewFact.txt_iva.setText(iva.toString());
            viewFact.txt_total.setText(total.toString());
        }
    }

    public void limpiarProd() {
        viewFact.txt_idproducto.setText(null);
        viewFact.lblvrfcedula.setText("");
        viewFact.spinnetcant.setValue(1);
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
        
        Encabezado enca = new Encabezado(cli == null ? "CONS-FIN" : cli.getIdCliente(), fechaAct);
        conDao.encabezadoinsert(enca);
        String ecd = enca.getCodigoEncabezado();
        System.out.println(ecd + " id refe1");
        for (int i = 0; i < listafact.size(); i++) {
            listafact.get(i).setCodigoEncabezado(enca.getCodigoEncabezado());
            if (comDao.insertarCompro(listafact.get(i))) {
                System.out.println("Ingresaron");
                System.out.println(enca.getCodigoEncabezado());
                System.out.println(listafact.get(i).getProductoID());
            }
        }
        JOptionPane.showMessageDialog(viewFact, "Ingresada exitosamente!");
        ImprimirFactura(ecd);
        limpiarProd();
        Cancelar();
        cli = null;
    }

    @Override
    public void focusGained(FocusEvent e) {
    }

    @Override
    public void focusLost(FocusEvent e) {
        EncabezadoDAO encdao = new EncabezadoDAO();
        cli = encdao.clienteEnca(viewFact.txt_cedula.getText());
        if (viewFact.txt_cedula.getText() == null 
                || "".equals(viewFact.txt_cedula.getText().trim())) {
            viewFact.lblvrfcedula.setText("");
        } else if (!digVfy(viewFact.txt_cedula.getText())) {
            viewFact.lblvrfcedula.setText("No es cédula");
        } else if (cli == null && digVfy(viewFact.txt_cedula.getText())) {
            ControladorC cliente = new ControladorC();
            viewFact.changePanel.removeAll();
            viewFact.changePanel.add(cliente.vista);
            viewFact.changePanel.repaint();
            viewFact.changePanel.revalidate();
        } else {
            viewFact.txt_nombres.setText(cli.getNombre() + " " + cli.getApellido());
            viewFact.txt_telefono.setText(cli.getNumero_telefono());
            viewFact.lblvrfcedula.setText("");
        }
    }
    
    public boolean digVfy(String cedula) {
        byte sum = 0;
        try {
            if (cedula.length() != 10) {
                return false;
            }
            String[] data = cedula.split("");
            byte verifier = Byte.parseByte(data[0] + data[1]);
            if (verifier < 1 || verifier > 24) {
                return false;
            }
            byte[] digits = new byte[data.length];
            for (byte i = 0; i < digits.length; i++) {
                digits[i] = Byte.parseByte(data[i]);
            }
            if (digits[2] > 6) {
                return false;
            }
            for (byte i = 0; i < digits.length - 1; i++) {
                if (i % 2 == 0) {
                    verifier = (byte) (digits[i] * 2);
                    if (verifier > 9) {
                        verifier = (byte) (verifier - 9);
                    }
                } else {
                    verifier = (byte) (digits[i] * 1);
                }
                sum = (byte) (sum + verifier);
            }
            if ((sum - (sum % 10) + 10 - sum) == digits[9]) {
                return true;
            }
        } catch (NumberFormatException e) {
            e.getMessage();
        }
        return false;
    }

    private void ImprimirFactura(String idEnca) {
        Conexion conexion = new Conexion();
        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/vista/viewReportes/asdf.jasper"));
            Map<String, Object> parametros = new HashMap<>();
            parametros.put("id_enca", idEnca);
            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, conexion.getCon());
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            System.out.println("Infrese en catch");
            Logger.getLogger(ControladorFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getSource() == viewFact.txt_cedula) {
            char c = e.getKeyChar();
            if (!Character.isDigit(c) && e.getKeyChar() != KeyEvent.VK_BACK_SPACE) {
                e.consume();
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}
}