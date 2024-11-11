package com.app.quintaypuaapp.controle;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.quintaypuaapp.modelo.Quartos;

@RestController
public class QuartosControle {

     @PostMapping("/quartos")
    public Quartos quarto(@RequestBody Quartos quartos){
        return quartos;
    }

}
