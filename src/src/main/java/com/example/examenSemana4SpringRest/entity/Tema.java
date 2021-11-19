package com.example.examenSemana4SpringRest.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="Topic")
@Getter @Setter
public class Tema {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private int contenido;
}
