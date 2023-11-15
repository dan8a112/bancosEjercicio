package hn.unah.banco.modelos;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "clientes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    
    @Id
    @Column(name = "dni") //Por convencion se coloca el mismo nombre
    private String dni;

    private String nombre;

    private String apellido;

    private String correo;

    private String telefono;

    @Column(name="fechaingreso")
    private Date fechaIngreso; 

    @OneToOne(mappedBy="cliente", cascade = CascadeType.ALL)
    private Direccion direccion; //->

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Cuenta> cuentas;

}

