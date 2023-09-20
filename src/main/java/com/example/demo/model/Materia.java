package com.example.demo.model;

public class Materia {
   private Long idMateria;
   private String nombre;
   private String anio;
   private Long idCarrera;
   private Long idProfesor;

   public Long getIdMateria() {
      return idMateria;
   }

   public void setIdMateria(Long idMateria) {
      this.idMateria = idMateria;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getAnio() {
      return anio;
   }

   public void setAnio(String anio) {
      this.anio = anio;
   }

   public Long getIdCarrera() {
      return idCarrera;
   }

   public void setIdCarrera(Long idCarrera) {
      this.idCarrera = idCarrera;
   }

   public Long getIdProfesor() {
      return idProfesor;
   }

   public void setIdProfesor(Long idProfesor) {
      this.idProfesor = idProfesor;
   }
}
