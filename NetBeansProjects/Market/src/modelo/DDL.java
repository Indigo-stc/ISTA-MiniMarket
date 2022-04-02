package modelo;

import java.util.ArrayList;

public interface DDL<T> {
    
    boolean insert(T objeto);
    void delete(String column);
    void update(T objeto);
    ArrayList<T> registros();
    void pk(String id);
    
}