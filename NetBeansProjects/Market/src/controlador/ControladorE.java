package controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.Empleado;
import connection.ModeloCliente;
import modelo.MensajeFantasma;
import connection.ModeloEmpleado;
import connection.RolDao;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import modelo.Cliente;
import modelo.Persona;
import modelo.Rol;
import vista.PanelEmpleado;

public class ControladorE implements KeyListener, FocusListener {

    DefaultTableModel tabla_modelo = new DefaultTableModel();

    ModeloEmpleado modelo = new ModeloEmpleado();
    PanelEmpleado vista = new PanelEmpleado();

    public ControladorE() {

        cargaLista();
        cbRoles();
        IncioControl();
//        TextFantasma();

    }

//    public void MODELO() {
//        tabla_modelo.addColumn("Cedula");
//        tabla_modelo.addColumn("Codigo");
//        tabla_modelo.addColumn("Nombre");
//        tabla_modelo.addColumn("Apellido");
//        tabla_modelo.addColumn("Fecha_N");
//        tabla_modelo.addColumn("Phone");
//        tabla_modelo.addColumn("Correo");
//        tabla_modelo.addColumn("Rol");
//        tabla_modelo.addColumn("Salario");
//        tabla_modelo.addColumn("Direccion");
//        tabla_modelo.addColumn("Password");
//        vista.getTablaEmpleado().setModel(tabla_modelo);
//    }
//
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
        RolDao rol = new RolDao();
        Persona per = modelo.existPer(vista.getTxtCedula().getText());
        Empleado existe = modelo.existEmps(vista.getTxtCedula().getText());

        if (existe != null) {
            JOptionPane.showMessageDialog(null, "Empleado existente");
        } else if (!digVfy(vista.getTxtCedula().getText())
                || "".equals(vista.getTxtCedula().getText())
                || "".equals(vista.getTxtNombre().getText())
                || "".equals(vista.getTxtApellido().getText())
                || "".equals(vista.getTxtPhone().getText())
                || "".equals(vista.getTxtDireccion().getText())
                || "".equals(vista.getTxtCorreo().getText())
                || vista.getDateFecha().getDate() == null
                || "".equals(vista.getTxtSalario().getText())
                || "Seleccionar".equals(vista.getCombo_Rol().getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(null, "Llenar campos requeridos");
            Validacione_Campos();
        } else if (per != null && existe == null) {
            int rol_iid = rol.Ff(vista.getCombo_Rol().getSelectedItem().toString());
            Empleado empl = new Empleado(Double.valueOf(vista.getTxtSalario().getText()), vista.getTxtPassword().getText(),
                    rol_iid, vista.getTxtCedula().getText(), vista.getTxtNombre().getText(), vista.getTxtApellido().getText(),
                    vista.getDateFecha().getDate(), vista.getTxtPhone().getText(), vista.getTxtCorreo().getText(), vista.getTxtDireccion().getText());
            if (modelo.insEmpleado(empl)) {
                JOptionPane.showMessageDialog(vista, "Empleado ingresado");
                cargaLista();
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(vista, "NO SE LOGRO GUARDAR EL REGISTRO");

            }
        } else {
            int rol_iid = rol.Ff(vista.getCombo_Rol().getSelectedItem().toString());
            Empleado empl = new Empleado(Double.valueOf(vista.getTxtSalario().getText()), vista.getTxtPassword().getText(),
                    rol_iid, vista.getTxtCedula().getText(), vista.getTxtNombre().getText(), vista.getTxtApellido().getText(),
                    vista.getDateFecha().getDate(), vista.getTxtPhone().getText(), vista.getTxtCorreo().getText(), vista.getTxtDireccion().getText());
            if (modelo.insert(empl)) {
                JOptionPane.showMessageDialog(vista, "SE LOGRO GUARDAR EL DATO CON EXITO");
                cargaLista();
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(vista, "NO SE LOGRO GUARDAR EL REGISTRO");

            }
        }
    }

