package hn.unah.banco.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.banco.modelos.Cuenta;

public interface CuentaRepository extends JpaRepository<Cuenta, Integer>{
    
}
