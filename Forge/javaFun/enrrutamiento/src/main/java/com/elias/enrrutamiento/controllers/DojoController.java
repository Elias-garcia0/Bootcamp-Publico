package com.elias.enrrutamiento.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DojoController {

	
	@RequestMapping("/m/{coding}")
	public String mostrar(@PathVariable("coding") String coding) {
		
		if(coding.contentEquals("dojo")) {
				  return "¡El Dojo es increíble!";
				  
			  }
			  
			  else if(coding.contentEquals("burbank-dojo")) {
			return "El Dojo Burbank está localizado al sur de California";
		}
			  else if(coding.contentEquals("san-jose")) {
					return "El Dojo SJ es el cuartel general";
		}
				 
	return "No reconozco el dojo " + coding;
	}
	
   
}





  
 

  

