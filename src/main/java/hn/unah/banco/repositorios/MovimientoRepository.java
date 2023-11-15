package hn.unah.banco.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.banco.modelos.Movimiento;

public interface MovimientoRepository extends JpaRepository<Movimiento, Integer>{
    
}
