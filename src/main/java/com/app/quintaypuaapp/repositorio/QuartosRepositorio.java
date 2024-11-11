package com.app.quintaypuaapp.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.app.quintaypuaapp.modelo.Quartos;

@Repository
public interface QuartosRepositorio extends CrudRepository<Quartos, Integer>{

}
