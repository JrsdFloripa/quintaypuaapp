package com.app.quintaypuaapp.controle;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.app.quintaypuaapp.modelo.Servicos;

@RestController
public class ServicosControle {

@PostMapping("/servicos")
    public Servicos servicos(@RequestBody Servicos servicos){
        return servicos;
    }


}
