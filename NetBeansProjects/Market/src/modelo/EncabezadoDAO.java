package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EncabezadoDAO extends Encabezado {

    Conexion con = new Conexion(); // intancia de la clase conexionpg

    

    public EncabezadoDAO(String codigoEncabezado, String cedula, Date fechaEncabezado) {
        super(codigoEncabezado, cedula, fechaEncabezado);
    }

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

//    public List<Encabezado> listar(String buscar) {
//        try {
//            List<Encabezado> lista = new ArrayList<Encabezado>(); // creacion de la lista (es un array list)
//
//            String sql = "select * from detallefactura";
//            ResultSet rs = con.selectConsulta(sql);
//            while (rs.next()) {
//                Encabezado encabezadoF = new Encabezado();
//                encabezadoF.setCodigoEncabezado(rs.getString("encabezado_id"));
//                encabezadoF.setCedula(rs.getString("dni"));
//                encabezadoF.setFechaEncabezado(rs.getDate("fecha"));
//                
//                lista.add(encabezadoF);
//            }
//            rs.close();
//            return lista;
//        } catch (SQLException ex) {
//            Logger.getLogger(EncabezadoDAO.class.getName()).log(Level.SEVERE, null, ex);
//            return null;
//        }
//    }

    public Boolean crearDetalleFactura() {
        String sql;

        sql = "INSERT INTO encabezados(encabezado_id, dni, fecha)";
        sql += "VALUES('" + getCodigoEncabezado() + "' , '" + getCedula() + "' , '" + getFechaEncabezado() + "')";

        return con.insertUpdateDelete(sql);
    }

    public boolean editardetallef() {
        String sql = "UPDATE encabezados SET encabezado_id = '" + getCodigoEncabezado() + "',dni = '" 
                + getCedula() + "'" + ", fecha = '" + getFechaEncabezado() + " '";

        return con.insertUpdateDelete(sql);
    }

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
}
