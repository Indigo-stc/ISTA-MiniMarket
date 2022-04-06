/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.UUID;

/**
 *
 * @author andres
 */
public class Cliente extends Persona {

    private String IdCliente;

    public Cliente() {

    }

//    public Cliente(String IdCliente, String Cedula, String Nombre, String Apellido, String fecha_nacimiento, String Numero_telefono, String Correo, String Direccion) {
//        super(Cedula, Nombre, Apellido, fecha_nacimiento, Numero_telefono, Correo, Direccion);
//        this.IdCliente = "Cli" + UUID.randomUUID().toString().substring(0, 3).toUpperCase();
//
//    }
//
//    public String getIdCliente() {
//        return IdCliente;
//    }

    public Cliente(String IdCliente) {
        this.IdCliente = IdCliente;
    }

    public Cliente(String IdCliente, String Cedula, String Nombre, String Apellido, String fecha_nacimiento, String Numero_telefono, String Correo, String Direccion) {
        super(Cedula, Nombre, Apellido, fecha_nacimiento, Numero_telefono, Correo, Direccion);
        this.IdCliente = IdCliente;
    }

    public String getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(String IdCliente) {
        this.IdCliente = IdCliente;
    }
    

}
