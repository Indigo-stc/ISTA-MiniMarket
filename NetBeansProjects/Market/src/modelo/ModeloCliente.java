/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 59399
 */
public class ModeloCliente extends Cliente implements Crud {

    Conexion cone = new Conexion();

    public ModeloCliente() {
    }

    public ModeloCliente(String IdCliente) {
        super(IdCliente);
    }

    public ModeloCliente(String IdCliente, String Cedula, String Nombre, String Apellido, String fecha_nacimiento, String Numero_telefono, String Correo, String Direccion) {
        super(IdCliente, Cedula, Nombre, Apellido, fecha_nacimiento, Numero_telefono, Correo, Direccion);
    }

    @Override
    public boolean Insertar() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

//    @Override
    public List<Cliente> LeerC() {
        try {
            String sqlC = "select p.dni,c.cliente_id,p.nombre,p.apellido,p.birth,p.telefono,p.email,p.direccion from personas p,\n"
                    + "clientes c where p.dni=c.dni;";
            ResultSet rs = cone.selectConsulta(sqlC);
            List<Cliente> cli = new ArrayList<>();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setCedula(rs.getString("cedula"));
                cliente.setIdCliente(rs.getString("cliente_id"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setFecha_nacimiento(rs.getString("fecha_n"));
                cliente.setNumero_telefono(rs.getString("phone"));
                cliente.setCorreo(rs.getString("correo"));
                cliente.setDireccion(rs.getString("direccion"));
                System.out.println("Error");
                cli.add(cliente);
            }
            rs.close();
            return cli;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean Modificar(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Eliminar(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    @Override
//    public List<Empleado> LeerT() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public List<Cliente> Leer() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

}
