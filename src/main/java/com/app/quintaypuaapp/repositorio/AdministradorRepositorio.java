package com.app.quintaypuaapp.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.quintaypuaapp.modelo.Administrador;

@Repository
public interface AdministradorRepositorio extends CrudRepository<Administrador, Integer>{

}
