package com.example.demo.Controller;


import javax.ws.rs.Produces;
import com.example.demo.DTOs.PersonaRequest;
import com.example.demo.Services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/estudiantes")
@Controller
public class EstudianteController {
    @Autowired
    private PersonaService personaService;

    @PostMapping("/nuevaPersona")
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity nuevaPersona(@RequestBody PersonaRequest personaRequest) {

        return personaService.setPersona(personaRequest);
    }
}
