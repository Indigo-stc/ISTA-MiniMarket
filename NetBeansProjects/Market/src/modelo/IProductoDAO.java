package modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IProductoDAO implements ProductoDAO {

    @Override
    public boolean insert(Producto objeto) {
        System.out.println(objeto);
        Conexion con = new Conexion();
        String sql = "INSERT INTO productos VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            PreparedStatement ps = con.getCon().prepareStatement(sql);
            ps.setString(1, objeto.getProducto_id());
            ps.setString(2, objeto.getNombre());
            ps.setDouble(3, objeto.getPrecio());
            ps.setInt(4, objeto.getStock());
            try {
                FileInputStream fin = new FileInputStream(objeto.getImagen());
                ps.setBinaryStream(5, fin, (int) objeto.getImagen().length());
            } catch (FileNotFoundException ex) {
                System.out.println("Problemas con la imagen");
                Logger.getLogger(IProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            ps.setString(6, objeto.getDescripcion());
            ps.setString(7, objeto.getProveedor_id());
            ps.setString(8, objeto.getCategoria_id());
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(IProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public void delete(String column) {}

    @Override
    public void update(Producto objeto) {}

   

//    @Override
//    public ArrayList<Object> buscar(String search) {
//        String stm = "";
//        if ("".equals(search.trim())) {
//            stm = """
//                  SELECT producto_id, pdt.nombre, precio, stock, imagen, descripcion, titulo, pvd.nombre
//                  FROM productos pdt 
//                    JOIN categorias cat ON pdt.categoria_id = cat.categoria_id 
//                    JOIN proveedores pvd ON pvd.proveedor_id = pdt.proveedor_id;""";
//        } else {
//            stm = """
//                  SELECT producto_id, pdt.nombre, precio, stock, imagen, descripcion, titulo, pvd.nombre
//                  FROM productos pdt 
//                  	JOIN categorias cat ON pdt.categoria_id = cat.categoria_id 
//                  	JOIN proveedores pvd ON pvd.proveedor_id = pdt.proveedor_id
//                  WHERE like(pdt.nombre) LIKE LOWER('%%') OR 
//                  	LOWER(titulo) = LIKE LOWER('%%') OR 
//                  	LOWER(pvd.nombre) LIKE LOWER('%%') OR
//                  	LOWER(product_id) LIKE LOWER('%%');""";
//        }
//        Conexion con = new Conexion();
//        ResultSet res = con.selectConsulta(stm);
//        ArrayList registros = new ArrayList();
//        try {
//            while(res.next()) {
//                Object[] sql = {res.getString(1), res.getString(2),
//                    res.getDouble(3), res.getInt(4), res.getBytes(5),
//                    res.getString(6), res.getString(7), res.getString(8)};
//                registros.add(sql);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(IProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return registros;
//    }

    @Override
    public ArrayList registros() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public ResultSet buscar(String search) {
        String stm = "";
        if ("".equals(search.trim())) {
            stm = """
                  SELECT producto_id, pdt.nombre, precio, stock, imagen, descripcion, titulo, pvd.nombre
                  FROM productos pdt 
                    JOIN categorias cat ON pdt.categoria_id = cat.categoria_id 
                    JOIN proveedores pvd ON pvd.proveedor_id = pdt.proveedor_id;""";
        } else {
            stm = "SELECT producto_id, pdt.nombre, precio, stock, imagen, descripcion, titulo, pvd.nombre " +
                    "FROM productos pdt " +
                    "JOIN categorias cat ON pdt.categoria_id = cat.categoria_id " +
                    "JOIN proveedores pvd ON pvd.proveedor_id = pdt.proveedor_id " +
                    "WHERE LOWER(pdt.nombre) LIKE LOWER('%"+search+"%') OR " +
                    "                  	LOWER(titulo) LIKE LOWER('%"+search+"%') OR " +
                    "                  	LOWER(pvd.nombre) LIKE LOWER('%"+search+"%') OR" +
                    "                  	LOWER(producto_id) LIKE LOWER('%"+search+"%');";
        }
        Conexion con = new Conexion();
        ResultSet res = con.selectConsulta(stm);
        return res;
    }

    @Override
    public  ResultSet pk(String id) {
        Conexion con = new Conexion();
        String sql = "select * from productos where producto_id = '"+id+"'";
        ResultSet rs = con.selectConsulta(sql);
        return rs;
    }

}