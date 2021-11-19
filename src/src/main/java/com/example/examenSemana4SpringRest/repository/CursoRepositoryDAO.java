package com.example.examenSemana4SpringRest.repository;

import com.example.examenSemana4SpringRest.entity.Curso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CursoRepositoryDAO extends CrudRepository<Curso, Integer> {
//    List<Curso> findCursoBy(@Param("curso") String curso);

}
