package com.hola.curso.servlet;

public class RegistroPersona {

	Persona persona;
	protected Persona creaPersona() {
		
		persona = new Persona();
		persona.setNombre("juan");
		persona.setEdad(32);
		return persona;
	}

}
