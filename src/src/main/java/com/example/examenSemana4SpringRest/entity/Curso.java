package com.example.examenSemana4SpringRest.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="curse")
@Getter @Setter
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCurso;
    private String curso;

    @JsonIgnore
    @OneToOne(mappedBy = "curso")
    private Expediente expediente;

    @JsonIgnore
    @OneToOne(mappedBy = "curso")
    private Sistema sistema;
}
