package com.example.demo.Services;

import com.example.demo.DTOs.ProfesorRequest;
import com.example.demo.Mapper.ProfesorMapper;
import com.example.demo.Repositories.ProfesorRepository;
import com.example.demo.model.Profesor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class ProfesorService {

    @Autowired
    private ProfesorRepository profesorRepository;

    @Autowired
    private ProfesorMapper profesorMapper;

    @Autowired
    private PersonaService personaService;

    public ResponseEntity setProfesor(ProfesorRequest profesorRequest) throws SQLException {

        Profesor profesor = profesorMapper.profesorRequestToProfesor(profesorRequest);

        try {
            profesorRepository.save(profesor);
        }
        catch (RuntimeException exception) {
            return ResponseEntity.badRequest().body(exception.getCause().getLocalizedMessage());
        }
        return ResponseEntity.ok("Profesor guardado: " + profesor.getPersona().getNombre() + " "
                + profesor.getPersona().getApellido());
    }

    public void setPersonaNuevaOExistente(ProfesorRequest profesorRequest, Profesor profesor) {
        if(personaService.getByDni(profesorRequest.getPersona().getDni()).isEmpty()) {
            profesor.setPersona(profesorMapper.profesorRequestToPersona(profesorRequest));
        }
        else {
            profesor.setPersona(personaService.getByDni(profesorRequest.getPersona().getDni()).get(0));
        }
    }
}
