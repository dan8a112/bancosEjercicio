package hn.unah.banco.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.banco.modelos.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, String>{
    
}
