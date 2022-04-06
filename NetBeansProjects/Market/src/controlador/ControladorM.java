/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.CardLayout;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.SwingUtilities;
import modelo.ModeloEmpleado;
import vista.Facturaa;
import vista.MenuPricpal;
import vista.PanelCliente;
import vista.PanelEmpleado;
import vista.PanelFactura;
import vista.PanelProducto;
import vista.PanelProveedor;

/**
 *
 * @author 59399
 */
public class ControladorM {
//

    private MenuPricpal vista;
    private ModeloEmpleado modelo;

    public ControladorM() {
    }

    public ControladorM(MenuPricpal vista, ModeloEmpleado modelo) {
        this.vista = vista;
        this.modelo = modelo;
        Vista();
    }

    public void Vista() {
        vista.setVisible(true);
        vista.setExtendedState(MAXIMIZED_BOTH);

    }

    public void InicioControl() {
        vista.getBtnCambia().addActionListener(l -> Empleado());
        vista.getBtnCliente().addActionListener(l -> Cliente());
        vista.getBtnProveedor().addActionListener(l -> Proveedor());
        vista.getBtnFactura().addActionListener(l -> Factura());
        vista.getBtnProducto().addActionListener(l -> Producto());
        vista.getBtnSalir().addActionListener(l -> System.exit(0));

    }

    public void Cliente() {
        PanelCliente panelcliente = new PanelCliente();
        vista.getPANELCAR().removeAll();
        vista.getPANELCAR().add(panelcliente);
        vista.getPANELCAR().repaint();
        vista.getPANELCAR().revalidate();
        System.out.println("CLIENTE!!!!!");
    }

    public void Empleado() {

        PanelEmpleado panelempleado = new PanelEmpleado();
        ModeloEmpleado me = new ModeloEmpleado();
        vista.getPANELCAR().removeAll();
        vista.getPANELCAR().add(panelempleado);
        vista.getPANELCAR().repaint();
        vista.getPANELCAR().revalidate();
        ControladorE empleado = new ControladorE(me, panelempleado);
        empleado.IncioControl();
    }

    public void Producto() {
        CardLayout cl = new CardLayout();
        cl = (CardLayout) vista.getPANELCAR().getLayout();
        ProductoCtrl panelPdt = new ProductoCtrl();
        vista.getPANELCAR().removeAll();
        vista.getPANELCAR().add(panelPdt.viewPdt);
        //cl.show(vista.getPANELCAR(), "Productos");
        SwingUtilities.updateComponentTreeUI(vista);
//        vista.getPANELCAR().repaint();  
//        vista.getPANELCAR().revalidate();
        vista.repaint();
        System.out.println("holaaaaa");
    }

    public void Proveedor() {
        PanelProveedor panelproveedor = new PanelProveedor();
        vista.getPANELCAR().removeAll();
        vista.getPANELCAR().add(panelproveedor);
        vista.getPANELCAR().repaint();
        vista.getPANELCAR().revalidate();

    }

    public void Factura() {
        Facturaa factura= new Facturaa();
        vista.getPANELCAR().removeAll();
        vista.getPANELCAR().add(factura);
        vista.getPANELCAR().repaint();
        vista.getPANELCAR().revalidate();

    }

}
