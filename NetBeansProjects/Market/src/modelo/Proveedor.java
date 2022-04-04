package modelo;

import java.util.UUID;

public class Proveedor {
    
    private String proveedor_id;
    private String nombre;
    private String telefono;
    private String direccion;

    public Proveedor(String proveedor_id, String nombre, String telefono, 
            String direccion) {
        this.proveedor_id = proveedor_id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
    public Proveedor(String nombre, String telefono, String direccion) {
        this.proveedor_id = "Pvd-" + UUID.randomUUID().toString().substring(0, 5);
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    
    public void setProveedor_id(String proveedor_id) {
        this.proveedor_id = proveedor_id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    public String getProveedor_id() {
        return proveedor_id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}