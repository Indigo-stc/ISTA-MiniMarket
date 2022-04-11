/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

//import Clases.Empleado;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public interface Crud<T> {

    boolean insert(T kl);

    List<T> LeerT();

// public boolean Modificar(T codigo);

    boolean delete(String codigo);
    boolean update(T objeto);
    List<T> Buscar(String codigo);
    ArrayList<T> registros();
    ResultSet pk(String id);

}
