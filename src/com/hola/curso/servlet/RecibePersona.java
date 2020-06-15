package com.hola.curso.servlet;

public class RecibePersona {

	public RecibePersona() {
		RegistroPersona registroPersona = new RegistroPersona();
		Persona persona = registroPersona.creaPersona();
		System.out.println("nombre: " + persona.getNombre());
		System.out.println("edad: " + persona.getEdad());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RecibePersona();
	}
}
