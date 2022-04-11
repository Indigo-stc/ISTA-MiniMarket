package controlador;

import vista.MenuPricpal;

//import proyecto.Vista.MenuPricpal;
//import proyecto.Vista.Menu;

public class Proyecto {

    public static void main(String[] args) {

        MenuPricpal vista = new MenuPricpal();
        ControladorM controlador = new ControladorM(vista);

    }

}
