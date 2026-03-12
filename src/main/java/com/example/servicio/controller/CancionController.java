package com.example.servicio.controller;

import com.example.servicio.model.Cancion;
import com.example.servicio.service.CancionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/canciones")
public class CancionController {

    private final CancionService cancionService;

    public CancionController(CancionService cancionService){
        this.cancionService = cancionService;
    }

    @GetMapping
    public List<Cancion> obtenerCanciones(){
        return cancionService.obtenerCanciones();
    }

    @GetMapping("/{id}")
    public Cancion obtenerCancion(@PathVariable int id){
        return cancionService.obtenerCancionPorId(id);
    }

}
