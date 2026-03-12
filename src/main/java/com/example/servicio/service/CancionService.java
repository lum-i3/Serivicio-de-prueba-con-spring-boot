package com.example.servicio.service;

import com.example.servicio.model.Cancion;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CancionService {

    private List<Cancion> canciones = new ArrayList<>();

    public CancionService() {
        canciones.add(new Cancion(1, "Angel", "Madonna"));
        canciones.add(new Cancion(2, "Who's Crying Now", "Journey"));
        canciones.add(new Cancion(3, "Inbetween Days", "The Cure"));
        canciones.add(new Cancion(4, "cowboy like me", "Taylor Swift"));
        canciones.add(new Cancion(5, "Any Way You Want It", "Journey"));
        canciones.add(new Cancion(6, "Creep", "Glee Cast"));
    }

    public List<Cancion> obtenerCanciones(){
        return canciones;
    }

    public Cancion obtenerCancionPorId(int id){

        for (Cancion c : canciones) {
            if (c.getId() == id) {
                return c;
            }
        }

        return null;
    }
}