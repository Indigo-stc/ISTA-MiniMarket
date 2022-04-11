package modelo;

import java.util.Date;
import java.util.UUID;

public class Cliente extends Persona {

    private String IdCliente;
    
    public Cliente(){
        
    }

    public Cliente(String IdCliente, String Cedula, String Nombre, String Apellido, Date fecha_nacimiento, String Numero_telefono, String Correo, String Direccion) {
        super(Cedula, Nombre, Apellido, fecha_nacimiento, Numero_telefono, Correo, Direccion);
        this.IdCliente = IdCliente;
    }

    public Cliente(String Cedula, String Nombre, String Apellido, Date fecha_nacimiento, String Numero_telefono, String Correo, String Direccion) {
        super(Cedula, Nombre, Apellido, fecha_nacimiento, Numero_telefono, Correo, Direccion);
        this.IdCliente = "Cli" + UUID.randomUUID().toString().substring(0, 3).toUpperCase();
    }

    public String getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(String IdCliente) {
        this.IdCliente = IdCliente;
    }
    
    
}
