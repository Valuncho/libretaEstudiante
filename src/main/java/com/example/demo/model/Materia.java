package com.example.demo.model;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Table(name = "materia")
@Entity
public class Materia {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long idMateria;
   private String nombre;
   private Integer anio;
   private Long idCarrera;
   private Long idProfesor;
}
