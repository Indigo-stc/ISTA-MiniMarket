package modelo;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Modelo_Factura extends Comprobante {

    Conexion con = new Conexion(); // intancia de la clase conexionpg

    public Modelo_Factura() {
        
    }

    public Modelo_Factura(String idComprobante, String productoID, int cantidadProducto, Double precio, Double subTotal, Double IVA, Double Total, String codigoEncabezado) {
        super(idComprobante, productoID, cantidadProducto, precio, subTotal, IVA, Total, codigoEncabezado);
    }

    
    
    
    
    public int idFactura() {
        String num = null;
        try {
            String sql = "select max(factura_id)as factura_id from comprobante";
            ResultSet rs = con.selectConsulta(sql);
            
            while (rs.next()) {
                num = rs.getString("factura_id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Factura.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (num == null) {
            return 0;
        } else {            
            return Integer.parseInt(num);
        }
    }
    
    public List<Comprobante> listar(String buscar) {
        try {
            List<Comprobante> lista = new ArrayList<Comprobante>(); // creacion de la lista (es un array list)
            
            String sql = "select * from comprobante";
            ResultSet rs = con.selectConsulta(sql);
            while (rs.next()) {
                Comprobante factura = new Comprobante();
                factura.setIdComprobante(rs.getString("id_comprobante"));
                factura.setProductoID(rs.getString("producto_id"));
                factura.setCantidadProducto(rs.getInt("cantidad"));
                factura.setSubTotal(rs.getDouble("subtotal"));
                factura.setSubTotal(rs.getDouble("total"));
                factura.setSubTotal(rs.getDouble("iva"));
                factura.setCodigoEncabezado(rs.getString("encabezado_id"));
                lista.add(factura);
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Factura.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public Boolean crearFactura() {
        String sql;
        
        sql = "INSERT INTO comprobante(id_comprobante, producto_id, cantidad, subtotal, total, iva, encabezado_id)";
        sql += "VALUES('" + getIdComprobante() + "' , '" + getProductoID() + "' , '" + getCantidadProducto() + "' , '" 
                + getSubTotal() + "', '" + getTotal() + "', '" + getCodigoEncabezado() + "')";
        
        return con.insertUpdateDelete(sql);
    }
    
    public boolean editarfactura() {
        String sql = "UPDATE comprobante SET id_comprobante='" + getIdComprobante() + "', producto_id='" + getProductoID() 
                + "',  cantidad='" + getCantidadProducto() + "',subtotal ='" + getSubTotal() + "', total ='" + getTotal() 
                + "', iva ='" + getIVA() + "', encabezado_id ='" + getCodigoEncabezado() + "')";
        
        return con.insertUpdateDelete(sql);
    }
    
    public boolean eliminarfactura(String id) {
        String sql = "DELETE FROM comprobante WHERE id_comprobante = '" + id + "'";
        return con.insertUpdateDelete(sql);
    }
    
//    public boolean crearfacturaByte() {
//        try {
//            String sql = "INSERT INTO public.comprobante(\n"
//                    + "	idfactura, fecha, total, idpersona)\n"
//                    + "	VALUES (?, ?, ?, ?, ?, ?);";
//            
//            PreparedStatement ps = con.getCon().prepareStatement(sql);
//            ps.setString(1, getId_factura());
//            ps.setDate(2, getFecha());
//            ps.setDouble(3, getTotal());
//            ps.setString(4, getId_persona());
//            
//            ps.executeUpdate();
//            return true;
//        } catch (SQLException ex) {
//            Logger.getLogger(Modelo_Factura.class.getName()).log(Level.SEVERE, null, ex);
//            return false;
//        }
//    }
    
//    public boolean editarfacturaByte() {
//        try {
//            String sql = "UPDATE public.factura\n"
//                    + "	SET idfactura=?, fecha=?, total=?, idpersona=?\n"
//                    + "	WHERE id='" + getId_factura() + "';";
//            PreparedStatement ps = con.getCon().prepareStatement(sql);
//            ps.setString(1, getId_factura());
//            ps.setDate(2, getFecha());
//            ps.setDouble(3, getTotal());
//            ps.setString(4, getId_persona());
//            ps.executeUpdate();
//            return true;
//        } catch (SQLException ex) {
//            Logger.getLogger(Modelo_Factura.class.getName()).log(Level.SEVERE, null, ex);
//            return false;
//        }
//    }
}
