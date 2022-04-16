package connection;

import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Producto;

public class IProductoDAO implements Crud<Producto> {

    @Override
    public boolean insert(Producto objeto) {
        System.out.println(objeto);
        Conexion con = new Conexion();
        String sql = "INSERT INTO public.productos(\n" +
"	producto_id, nombre, precio, stock, imagen, descripcion, proveedor_id, categoria_id, activo)\n" +
"	VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            PreparedStatement ps = con.getCon().prepareStatement(sql);
            ps.setString(1, objeto.getProducto_id());
            ps.setString(2, objeto.getNombre());
            ps.setDouble(3, objeto.getPrecio());
            ps.setInt(4, objeto.getStock());
            ps.setBytes(5, objeto.getImagen());
            ps.setString(6, objeto.getDescripcion());
            ps.setString(7, objeto.getProveedor_id());
            ps.setString(8, objeto.getCategoria_id());
            ps.setBoolean(9, true);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(IProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public ArrayList registros() {
        ArrayList<Producto> pdts = new ArrayList<>();
        String stm = """
                    SELECT producto_id, pdt.nombre, precio, stock, imagen, descripcion, titulo, pvd.nombre
                    FROM productos pdt 
                    JOIN categorias cat ON pdt.categoria_id = cat.categoria_id 
                    JOIN proveedores pvd ON pvd.proveedor_id = pdt.proveedor_id;""";

        Conexion con = new Conexion();
        ResultSet res = con.selectConsulta(stm);
        try {
            while (res.next()) {
                Producto pdt = new Producto(res.getString(1), res.getString(2),
                        res.getDouble(3), res.getInt(4), res.getBytes(5),
                        res.getString(6), res.getString(8), res.getString(7));
                pdts.add(pdt);
            }
        } catch (SQLException ex) {
            Logger.getLogger(IProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pdts;
    }

    @Override
    public boolean delete(String id) {
        Conexion con = new Conexion();
        String stm = """
                     UPDATE productos
                     	SET  activo=FALSE 
                     	WHERE producto_id=?;""";
        try {
            PreparedStatement ps = con.getCon().prepareStatement(stm);
            ps.setString(1, id);    
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(IProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean existPdt(String name) {
        Conexion con = new Conexion();
        String stm = "SELECT * FROM productos WHERE activo = TRUE AND "
                + " UPPER(REPLACE(nombre , ' ', '')) like UPPER(REPLACE('"+name+"' , ' ', '')) ";
        ResultSet res = con.selectConsulta(stm);
        try {
            return res.next();
        } catch (SQLException ex) {
            System.out.println("producto_id existente");
            return false;
        }
    }

    @Override
    public ResultSet pk(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ArrayList<Producto> buscar(String search) {
        ArrayList<Producto> pdts = new ArrayList<>();
        String stm = "";
        if ("".equals(search.trim())) {
            stm = """
                  SELECT producto_id, pdt.nombre, precio, stock, imagen, descripcion, titulo, pvd.nombre
                  FROM productos pdt 
                    JOIN categorias cat ON pdt.categoria_id = cat.categoria_id 
                    JOIN proveedores pvd ON pvd.proveedor_id = pdt.proveedor_id 
                  WHERE activo = TRUE;""";
        } else {
            stm = "SELECT producto_id, pdt.nombre, precio, stock, imagen, descripcion, titulo, pvd.nombre "
                    + "FROM productos pdt "
                    + "JOIN categorias cat ON pdt.categoria_id = cat.categoria_id "
                    + "JOIN proveedores pvd ON pvd.proveedor_id = pdt.proveedor_id "
                    + "WHERE activo = TRUE AND "
                    + "(LOWER(pdt.nombre) LIKE LOWER('%" + search + "%') OR "
                    + "                  	LOWER(titulo) LIKE LOWER('%" + search + "%') OR "
                    + "                  	LOWER(pvd.nombre) LIKE LOWER('%" + search + "%') OR "
                    + "                  	LOWER(producto_id) LIKE LOWER('%" + search + "%'));";
        }
        Conexion con = new Conexion();
        ResultSet res = con.selectConsulta(stm);
        try {
            while (res.next()) {
                Producto pdt = new Producto(res.getString(1), res.getString(2),
                        res.getDouble(3), res.getInt(4), res.getBytes(5),
                        res.getString(6), res.getString(8), res.getString(7));
                pdts.add(pdt);
            }
        } catch (SQLException ex) {
            Logger.getLogger(IProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pdts;
    }

    @Override
    public List<Producto> LeerT() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Producto> Buscar(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(Producto objeto) {
        Conexion con = new Conexion();
        String stm = """
                     UPDATE public.productos
                     	SET nombre=?, precio=?, stock=?, imagen=?, descripcion=?, proveedor_id=?, categoria_id=?
                     	WHERE producto_id=?;""";
        try {
            PreparedStatement ps = con.getCon().prepareStatement(stm);
            ps.setString(1, objeto.getNombre());
            ps.setDouble(2, objeto.getPrecio());
            ps.setInt(3, objeto.getStock());
            ps.setBytes(4, objeto.getImagen());
            ps.setString(5, objeto.getDescripcion());
            ps.setString(6, objeto.getProveedor_id());
            ps.setString(7, objeto.getCategoria_id());
            ps.setString(8, objeto.getProducto_id());
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(IProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public Producto produ(String id) {
        Conexion con = new Conexion();
        String sql = "select * from productos where producto_id = '"+id+"' AND activo = TRUE";
        ResultSet rs = con.selectConsulta(sql);
        Producto pro = null;
        try {
            if (rs.next()) {
                pro = new Producto(rs.getString(1), rs.getString(2), rs.getDouble(3), rs.getInt(4), rs.getBytes(5),
                        rs.getString(6), rs.getString(7),
                        rs.getString(8));
            }
        } catch (SQLException ex) {
            Logger.getLogger(IProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
            pro = null;
        }
        return pro;
    }

}

