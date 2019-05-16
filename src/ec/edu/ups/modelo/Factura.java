package ec.edu.ups.modelo;

import java.util.Date;
import java.util.List;

public class Factura {
private int codigo;
private Date fecha;
private Cliente cliente;
private double subtotal;
private double iva;
private double total;


    public Factura() {
    }

    public Factura(int codigo, Date fecha, Cliente cliente, double subtotal, double iva, double total) {
        this.codigo = codigo;
        this.fecha = fecha;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Factura{" + "codigo=" + codigo + ", fecha=" + fecha + ", cliente=" + cliente + ", subtotal=" + subtotal + ", iva=" + iva + ", total=" + total + '}';
    }

   
}