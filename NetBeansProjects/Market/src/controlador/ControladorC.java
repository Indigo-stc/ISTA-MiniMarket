package controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Empleado;
import modelo.MensajeFantasma;
import connection.ModeloCliente;
import connection.ModeloEmpleado;
import vista.PanelCliente;

/**
 *
 * @author 59399
 */
public class ControladorC implements KeyListener {

    ModeloCliente modelo = new ModeloCliente();
    PanelCliente vista = new PanelCliente();

    public ControladorC() {
        cargaLista();
        IncioControl();
        TextFantasma();
    }

    public void TextFantasma() {
        MensajeFantasma m1 = new MensajeFantasma("Ditgite la Cedula", vista.getTxtCedula());
        MensajeFantasma m2 = new MensajeFantasma("Ditgite el Nombre ", vista.getTxtNombre());
        MensajeFantasma m3 = new MensajeFantasma("Ditgite el Apellido", vista.getTxtApellido());
        MensajeFantasma m4 = new MensajeFantasma("Ditgite un Correo", vista.getTxtCorreo());
        MensajeFantasma m5 = new MensajeFantasma("Ditgite una Direccion", vista.getTxtDireccion());
        MensajeFantasma m6 = new MensajeFantasma("Ditgite un Numero de telefono", vista.getTxtPhone());

    }

    private void cargaLista() {
        DefaultTableModel tblModel = (DefaultTableModel) vista.getTablaCliente().getModel();
        tblModel.setNumRows(0);
        List<Cliente> lista = modelo.LeerT();
        lista.stream().forEach(p -> {

            String[] PersonaC = {p.getCedula(), p.getIdCliente(), p.getNombre(), p.getApellido(), p.getFecha_nacimiento().toString(),
                p.getNumero_telefono(), p.getCorreo(), p.getDireccion(),};
            tblModel.addRow(PersonaC);
        });
    }

