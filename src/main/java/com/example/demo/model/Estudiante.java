package com.example.demo.model;

public class Estudiante {
   private Long idEstudiante;
   private Long idPersona;
   private Integer legajo;

   public Long getIdEstudiante() {
      return idEstudiante;
   }

   public void setIdEstudiante(Long idEstudiante) {
      this.idEstudiante = idEstudiante;
   }

   public Long getIdPersona() {
      return idPersona;
   }

   public void setIdPersona(Long idPersona) {
      this.idPersona = idPersona;
   }

   public Integer getLegajo() {
      return legajo;
   }

   public void setLegajo(Integer legajo) {
      this.legajo = legajo;
   }
}
