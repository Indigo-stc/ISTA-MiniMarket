package modelo;

import java.util.Date;
import java.util.UUID;


public class Empleado extends Persona {

    private String Empleado_id;
    private String Rol;
    private double Salario;
    private String Password;
    private int Rol_id;
    private String dni;

    public Empleado() {
    }
    

    public Empleado(double Salario, String Password, int Rol_id, String Cedula, String Nombre, String Apellido, Date fecha_nacimiento, String Numero_telefono, String Correo, String Direccion) {
        super(Cedula, Nombre, Apellido, fecha_nacimiento, Numero_telefono, Correo, Direccion);
        this.Empleado_id = "Emp" + UUID.randomUUID().toString().substring(0, 3).toUpperCase();
        this.Rol = Rol;
        this.Salario = Salario;
        this.Password = Password;
        this.Rol_id = Rol_id;
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

    public int getRol_id() {
        return Rol_id;
    }

    public void setRol_id(int Rol_id) {
        this.Rol_id = Rol_id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

}
