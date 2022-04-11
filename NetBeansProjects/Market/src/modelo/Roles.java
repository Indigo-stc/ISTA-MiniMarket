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
public class Roles {

    private int Rol_id;
    private String Etiqueta;

    public Roles() {

    }

    public Roles(int Rol_id, String Etiqueta) {
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
