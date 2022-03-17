/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
//
//import Controlador.ControladorM;

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
        // TODO code application logic here
        MenuPricpal vista= new MenuPricpal();
        ControladorM controlador= new ControladorM(vista);
        controlador.InicioControl();
    }
    
}
