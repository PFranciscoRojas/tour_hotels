package com.firstproject.poo.infraestructure.repositories;

import com.firstproject.poo.infraestructure.entities.Libro;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

//el crud repository nos sirve por que ya hay funciones parametrizadas para bases de datos
public interface LibroCroudRepository extends CrudRepository<Libro,Integer> {
    //query metods
    @Query(value = "select * from libros where anio_publicacion = ?", nativeQuery = true)
    List<Libro> findByAnioPublicacion(int anioPublicacion);
    List<Libro> findByAnioPublicacionOrderByTitulo(int anioPublicacion);

}
