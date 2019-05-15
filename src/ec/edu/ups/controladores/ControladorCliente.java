package ec.edu.ups.controladores;

import ec.edu.ups.modelo.Cliente;
import java.util.HashSet;
import java.util.Set;

public class ControladorCliente {

    private Set<Cliente> lista;
    private int codigo;
    private int contador;
    
    public ControladorCliente() {
        lista = new HashSet<>();
        codigo = 1;
        contador = 1;
    }

    public int getContador() {
        return contador;
    }
    
    
    public int getCodigo() {
        return codigo;
    }

    public void crear(Cliente objeto) {
        objeto.setCodigo(codigo);
        lista.add(objeto);
        codigo++;
    }

    public Cliente read(int codigo) {
        for (Cliente cliente : lista) {
            if (cliente.getCodigo() == codigo) {
                return cliente;
            }
        }
        return null;
    }

    public void update(Cliente objeto) {
        if (lista.contains(objeto)) {
            lista.remove(objeto);
            lista.add(objeto);
        }
    }

    public void delete(int codigo) {
        for (Cliente cliente : lista) {
            if (cliente.getCodigo() == codigo) {
                lista.remove(cliente);
                break;
            }
        }
    }

    public Set<Cliente> getLista() {

        return lista;

    }

}
