package com.example.examenSemana4SpringRest.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="Expen")
@Getter @Setter
public class Expediente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idExpediente;
    private String fechaIncio;
    private String fwchaFin;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_Curso", referencedColumnName = "idCurso")
    private Curso curso;

    @JsonIgnore
    @OneToOne(mappedBy = "expediente")
    private Alumno alumno;
}
