package controlador;

import static java.awt.Frame.MAXIMIZED_BOTH;
import vista.MenuPricpal;

public class ControladorM {

    private MenuPricpal vista = new MenuPricpal();

    public ControladorM() {
        this.vista = vista;
        Vista();        
        InicioControl();
    }

    public ControladorM(String etiqueta) {
        if(etiqueta.equalsIgnoreCase("Administrador")){
            vista.getBtnCambia().setEnabled(true);
            vista.getBtnCliente().setEnabled(true); 
            vista.getBtnFactura().setEnabled(true);
            vista.getBtnProducto().setEnabled(true);
//            vista.getBtnProveedor().setEnabled(true);
            vista.getBtnReportes().setEnabled(true);
            vista.getBtnSalir().setEnabled(true);       
        } else if(etiqueta.equalsIgnoreCase( "Cajero")){
            vista.getBtnCliente().setEnabled(true);
            vista.getBtnProducto().setEnabled(true);
            vista.getBtnFactura().setEnabled(true);
        }
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
        vista.getBtnFactura().addActionListener(l -> Factura());
        vista.getBtnProducto().addActionListener(l -> Producto());
        vista.getBtnSalir().addActionListener(l -> System.exit(0));
        vista.getBtnReportes().addActionListener(l -> reportes());
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
        ProductCtrl panelPdt = new ProductCtrl();
        vista.getPANELCAR().removeAll();
        vista.getPANELCAR().add(panelPdt.viewPdt);
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
    
    public void reportes() {
        ControladorReporte controler = new ControladorReporte();
        vista.getPANELCAR().removeAll();
        vista.getPANELCAR().add(controler.viewReport);
        vista.getPANELCAR().repaint();
        vista.getPANELCAR().revalidate();
    }
    
} 

