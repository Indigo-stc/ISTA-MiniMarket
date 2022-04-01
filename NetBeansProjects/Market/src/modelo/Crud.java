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
public interface Crud {
    
    public boolean Insertar();

    public List<Empleado> Leer(String codigo);

    public boolean Modificar(String codigo);

    public boolean Eliminar(String codigo);
    
}
