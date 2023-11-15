package hn.unah.banco.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.banco.modelos.Cliente;
import hn.unah.banco.servicios.impl.ClienteServiceImpl;

@RestController
@RequestMapping("/api/clientes")
public class ClientesController {
    
    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @PostMapping("/guardar")
    public Cliente guardarCliente(@RequestBody Cliente nvoCliente){
        if(nvoCliente.getDireccion() != null){
            nvoCliente.getDireccion().setCliente(nvoCliente);
        }
        return this.clienteServiceImpl.guardarCliente(nvoCliente);
    }

    @GetMapping("/todos")
    public List<Cliente> obtenerTodos(){
        return this.clienteServiceImpl.obtenerTodos();
    }

 
}
