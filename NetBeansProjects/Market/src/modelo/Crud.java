/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

//import Clases.Empleado;
import java.util.List;

/**
 *
 * @author 59399
 */
public interface Crud<T> {

    boolean Insertar(T kl);

    public List<T> LeerT();

//    public boolean Modificar(T codigo);

    public boolean Eliminar(String codigo);

    public List<T> Buscar(String codigo);

}
