package com.example.examenSemana4SpringRest.controller;


import com.example.examenSemana4SpringRest.entity.Sistema;
import com.example.examenSemana4SpringRest.repository.SistemaRepositoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SistemaController {
    @Autowired
    private SistemaRepositoryDAO sistemaRepositoryDAO;

    @GetMapping("/sistema")
    public List<Sistema> allSystem(){
        return (List<Sistema>) sistemaRepositoryDAO.findAll();
    }
}
