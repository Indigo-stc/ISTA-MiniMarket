package conection;

import java.util.ArrayList;
import java.sql.ResultSet;

public interface DDL<T> {
    
    boolean insert(T objeto);
    boolean delete(String column);
    boolean update(T objeto);
    ArrayList<T> registros();
    ResultSet pk(String id);
    boolean existeID(String id);

}