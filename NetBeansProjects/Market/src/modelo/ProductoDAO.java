package modelo;

import java.util.ArrayList;

public interface ProductoDAO extends DDL<Producto> {

    ArrayList buscar(String search);
    
}