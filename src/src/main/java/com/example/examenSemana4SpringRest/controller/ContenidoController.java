package com.example.examenSemana4SpringRest.controller;

import com.example.examenSemana4SpringRest.entity.Contenido;
import com.example.examenSemana4SpringRest.entity.Curso;
import com.example.examenSemana4SpringRest.repository.ContenidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContenidoController {
    @Autowired
    private ContenidoRepository contenidoRepository;

    @GetMapping("/contenido")
    public List<Contenido> allContents(){
        return (List<Contenido>) contenidoRepository.findAll();

    }
    @PostMapping("/contenidos")
    public Contenido createCntenido(@RequestBody Contenido contenido){
        return contenidoRepository.save(contenido);
    }
    @PutMapping("/contenido/{id}")
    public Contenido updateContenido(@PathVariable Integer id, @RequestBody Contenido contenido){
        return contenidoRepository.save(contenido);
    }
    @DeleteMapping("/contenido/{id}")
    public void deletedContenido(@PathVariable("id") Integer id){
        contenidoRepository.deleteById(id);
    }
}
