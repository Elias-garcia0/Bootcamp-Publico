package com.elias.lenguajes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.elias.lenguajes.models.Lenguaje;
import com.elias.lenguajes.services.LenguajeService;

@RestController
public class LenguajeApiController {
	
	@Autowired
	private LenguajeService languageservice;
	
    //MOSTRAR INFORMACIÓN DE TODOS LOS LENGUAJES
    @GetMapping("/api/languages")
    public List<Lenguaje> index() {
        return languageservice.allLanguages();
    }
    
	//CREAR UN LENGUAJE
    @PostMapping(value="/api/languages")
    public Lenguaje create(@RequestParam(value="language") String name, 
    		@RequestParam(value="create") String create, 
    		@RequestParam(value="numberOfVersion") String numberOfVersion) {
        Lenguaje language = new Lenguaje(name, create, numberOfVersion);
        return languageservice.createLanguages(language);
    }
    
    //MOSTRAR INFORMACION DE UN LENGUAJE ESPECIFICO
    @GetMapping("/api/languages/{id}")
    public Lenguaje show(@PathVariable("id") Long id) {
        Lenguaje language = languageservice.findLanguage(id);
        return language;
    }
    
    //ACTUALIZAR INFORMACION DE UN LENGUAJE ESPECIFICO
    @PutMapping("/api/languages/{id}")
    public Lenguaje actualizar(@PathVariable("id")Long id,
    		@RequestParam(value="name") String name, 
    		@RequestParam(value="create") String create,
    		@RequestParam(value="numberOfVersion") String numberOfVersion) {
    	Lenguaje language = new Lenguaje(id, name, create, numberOfVersion);
        return languageservice.updateLanguage(language);
    	//return bookService.actualizarLibro(id, title, desc, lang,numOfPages );
    }

    //BORRAR LENGUAJE
    @DeleteMapping("/api/languages/{id}")
    public void borrarRegistro(@PathVariable("id")Long id) {
    	languageservice.borrarLanguage(id);
    }
}