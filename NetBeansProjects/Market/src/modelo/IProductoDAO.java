package modelo;

import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IProductoDAO implements ProductoDAO {

    @Override
    public boolean insert(Producto objeto) {
        Conexion con = new Conexion();
        String stm = "INSERT INTO productos" +
                "VALUES ("+ objeto.getProducto_id() +", "+ objeto.getNombre() +", "
                + ""+ objeto.getPrecio() +", "+ objeto.getStock() +", "+ objeto.getImagen().toString() +", "
                + ""+ objeto.getDescripcion() +", "+ objeto.getProveedor_id() +", "+ objeto.getCategoria_id() +");";
        return con.insertUpdateDelete(stm);
    }

    @Override
    public void delete(String column) {}

    @Override
    public void update(Producto objeto) {}

    @Override
    public void pk(String id) {}

    @Override
    public ArrayList buscar(String search) {
        String stm = "";
        if ("".equals(search.trim())) {
            stm = """
                  SELECT producto_id, pdt.nombre, precio, stock, imagen, descripcion, titulo, pvd.nombre
                  FROM productos pdt 
                    JOIN categorias cat ON pdt.categoria_id = cat.categoria_id 
                    JOIN proveedores pvd ON pvd.proveedor_id = pdt.proveedor_id;""";
        } else {
            stm = """
                  SELECT producto_id, pdt.nombre, precio, stock, imagen, descripcion, titulo, pvd.nombre
                  FROM productos pdt 
                  	JOIN categorias cat ON pdt.categoria_id = cat.categoria_id 
                  	JOIN proveedores pvd ON pvd.proveedor_id = pdt.proveedor_id
                  WHERE like(pdt.nombre) LIKE LOWER('%%') OR 
                  	LOWER(titulo) = LIKE LOWER('%%') OR 
                  	LOWER(pvd.nombre) LIKE LOWER('%%') OR
                  	LOWER(product_id) LIKE LOWER('%%');""";
        }
        Conexion con = new Conexion();
        ResultSet res = con.selectConsulta(stm);
        ArrayList registros = new ArrayList();
        try {
            while(res.next()) {
                Categoria ctg = new Categoria(res.getString(1), res.getString(2));
                registros.add(ctg);
            }
        } catch (SQLException ex) {
            Logger.getLogger(IProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return registros;
    }

    @Override
    public ArrayList registros() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}