    public void Registrar() {
        if (validarCedulaRepetida(vista.getTxtCedula().getText()) == true) {

            Cliente cl = new Cliente(vista.getTxtCedula().getText(), vista.getTxtNombre().getText(),
                    vista.getTxtApellido().getText(), vista.getDateFecha().getDate(),
                    vista.getTxtPhone().getText(), vista.getTxtCorreo().getText(), vista.getTxtDireccion().getText());
            ModeloCliente md = new ModeloCliente();
            if (md.insert(cl)) {
                JOptionPane.showMessageDialog(null, "REGISTRO");
                cargaLista();
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "ER");

            }
        }

    }

    public void Modificar() {

        Cliente mdc = new Cliente();
        mdc.setNombre(vista.getTxtNombre().getText());
        mdc.setApellido(vista.getTxtApellido().getText());
        mdc.setNumero_telefono(vista.getTxtPhone().getText());
        mdc.setCorreo(vista.getTxtCorreo().getText());
        mdc.setDireccion(vista.getTxtDireccion().getText());

        int resultado = JOptionPane.showConfirmDialog(vista, "ESTA SEGURO QUE LOS DATOS INGRESADOS SON CORRECTOS", "Confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resultado == JOptionPane.YES_NO_OPTION) {
            if (modelo.ModificarT(mdc, vista.getTxtCedula().getText())) {
                JOptionPane.showMessageDialog(vista, "SE LOGRO GRABAR EL DATO EN LA BDD");
                cargaLista();
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(vista, "Error en la Ejecucion");
            }
        }
    }

    private void Buscar() {
        DefaultTableModel tblModel = (DefaultTableModel) vista.getTablaCliente().getModel();
        tblModel.setNumRows(0);
        List<Cliente> lista = modelo.Buscar(vista.getTxtBuscar().getText());
        lista.stream().forEach(p -> {

            String[] Cliente = {p.getCedula(), p.getIdCliente(), p.getNombre(), p.getApellido(), p.getFecha_nacimiento().toString(),
                p.getNumero_telefono(), p.getCorreo(), p.getDireccion(),};
            tblModel.addRow(Cliente);
        });
    }

    public void Eliminar() {
        DefaultTableModel tblClientes = (DefaultTableModel) vista.getTablaCliente().getModel();
        int fila = vista.getTablaCliente().getSelectedRow();
        if (fila != -1) {
            String id_Clientes = tblClientes.getValueAt(fila, 0).toString();
            ModeloCliente clientes = new ModeloCliente();
            int resultado = JOptionPane.showConfirmDialog(vista, "ESTA SEGURO QUE DESEA BORRAR A ESTE DATO", "Confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (resultado == JOptionPane.YES_NO_OPTION) {
                if (clientes.delete(id_Clientes)) {
                    JOptionPane.showMessageDialog(vista, "SE LOGRO ELIMINAR DE LA BDD");
                    cargaLista();
                    Limpiar();
                } else {
                    JOptionPane.showMessageDialog(vista, "hubo un error");
                }
            }
        } else {
            JOptionPane.showMessageDialog(vista, "DE PRIMERO CLICK ENCIMA EN ALGUNA PERSONA Y LUEGO EN ELIMINAR", "AVISO", 2);
        }
    }

    public void Limpiar() {

        vista.getTxtCedula().setText("");
        vista.getTxtNombre().setText("");
        vista.getTxtApellido().setText("");
        vista.getTxtCorreo().setText("");
        vista.getDateFecha().setDate(null);
        vista.getTxtPhone().setText("");
        vista.getTxtDireccion().setText("");
        ((JTextField) vista.getDateFecha().getDateEditor().getUiComponent()).setText(null);
    }

    private boolean validarCedulaRepetida(String cedula) {
        List<Cliente> clie = modelo.LeerT();

        for (int i = 0; i < clie.size(); i++) {
            if (clie.get(i).getCedula().equals(cedula)) {
                JOptionPane.showMessageDialog(vista, "Esta cedula pertenece a una persona que ya ha sido registrada", "Advertencia!", 2);
                return false;
            }
        }
        if (vista.getTxtCedula().getText().matches("^\\d{10}")) {
            return true;

        } else {
            JOptionPane.showMessageDialog(null, "La cedula tiene 10 digitos");
            return false;

        }

    }

    public void IncioControl() {
        vista.getBtnRegistrar().addActionListener(l -> Registrar());
        vista.getBtnModificar().addActionListener(l -> Modificar());
        vista.getBtnEliminar().addActionListener(l -> Eliminar());
        vista.getTxtCedula().addKeyListener(this);
        vista.getTxtNombre().addKeyListener(this);
        vista.getTxtApellido().addKeyListener(this);
        vista.getTxtPhone().addKeyListener(this);
        vista.getTxtCorreo().addKeyListener(this);
        vista.getTxtBuscar().addKeyListener(this);
        vista.getTablaCliente().addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                int tabla = vista.getTablaCliente().rowAtPoint(e.getPoint());
                if (tabla >= -1) {
                    vista.getTxtCedula().setText(vista.getTablaCliente().getValueAt(tabla, 0).toString());
                    vista.getTxtNombre().setText(vista.getTablaCliente().getValueAt(tabla, 2).toString());
                    vista.getTxtApellido().setText(vista.getTablaCliente().getValueAt(tabla, 3).toString());
                    vista.getDateFecha().setDate(java.sql.Date.valueOf(vista.getTablaCliente().getValueAt(tabla, 4).toString()));
                    vista.getTxtPhone().setText(vista.getTablaCliente().getValueAt(tabla, 5).toString());
                    vista.getTxtCorreo().setText(vista.getTablaCliente().getValueAt(tabla, 6).toString());
                    vista.getTxtDireccion().setText(vista.getTablaCliente().getValueAt(tabla, 7).toString());
                    vista.getTxtCedula().setEnabled(false);
                }
            }
        });

    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getSource() == vista.getTxtCedula()) {
            char c = e.getKeyChar();
            if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)
                    && (c != '.')) {
                e.consume();
            }

        }
        if (e.getSource() == vista.getTxtNombre()) {
            char r = e.getKeyChar();

            if (((Character.isDigit(r)))) {
                e.consume();
            }
        }
        if (e.getSource() == vista.getTxtApellido()) {
            char r = e.getKeyChar();

            if (((Character.isDigit(r)))) {
                e.consume();
            }
        }
        if (e.getSource() == vista.getTxtCorreo()) {
            char r = e.getKeyChar();

            if (((Character.isDigit(r)))) {
                e.consume();
            }
        }
        if (e.getSource() == vista.getTxtPhone()) {
            char c = e.getKeyChar();
            if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)
                    && (c != '.')) {
                e.consume();
            }

        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {

        if (e.getSource() == vista.getTxtBuscar()) {
            vista.getTxtBuscar().getText();
            Buscar();

        }
    }

}
