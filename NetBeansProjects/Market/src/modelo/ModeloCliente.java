/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 59399
 */
public class ModeloCliente implements Crud<Cliente> {

    Conexion con = new Conexion();

    @Override
    public List<Cliente> LeerT() {
        try {
            String sqlC = "select p.dni,c.cliente_id,p.nombre,p.apellido,p.birth,p.telefono,p.email,p.direccion from personas p,\n"
                    + "clientes c where p.dni=c.dni;";
            ResultSet rs = con.selectConsulta(sqlC);
            List<Cliente> cli = new ArrayList<>();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setCedula(rs.getString(1));
                cliente.setIdCliente(rs.getString(2));
                cliente.setNombre(rs.getString(3));
                cliente.setApellido(rs.getString(4));
                cliente.setFecha_nacimiento(rs.getDate(5));
                cliente.setNumero_telefono(rs.getString(6));
                cliente.setCorreo(rs.getString(7));
                cliente.setDireccion(rs.getString(8));
                cli.add(cliente);
            }
            rs.close();
            return cli;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean Eliminar(String codigo) {
        String sql1 = "DELETE FROM public.personas\n"
                + "	WHERE dni='" + codigo + "';";

        String sql2 = "DELETE FROM public.clientes\n"
                + "	WHERE dni='" + codigo + "';";

        String sqlC = sql2 + sql1;
        System.out.println(sqlC);
        return con.insertUpdateDelete(sqlC);
    }

    @Override
    public List<Cliente> Buscar(String codigo) {
        try {

            String sql = "select p.dni,c.cliente_id,p.nombre,p.apellido,p.birth,p.telefono,p.email,p.direccion from personas p,\n"
                    + "clientes c where p.dni=c.dni and p.dni like lower('%"+codigo+"%');";
            ResultSet rs = con.selectConsulta(sql);
            List<Cliente> cl = new ArrayList<>();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setCedula(rs.getString(1));
                cliente.setIdCliente(rs.getString(2));
                cliente.setNombre(rs.getString(3));
                cliente.setApellido(rs.getString(4));
                cliente.setFecha_nacimiento(rs.getDate(5));
                cliente.setNumero_telefono(rs.getString(6));
                cliente.setCorreo(rs.getString(7));
                cliente.setDireccion(rs.getString(8));
                cl.add(cliente);
            }
            System.out.println("BsM");
            rs.close();
            return cl;

        } catch (SQLException ex) {
            Logger.getLogger(ModeloEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean Insertar(Cliente cl) {
        long form = cl.getFecha_nacimiento().getTime();
        java.sql.Date time = new java.sql.Date(form);
        String sqlC1 = "INSERT INTO public.personas(\n"
                + "	dni, nombre, apellido, birth, telefono, direccion, email)\n"
                + "	VALUES ('" + cl.getCedula() + "', '" + cl.getNombre() + "', '" + cl.getApellido()
                + "', '" + time + "', '" + cl.getNumero_telefono()
                + "', '" + cl.getDireccion() + "', '" + cl.getCorreo() + "');";

        String sqlC2 = "INSERT INTO public.clientes(\n"
                + "	cliente_id, dni)\n"
                + "	VALUES ('" + cl.getIdCliente() + "', '" + cl.getCedula() + "');";
        String sql = sqlC1 + sqlC2;
        return con.insertUpdateDelete(sql);
    }

//    @Override
    public boolean ModificarT(Cliente tt, String cedula) {
//        Cliente tt = new Cliente();
//         long form = codigo.getFecha_nacimiento().getTime();
//        java.sql.Date time = new java.sql.Date(form);
        String sqlC = "UPDATE public.personas\n"
                + "	SET  nombre='" + tt.getNombre() + "', apellido='" + tt.getApellido()
                + "', telefono='" + tt.getNumero_telefono() + "', direccion='"
                + tt.getDireccion() + "', email='" + tt.getCorreo() + "'\n"
                + "	WHERE dni='" + cedula + "';";
        System.out.println(sqlC);
        return con.insertUpdateDelete(sqlC);

    }
}
