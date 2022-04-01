package modelo;

public class Comprobante {
    
    private String idComprobante;
    private String productoID;
    private int cantidadProducto;
    private Double subTotal;
    private Double IVA;
    private Double Total;
    private String codigoEncabezado;

    public Comprobante(String idComprobante, String productoID, String nombreProducto, int cantidadProducto, Double subTotal, Double IVA, Double Total, String codigoEncabezado) {
        this.idComprobante = idComprobante;
        this.productoID = productoID;
        this.cantidadProducto = cantidadProducto;
        this.subTotal = subTotal;
        this.IVA = IVA;
        this.Total = Total;
        this.codigoEncabezado = codigoEncabezado;
    }

    public String getIdComprobante() {
        return idComprobante;
    }

    public void setIdComprobante(String idComprobante) {
        this.idComprobante = idComprobante;
    }

    public String getProductoID() {
        return productoID;
    }

    public void setProductoID(String productoID) {
        this.productoID = productoID;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public Double getIVA() {
        return IVA;
    }

    public void setIVA(Double IVA) {
        this.IVA = IVA;
    }

    public Double getTotal() {
        return Total;
    }

    public void setTotal(Double Total) {
        this.Total = Total;
    }

    public String getCodigoEncabezado() {
        return codigoEncabezado;
    }

    public void setCodigoEncabezado(String codigoEncabezado) {
        this.codigoEncabezado = codigoEncabezado;
    }
    
}
