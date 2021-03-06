package connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cliente;
import modelo.Persona;

public class ModeloCliente implements Crud<Cliente> {

    Conexion con = new Conexion();

    @Override
    public List<Cliente> LeerT() {
        try {
            String sqlC = "select p.dni,c.cliente_id,p.nombre,p.apellido,p.birth,p.telefono,p.email,p.direccion from personas p,\n"
                    + "clientes c where p.dni=c.dni and c.activo=true;";
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
    public boolean delete(String codigo) {

        String sqlK="UPDATE public.clientes\n" +
"	SET activo=false\n" +
"	WHERE dni='"+codigo+"';";

        return con.insertUpdateDelete(sqlK);
    }

    @Override
    public List<Cliente> Buscar(String codigo) {
        try {

            String sql = "select p.dni,c.cliente_id,p.nombre,p.apellido,p.birth,p.telefono,p.email,p.direccion from personas p,\n" +
"	clientes c where p.dni=c.dni and p.dni like lower('%"+codigo+"%')and c.activo=true;";
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
            rs.close();
            return cl;

        } catch (SQLException ex) {
            Logger.getLogger(ModeloEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean insert(Cliente cl) {
        long form = cl.getFecha_nacimiento().getTime();
        java.sql.Date time = new java.sql.Date(form);
        String sqlC1 = "INSERT INTO public.personas(\n"
                + "	dni, nombre, apellido, birth, telefono, direccion, email)\n"
                + "	VALUES ('" + cl.getCedula() + "', '" + cl.getNombre() + "', '" + cl.getApellido()
                + "', '" + time + "', '" + cl.getNumero_telefono()
                + "', '" + cl.getDireccion() + "', '" + cl.getCorreo() + "');";

        String sqlC2 = "INSERT INTO public.clientes(\n"
                + "	cliente_id, dni, activo)\n"
                + "	VALUES ('" + cl.getIdCliente() + "', '" + cl.getCedula() + "',true);";
        String sql = sqlC1 + sqlC2;
        return con.insertUpdateDelete(sql);
    }

//    @Override
    public boolean ModificarT(Cliente tt, String cedula) {
        String sqlC = "UPDATE public.personas "
                + "	SET  nombre='" + tt.getNombre() + "', apellido='" + tt.getApellido()
                + "', telefono='" + tt.getNumero_telefono() + "', direccion='"
                + tt.getDireccion() + "', email='" + tt.getCorreo() + "'\n"
                + "	WHERE dni='" + cedula + "';";
        String sqlP = "UPDATE clientes "
                + "SET activo = TRUE;";
        return con.insertUpdateDelete(sqlC + sqlP);

    }

    @Override
    public ArrayList<Cliente> registros() {
        throw new UnsupportedOperationException(""); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ResultSet pk(String id) {
        throw new UnsupportedOperationException(""); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(Cliente objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Persona existPer(String cedula) {
        String stm = "SELECT * FROM personas WHERE dni = '"+cedula+"';";
        ResultSet res = con.selectConsulta(stm);
        Persona per = null;
        try {
            if (res.next()) {
                per = new Persona(res.getString(1), res.getString(2), res.getString(3), 
                        res.getDate(4), res.getString(5), res.getString(6), res.getString(7));
            }
            return per;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCliente.class.getName()).log(Level.SEVERE, null, ex);
            return per;
        }
    }
    
    public Cliente existCLi(String cedula) {
        String stm = "SELECT * FROM clientes WHERE dni = '"+cedula+"';";
        ResultSet rs = con.selectConsulta(stm);
        Cliente cli = null;
        try {
            if (rs.next()) {
                cli = new Cliente(rs.getString(1), rs.getString(2), 
                        null, null, null, null, null, null);
                return cli;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCliente.class.getName()).log(Level.SEVERE, null, ex);
            return cli;
        }
        return cli;
    }
    
    public boolean activo(String cedula) {
        String stm = "SELECT * FROM clientes WHERE dni = '"+cedula+"' AND activo = TRUE;";
        ResultSet rs = con.selectConsulta(stm);
        try {
            if (rs.next()) { 
            return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloCliente.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return false;
    }
    
    public boolean insCliente(Cliente cli) {
        String sqlP = "UPDATE public.personas\n"
                + "	SET  nombre='" + cli.getNombre() + "', apellido='" + cli.getApellido() + "', telefono='" + cli.getNumero_telefono()
                + "', direccion='" + cli.getDireccion() + "', email='" + cli.getCorreo() + "'\n"
                + "	WHERE dni='" + cli.getCedula() + "';";
        String sqlC = "INSERT INTO public.clientes(\n"
                + "	cliente_id, dni, activo)\n"
                + "	VALUES ('" + cli.getIdCliente() + "', '" + cli.getCedula() + "', TRUE);";
        String sql = sqlP + sqlC;
        return con.insertUpdateDelete(sql);
    }
}