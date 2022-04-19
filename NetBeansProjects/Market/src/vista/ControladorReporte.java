package vista;

import connection.Conexion;
import controlador.ControladorFactura;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import vista.PanelReporte;

public class ControladorReporte implements ActionListener {

    PanelReporte viewReport = new PanelReporte();

    public ControladorReporte() {

        viewReport.btnImprimirCLI.addActionListener(this);
        viewReport.btnimprimirEMP.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == viewReport.btnImprimirCLI) {
            ReporteCliente();
        } else if (e.getSource() == viewReport.btnimprimirEMP) {
            ReporteProductos();
        }

    }

    private void ReporteCliente() {
        Conexion con = new Conexion();
        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/vista/viewReportes/ClientReport.jasper"));

            JasperPrint jp = JasperFillManager.fillReport(jr, null, con.getCon());//cargando el reporte con los datos BD

            JasperViewer jv = new JasperViewer(jp, false);

            jv.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(ControladorFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void ReporteProductos() {
        Conexion con = new Conexion();
        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/vista/viewReportes/ProductReport.jasper"));

            JasperPrint jp = JasperFillManager.fillReport(jr, null, con.getCon());//cargando el reporte con los datos BD

            JasperViewer jv = new JasperViewer(jp, false);

            jv.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(ControladorFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
