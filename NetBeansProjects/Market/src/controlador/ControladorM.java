/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.CardLayout;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.SwingUtilities;
import vista.MenuPricpal;
import vista.PanelCliente;
import vista.PanelFactura;
import vista.PanelProducto;
import vista.PanelProveedor;
//import proyecto.Vista.MenuPricpal;
//import proyecto.Vista.PanelCliente;
//import proyecto.Vista.Menu;
//import proyecto.Vista.PanelFactura;
//import proyecto.Vista.PanelProducto;
//import proyecto.Vista.PanelProveedor;

/**
 *
 * @author 59399
 */
public class ControladorM {
    PanelCliente panelcliente= new PanelCliente();
    PanelProducto panelproducto= new PanelProducto();
    PanelProveedor panelproveedor= new PanelProveedor(); 
    PanelFactura panelfactura= new PanelFactura();
    
    CardLayout traslado = new CardLayout();
    private MenuPricpal vista;

//    Producto PanelProducto = new Producto();
    public ControladorM() {
    }

    public ControladorM(MenuPricpal vista) {
//        try {
        this.vista = vista;
        Vista();
        InicioControl();
//
//        } catch (Exception e) {
//        }

    }

    public void Vista() {
        vista.setVisible(true);
//        vista.setExtendedState(MAXIMIZED_BOTH);
    }

    public void InicioControl() {
//        vista.getBtnNose().addActionListener(l -> System.exit(0));
        vista.getBtnCambia().addActionListener(l -> Empleado());
        vista.getBtnCliente().addActionListener(l -> Cliente());
        vista.getBtnCliente().addActionListener(l -> Cliente());
        vista.getBtnCliente().addActionListener(l -> Cliente());
        vista.getBtnCliente().addActionListener(l -> Cliente());

    }

    public void Cliente() {
        vista.getPANELCAR().removeAll();
        vista.getPANELCAR().add(panelcliente);
        vista.getPANELCAR().repaint();
        vista.getPANELCAR().revalidate();

    }

    public void Empleado() {
        vista.getPANELCAR().removeAll();
        vista.getPANELCAR().add(vista.getPanelEmpleado());
        vista.getPANELCAR().repaint();
        vista.getPANELCAR().revalidate();

    }
    
    public void Producto() {
        vista.getPANELCAR().removeAll();
        vista.getPANELCAR().add(vista.getPanelEmpleado());
        vista.getPANELCAR().repaint();
        vista.getPANELCAR().revalidate();

    }

    public void Proveedor() {
        vista.getPANELCAR().removeAll();
        vista.getPANELCAR().add(vista.getPanelEmpleado());
        vista.getPANELCAR().repaint();
        vista.getPANELCAR().revalidate();

    }

    public void Factura() {
        vista.getPANELCAR().removeAll();
        vista.getPANELCAR().add(vista.getPanelEmpleado());
        vista.getPANELCAR().repaint();
        vista.getPANELCAR().revalidate();

    }


}
