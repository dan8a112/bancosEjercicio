package hn.unah.banco.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "direcciones")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Direccion {
    
    @Id
    @Column(name="iddireccion")
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Especificamos que es un campo autoincrementable
    private int idDireccion;

    private String departamento;
    
    private String ciudad;
    
    @JsonIgnore //Hace que se ignore este campo al momento de enviar un json
    @OneToOne
    @JoinColumn(name = "dni", referencedColumnName = "dni")
    private Cliente cliente;

    
}
