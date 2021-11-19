package com.example.examenSemana4SpringRest.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="System")
@Getter
@Setter
public class Sistema {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idSystem;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="Fk_Alumno", referencedColumnName = "idAlumno")
    private Alumno alumno;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_Curso", referencedColumnName = "idCurso")
    private Curso curso;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_Contenido", referencedColumnName = "idContenido")
    private Contenido contenido;
}
