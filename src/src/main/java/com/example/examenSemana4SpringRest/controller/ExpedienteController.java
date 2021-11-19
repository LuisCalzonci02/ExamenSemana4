package com.example.examenSemana4SpringRest.controller;

import com.example.examenSemana4SpringRest.entity.Curso;
import com.example.examenSemana4SpringRest.entity.Expediente;
import com.example.examenSemana4SpringRest.repository.ExpedienteRepositoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ExpedienteController {
    @Autowired
    private ExpedienteRepositoryDAO expedienteRepositoryDAO;

    @GetMapping("/expediente")
    public List<Expediente> allExpedientes(){
        return (List<Expediente>) expedienteRepositoryDAO.findAll();
    }

    @PostMapping("/expediente")
    public Expediente createExpediente(@RequestBody Expediente expediente){
        return expedienteRepositoryDAO.save(expediente);
    }
}
