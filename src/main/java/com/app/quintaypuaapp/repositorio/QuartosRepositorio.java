package com.app.quintaypuaapp.repositorio;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.app.quintaypuaapp.modelo.Quartos;

@Repository
public interface QuartosRepositorio extends CrudRepository<Quartos, Integer>{

    @SuppressWarnings("null")
    List <Quartos> findAll();

    List <Quartos> findByNumeroCamas(int numeroCamas);
    
    List <Quartos> findByRegistro(int registro);
}
