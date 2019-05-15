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

    
}