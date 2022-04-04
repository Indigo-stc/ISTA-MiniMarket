package modelo;

import java.util.UUID;

public class Categoria {
    
    private String categoria_id;
    private String titulo;

    public Categoria(String categoria_id, String titulo) {
        this.categoria_id = categoria_id;
        this.titulo = titulo;
    }

    public Categoria(String titulo) {
        this.categoria_id = "Ctg-" + UUID.randomUUID().toString().substring(0, 5);
        this.titulo = titulo;
    }
    

    public String getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(String categoria_id) {
        this.categoria_id = categoria_id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return titulo;
    }
    
    
}