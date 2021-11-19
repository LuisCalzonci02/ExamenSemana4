package com.example.examenSemana4SpringRest.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@Table(name="content")
public class Contenido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idContenido;

    private String description;
    private String nombre;
    private int duracion;

    @JsonIgnore
    @OneToOne(mappedBy = "contenido")
    private Sistema sistema;
}
