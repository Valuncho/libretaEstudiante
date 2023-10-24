package com.example.demo.Services;

import com.example.demo.DTOs.CarreraRequest;
import com.example.demo.Mapper.CarreraMapper;
import com.example.demo.Repositories.CarreraRepository;
import com.example.demo.model.Carrera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CarreraService {

    @Autowired
    public CarreraRepository carreraRepository;

    @Autowired
    public CarreraMapper carreraMapper;

    public ResponseEntity setCarrera(CarreraRequest carreraRequest){
        Carrera carrera = carreraMapper.carreraRequestToCarrera(carreraRequest);
        carreraRepository.save(carrera);
        return ResponseEntity.ok("Carrera nueva guardada: " + carrera.getNombre());

    }

}
