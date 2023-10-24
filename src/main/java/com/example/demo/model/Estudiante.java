package com.example.demo.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Table(name = "estudiante")
@Entity
public class Estudiante {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long idEstudiante;
   private Long idPersona;
   private Integer legajo;
}
