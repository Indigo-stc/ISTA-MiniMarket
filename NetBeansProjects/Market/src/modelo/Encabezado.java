package modelo;

import java.util.Date;
import java.util.UUID;

public class Encabezado {

    private String codigoEncabezado;
    private String cedula;
    private Date fechaEncabezado;

   
    public Encabezado(String cedula, Date fechaEncabezado) {
        this.codigoEncabezado = "FACT-" +UUID.randomUUID().toString().substring(0, 3);
        this.cedula = cedula;
        this.fechaEncabezado = fechaEncabezado;
    }

    public Encabezado(String codigoEncabezado, String cedula, Date fechaEncabezado) {
        this.codigoEncabezado = codigoEncabezado;
        this.cedula = cedula;
        this.fechaEncabezado = fechaEncabezado;
    }

    
    
    public String getCodigoEncabezado() {
        return codigoEncabezado;
    }

    public void setCodigoEncabezado(String codigoEncabezado) {
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
