package com.example.examenSemana4SpringRest.controller;

import com.example.examenSemana4SpringRest.entity.Curso;
import com.example.examenSemana4SpringRest.entity.Modulo;
import com.example.examenSemana4SpringRest.repository.ModulRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ModuleController {
    @Autowired
    private ModulRepository modulRepository;

    @GetMapping("/module")
    public List<Modulo> allModulos(){
        return (List<Modulo>) modulRepository.findAll();
    }
    @PostMapping("/module")
    public Modulo createModulo(@RequestBody Modulo modulo){
        return modulRepository.save(modulo);
    }
}
