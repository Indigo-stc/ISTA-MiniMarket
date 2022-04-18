package connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cliente;
import modelo.Comprobante;

public class ComprobanteDAO implements Crud {

    Conexion con = new Conexion(); // intancia de la clase conexionpg

    public int idFactura() {
        String num = null;
        try {
            String sql = "select max(factura_id) as factura_id from comprobante";
            ResultSet rs = con.selectConsulta(sql);
            
            while (rs.next()) {
                num = rs.getString("factura_id");
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
    
//    public String[][] pdfSalida(){
//        
//        String [] pdf = new String[9]; 
//        String sql;
//        Cliente clie = null;
//        sql = """
//              SELECT encabezados.encabezado_id,
//              \tclientes.cliente_id,
//              \tclientes.dni,
//              \tpersonas.nombre ' 'personas.apellido Nombre_Apellido,
//              \tcomprobante.producto_id,
//              \tcomprobante.cantidad,
//              \tencabezados.fecha,
//              \tcomprobante.subtotalFROM comprobante
//              \tINNER JOIN encabezados ON 
//              \t comprobante.encabezado_id = encabezados.encabezado_id 
//              \tINNER JOIN clientes ON 
//              \t encabezados.cliente_id = clientes.cliente_id 
//              \tINNER JOIN personas ON 
//              \t clientes.dni = personas.dni""";
//        ResultSet rs = con.selectConsulta(sql);
//        try {
//            if(rs.next()){
//               pdf [0] = rs.get
//                    
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(EncabezadoDAO.class.getName()).log(Level.SEVERE, null, ex); 
//            return clie;
//
//        }
//        return null;
//    }
//    public List<Comprobante> listar(String buscar) {
//        try {
//            List<Comprobante> lista = new ArrayList<Comprobante>(); // creacion de la lista (es un array list)
//            
//            String sql = "select * from comprobante";
//            ResultSet rs = con.selectConsulta(sql);
//            while (rs.next()) {
//                
//                Comprobante factura = new Comprobante();
//                factura.setIdComprobante(rs.getString("id_comprobante"));
//                factura.setProductoID(rs.getString("producto_id"));
//                factura.setCantidadProducto(rs.getInt("cantidad"));
//                factura.setSubTotal(rs.getDouble("subtotal"));
//                factura.setSubTotal(rs.getDouble("total"));
//                factura.setSubTotal(rs.getDouble("iva"));
//                factura.setCodigoEncabezado(rs.getString("encabezado_id"));
//                lista.add(factura);
//            }
//            rs.close();
//            return lista;
//        } catch (SQLException ex) {
//            Logger.getLogger(ComprobanteDAO.class.getName()).log(Level.SEVERE, null, ex);
//            return null;
//        }
//    }
    
    
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

    public boolean insertarCompro(Comprobante obj){
        Conexion con = new Conexion();
        String sql;
        sql = "INSERT INTO comprobante(id_comprobante, producto_id, cantidad, subtotal, total, iva, encabezado_id)";
        sql += "VALUES ('" + obj.getIdComprobante() + "', '" + obj.getProductoID() + "', '" + obj.getCantidadProducto() + "', '" 
                + obj.getSubTotal() + "', '" + obj.getTotal() + "', '" + obj.getIVA() + "', '" + obj.getCodigoEncabezado() + "')";
        
        if(con.insertUpdateDelete(sql)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean insert(Object objeto) {
        return false;
//     String sql;
//        
//        sql = "INSERT INTO comprobante(id_comprobante, producto_id, cantidad, subtotal, total, iva, encabezado_id)";
//        sql += "VALUES('" + get+ "' , '" + getProductoID() + "' , '" + getCantidadProducto() + "' , '" 
//                + getSubTotal() + "', '" + getTotal() + "', '" + getCodigoEncabezado() + "')";
//        return false;
    }


    @Override
    public ArrayList registros() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet pk(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List LeerT() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List Buscar(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}