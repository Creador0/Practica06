/*
Ricardo Sánchez Méndez
Fecha: 19/02/2021
Hora de inicio: 08:21 a. m.
Hora de finalizacion: 08: a. m.
*/
package com.softgame.poo1game.personajes;
public class Personaje{
	private String nombre;
	private int edad;
	public Personaje(String nombre){
		edad = 0;
		this.nombre = nombre;
	}
	public void setNombre(String nombre){
		if(nombre.length() > 3 && nombre.length() < 10){
			this.nombre = nombre;
		}
	}

	public String getNombre(){
		return nombre;
	}

	public void saludar(){
		System.out.println("Hola alumno de POO " + nombre);
	}
		
	public int getEdad(){
		return edad;
	}	
	public boolean setEdad(int edad){
		if(edad > 0 && edad < 120){
			this.edad = edad;
			return true;
		} else {
			return false;
		}
	}
	public String getDetalle(){
		return nombre + "\t" + edad;
	}
}