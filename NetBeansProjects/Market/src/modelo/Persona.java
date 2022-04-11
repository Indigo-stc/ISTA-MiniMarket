/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author 59399
 */
public class Persona {
    private String Cedula;
    private String Nombre;
    private String Apellido;
    private Date fecha_nacimiento;
    private String Numero_telefono;
    private String Correo;
    private String Direccion;

    public Persona() {
    }

    public Persona(String Cedula, String Nombre, String Apellido, Date fecha_nacimiento, String Numero_telefono, String Correo, String Direccion) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.Numero_telefono = Numero_telefono;
        this.Correo = Correo;
        this.Direccion = Direccion;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getNumero_telefono() {
        return Numero_telefono;
    }

    public void setNumero_telefono(String Numero_telefono) {
        this.Numero_telefono = Numero_telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    
    
}
