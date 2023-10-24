package com.example.demo.Services;

import com.example.demo.DTOs.PersonaRequest;
import com.example.demo.DTOs.PersonasResponse;
import com.example.demo.Mapper.PersonaMapper;
import com.example.demo.Repositories.PersonaRepository;
import com.example.demo.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;
    @Autowired
    private PersonaMapper personaMapper;
    public ResponseEntity setPersona(PersonaRequest personaRequest) {

        Persona persona = personaMapper.personaRequestToPersona(personaRequest);
        personaRepository.save(persona);
        return ResponseEntity.ok("Persona guardada: " + persona.getNombre() + " " + persona.getApellido());
    }
    public PersonasResponse listarPersonas() {
        List<Persona> listaPersonas = personaRepository.findAll();
        return personaMapper.personaListToResponse(listaPersonas);
    }

    public List<Persona> getByDni(String dni) {
        return personaRepository.findByDni(dni);
    }

    public Persona save(Persona persona) {
        return personaRepository.save(persona);
    }

}
