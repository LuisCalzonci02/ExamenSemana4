package com.example.examenSemana4SpringRest.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="Student")
@Getter @Setter
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idAlumno;
    private String nombre;
    private String apellido;
    private String direccion;
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "fk_expediente", referencedColumnName = "idExpediente")
    private Expediente expediente;

    @JsonIgnore
    @OneToOne(mappedBy = "alumno")
    private Sistema sistema;
}
