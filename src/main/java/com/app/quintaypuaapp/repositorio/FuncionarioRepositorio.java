package com.app.quintaypuaapp.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.app.quintaypuaapp.modelo.Funcionario;

@Repository
public interface FuncionarioRepositorio extends CrudRepository<Funcionario, Integer>{

    
    

}
