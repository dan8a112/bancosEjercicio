package hn.unah.banco.servicios;

import java.util.List;

import hn.unah.banco.modelos.Cliente;

public interface ClienteService {
    
    public Cliente guardarCliente(Cliente cliente);

    public Cliente eliminarCliente(String id);

    public List<Cliente> obtenerTodos();

    public boolean validarTipoCuenta(char tipoCuenta);
    

}
