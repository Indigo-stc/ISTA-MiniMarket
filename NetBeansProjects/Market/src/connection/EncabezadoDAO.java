package connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cliente;
import modelo.Encabezado;

public class EncabezadoDAO implements Crud{

    Conexion con = new Conexion(); // intancia de la clase conexionpg
    public int idEncabezado_Factura() {

        String num = null;
        try {
            String sql = "select max(encabezado_id) as id_encabezado from encabezados";
            ResultSet rs = con.selectConsulta(sql);

            while (rs.next()) {
                num = rs.getString("encabezado_id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ComprobanteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (num == null) {
            return 0;
        } else {
            return Integer.parseInt(num);
        }
    }


    public boolean encabezadoinsert(Encabezado enca) {
        long form = enca.getFechaEncabezado().getTime();
                        java.sql.Date time = new java.sql.Date(form);
        String sql;
        sql = "INSERT INTO encabezados(encabezado_id, cliente_id, fecha)";
        sql += "VALUES('" + enca.getCodigoEncabezado() + "' , '" + enca.getCedula() + "' , '" + time + "')";
        return con.insertUpdateDelete(sql);
    }
    
    public Cliente clienteEnca(String dni){
    
        String sql;
        Cliente clie = null;
        sql = "select cliente_id, clientes.dni, nombre, apellido, birth, telefono, direccion, email "
                + "from clientes, personas "
                + "where activo = TRUE and clientes.dni = personas.dni and clientes.dni = '"+ dni +"'";
        ResultSet rs = con.selectConsulta(sql);
        try {
            if(rs.next()){
                clie = new Cliente(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5),
                        rs.getString(6), rs.getString(7), rs.getString(8));
                return clie;
            }
        } catch (SQLException ex) {
            Logger.getLogger(EncabezadoDAO.class.getName()).log(Level.SEVERE, null, ex); 
            return clie;
            
        }
        return null;
    }

//    public boolean editardetallef() {
//        String sql = "UPDATE encabezados SET encabezado_id = '" + getCodigoEncabezado() + "',dni = '" 
//                + getCedula() + "'" + ", fecha = '" + getFechaEncabezado() + " '";
//
//        return con.insertUpdateDelete(sql);
//    }

    public boolean eliminarfactura(String id) {
        String sql = "DELETE FROM encabezados WHERE encabezado_id = '" + id + "'";
        return con.insertUpdateDelete(sql);
    }

//    public boolean creardetallefByte() {
//        try {
//            String sql = "INSERT INTO public.detallefactura(\n"
//                    + "	id_detallefac,idfactura,id, cantidad, precio, total)\n"
//                    + "	VALUES (?, ?, ?, ?, ?, ?);";
//
//            PreparedStatement ps = con.getCon().prepareStatement(sql);
//            ps.setString(1, getId_detallef() + "");
//            ps.setString(1, getId_factura());
//            ps.setInt(1, getId_producto());
//            ps.setInt(2, getCantidad());
//            ps.setDouble(3, getTotal());
//
//            ps.executeUpdate();
//            return true;
//        } catch (SQLException ex) {
//            Logger.getLogger(Modelo_Encabezado.class.getName()).log(Level.SEVERE, null, ex);
//            return false;
//        }
//    }

//    public boolean editarfacturaByte() {
//        try {
//            String sql = "UPDATE public.factura\n"
//                    + "	SET id_detallefac=?,idfactura=?,id=?, cantidad=?, precio=?, total=?\n"
//                    + "	WHERE id='" + getId_factura() + "';";
//            PreparedStatement ps = con.getCon().prepareStatement(sql);
//            ps.setString(1, getId_detallef() + "");
//            ps.setString(1, getId_factura());
//            ps.setInt(1, getId_producto());
//            ps.setInt(2, getCantidad());
//            ps.setDouble(3, getTotal());
//            ps.executeUpdate();
//            return true;
//        } catch (SQLException ex) {
//            Logger.getLogger(Modelo_Encabezado.class.getName()).log(Level.SEVERE, null, ex);
//            return false;
//        }
//    }

    @Override
    public boolean insert(Object kl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List LeerT() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List Buscar(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList registros() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet pk(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}