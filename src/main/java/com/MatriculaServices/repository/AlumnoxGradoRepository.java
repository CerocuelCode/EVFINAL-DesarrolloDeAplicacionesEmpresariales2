package com.MatriculaServices.repository;

import com.MatriculaServices.entity.AlumnoxGrado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlumnoxGradoRepository extends JpaRepository<AlumnoxGrado, Integer> {
    List<AlumnoxGrado> findAll();
}
