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
import connection.ModeloCliente;
import modelo.MensajeFantasma;
import connection.ModeloEmpleado;
import modelo.Proveedor;
import connection.RolDao;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import modelo.Cliente;
import modelo.Persona;
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

        if (!(vista.getTxtCedula().getText().isEmpty() || vista.getTxtNombre().getText().isEmpty()
                || vista.getTxtApellido().getText().isEmpty() || vista.getCombo_Rol().getSelectedItem().equals("Seleccione")
                || vista.getDateFecha().getDate() == null || vista.getTxtSalario().getText().isEmpty() || vista.getTxtPhone().getText().isEmpty()
                || vista.getTxtCorreo().getText().isEmpty() || vista.getTxtDireccion().getText().isEmpty()
                || vista.getTxtPassword().getText().isEmpty())) {
            if (validarCedula(vista.getTxtCedula().getText()) == true) {
                if (CedulaC(vista.getTxtCedula().getText()) == true) {

                    if ((vista.getTxtNombre().getText().matches("^[A-Z].{3,25}$"))) {

                        if ((vista.getTxtApellido().getText().matches("^[A-Z].{3,25}$"))) {

                            if ((vista.getTxtSalario().getText().matches("[0-9]{3,4}"))) {

                                if ((vista.getTxtPhone().getText().matches("^\\d{10}$"))) {

                                    if ((vista.getTxtCorreo().getText().matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                                            + "[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*"
                                            + "(\\.[A-Za-z]{2,})$"))) {

                                        if ((vista.getTxtDireccion().getText().matches("^[A-Za-z].{3,25}$"))) {

                                            if ((vista.getTxtPassword().getText().matches("^(?=.*[0-9])"
                                                    + "(?=.*[a-z])(?=.*[A-Z])"
                                                    + "(?=.*[@#$%^&+=])"
                                                    + "(?=\\S+$).{8,20}$"))) {
                                                if (validarCedula(vista.getTxtCedula().getText()) == true) {

                                                    int enviar = JOptionPane.showConfirmDialog(vista, "ESTA SEGURO DE GUARDAR ESTE DATO", "Confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                                                    if (enviar == JOptionPane.YES_NO_OPTION) {
                                                        RolDao rol = new RolDao();
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

                                            } else {
                                                JOptionPane.showMessageDialog(null, "Su contraseña debe de tener 1 letra mayuscula,1 letra minuscula,"
                                                        + "1 numero, 1 caracter especial, minimo 8 caracteres");
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

            }
        } else {
            Validacione_Campos();
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
        vista.getTxtPassword().setEnabled(true);
        vista.getTxtCedula().setEnabled(true);
        vista.getDateFecha().setEnabled(true);
        vista.getDateFecha().setToolTipText("");
        vista.getTxtPassword().setToolTipText("");
        vista.getTxtCedula().setToolTipText("");
        vista.getTxtPassword().getToolTipText();
        vista.getTxtCedula().getToolTipText();
        vista.getDateFecha().getToolTipText();
        vista.getLb4().setText("");

    }

    public void IncioControl() {
        vista.getBtnAceptar().addActionListener(l -> Registrar());
        vista.getBtnLimpiar().addActionListener(l -> Limpiar());
        vista.getBtnModificar().addActionListener(l -> Modificar());
        vista.getBtnEliminar().addActionListener(l -> Eliminar());
//        vista.getBtnBuscar().addActionListener(l -> Buscar());
        vista.getTxtCedula().addKeyListener(this);
        vista.getDateFecha().addPropertyChangeListener(l -> ValidarCampoJcalendar());
        vista.getCombo_Rol().addActionListener(l -> ValidacionDeCombobox());
        vista.getTxtNombre().addKeyListener(this);
        vista.getTxtApellido().addKeyListener(this);
        vista.getTxtPhone().addKeyListener(this);
        vista.getTxtSalario().addKeyListener(this);
        vista.getTxtDireccion().addKeyListener(this);
        vista.getTxtPassword().addKeyListener(this);
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

// Validaciones de Campos y Validacion de Cedula.?
    private boolean validarCedula(String cedula) {

        //Validar Cedula Ecuatoriana//
        boolean cedulaCorrecta = false;

        try {

            if (cedula.length() == 10) {
                int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
                if (tercerDigito < 6) {
                    int[] coefValCedula = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                    int verificador = Integer.parseInt(cedula.substring(9, 10));
                    int suma = 0;
                    int digito = 0;
                    for (int i = 0; i < (cedula.length() - 1); i++) {
                        digito = Integer.parseInt(cedula.substring(i, i + 1)) * coefValCedula[i];
                        suma += ((digito % 10) + (digito / 10));
                    }
                    if ((suma % 10 == 0) && (suma % 10 == verificador)) {
                        cedulaCorrecta = true;
                    } else if ((10 - (suma % 10)) == verificador) {
                        cedulaCorrecta = true;
                    } else {
                        cedulaCorrecta = false;
                    }
                } else {
                    cedulaCorrecta = false;
                }
            } else {
                cedulaCorrecta = false;
            }
        } catch (NumberFormatException nfe) {
            cedulaCorrecta = false;
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, "Una excepcion ocurrio en el proceso de validadcion");
            cedulaCorrecta = false;
        }

        if (!cedulaCorrecta) {
            JOptionPane.showMessageDialog(null, "La Cédula ingresada es Incorrecta");
        }
        return cedulaCorrecta;

    }

    private void cbRoles() {
        RolDao rol = new RolDao();
        List<Rol> lista = rol.Aa();
        lista.stream().forEach(ab -> {
            String[] rolDatos = {ab.getEtiqueta()};
            vista.getCombo_Rol().addItem(rolDatos[0]);
        });

    }

    public void ValidacionDeCombobox() {
        if (vista.getCombo_Rol().getSelectedIndex() > -1) {
            String as = vista.getCombo_Rol().getSelectedItem().toString();

            if (as.equals("Seleccione")) {
                vista.getLb4().setText("Campos Requeridos.!");

            } else {
                vista.getLb4().setText("");

            }
        }
    }

    public void ValidarCampoJcalendar() {
        if (vista.getDateFecha().getDate() == null) {
            vista.getLb5().setText("");

        } else {
            vista.getLb5().setText("");
        }

    }

    public void Campos() {
        vista.getLb1().setText("");
        vista.getLb2().setText("");
        vista.getLb3().setText("");
        vista.getLb4().setText("");
        vista.getLb5().setText("");
        vista.getLb6().setText("");
        vista.getLb7().setText("");
        vista.getLb8().setText("");
        vista.getLb9().setText("");
        vista.getLb10().setText("");

    }

    public void Validacione_Campos() {

        if (!vista.getTxtCedula().getText().isEmpty()) {
            vista.getLb1().setText("");
        } else {
            vista.getLb1().setText("Campos Requeridos.!");
        }

        if (!vista.getTxtNombre().getText().isEmpty()) {
            vista.getLb2().setText("");

        } else {
            vista.getLb2().setText("Campos Requeridos.!");
        }

        if (!vista.getTxtApellido().getText().isEmpty()) {
            vista.getLb3().setText("");

        } else {
            vista.getLb3().setText("Campos Requeridos.!");

        }

        if (!vista.getCombo_Rol().getSelectedItem().equals("Seleccione")) {
            vista.getLb4().setText("");
        } else {
            vista.getLb4().setText("Campos Requeridos.!");

        }
        if (vista.getDateFecha().getDate() == null) {
            vista.getLb5().setText("Campos Requeriidos.!");
        } else {
            vista.getLb5().setText("");

        }
        if (!vista.getTxtSalario().getText().isEmpty()) {
            vista.getLb6().setText("");
        } else {
            vista.getLb6().setText("Campos Requeridos.!");

        }

        if (!vista.getTxtPhone().getText().isEmpty()) {
            vista.getLb7().setText("");
        } else {
            vista.getLb7().setText("Campos Requeridos.!");

        }

        if (!vista.getTxtCorreo().getText().isEmpty()) {
            vista.getLb8().setText("");
        } else {
            vista.getLb8().setText("Campos Requeridos.!");

        }

        if (!vista.getTxtDireccion().getText().isEmpty()) {
            vista.getLb9().setText("");
        } else {
            vista.getLb9().setText("Campos Requeridos.!");

        }

        if (!vista.getTxtPassword().getText().isEmpty()) {
            vista.getLb10().setText("");
        } else {
            vista.getLb10().setText("Campos Requeridos.!");

        }

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

        if (e.getSource() == vista.getTxtCedula()) {
            if (!vista.getTxtCedula().getText().trim().equals("")) {
                vista.getLb1().setText("");
            } else {
                vista.getLb1().setText("Campos Requeridos.!");
            }
        }
        if (e.getSource() == vista.getTxtNombre()) {
            if (!vista.getTxtNombre().getText().trim().equals("")) {
                vista.getLb2().setText("");
            } else {
                vista.getLb2().setText("Campos Requeridos.!");
            }

        }
        if (e.getSource() == vista.getTxtApellido()) {
            if (!vista.getTxtApellido().getText().trim().equals("")) {
                vista.getLb3().setText("");
            } else {
                vista.getLb3().setText("Campos Requeridos.!");
            }

        }

        if (e.getSource() == vista.getTxtSalario()) {
            if (!vista.getTxtSalario().getText().trim().equals("")) {
                vista.getLb6().setText("");
            } else {
                vista.getLb6().setText("Campos Requeridos.!");
            }

        }
        if (e.getSource() == vista.getTxtPhone()) {
            if (!vista.getTxtPhone().getText().trim().equals("")) {
                vista.getLb7().setText("");
            } else {
                vista.getLb7().setText("Campos Requeridos.!");
            }

        }
        if (e.getSource() == vista.getTxtCorreo()) {
            if (!vista.getTxtCorreo().getText().trim().equals("")) {
                vista.getLb8().setText("");
            } else {
                vista.getLb8().setText("Campos Requeridos.!");
            }

        }
        if (e.getSource() == vista.getTxtDireccion()) {
            if (!vista.getTxtDireccion().getText().trim().equals("")) {
                vista.getLb9().setText("");
            } else {
                vista.getLb9().setText("Campos Requeridos.!");
            }

        }

        if (e.getSource() == vista.getTxtPassword()) {
            if (!vista.getTxtPassword().getText().trim().equals("")) {
                vista.getLb10().setText("");
            } else {
                vista.getLb10().setText("Campos Requeridos.!");
            }

        }

    }

}
