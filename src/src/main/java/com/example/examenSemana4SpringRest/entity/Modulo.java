package com.example.examenSemana4SpringRest.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="MModul")
@Getter @Setter
public class Modulo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private int duracion;

}
