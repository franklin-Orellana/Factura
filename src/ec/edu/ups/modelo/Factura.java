package ec.edu.ups.modelo;

import java.util.Date;
import java.util.Objects;

public class Factura {
private int codigo;
private Date Fecha;
private Cliente cliente;
private double subtotal;
private double iva;
private double total;

    public Factura() {
    }

    public Factura(int codigo, Date Fecha, Cliente cliente, double subtotal, double iva, double total) {
        this.codigo = codigo;
        this.Fecha = Fecha;
        this.cliente = cliente;
        this.subtotal = subtotal;
        this.iva = iva;
        this.total = total;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Factura{" + "codigo=" + codigo + ", Fecha=" + Fecha + ", cliente=" + cliente + ", subtotal=" + subtotal + ", iva=" + iva + ", total=" + total + '}';
    }

}