    public void Modificar() {

//        DefaultTableModel tblEmpleados = (DefaultTableModel) vista.getTablaEmpleado().getModel();
        int fila = vista.getTablaEmpleado().getSelectedRow();
        if (fila != -1) {
            if (!(vista.getTxtNombre().getText().isEmpty()
                    || vista.getTxtApellido().getText().isEmpty() || vista.getCombo_Rol().getSelectedItem().equals("Seleccione")
                    || vista.getTxtSalario().getText().isEmpty() || vista.getTxtPhone().getText().isEmpty()
                    || vista.getTxtCorreo().getText().isEmpty() || vista.getTxtDireccion().getText().isEmpty())) {

                if ((vista.getTxtNombre().getText().matches("^[A-Z].{3,25}$"))) {

                    if ((vista.getTxtApellido().getText().matches("^[A-Z].{3,25}$"))) {

                        if ((vista.getTxtSalario().getText().matches("[0-9]{3,4}"))) {

                            if ((vista.getTxtPhone().getText().matches("^\\d{10}$"))) {

                                if ((vista.getTxtCorreo().getText().matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                                        + "[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*"
                                        + "(\\.[A-Za-z]{2,})$"))) {

                                    if ((vista.getTxtDireccion().getText().matches("^[A-Za-z].{3,25}$"))) {
                                        Empleado empleado = new Empleado();
                                        RolDao rol = new RolDao();
                                        int rol_iid = rol.Ff(vista.getCombo_Rol().getSelectedItem().toString());
                                        empleado.setNombre(vista.getTxtNombre().getText());
                                        empleado.setApellido(vista.getTxtApellido().getText());
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
                                                vista.getTxtCedula().setEnabled(true);
                                                vista.getTxtPassword().setEnabled(true);
                                                vista.getDateFecha().setEnabled(true);

                                            } else {
                                                JOptionPane.showMessageDialog(vista, "NO SE LOGRO GRABAR EL DATO EN LA BDD");
                                            }
                                        }

                                    } else {
                                        JOptionPane.showMessageDialog(null, "La Direccion debe de tener mas de 3 caracteres");

                                    }

                                } else {
                                    JOptionPane.showMessageDialog(null, "Ejemplo de Correo: Manuelita7@hotmail.com");

                                }

                            } else {
                                JOptionPane.showMessageDialog(null, "El numero de telefono debe de tener 10 digitos");

                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "El Salario no debe decer mayor o menor a 3 digitos");

                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Su Apellido debe de tener mas de 3 caracteres");

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Su Nombre debe de tener mas de 4 caracteres");

                }

            }
        } else {
            JOptionPane.showMessageDialog(vista, "DE PRIMERO CLICK ENCIMA EN ALGUN EMPLEADO Y LUEGO EN MODIFICAR", "AVISO", 2);

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
                    vista.getTxtCedula().setEnabled(true);
                    vista.getTxtPassword().setEnabled(true);

                } else {
                    JOptionPane.showMessageDialog(vista, "ERROR CON LA CONEXION");
                }
            }
        } else {
            JOptionPane.showMessageDialog(vista, "DE PRIMERO CLICK ENCIMA EN ALGUN EMPLEADO Y LUEGO EN ELIMINAR", "AVISO", 2);
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
                p.getNumero_telefono(), p.getCorreo(), p.getRol(), String.valueOf(p.getRol_id()),  String.valueOf(p.getSalario()), p.getDireccion(), p.getPassword()};
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
        vista.getTxtPassword().setEnabled(true);
        vista.getTxtCedula().setEnabled(true);
        vista.getDateFecha().setEnabled(true);
        vista.getDateFecha().setToolTipText("");
        vista.getTxtPassword().setToolTipText("");
        vista.getTxtCedula().setToolTipText("");
        vista.getTxtPassword().getToolTipText();
        vista.getTxtCedula().getToolTipText();
        vista.getDateFecha().getToolTipText();
        Campos();
    }

    public void IncioControl() {
        vista.getBtnAceptar().addActionListener(l -> Registrar());
        vista.getBtnLimpiar().addActionListener(l -> Limpiar());
        vista.getBtnModificar().addActionListener(l -> Modificar());
        vista.getBtnEliminar().addActionListener(l -> Eliminar());
        vista.getTxtCedula().addKeyListener(this);
        vista.getDateFecha().addPropertyChangeListener(l -> ValidarCampoJcalendar());
        vista.getTxtNombre().addKeyListener(this);
        vista.getTxtApellido().addKeyListener(this);
        vista.getTxtPhone().addKeyListener(this);
        vista.getTxtSalario().addKeyListener(this);
        vista.getTxtDireccion().addKeyListener(this);
        vista.getTxtPassword().addKeyListener(this);
        vista.getTxtCorreo().addKeyListener(this);
        vista.getTxtBuscar().addKeyListener(this);
        vista.getTxtSalario().addKeyListener(this);
        vista.getTxtCedula().addFocusListener(this);
        vista.getTxtPhone().addFocusListener(this);
        vista.getCombo_Rol().addFocusListener(this);
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
                    vista.getTxtPassword().setText(vista.getTablaEmpleado().getValueAt(tabla, 11).toString());
                    vista.getDateFecha().setEnabled(false);
                    vista.getTxtCedula().setEnabled(false);
                    vista.getTxtPassword().setEnabled(false);
                    vista.getDateFecha().setToolTipText("Este campo esta bloqueado.!");
                    vista.getTxtPassword().setToolTipText("Este campo esta bloqueado.!");
                    vista.getTxtCedula().setToolTipText("Este campo esta bloqueado.!");
                    vista.getTxtPassword().getToolTipText();
                    vista.getTxtCedula().getToolTipText();
                    vista.getDateFecha().getToolTipText();
                    Campos();
                }
            }
        });

    }

    public boolean CedulaC(String cedula) {

        List<Empleado> empl = modelo.LeerT();

        for (int i = 0; i < empl.size(); i++) {

            if (empl.get(i).getCedula().equals(cedula)) {
                JOptionPane.showMessageDialog(vista, "Esta cedula pertenece a una persona que ya ha sido registrada", "Advertencia!", 2);
                return false;
            }
        }

        ModeloCliente mdCliente = new ModeloCliente();
        List<Cliente> clie = mdCliente.LeerT();
        for (int i = 0; i < clie.size(); i++) {
            if (empl.get(i).getCedula().equals(cedula)) {
                JOptionPane.showMessageDialog(vista, "POR RESTRINCION DE LA EMPRESA EL EMPLEADO NO PUEDE SER REGISTRADO EN ESTE FORMULARIO", "Advertencia!", 2);

                return false;
            }

        }
        return true;
    }

    public static boolean digVfy(String cedula) {
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

    private void cbRoles() {
        RolDao rol = new RolDao();
        List<Rol> lista = rol.Aa();
        lista.stream().forEach(ab -> {
            String[] rolDatos = {ab.getEtiqueta()};
            vista.getCombo_Rol().addItem(rolDatos[0]);
        });

    }

    public void ValidarCampoJcalendar() {
        if (vista.getDateFecha().getDate() == null) {
            vista.getVfyBirth().setText("");

        } else {
            vista.getVfyBirth().setText("");
        }

    }

    public void Campos() {
        vista.getVfyCedula().setText("");
        vista.getVfyNombre().setText("");
        vista.getVfyApellido().setText("");
        vista.getVfyCelu().setText("");
        vista.getVfyDir().setText("");
        vista.getVfyBirth().setText("");
        vista.getVfyContra().setText("");
        vista.getVfyRol().setText("");
        vista.getVfySalario().setText("");
        vista.getVfyCorreo().setText("");

    }

    public void Validacione_Campos() {
        if (vista.getTxtCedula().getText().isEmpty()) {
            vista.getVfyCedula().setText("Campos Requeridos.!");
        } else if (!digVfy(vista.getTxtCedula().getText())) {
            vista.getVfyCedula().setText("No es cédula!!!");
        } else {
            vista.getVfyCedula().setText("");
        }

        if (!vista.getTxtNombre().getText().isEmpty()) {
            vista.getVfyNombre().setText("");
        } else {
            vista.getVfyNombre().setText("Campos Requeridos.!");
        }

        if (!vista.getTxtApellido().getText().isEmpty()) {
            vista.getVfyApellido().setText("");
        } else {
            vista.getVfyApellido().setText("Campos Requeridos.!");
        }

        if (!vista.getCombo_Rol().getSelectedItem().equals("Seleccione")) {
            vista.getVfyRol().setText("");
        } else {
            vista.getVfyRol().setText("Campos Requeridos.!");
        }

        if (vista.getDateFecha().getDate() == null) {
            vista.getVfyBirth().setText("Campos Requeriidos.!");
        } else {
            vista.getVfyBirth().setText("");
        }

        if (!vista.getTxtSalario().getText().isEmpty()) {
            vista.getVfySalario().setText("");
        } else {
            vista.getVfySalario().setText("Campos Requeridos.!");
        }

        if (!vista.getTxtPhone().getText().isEmpty()) {
            vista.getVfyCelu().setText("");
        } else {
            vista.getVfyCelu().setText("Campos Requeridos.!");
        }

        if (!vista.getTxtCorreo().getText().isEmpty()) {
            vista.getVfyCorreo().setText("");
        } else {
            vista.getVfyCorreo().setText("Campos Requeridos.!");
        }

        if (!vista.getTxtDireccion().getText().isEmpty()) {
            vista.getVfyDir().setText("");
        } else {
            vista.getVfyDir().setText("Campos Requeridos.!");
        }

        if (vista.getTxtPassword().getText().isEmpty() 
                && (vista.getCombo_Rol().getSelectedItem().equals("Administrador") 
                || vista.getCombo_Rol().getSelectedItem().equals("Cajero"))) {
            vista.getVfyContra().setText("Campos Requeridos.!");
        } else {
            vista.getVfyContra().setText("");
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getSource() == vista.getTxtCedula()) {
            char c = e.getKeyChar();
            if (!Character.isDigit(c) && e.getKeyChar() != KeyEvent.VK_BACK_SPACE) {
                e.consume();
            }
        } else if (e.getSource() == vista.getTxtNombre()) {
            char r = e.getKeyChar();
            if (((Character.isDigit(r)))) {
                e.consume();
            }
        } else if (e.getSource() == vista.getTxtApellido()) {
            char r = e.getKeyChar();
            if (((Character.isDigit(r)))) {
                e.consume();
            }
        } else if (e.getSource() == vista.getTxtPhone()) {
            char c = e.getKeyChar();
            if (!Character.isDigit(c) && e.getKeyChar() != KeyEvent.VK_BACK_SPACE) {
                e.consume();
            }
        } else if (e.getSource() == vista.getTxtSalario()) {
            char c = e.getKeyChar();
            if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)
                    && (c != '.')) {
                e.consume();
            }
            if (c == '.' && vista.getTxtSalario().getText().contains(".")) {
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

    @Override
    public void focusGained(FocusEvent e) {
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (e.getSource() == vista.getTxtCedula()) {
            if (modelo.existEmps(vista.getTxtCedula().getText()) != null) {
                JOptionPane.showMessageDialog(null, "Registro existente");
            } else if (digVfy(vista.getTxtCedula().getText())) {
                vista.getVfyCedula().setText("");
                Persona per = modelo.existPer(vista.getTxtCedula().getText());
                if (per != null) {
                    vista.getTxtNombre().setText(per.getNombre());
                    vista.getTxtApellido().setText(per.getApellido());
                    vista.getDateFecha().setDate(per.getFecha_nacimiento());
                    vista.getTxtPhone().setText(per.getNumero_telefono());
                    vista.getTxtDireccion().setText(per.getDireccion());
                    vista.getTxtCorreo().setText(per.getCorreo());
                }
            } else {
                vista.getVfyCedula().setText("No es una cedula!!!");
            }
        } else if (e.getSource() == vista.getTxtPhone()) {
            if (vista.getTxtPhone().getText().length() <= 10) {
                vista.getVfyCelu().setText("");
            } else {
                vista.getVfyCelu().setText("No es un telefono!!!");
            }
        } else if (e.getSource() == vista.getCombo_Rol()) {
            if (vista.getCombo_Rol().getSelectedItem().equals("Administrador") 
                    || vista.getCombo_Rol().getSelectedItem().equals("Cajero")) {
                vista.getTxtPassword().setEnabled(true);
            } else {
                vista.getTxtPassword().setEnabled(false);
            }
        }
    }

}
