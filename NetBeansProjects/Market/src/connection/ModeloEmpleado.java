/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Empleado;

public class ModeloEmpleado implements Crud<Empleado> {

    Conexion con = new Conexion();

    @Override
    public boolean insert(Empleado em) {
        long form = em.getFecha_nacimiento().getTime();
        java.sql.Date time = new java.sql.Date(form);
        String sqlE1 = " INSERT INTO public.personas(\n"
                + "	dni, nombre, apellido, birth, telefono, direccion, email)\n"
                + "	VALUES ('" + em.getCedula() + "', '" + em.getNombre() + "', '" + em.getApellido() + "', '" + time + "', "
                + "'" + em.getNumero_telefono() + "', '" + em.getDireccion() + "', '" + em.getCorreo() + "');";

        String sqlC1 = " INSERT INTO public.empleados(\n"
                + "	empleado_id, \"contraseña\", dni, rol_id, salarios)\n"
                + "	VALUES ('" + em.getEmpleado_id() + "', '" + em.getPassword() + "', '"
                + em.getCedula() + "', '" + em.getRol_id() + "', '" + em.getSalario() + "');";
        String sql = sqlE1 + sqlC1;
        return con.insertUpdateDelete(sql);
    }

    @Override
    public List<Empleado> LeerT() {
        try {
            String sql = "select p.dni, e.empleado_id,p.nombre,p.apellido,p.birth,p.telefono,p.email,r.etiqueta,\n"
                    + "e.rol_id,e.salarios,p.direccion,\n"
                    + "e.contraseña from personas p, empleados e, roles r where p.dni=e.dni and\n"
                    + "e.rol_id=r.rol_id;";
            ResultSet rs = con.selectConsulta(sql);

            List<Empleado> em = new ArrayList<>();
            while (rs.next()) {
                Empleado emp = new Empleado();
                emp.setCedula(rs.getString(1));
                emp.setEmpleado_id(rs.getString(2));
                emp.setNombre(rs.getString(3));
                emp.setApellido(rs.getString(4));
                emp.setFecha_nacimiento(rs.getDate(5));
                emp.setNumero_telefono(rs.getString(6));
                emp.setCorreo(rs.getString(7));
                emp.setRol(rs.getString(8));
                emp.setRol_id(rs.getInt(9));
                emp.setSalario(rs.getDouble(10));
                emp.setDireccion(rs.getString(11));
                emp.setPassword(rs.getString(12));
                em.add(emp);
            }
            rs.close();
            return em;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    @Override
    public boolean delete(String codigo) {
        String sql2 = "DELETE FROM public.personas\n"
                + "	WHERE dni='" + codigo + "';";

        String sql1 = "DELETE FROM public.empleados\n"
                + "	WHERE dni='" + codigo + "';";
        String sqlE = sql1 + sql2;
        System.out.println("Eliminado: " + sqlE);

        return con.insertUpdateDelete(sqlE);
    }

    @Override
    public List<Empleado> Buscar(String codigo) {

        try {
            String sql = "select p.dni, e.empleado_id,p.nombre,p.apellido,"
                    + "p.birth,p.telefono,p.email,r.etiqueta,\n"
                    + "                    e.rol_id,e.salarios,p.direccion,\n"
                    + "                    e.contraseña from personas p, empleados e, roles r where p.dni=e.dni and\n"
                    + "                    e.rol_id=r.rol_id and p.dni like lower('%"+codigo+"%');";
            ResultSet rs = con.selectConsulta(sql);

            List<Empleado> em = new ArrayList<>();
            while (rs.next()) {
                Empleado emp = new Empleado();
                emp.setCedula(rs.getString(1));
                emp.setEmpleado_id(rs.getString(2));
                emp.setNombre(rs.getString(3));
                emp.setApellido(rs.getString(4));
                emp.setFecha_nacimiento(rs.getDate(5));
                emp.setNumero_telefono(rs.getString(6));
                emp.setCorreo(rs.getString(7));
                emp.setRol(rs.getString(8));
                emp.setRol_id(rs.getInt(9));
                emp.setSalario(rs.getDouble(10));
                emp.setDireccion(rs.getString(11));
                emp.setPassword(rs.getString(12));
                em.add(emp);
            }
            rs.close();
            return em;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

//    @Override
    public boolean ModificarT(Empleado empl, String codigo) {
        long form = empl.getFecha_nacimiento().getTime();
        java.sql.Date fecha = new java.sql.Date(form);
        String sql1 = "UPDATE public.personas\n"
                + "	SET  nombre='" + empl.getNombre() + "', apellido='" + empl.getApellido() + "',  birth='" + fecha + "', telefono='" + empl.getNumero_telefono()
                + "', direccion='" + empl.getDireccion() + "', email='" + empl.getCorreo() + "'\n"
                + "	WHERE dni='" + codigo + "';";
        String sql2 = "UPDATE public.empleados\n"
                + "	SET  rol_id='" + empl.getRol_id() + "', salarios='" + empl.getSalario() + "'\n"
                + "	WHERE dni='" + codigo + "';";
        String sql = sql1 + sql2;
        return con.insertUpdateDelete(sql);
    }

    @Override
    public ArrayList<Empleado> registros() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ResultSet pk(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(Empleado objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
public ResultSet login (String usuario,String contraseña){
    String s="select*from empleados join roles on empleados.rol_id=roles.rol_id where dni= '"+usuario+"' and contraseña='"+contraseña+"' ; ";
    
    Conexion c=new Conexion();
     ResultSet r = con.selectConsulta(s);
        return r;
     
   
}
}
