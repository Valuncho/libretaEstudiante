package com.example.demo.DTOs;

import lombok.Data;

@Data
public class PersonaResponse {
    private String Nombre;
    private String Apellido;
    private String dni;
    private String telefono;
    private String mail;
    private String direccion;
}
