package hn.unah.banco.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.banco.modelos.Direccion;

public interface DireccionRepository extends JpaRepository<Direccion, Integer> {
    
}
