/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.CardLayout;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.SwingUtilities;
import modelo.ModeloCliente;
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
    private ModeloEmpleado modeloE;
    private ModeloCliente modeloC;
    public ControladorM() {
    }

    public ControladorM(MenuPricpal vista, ModeloCliente modeloC) {
//        ModeloEmpleado modelo
        this.vista = vista;
////        this.modeloC=modeloC;
//        this.modeloE = modelo;
        Vista();
//        InicioControl();
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
        vista.getBtnSalir().setEnabled(false);

    }

    public void Cliente() {
        PanelCliente panelcliente = new PanelCliente();
        ModeloCliente ci= new ModeloCliente();
        vista.getPANELCAR().removeAll();
        vista.getPANELCAR().add(panelcliente);
        vista.getPANELCAR().repaint();
        vista.getPANELCAR().revalidate();
        ControladorC cliente= new ControladorC(ci,panelcliente);
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
        System.out.println("iiii");
    }

    public void Producto() {
        ProductoCtrl panelPdt = new ProductoCtrl();
        vista.getPANELCAR().removeAll();
        vista.getPANELCAR().add(panelPdt.viewPdt);
        vista.getPANELCAR().repaint();
        vista.getPANELCAR().revalidate();
    }

    public void Proveedor() {
        PanelProveedor panelproveedor = new PanelProveedor();
        vista.getPANELCAR().removeAll();
        vista.getPANELCAR().add(panelproveedor);
        vista.getPANELCAR().repaint();
        vista.getPANELCAR().revalidate();

    }

    public void Factura() {
        Facturaa factura = new Facturaa();
        vista.getPANELCAR().removeAll();
        vista.getPANELCAR().add(factura);
        vista.getPANELCAR().repaint();
        vista.getPANELCAR().revalidate();

    }

}
