package controlador;

import java.awt.CardLayout;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.SwingUtilities;
import connection.ModeloCliente;
import vista.Factura;
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

    public ControladorM() {
    }

    public ControladorM(MenuPricpal vista) {
        this.vista = vista;
        Vista();
        InicioControl();
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
        ControladorC cliente = new ControladorC();
        vista.getPANELCAR().removeAll();
        vista.getPANELCAR().add(cliente.vista);
        vista.getPANELCAR().repaint();
        vista.getPANELCAR().revalidate();

    }

    public void Empleado() {
        ControladorE empleado = new ControladorE();
        vista.getPANELCAR().removeAll();
        vista.getPANELCAR().add(empleado.vista);
        vista.getPANELCAR().repaint();
        vista.getPANELCAR().revalidate();
      
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
        ControladorFactura controler = new ControladorFactura();
        vista.getPANELCAR().removeAll();
        vista.getPANELCAR().add(controler.viewFact);
        vista.getPANELCAR().repaint();
        vista.getPANELCAR().revalidate();

    }

}
