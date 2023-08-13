package com.elias.lenguajes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elias.lenguajes.models.Lenguaje;
import com.elias.lenguajes.repositories.LenguajeRepo;


@Service
public class LenguajeService {
	
	@Autowired
	private LenguajeRepo lenguajeRepo;
	
    //DEVOLVIENDO TODOS LOS LENGUAJES
    public List<Lenguaje> allLanguages() {
        return lenguajeRepo.findAll();
    }
    
    //CREANDO UN LENGUAJE
    public Lenguaje createLanguages(Lenguaje b) {
        return lenguajeRepo.save(b);
    }
    
    //OBTENIENDO LOS DETALLES DE UN LENGUAJE EN ESPECÍFICO
    public Lenguaje findLanguage(Long id) {
        Optional<Lenguaje> optionalLanguage = lenguajeRepo.findById(id);
        if(optionalLanguage.isPresent()) {
            return optionalLanguage.get();
        } else {
            return null;
        }
    }
    
  //ACTUALIZAR INFORMACION
    public Lenguaje updateLanguage(Lenguaje language) {
    	Lenguaje temporal = findLanguage(language.getId());
    	temporal.setName(language.getName());
    	temporal.setCreator(language.getCreator());
    	temporal.setNumberOfVersion(language.getNumberOfVersion());
    	
    	return lenguajeRepo.save(temporal);
    }
    //SOBRECARGA DE METODO DE ACTUALIZAR INFORMACION
	public Lenguaje updateLanguage(Long id,
			String name, 
			String creator, 
			String numberOfVersion) {
		Lenguaje temporal = lenguajeRepo.findById(id).orElse(null);
		if(temporal != null) {
			temporal.setName(name);
			temporal.setCreator(creator);
			temporal.setNumberOfVersion(numberOfVersion);
			
			lenguajeRepo.save(temporal);
			return temporal;
		}else {
			return temporal;
		}
	}
	
	//BORRAR UN LENGUAJE
	public void borrarLanguage(Long id) {
		lenguajeRepo.deleteById(id);
	}


}