package com.example.demo.Controller;

import com.example.demo.DTOs.PersonaRequest;
import com.example.demo.DTOs.PersonasResponse;
import com.example.demo.Services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.POST;
import javax.ws.rs.Produces;

@RequestMapping("/personas")
@Controller
// @GetMapping("/nuevo")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @PostMapping("/nuevaPersona")
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity nuevaPersona(@RequestBody PersonaRequest personaRequest) {

        return personaService.setPersona(personaRequest);
    }

    @GetMapping("/listarPersonas")
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public PersonasResponse listarPersonas(){

        return personaService.listarPersonas();
    }
}
