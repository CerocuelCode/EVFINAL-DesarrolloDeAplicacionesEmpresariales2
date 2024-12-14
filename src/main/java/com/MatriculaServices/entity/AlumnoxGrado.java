package com.MatriculaServices.entity;

import jakarta.persistence.*;

@Entity
public class AlumnoxGrado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    @ManyToOne
    @JoinColumn(name = "idGrado")
    private Grado idGrado;
    @ManyToOne
    @JoinColumn(name = "idAlumno")
    private Alumno idAlumno;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Grado getIdGrado() {
        return idGrado;
    }

    public void setIdGrado(Grado idGrado) {
        this.idGrado = idGrado;
    }

    public Alumno getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Alumno idAlumno) {
        this.idAlumno = idAlumno;
    }
}
