package com.example.demo.DTOs;

import lombok.Data;

import java.util.List;

@Data
public class ProfesorRequest {
    private PersonaRequest persona;
    private List<MateriaRequest> materias;
}
