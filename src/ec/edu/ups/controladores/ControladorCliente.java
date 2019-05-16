package ec.edu.ups.controladores;

import ec.edu.ups.modelo.Cliente;
import java.util.HashSet;
import java.util.Set;

public class ControladorCliente {

    private Set<Cliente> lista;
    private int codigo;
 
    
    public ControladorCliente() {
        lista = new HashSet<>();
        codigo = 1;
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
    
    public Cliente readCedula(String cedula){
        for(Cliente cliente : lista){
            if(cliente.getCedula().equals(cedula))
                return cliente;
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
