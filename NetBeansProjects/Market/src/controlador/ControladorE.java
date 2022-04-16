package controlador;

//import Clases.Empleado;
//import Menu.Vista.MenuPricpal;
//import Menu.Vista.PanelEmpleado;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.Empleado;
import connection.IProveedorDAO;
import modelo.MensajeFantasma;
import connection.ModeloEmpleado;
import modelo.Proveedor;
import connection.RolDao;
import modelo.Rol;
import vista.PanelEmpleado;
//import sun.security.rsa.RSAUtil;
//import sun.security.rsa.RSAUtil.KeyType;

/**
 *
 * @author 59399
 */
public class ControladorE implements KeyListener {

    DefaultTableModel tabla_modelo = new DefaultTableModel();

    ModeloEmpleado modelo = new ModeloEmpleado();
    PanelEmpleado vista = new PanelEmpleado();

    public ControladorE() {
        cargaLista();
        cbRoles();
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
        MensajeFantasma m7 = new MensajeFantasma("Ditgite un Salario", vista.getTxtSalario());
        MensajeFantasma m8 = new MensajeFantasma("Ditgite una Contraseña", vista.getTxtPassword());

    }

    public void Registrar() {
        if (validarCedulaRepetida(vista.getTxtCedula().getText()) == true) {

            RolDao rol = new RolDao();
            int rol_iid = rol.Ff(vista.getCombo_Rol().getSelectedItem().toString());
            Empleado empl = new Empleado(Double.valueOf(vista.getTxtSalario().getText()), vista.getTxtPassword().getText(),
                    rol_iid, vista.getTxtCedula().getText(), vista.getTxtNombre().getText(), vista.getTxtApellido().getText(),
                    vista.getDateFecha().getDate(), vista.getTxtPhone().getText(), vista.getTxtCorreo().getText(), vista.getTxtDireccion().getText());
            if (modelo.insert(empl)) {
                JOptionPane.showMessageDialog(null, "Registro en la base de Datos");

                cargaLista();
                Limpiar();
            } else {
                System.out.println("No se creo Empleado");

            }

        }

    }

    public void Modificar() {
        Empleado empleado = new Empleado();
        RolDao rol = new RolDao();
        int rol_iid = rol.Ff(vista.getCombo_Rol().getSelectedItem().toString());
        empleado.setNombre(vista.getTxtNombre().getText());
        empleado.setApellido(vista.getTxtApellido().getText());
        empleado.setFecha_nacimiento(vista.getDateFecha().getDate());
        empleado.setNumero_telefono(vista.getTxtPhone().getText());
        empleado.setCorreo(vista.getTxtCorreo().getText());
        empleado.setDireccion(vista.getTxtDireccion().getText());
        empleado.setSalario(Double.valueOf(vista.getTxtSalario().getText()));
        empleado.setRol_id(rol_iid);

        int resultado = JOptionPane.showConfirmDialog(vista, "ESTA SEGURO QUE LOS DATOS INGRESADOS SON CORRECTOS", "Confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resultado == JOptionPane.YES_NO_OPTION) {
            if (modelo.ModificarT(empleado, vista.getTxtCedula().getText())) {
                JOptionPane.showMessageDialog(vista, "SE LOGRO GRABAR EL DATO EN LA BDD");
                Limpiar();
                cargaLista();
            } else {
                JOptionPane.showMessageDialog(vista, "VALIENDO GASVER X¨D");
            }
        }

    }


