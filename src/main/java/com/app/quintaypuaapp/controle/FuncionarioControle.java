package com.app.quintaypuaapp.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.app.quintaypuaapp.modelo.Funcionario;
import com.app.quintaypuaapp.repositorio.FuncionarioRepositorio;

@RestController
public class FuncionarioControle {
   
    @Autowired
    private FuncionarioRepositorio gerenciar;

    @PostMapping("cadastrarFuncionario")
    public Funcionario cadastrar(@RequestBody Funcionario funcionario){
        return gerenciar.save(funcionario);
    }

}
