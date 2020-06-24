package com.ecodeup.model;

import java.io.Serializable;
import java.util.Date;

public class Ecodeup implements Serializable {

	public static final long serialVersionUID = 1L;
	
	private String welcomeMessage;
	private String helloWorld;
	private Date date;
	private int contador;

	
	public Ecodeup(String wm, String hw, int contador) {
		super();
		this.welcomeMessage = wm;
		this.helloWorld = hw;
		this.date = new Date();
		this.contador = contador;
	}

	public Ecodeup() {

	}

	public String getWelcomeMessage() {
		return welcomeMessage;
	}

	public void setWelcomeMessage(String wm) {
		this.welcomeMessage = wm;
	}

	public String getHelloWorld() {
		return helloWorld;
	}

	public void setHelloWorld(String hw) {
		this.helloWorld = hw;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
}