    public void Eliminar() {
        DefaultTableModel tblPersonas = (DefaultTableModel) vista.getTablaEmpleado().getModel();
        int fila = vista.getTablaEmpleado().getSelectedRow();
        if (fila != -1) {
            String idPersona = tblPersonas.getValueAt(fila, 0).toString();
            ModeloEmpleado empleado = new ModeloEmpleado();
            int resultado = JOptionPane.showConfirmDialog(vista, "ESTA SEGURO QUE DESEA BORRAR A ESTE DATO", "Confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (resultado == JOptionPane.YES_NO_OPTION) {
                if (empleado.delete(idPersona)) {
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

    private void cargaLista() {
        DefaultTableModel tblModel = (DefaultTableModel) vista.getTablaEmpleado().getModel();
        tblModel.setNumRows(0);
        List<Empleado> lista = modelo.LeerT();
        lista.stream().forEach(p -> {
            String[] Persona = {p.getCedula(), p.getEmpleado_id(), p.getNombre(), p.getApellido(), p.getFecha_nacimiento().toString(),
                p.getNumero_telefono(), p.getCorreo(), p.getRol(), String.valueOf(p.getRol_id()), String.valueOf(p.getSalario()), p.getDireccion(), p.getPassword()};
            tblModel.addRow(Persona);
        });

    }

    public void Buscar() {

        DefaultTableModel tblModel = (DefaultTableModel) vista.getTablaEmpleado().getModel();
        tblModel.setNumRows(0);
        List<Empleado> lista = modelo.Buscar(vista.getTxtBuscar().getText());
        lista.stream().forEach(p -> {

            String[] Persona = {p.getCedula(), p.getEmpleado_id(), p.getNombre(), p.getApellido(), p.getFecha_nacimiento().toString(),
                p.getNumero_telefono(), p.getCorreo(), p.getRol(), String.valueOf(p.getSalario()), p.getDireccion(), p.getPassword()};
            tblModel.addRow(Persona);
        });
    }

    public void Limpiar() {
        vista.getTxtCedula().setText("");
        vista.getTxtNombre().setText("");
        vista.getTxtApellido().setText("");
        vista.getTxtCorreo().setText("");
        vista.getTxtPassword().setText("");
        vista.getTxtSalario().setText("");
        vista.getTxtPhone().setText("");
        vista.getTxtDireccion().setText("");
        vista.getCombo_Rol().setSelectedItem("Seleccione");
        ((JTextField) vista.getDateFecha().getDateEditor().getUiComponent()).setText(null);
    }

    public void IncioControl() {
        vista.getBtnAceptar().addActionListener(l -> Registrar());

        vista.getBtnModificar().addActionListener(l -> Modificar());
        vista.getBtnEliminar().addActionListener(l -> Eliminar());
//        vista.getBtnBuscar().addActionListener(l -> Buscar());
        vista.getTxtCedula().addKeyListener(this);
        vista.getTxtNombre().addKeyListener(this);
        vista.getTxtApellido().addKeyListener(this);
        vista.getTxtPhone().addKeyListener(this);
        vista.getTxtCorreo().addKeyListener(this);
        vista.getTxtBuscar().addKeyListener(this);
        vista.getTablaEmpleado().addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                int tabla = vista.getTablaEmpleado().rowAtPoint(e.getPoint());
                if (tabla >= 0) {
                    vista.getTxtCedula().setText(vista.getTablaEmpleado().getValueAt(tabla, 0).toString());
                    vista.getTxtNombre().setText(vista.getTablaEmpleado().getValueAt(tabla, 2).toString());
                    vista.getTxtApellido().setText(vista.getTablaEmpleado().getValueAt(tabla, 3).toString());
                    vista.getDateFecha().setDate(Date.valueOf(vista.getTablaEmpleado().getValueAt(tabla, 4).toString()));
                    vista.getTxtPhone().setText(vista.getTablaEmpleado().getValueAt(tabla, 5).toString());
                    vista.getTxtCorreo().setText(vista.getTablaEmpleado().getValueAt(tabla, 6).toString());
                    vista.getCombo_Rol().setSelectedItem(vista.getTablaEmpleado().getValueAt(tabla, 7).toString());
                    vista.getTxtSalario().setText(vista.getTablaEmpleado().getValueAt(tabla, 9).toString());
                    vista.getTxtDireccion().setText(vista.getTablaEmpleado().getValueAt(tabla, 10).toString());
//                    vista.getTxtPassword().setText(vista.getTablaEmpleado().getValueAt(tabla, 11).toString());
                    vista.getTxtCedula().setEnabled(false);
                }
            }
        });

    }

    private boolean validarCedulaRepetida(String cedula) {
        List<Empleado> empl = modelo.LeerT();

        for (int i = 0; i < empl.size(); i++) {
            if (empl.get(i).getCedula().equals(cedula)) {
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

    private void cbRoles() {
        RolDao rol = new RolDao();
        List<Rol> lista = rol.Aa();
        lista.stream().forEach(ab -> {
            String[] rolDatos = {ab.getEtiqueta()};
            vista.getCombo_Rol().addItem(rolDatos[0]);
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
