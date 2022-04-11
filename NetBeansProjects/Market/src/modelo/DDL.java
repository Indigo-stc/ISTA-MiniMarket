package modelo;

import java.util.ArrayList;
import java.sql.ResultSet;

public interface DDL<T> {
    
    boolean insert(T objeto);
    void delete(String column);
    void update(T objeto);
    ArrayList<T> registros();
    ResultSet pk(String id);
    
}