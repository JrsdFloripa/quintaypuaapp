package com.app.quintaypuaapp.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.app.quintaypuaapp.modelo.Hospede;

@Repository
public interface HospedeRepositorio extends CrudRepository<Hospede, Integer> {

    
    
}