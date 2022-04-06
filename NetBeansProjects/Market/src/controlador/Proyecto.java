/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
//
//import Controlador.ControladorM;

import java.util.UUID;
import modelo.Cliente;
import modelo.Conexion;
import modelo.ModeloCliente;
import modelo.ModeloEmpleado;
import vista.MenuPricpal;

//import proyecto.Vista.MenuPricpal;
//import proyecto.Vista.Menu;
/** 
 *
 * @author 59399
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MenuPricpal vista = new MenuPricpal();
        ModeloEmpleado modelo_E = new ModeloEmpleado();
        ModeloCliente modelo_C= new ModeloCliente();
        ControladorM controlador = new ControladorM(vista,modelo_C);
        controlador.InicioControl();

//        Cliente cl = new Cliente();
//        System.out.println(cl.getIdCliente());
            
    }

}
