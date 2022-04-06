/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

//import Clases.Empleado;
//import Conexion.Conexion;
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
public class ModeloEmpleado extends Empleado implements Crud {

    Conexion con = new Conexion();

    public ModeloEmpleado() {
    }

    public ModeloEmpleado(String Empleado_id, String Rol, double Salario, String Password) {
        super(Empleado_id, Rol, Salario, Password);
    }

    public ModeloEmpleado(String Empleado_id, String Rol, double Salario, String Password, String Cedula, String Nombre, String Apellido, String fecha_nacimiento, String Numero_telefono, String Correo, String Direccion) {
        super(Empleado_id, Rol, Salario, Password, Cedula, Nombre, Apellido, fecha_nacimiento, Numero_telefono, Correo, Direccion);
    }

    @Override
    public boolean Insertar() {
        String sqlE1 = "	INSERT INTO public.persona(cedula, nombre, apellido, fecha_n, phone, correo, direccion)\n"
                + "VALUES ('" + getCedula() + "', '" + getNombre() + "', '" + getApellido() + "', '" + getFecha_nacimiento() + "', '" + getNumero_telefono() + "', '" + getCorreo() + "', '" + getDireccion() + "');";
        String sqlP1 = "INSERT INTO public.empleado(\n"
                + "	 sueldo, rol, cedula, clave)\n"
                + "	VALUES ( '" + getSalario() + "', '" + getRol() + "', '" + getCedula() + "','" + getPassword() + "');";
        String sql = sqlE1 + sqlP1;
        return con.insertUpdateDelete(sql);

    }

    @Override
    public boolean Modificar(String codigo) {
        String sql1 = "update persona set nombre='" + getNombre() + "',apellido='" + getApellido() + "',fecha_n='" + getFecha_nacimiento() + "',phone='" + getNumero_telefono() + "',correo='" + getCorreo() + "',\n"
                + "direccion='" + getDireccion() + "' where cedula='" + codigo + "';";

        String sql2 = "update empleado set sueldo= '" + getSalario() + "',rol='" + getRol() + "',clave='" + getPassword() + "' where cedula='" + codigo + "';";

        String sql = sql1 + sql2;
        System.out.println(sql);
        return con.insertUpdateDelete(sql);
    }

    @Override
    public boolean Eliminar(String codigo) {
        String sql2 = "DELETE FROM public.persona WHERE cedula='" + codigo + "';";

        String sql1 = "DELETE FROM public.empleado WHERE cedula='" + codigo + "';";
        String sqlE = sql1 + sql2;
        System.out.println("Eliminado: " + sqlE);

        return con.insertUpdateDelete(sqlE);
    }

//    @Override
    public List<Empleado> LeerT() {
        try {
            String sql = "select p.cedula,e.empleado_id, p.nombre, p.apellido, p.fecha_n,p.phone,p.correo,  e.rol, e.sueldo,p.direccion,e.clave from persona p, empleado e where p.cedula=e.cedula;";
            ResultSet rs = con.selectConsulta(sql);
            List<Empleado> em = new ArrayList<>();
            while (rs.next()) {
                Empleado empleado = new Empleado();
                empleado.setCedula(rs.getString("cedula"));
                empleado.setEmpleado_id(rs.getString("empleado_id"));
                empleado.setNombre(rs.getString("nombre"));
                empleado.setApellido(rs.getString("apellido"));
                empleado.setFecha_nacimiento(rs.getString("fecha_n"));
                empleado.setNumero_telefono(rs.getString("phone"));
                empleado.setCorreo(rs.getString("correo"));
                empleado.setRol(rs.getString("rol"));
                empleado.setSalario(rs.getDouble("sueldo"));
                empleado.setDireccion(rs.getString("direccion"));
                empleado.setPassword(rs.getString("clave"));
                em.add(empleado);
            }
            rs.close();
            return em;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
      public List<Empleado> Buscar(String codigo) {
        try {
            String sql="select p.cedula,e.empleado_id, p.nombre, p.apellido, p.fecha_n,p.phone,p.correo,  e.rol, e.sueldo,p.direccion,e.clave from persona p, empleado e where p.cedula=e.cedula and e.cedula='"+codigo+"';";
            ResultSet rs = con.selectConsulta(sql);
            List<Empleado> em = new ArrayList<>();
            while (rs.next()) {
                Empleado empleado = new Empleado();
                empleado.setCedula(rs.getString("cedula"));
                empleado.setEmpleado_id(rs.getString("empleado_id"));
                empleado.setNombre(rs.getString("nombre"));
                empleado.setApellido(rs.getString("apellido"));
                empleado.setFecha_nacimiento(rs.getString("fecha_n"));
                empleado.setNumero_telefono(rs.getString("phone"));
                empleado.setCorreo(rs.getString("correo"));
                empleado.setRol(rs.getString("rol"));
                empleado.setSalario(rs.getDouble("sueldo"));
                empleado.setDireccion(rs.getString("direccion"));
                empleado.setPassword(rs.getString("clave"));
                em.add(empleado);
            }
            rs.close();
            return em;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    

//    @Override
//    public List<Empleado> Leer(String codigo) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    @Override
//    public boolean Eliminar(String codigo) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    public boolean Eliminarer(String IdEmpleado) {
//        String sql1 = "DELETE FROM public.empleado\n"
//                + "	WHERE cedula='" + getCedula() + "';";
//        String sql2 = "DELETE FROM public.persona\n"
//                + "	WHERE cedula='" + getCedula() + "';";
//        String sqlE = sql2 + sql1;
//        System.out.println("Eliminado: " + sqlE);
//
//        return con.insertUpdateDelete(sqlE);
//    }
}
