package modelo;
import java.sql.ResultSet;

public interface ProductoDAO extends DDL<Producto> {

    public ResultSet buscar(String search);
    
}