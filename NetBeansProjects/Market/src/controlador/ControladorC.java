package controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Empleado;
import modelo.MensajeFantasma;
import connection.ModeloCliente;
import connection.ModeloEmpleado;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import modelo.Persona;
import vista.PanelCliente;

/**
 *
 * @author 59399
 */
public class ControladorC implements KeyListener, FocusListener {

    ModeloCliente modelo = new ModeloCliente();
    PanelCliente vista = new PanelCliente();

    public ControladorC() {
        cargaLista();
        IncioControl();
//        TextFantasma();
    }

//    public void TextFantasma() {
//        MensajeFantasma m1 = new MensajeFantasma("Ditgite la Cedula", vista.getTxtCedula());
//        MensajeFantasma m2 = new MensajeFantasma("Ditgite el Nombre ", vista.getTxtNombre());
//        MensajeFantasma m3 = new MensajeFantasma("Ditgite el Apellido", vista.getTxtApellido());
//        MensajeFantasma m4 = new MensajeFantasma("Ditgite un Correo", vista.getTxtCorreo());
//        MensajeFantasma m5 = new MensajeFantasma("Ditgite una Direccion", vista.getTxtDireccion());
//        MensajeFantasma m6 = new MensajeFantasma("Ditgite un Numero de telefono", vista.getTxtPhone());
//
//    }

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
        Persona per = modelo.existPer(vista.getTxtCedula().getText());
        Cliente existe = modelo.existCLi(vista.getTxtCedula().getText());
        if (modelo.activo(vista.getTxtCedula().getText())) {
            JOptionPane.showMessageDialog(null, "Registro existente");
        } else if (!digVfy(vista.getTxtCedula().getText())
                || "".equals(vista.getTxtCedula().getText())
                || "".equals(vista.getTxtNombre().getText())
                || "".equals(vista.getTxtApellido().getText())
                || "".equals(vista.getTxtPhone().getText())
                || "".equals(vista.getTxtDireccion().getText())
                || "".equals(vista.getTxtCorreo().getText())
                || vista.getDateFecha().getDate() == null) {
            JOptionPane.showMessageDialog(null, "Llenar campos obligatorios");
            Validacione_Campos();
        } else if (existe != null) {
            existe.setNombre(vista.getTxtNombre().getText());
            existe.setApellido(vista.getTxtApellido().getText());
            existe.setFecha_nacimiento(vista.getDateFecha().getDate());
            existe.setCorreo(vista.getTxtCorreo().getText());
            existe.setDireccion(vista.getTxtDireccion().getText());
            existe.setNumero_telefono(vista.getTxtPhone().getText());
            if (modelo.ModificarT(existe, existe.getCedula())) {
                JOptionPane.showMessageDialog(null, "Activando Cliente");
                cargaLista();
                Limpiar();
            }
        } else if (per != null && existe == null) {
            existe = new Cliente(vista.getTxtCedula().getText(), vista.getTxtNombre().getText(),
                    vista.getTxtApellido().getText(),
                    vista.getDateFecha().getDate(), vista.getTxtPhone().getText(),
                    vista.getTxtCorreo().getText(), vista.getTxtDireccion().getText());
            if (modelo.insCliente(existe)) {
                JOptionPane.showMessageDialog(null, "CLiente Ingresado");
                cargaLista();
                Limpiar();
            }
        } else {
            existe = new Cliente(vista.getTxtCedula().getText(), vista.getTxtNombre().getText(),
                    vista.getTxtApellido().getText(),
                    vista.getDateFecha().getDate(), vista.getTxtPhone().getText(),
                    vista.getTxtCorreo().getText(), vista.getTxtDireccion().getText());
            if (modelo.insert(existe)) {
                JOptionPane.showMessageDialog(null, "CLiente Ingresado");
                cargaLista();
                Limpiar();
            }
        }
    }

    public void Modificar() {

        int fila = vista.getTablaCliente().getSelectedRow();
        if (fila != -1) {

            if (!(vista.getTxtNombre().getText().isEmpty()
                    || vista.getTxtApellido().getText().isEmpty()
                    || vista.getTxtPhone().getText().isEmpty()
                    || vista.getTxtCorreo().getText().isEmpty() || vista.getTxtDireccion().getText().isEmpty())) {
//                if ((vista.getTxtNombre().getText().matches("^[A-Za-z].{3,25}$"))) {

//                    if ((vista.getTxtApellido().getText().matches("^[A-Za-z].{3,25}$"))) {
//                        if ((vista.getTxtPhone().getText().matches("^\\d{10}$"))) {
//                            if ((vista.getTxtCorreo().getText().matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
//                                    + "[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*"
//                                    + "(\\.[A-Za-z]{2,})$"))) {
//                                if ((vista.getTxtDireccion().getText().matches("^[A-Za-z].{3,25}$"))) {
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
                        vista.getTxtCedula().setEnabled(true);
                        vista.getDateFecha().setEnabled(true);

                    } else {
                        JOptionPane.showMessageDialog(vista, "NO SE LOGRO GRABAR EL REGISTRO");
                    }
                }

//                                } else {
//                                    JOptionPane.showMessageDialog(null, "La Direccion debe de tener mas de 3 caracteres");
//
//                                }
//                            } else {
//                                JOptionPane.showMessageDialog(null, "Ejemplo de Correo: Manuelita7@hotmail.com");
//
//                            }
//                        } else {
//                            JOptionPane.showMessageDialog(null, "El numero de telefono debe de tener 10 digitos");
//
//                        }
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Su Apellido debe de tener mas de 3 caracteres");
//
//                    }
//                } else {
//                    JOptionPane.showMessageDialog(null, "Su Nombre debe de tener mas de 3 caracteres");
//
//                }
            } else {
//                Validacione_Campos();
            }

        } else {
            JOptionPane.showMessageDialog(vista, "DE PRIMERO CLICK ENCIMA EN ALGUN CLIENTE Y LUEGO MODIFICAR", "AVISO", 2);

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
                    vista.getTxtCedula().setEnabled(true);
                    vista.getDateFecha().setEnabled(true);

                } else {
                    JOptionPane.showMessageDialog(vista, "hubo un error");
                }
            }
        } else {
            JOptionPane.showMessageDialog(vista, "DE PRIMERO CLICK ENCIMA EN ALGUN CLIENTE Y LUEGO EN ELIMINAR", "AVISO", 2);
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
        vista.getTxtCedula().setEnabled(true);
        vista.getDateFecha().setEnabled(true);

        Campos();

    }

    public boolean CedulaE(String cedula) {

        List<Cliente> clie = modelo.LeerT();

        for (int i = 0; i < clie.size(); i++) {
            if (clie.get(i).getCedula().equals(cedula)) {
                JOptionPane.showMessageDialog(vista, "Esta cedula pertenece a una persona que ya ha sido registrada", "Advertencia!", 2);
                return false;
            }
        }

        ModeloEmpleado mdEmpleado = new ModeloEmpleado();
        List<Empleado> empl = mdEmpleado.LeerT();
        for (int i = 0; i < empl.size(); i++) {
            if (empl.get(i).getCedula().equals(cedula)) {
                JOptionPane.showMessageDialog(vista, "POR RESTRINCION DE LA EMPRESA EL EMPLEADO NO PUEDE SER REGISTRADO EN ESTE FORMULARIO", "Advertencia!", 2);

                return false;
            }

        }
        return true;
    }

    public void IncioControl() {
        vista.getBtnRegistrar().addActionListener(l -> Registrar());
        vista.getBtnModificar().addActionListener(l -> Modificar());
        vista.getBtnEliminar().addActionListener(l -> Eliminar());
        vista.getBtnLimpiar().addActionListener(l -> Limpiar());
        vista.getTxtCedula().addKeyListener(this);
        vista.getTxtNombre().addKeyListener(this);
        vista.getTxtApellido().addKeyListener(this);
        vista.getDateFecha().addPropertyChangeListener(l -> ValidarCampoJcalendar());
        vista.getTxtPhone().addKeyListener(this);
        vista.getTxtCorreo().addKeyListener(this);
        vista.getTxtBuscar().addKeyListener(this);
        vista.getTxtPhone().addFocusListener(this);
        vista.getTxtCedula().addFocusListener(this);
        vista.getTxtDireccion().addKeyListener(this);

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
                    vista.getDateFecha().setEnabled(false);
                    Campos();

                }
            }
        });

    }

    public void Campos() {
        vista.getLb1().setText("");
        vista.getLb2().setText("");
        vista.getLb3().setText("");
        vista.getLb4().setText("");
        vista.getLb5().setText("");
        vista.getLb6().setText("");
        vista.getLb7().setText("");

    }

    public void ValidarCampoJcalendar() {
        if (vista.getDateFecha().getDate() == null) {
            vista.getLb4().setText("");

        } else {
            vista.getLb4().setText("");
        }

    }

    public void Validacione_Campos() {

        if (vista.getTxtCedula().getText().isEmpty()) {
            vista.getLb1().setText("Campos Requeridos.!");
        } else if (!digVfy(vista.getTxtCedula().getText())) {
            vista.getLb1().setText("No es cédula!!!");
        } else {
            vista.getLb1().setText("");
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

        if (vista.getDateFecha().getDate() == null) {
            vista.getLb4().setText("Campos Requeriidos.!");
        } else {
            vista.getLb4().setText("");
        }

        if (!vista.getTxtPhone().getText().isEmpty()) {
            vista.getLb5().setText("");
        } else {
            vista.getLb5().setText("Campos Requeridos.!");
        }

        if (!vista.getTxtCorreo().getText().isEmpty()) {
            vista.getLb6().setText("");
        } else {
            vista.getLb6().setText("Campos Requeridos.!");
        }

        if (!vista.getTxtDireccion().getText().isEmpty()) {
            vista.getLb7().setText("");
        } else {
            vista.getLb7().setText("Campos Requeridos.!");
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
            if (modelo.activo(vista.getTxtCedula().getText())) {
                JOptionPane.showMessageDialog(null, "Registro existente");
            } else if (digVfy(vista.getTxtCedula().getText())) {
                vista.getLb1().setText("");
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
                vista.getLb1().setText("No es una cedula!!!");
            }
        } else if (e.getSource() == vista.getTxtPhone()) {
            if (vista.getTxtPhone().getText().length() == 10) {
                vista.getLb1().setText("");
            } else {
                vista.getLb5().setText("No es un telefono!!!");
            }
        }

    }

    boolean digVfy(String cedula) {
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

}
