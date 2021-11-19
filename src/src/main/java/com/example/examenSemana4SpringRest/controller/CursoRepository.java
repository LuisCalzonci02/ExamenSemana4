package com.example.examenSemana4SpringRest.controller;

import com.example.examenSemana4SpringRest.entity.Curso;
import com.example.examenSemana4SpringRest.repository.CursoRepositoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CursoRepository {

    @Autowired
    private CursoRepositoryDAO cursoRepositoryDAO;

    @GetMapping("/curso")
    public List<Curso> allCursos(){
        return (List<Curso>) cursoRepositoryDAO.findAll();
    }
    @PostMapping("/cursos")
    public  Curso createCurso(@RequestBody Curso curso){
        return cursoRepositoryDAO.save(curso);
    }
    @PutMapping("/cursos/{id}")
    public Curso updateCurso(@PathVariable Integer id ,@RequestBody Curso curso) {
        return cursoRepositoryDAO.save(curso);
    }

    @DeleteMapping("/curos/{id}")
    public void deleteCursos(@PathVariable("id") Integer id) {
        cursoRepositoryDAO.deleteById(id);
    }
}
