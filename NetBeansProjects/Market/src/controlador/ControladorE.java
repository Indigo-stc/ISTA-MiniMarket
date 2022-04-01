/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

//import Clases.Empleado;
//import Menu.Vista.MenuPricpal;
//import Menu.Vista.PanelEmpleado;
//import Modelo.MensajeFantasma;
//import Modelo.ModeloEmpleado;
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
import modelo.MensajeFantasma;
import modelo.ModeloEmpleado;
import vista.PanelEmpleado;

/**
 *
 * @author 59399
 */
public class ControladorE {

    DefaultTableModel tabla_modelo = new DefaultTableModel();

    private ModeloEmpleado modelo;
    private PanelEmpleado vista;

    public ControladorE() {

    }

    public ControladorE(ModeloEmpleado modelo, PanelEmpleado vista) {
        this.modelo = modelo;
        this.vista = vista;
        cargaLista();
        TextFantasma();
    }

    public void MODELO() {
        tabla_modelo.addColumn("Cedula");
        tabla_modelo.addColumn("Codigo");
        tabla_modelo.addColumn("Nombre");
        tabla_modelo.addColumn("Apellido");
        tabla_modelo.addColumn("Fecha_N");
        tabla_modelo.addColumn("Phone");
        tabla_modelo.addColumn("Correo");
        tabla_modelo.addColumn("Rol");
        tabla_modelo.addColumn("Salario");
        tabla_modelo.addColumn("Direccion");
        tabla_modelo.addColumn("Password");
        vista.getTablaEmpleado().setModel(tabla_modelo);
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
        if (!(vista.getTxtCedula().getText().isEmpty())) {

            if (!(vista.getTxtNombre().getText().isEmpty())) {

                if (!(vista.getTxtApellido().getText().isEmpty())) {

                    if (!(vista.getCombo_Rol().getSelectedItem().equals("Seleccione"))) {

//                        if (!(((JTextField) vista.getDateFecha().getDateEditor().getUiComponent()).getText().equals(""))) {

                            if (!(vista.getTxtSalario().getText().isEmpty())) {

                                if (!(vista.getTxtPhone().getText().isEmpty())) {

                                    if (!(vista.getTxtCorreo().getText().isEmpty())) {

                                        if (!(vista.getTxtDireccion().getText().isEmpty())) {

                                            if (!(vista.getTxtPassword().getText().isEmpty())) {

                                                if (validarCedulaRepetida(vista.getTxtCedula().getText()) == true) {

                                                    modelo.setCedula(vista.getTxtCedula().getText());
                                                    modelo.setNombre(vista.getTxtNombre().getText());
                                                    modelo.setApellido(vista.getTxtApellido().getText());
//                                                    modelo.setFecha_nacimiento(((JTextField) vista.getDateFecha().getDateEditor().getUiComponent()).getText());
                                                    modelo.setNumero_telefono(vista.getTxtPhone().getText());
                                                    modelo.setCorreo(vista.getTxtCorreo().getText());
                                                    modelo.setDireccion(vista.getTxtDireccion().getText());
                                                    modelo.setRol(vista.getCombo_Rol().getSelectedItem().toString());
                                                    modelo.setSalario(Double.valueOf(vista.getTxtSalario().getText()));
                                                    modelo.setPassword(vista.getTxtPassword().getText());

                                                    if (modelo.Insertar()) {
                                                        System.out.println("Correcto");
                                                        JOptionPane.showMessageDialog(null, "Registro en la base de Datos");
                                                        cargaLista();
                                                        Limpiar();
                                                    } else {
                                                        JOptionPane.showMessageDialog(null, "hubo un error");
                                                    }
                                                }

                                            } else {
                                                JOptionPane.showMessageDialog(null, "Existen Campos Vacios2");

                                            }

                                        } else {
                                            JOptionPane.showMessageDialog(null, "Existen Campos Vacios2");

                                        }

                                    } else {
                                        JOptionPane.showMessageDialog(null, "Existen Campos Vacios2");

                                    }

                                } else {
                                    JOptionPane.showMessageDialog(null, "Existen Campos Vacios2");

                                }

                            } else {
                                JOptionPane.showMessageDialog(null, "Existen Campos Vacios2");

                            }

//                        } else {
//                            JOptionPane.showMessageDialog(null, "Existen Campos Vacios2");
//
//                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Existen Campos Vacios2");

                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Existen Campos Vacios3");

                }
            } else {
                JOptionPane.showMessageDialog(null, "Existen Campos Vaciosaa");

            }
        } else {
            JOptionPane.showMessageDialog(null, "Existen Campos Vaciospp");

        }
    }

    public void Modificar() {
        if (!(vista.getTxtCedula().getText().isEmpty())) {

            if (!(vista.getTxtNombre().getText().isEmpty())) {

                if (!(vista.getTxtApellido().getText().isEmpty())) {

                    if (!(vista.getCombo_Rol().getSelectedItem().equals("Seleccione"))) {

//                        if (!(((JTextField) vista.getDateFecha().getDateEditor().getUiComponent()).getText().equals(""))) {

                            if (!(vista.getTxtSalario().getText().isEmpty())) {

                                if (!(vista.getTxtPhone().getText().isEmpty())) {

                                    if (!(vista.getTxtCorreo().getText().isEmpty())) {

                                        if (!(vista.getTxtDireccion().getText().isEmpty())) {

                                            if (!(vista.getTxtPassword().getText().isEmpty())) {

                                                modelo.setCedula(vista.getTxtCedula().getText());
                                                modelo.setNombre(vista.getTxtNombre().getText());
                                                modelo.setApellido(vista.getTxtApellido().getText());
//                                                modelo.setFecha_nacimiento(((JTextField) vista.getDateFecha().getDateEditor().getUiComponent()).getText());
                                                modelo.setNumero_telefono(vista.getTxtPhone().getText());
                                                modelo.setCorreo(vista.getTxtCorreo().getText());
                                                modelo.setDireccion(vista.getTxtDireccion().getText());
                                                modelo.setRol(vista.getCombo_Rol().getSelectedItem().toString());
                                                modelo.setSalario(Double.valueOf(vista.getTxtSalario().getText()));
                                                modelo.setPassword(vista.getTxtPassword().getText());

                                                int resultado = JOptionPane.showConfirmDialog(vista, "ESTA SEGURO QUE LOS DATOS INGRESADOS SON CORRECTOS", "Confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                                                if (resultado == JOptionPane.YES_NO_OPTION) {
                                                    if (modelo.Modificar(vista.getTxtCedula().getText())) {
                                                        JOptionPane.showMessageDialog(vista, "SE LOGRO GRABAR EL DATO EN LA BDD");
                                                        Limpiar();
                                                        cargaLista();
                                                    } else {
                                                        JOptionPane.showMessageDialog(vista, "VALIENDO GASVER X¨D");
                                                    }
                                                }

                                            } else {
                                                JOptionPane.showMessageDialog(null, "Existen Campos Vacios2");

                                            }

                                        } else {
                                            JOptionPane.showMessageDialog(null, "Existen Campos Vacios2");

                                        }

                                    } else {
                                        JOptionPane.showMessageDialog(null, "Existen Campos Vacios2");

                                    }

                                } else {
                                    JOptionPane.showMessageDialog(null, "Existen Campos Vacios2");

                                }

                            } else {
                                JOptionPane.showMessageDialog(null, "Existen Campos Vacios2");

                            }

//                        } else {
//                            JOptionPane.showMessageDialog(null, "Existen Campos Vacios2");
//
//                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Existen Campos Fecha");

                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Existen Campos pellido");

                }
            } else {
                JOptionPane.showMessageDialog(null, "Existen Campos Nombre");

            }
        } else {
            JOptionPane.showMessageDialog(null, "Existen Campos cedula");

        }
    }

    private void cargaLista() {
        DefaultTableModel tblModel = (DefaultTableModel) vista.getTablaEmpleado().getModel();
        tblModel.setNumRows(0);
        List<Empleado> lista = modelo.LeerT();
        lista.stream().forEach(p -> {

            String[] Persona = {p.getCedula(), p.getEmpleado_id(), p.getNombre(), p.getApellido(), p.getFecha_nacimiento(),
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
//        ((JTextField) vista.getDateFecha().getDateEditor().getUiComponent()).setText(null);
    }

    public void IncioControl() {
        vista.getBtnAceptar().addActionListener(l -> Registrar());
        vista.getBtnModificar().addActionListener(l -> Modificar());

        vista.getTablaEmpleado().addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                int tabla = vista.getTablaEmpleado().rowAtPoint(e.getPoint());
                if (tabla >= 0) {
                    vista.getTxtCedula().setText(vista.getTablaEmpleado().getValueAt(tabla, 0).toString());
                    vista.getTxtNombre().setText(vista.getTablaEmpleado().getValueAt(tabla, 2).toString());
                    vista.getTxtApellido().setText(vista.getTablaEmpleado().getValueAt(tabla, 3).toString());
//                    vista.getDateFecha().setDate(Date.valueOf(vista.getTablaEmpleado().getValueAt(tabla, 4).toString()));
                    vista.getTxtPhone().setText(vista.getTablaEmpleado().getValueAt(tabla, 5).toString());
                    vista.getTxtCorreo().setText(vista.getTablaEmpleado().getValueAt(tabla, 6).toString());
                    vista.getCombo_Rol().setSelectedItem(vista.getTablaEmpleado().getValueAt(tabla, 7).toString());
                    vista.getTxtSalario().setText(vista.getTablaEmpleado().getValueAt(tabla, 8).toString());
                    vista.getTxtDireccion().setText(vista.getTablaEmpleado().getValueAt(tabla, 9).toString());
                    vista.getTxtPassword().setText(vista.getTablaEmpleado().getValueAt(tabla, 10).toString());
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

}
