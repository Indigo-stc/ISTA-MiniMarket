/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

//import Clases.Persona;

/**
 *
 * @author 59399
 */
public class Empleado extends Persona {
    private String Empleado_id;
    private String Rol;
    private double Salario;
    private String Password;

    public Empleado() {
        super();
    }

    public Empleado(String Empleado_id, String Rol, double Salario, String Password) {
        this.Empleado_id = Empleado_id;
        this.Rol = Rol;
        this.Salario = Salario;
        this.Password = Password;
    }

    public Empleado(String Empleado_id, String Rol, double Salario, String Password, String Cedula, String Nombre, String Apellido, String fecha_nacimiento, String Numero_telefono, String Correo, String Direccion) {
        super(Cedula, Nombre, Apellido, fecha_nacimiento, Numero_telefono, Correo, Direccion);
        this.Empleado_id = Empleado_id;
        this.Rol = Rol;
        this.Salario = Salario;
        this.Password = Password;
    }


    public String getEmpleado_id() {
        return Empleado_id;
    }

    public void setEmpleado_id(String Empleado_id) {
        this.Empleado_id = Empleado_id;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
}
