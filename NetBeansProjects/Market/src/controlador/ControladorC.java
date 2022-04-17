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
import connection.RolDao;
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
        if (!(vista.getTxtCedula().getText().isEmpty() || vista.getTxtNombre().getText().isEmpty()
                || vista.getTxtApellido().getText().isEmpty()
                || vista.getDateFecha().getDate() == null || vista.getTxtPhone().getText().isEmpty()
                || vista.getTxtCorreo().getText().isEmpty() || vista.getTxtDireccion().getText().isEmpty())) {
            if (validarCedula(vista.getTxtCedula().getText()) == true) {
                if (CedulaE(vista.getTxtCedula().getText()) == true) {
//
//                    if ((vista.getTxtNombre().getText().matches("^[A-Za-z].{3,25}$"))) {
//
//                        if ((vista.getTxtApellido().getText().matches("^[A-Za-z].{3,25}$"))) {
//
//                            if ((vista.getTxtPhone().getText().matches("^\\d{10}$"))) {
//
//                                if ((vista.getTxtCorreo().getText().matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
//                                        + "[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*"
//                                        + "(\\.[A-Za-z]{2,})$"))) {
//
//                                    if ((vista.getTxtDireccion().getText().matches("^[A-Za-z].{3,25}$"))) {

                                        int enviar = JOptionPane.showConfirmDialog(vista, "ESTA SEGURO DE GUARDAR ESTE DATO", "Confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                                        if (enviar == JOptionPane.YES_NO_OPTION) {
                                            Cliente cl = new Cliente(vista.getTxtCedula().getText(), vista.getTxtNombre().getText(),
                                                    vista.getTxtApellido().getText(), vista.getDateFecha().getDate(),
                                                    vista.getTxtPhone().getText(), vista.getTxtCorreo().getText(), vista.getTxtDireccion().getText());
                                            ModeloCliente md = new ModeloCliente();
                                            if (md.insert(cl)) {
                                                JOptionPane.showMessageDialog(vista, "SE LOGRO GUARDAR EL DATO CON EXITO");
                                                cargaLista();
                                                Limpiar();
                                            } else {
                                                JOptionPane.showMessageDialog(vista, "NO SE LOGRO GUARDAR EL REGISTRO");

                                            }
                                        }

//                                    } else {
//                                        JOptionPane.showMessageDialog(null, "La Direccion debe de tener mas de 3 caracteres");
//
//                                    }
//
//                                } else {
//                                    JOptionPane.showMessageDialog(null, "Ejemplo de Correo: Manuelita7@hotmail.com");
//
//                                }
//
//                            } else {
//                                JOptionPane.showMessageDialog(null, "El numero de telefono debe de tener 10 digitos");
//
//                            }

//                        } else {
//                            JOptionPane.showMessageDialog(null, "Su Apellido debe de tener mas de 3 caracteres");
//
//                        }
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Su Nombre debe de tener mas de 3 caracteres");
//
//                    }
                }

            }
        } else {
            Validacione_Campos();

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

        if (e.getSource() == vista.getTxtPhone()) {
            if (!vista.getTxtPhone().getText().trim().equals("")) {
                vista.getLb5().setText("");
            } else {
                vista.getLb5().setText("Campos Requeridos.!");
            }

        }
        if (e.getSource() == vista.getTxtCorreo()) {
            if (!vista.getTxtCorreo().getText().trim().equals("")) {
                vista.getLb6().setText("");
            } else {
                vista.getLb6().setText("Campos Requeridos.!");
            }

        }
        if (e.getSource() == vista.getTxtDireccion()) {
            if (!vista.getTxtDireccion().getText().trim().equals("")) {
                vista.getLb7().setText("");
            } else {
                vista.getLb7().setText("Campos Requeridos.!");
            }

        }

    }

}