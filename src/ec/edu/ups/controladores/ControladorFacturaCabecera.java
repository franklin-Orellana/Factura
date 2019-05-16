package ec.edu.ups.controladores;

import ec.edu.ups.modelo.Factura;
import java.util.HashSet;
import java.util.Set;

public class ControladorFacturaCabecera {

    private Set<Factura> lista;
    private int codigo;

    public ControladorFacturaCabecera() {
        lista = new HashSet<>();
        codigo = 1;
    }
    
    
    public int getCodigo() {
        return codigo;
    }

    public void crear(Factura objeto) {
        objeto.setCodigo(codigo);
        lista.add(objeto);
        codigo++;
    }

    public Factura read(int codigo) {
        for (Factura factura : lista) {
            if (factura.getCodigo() == codigo) {
                return factura;
            }
        }
        return null;
    }

    public void update(Factura objeto) {
        if (lista.contains(objeto)) {
            lista.remove(objeto);
            lista.add(objeto);
        }
    }

    public void delete(int codigo) {
        for (Factura factura : lista) {
            if (factura.getCodigo() == codigo) {
                lista.remove(factura);
                break;
            }
        }
    }

    public Set<Factura> getLista() {

        return lista;

    }

}
