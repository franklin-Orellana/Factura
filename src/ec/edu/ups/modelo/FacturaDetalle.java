package ec.edu.ups.modelo;

public class FacturaDetalle {

    private int codigo;
    private double precio;
    private int cantidad;
    private double subtotal;
    private Producto producto;
    private int codfac;

    public FacturaDetalle() {
    }

    public FacturaDetalle(int codigo, double precio, int cantidad, double subtotal, Producto producto, int codfac) {
        this.codigo = codigo;
        this.precio = precio;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.producto = producto;
        this.codfac = codfac;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCodfac() {
        return codfac;
    }

    public void setCodfac(int codfac) {
        this.codfac = codfac;
    }

    @Override
    public String toString() {
        return "FacturaDetalle{" + "codigo=" + codigo + ", precio=" + precio + ", cantidad=" + cantidad + ", subtotal=" + subtotal + ", producto=" + producto + ", codfac=" + codfac + '}';
    }

}
