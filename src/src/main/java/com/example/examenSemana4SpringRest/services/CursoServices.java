package com.example.examenSemana4SpringRest.services;

import com.example.examenSemana4SpringRest.entity.Curso;
import com.example.examenSemana4SpringRest.repository.CursoRepositoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServices {

    @Autowired
    CursoRepositoryDAO cursoRepositoryDAO;

        public List<Curso> getList(){
            return null;
        }
}
