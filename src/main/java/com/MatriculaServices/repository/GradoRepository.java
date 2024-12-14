package com.MatriculaServices.repository;

import com.MatriculaServices.entity.Grado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GradoRepository extends JpaRepository<Grado, Integer> {
    List<Grado> findAll();
    Grado findByAnho(int anho);
    void deleteById(int id);
}
