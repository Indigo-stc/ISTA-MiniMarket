package modelo;

public class Rol {

    private int Rol_id;
    private String Etiqueta;

    public Rol() {

    }

    public Rol(int Rol_id, String Etiqueta) {
        this.Rol_id = Rol_id;
        this.Etiqueta = Etiqueta;
    }

    public int getRol_id() {
        return Rol_id;
    }

    public void setRol_id(int Rol_id) {
        this.Rol_id = Rol_id;
    }

    public String getEtiqueta() {
        return Etiqueta;
    }

    public void setEtiqueta(String Etiqueta) {
        this.Etiqueta = Etiqueta;
    }

    @Override
    public String toString() {
        return Etiqueta;
    }

  
}
