
package modelo;

import java.util.Date;

public class Encabezado {
    
     private int codigoEncabezado;
     private String cedula;
     private Date fechaEncabezado;
     

    public Encabezado(int codigoEncabezado, String cedula, Date fechaEncabezado) {
        this.codigoEncabezado = codigoEncabezado;
        this.cedula = cedula;
        this.fechaEncabezado = fechaEncabezado;
       
    }

    public int getCodigoEncabezado() {
        return codigoEncabezado;
    }

    public void setCodigoEncabezado(int codigoEncabezado) {
        this.codigoEncabezado = codigoEncabezado;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Date getFechaEncabezado() {
        return fechaEncabezado;
    }

    public void setFechaEncabezado(Date fechaEncabezado) {
        this.fechaEncabezado = fechaEncabezado;
    }
       
}

