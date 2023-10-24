package com.example.demo.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter

@Table(name = "profesor")
@Entity
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProfesor;
    private Long idPersona;
    // copiado del profe
    @OneToOne
    private Persona persona;
    @OneToMany
    private List<Materia> materias;
}
