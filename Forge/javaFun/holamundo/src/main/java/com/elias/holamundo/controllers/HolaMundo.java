package com.elias.holamundo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundo {
	
	@RequestMapping("")
	public String Bienvenida() {
		return "HOLA MUNDO";
	}
	
	@GetMapping("/random")
	public String BienvenidaRandom() {
		return "HOLA DESDE RANDOM";
	}

}
