package com.elias.lenguajes.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.elias.lenguajes.models.Lenguaje;

public interface LenguajeRepo extends CrudRepository<Lenguaje, Long>{
	
	 //ESTE MÉTODO RECUPERA TODOS LOS LENGUAJES DE LA BASE DE DATOS
    List<Lenguaje> findAll();
    
    //ESTE MÉTODO ENCUENTRA UN LENGUAJE POR SU DESCRIPCIÓN
    //List<LanguageModel> findByDescriptionContaining(String search);
    
    //ESTE MÉTODO CUENTA CUÁNTOS LIBROS CONTIENE CIERTA CADENA EN EL TÍTULO
    //Long countByTitleContaining(String search);
    
    //ESTE MÉTODO BORRA UN LIBRO QUE EMPIEZA CON UN TÍTULO ESPECÍFICO
   // Long deleteByTitleStartingWith(String search);

}