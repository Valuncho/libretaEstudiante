package com.example.demo.DTOs;

import lombok.Data;

import java.util.List;

@Data
public class PersonasResponse {
    private List<PersonaResponse> personas;
}
