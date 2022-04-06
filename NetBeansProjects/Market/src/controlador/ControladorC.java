/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Empleado;
import modelo.ModeloCliente;
import vista.PanelCliente;

/**
 *
 * @author 59399
 */
public class ControladorC {

    private ModeloCliente modelo;
    private PanelCliente vista;

    public ControladorC(ModeloCliente modelo, PanelCliente vista) {
        this.modelo = modelo;
        this.vista = vista;
        cargaLista();
    }

    private void cargaLista() {
        DefaultTableModel tblModel = (DefaultTableModel) vista.getTablaCliente().getModel();
        tblModel.setNumRows(0);
        List<Cliente> lista = modelo.LeerC();
        lista.stream().forEach(p -> {

            String[] PersonaC = {p.getCedula(), p.getIdCliente(), p.getNombre(), p.getApellido(), p.getFecha_nacimiento(),
                p.getNumero_telefono(), p.getCorreo(), p.getDireccion(),};
            tblModel.addRow(PersonaC);
        });
    }
}
