package com.example.demo.Mapper;

import com.example.demo.DTOs.CarreraRequest;
import com.example.demo.model.Carrera;
import org.springframework.stereotype.Service;
@Service
public class CarreraMapper {
    public CarreraMapper() {
    }

    public Carrera carreraRequestToCarrera(CarreraRequest carreraRequest){
        Carrera carrera = new Carrera();
        carrera.setNombre(carreraRequest.getNombre());
        return carrera;
    }

}
