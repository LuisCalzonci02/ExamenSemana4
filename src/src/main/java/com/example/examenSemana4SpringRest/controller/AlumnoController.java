package com.example.examenSemana4SpringRest.controller;


import com.example.examenSemana4SpringRest.entity.Alumno;
import com.example.examenSemana4SpringRest.entity.Curso;
import com.example.examenSemana4SpringRest.repository.AlumnoRepositoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlumnoController {

    @Autowired
    private AlumnoRepositoryDAO alumnoRepositoryDAO;

    @GetMapping("/alumnos")
    public List<Alumno> allAlumnos(){
        return (List<Alumno>) alumnoRepositoryDAO.findAll();
    }
    @PostMapping("/alumnos")
    public  Alumno createAlumno(@RequestBody Alumno alumno){
        return alumnoRepositoryDAO.save(alumno);
    }
    @PutMapping("/alumno/{id}")
    public Alumno updateAlumno(@PathVariable Integer id ,@RequestBody Alumno alumno) {
        return alumnoRepositoryDAO.save(alumno);
    }

    @DeleteMapping("/alumno/{id}")
    public void deleteAlumno(@PathVariable("id") Integer id) {
        alumnoRepositoryDAO.deleteById(id);
    }
}
