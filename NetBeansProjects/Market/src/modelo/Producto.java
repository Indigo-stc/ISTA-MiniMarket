package modelo;

import java.io.File;
import java.util.UUID;

public class Producto {
    
    private String producto_id;
    private String nombre;
    private double precio;
    private int stock;
    private File imagen;
    private String descripcion;
    private String proveedor_id;
    private String categoria_id;

    public Producto(String nombre, double precio, int stock, File imagen, 
            String descripcion, String proveedor_id, String categoria_id) {
        this.producto_id = "Pdt-" + UUID.randomUUID().toString().substring(0, 5);;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.proveedor_id = proveedor_id;
        this.categoria_id = categoria_id;
    }

    public Producto(String producto_id, String nombre, double precio, int stock, 
            File imagen, String descripcion, String proveedor_id, String categoria_id) {
        this.producto_id = producto_id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.proveedor_id = proveedor_id;
        this.categoria_id = categoria_id;
    }

    public void setProducto_id(String producto_id) {
        this.producto_id = producto_id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setImagen(File imagen) {
        this.imagen = imagen;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setProveedor_id(String proveedor_id) {
        this.proveedor_id = proveedor_id;
    }

    public void setCategoria_id(String categoria_id) {
        this.categoria_id = categoria_id;
    }

    public String getProducto_id() {
        return producto_id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getProveedor_id() {
        return proveedor_id;
    }

    public String getCategoria_id() {
        return categoria_id;
    }

    public File getImagen() {
        return imagen;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %s %s", producto_id,nombre, precio,  stock, 
             imagen, descripcion, proveedor_id, categoria_id);
    }
    
}