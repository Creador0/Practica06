package com.softgame.poo1game.personajes;
import com.softgame.poo1game.utils.Utileria;
import java.lang.String;
public class Personaje{
	protected String nombre;
	protected int vida;
	private final int id;
	
	public Personaje(String nombre, int vida){
		this.vida = vida;
		this.nombre = nombre;
		id = Utileria.getID();
	}
	
	public Personaje(String nombre){
		this(nombre,3);
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
		
	public int getVida(){
		return vida;
	}	
	public boolean setVida(int vida){
		if(vida > 0 && vida < 100){
			this.vida = vida;
			return true;
		} else {
			return false;
		}
	}
	
	public String toString(){
		return (id + " " + nombre + " " + vida);
	}
	
	public void decVida(){
		decVida(1);
	}
	
	public void decVida(int dec){
		if((vida - dec) >= 0){
			vida = vida - dec;
		}
	}
	
	public boolean equals(Object o){
		boolean inicio = false;
		if((o != null) && (o instanceof Personaje)){
			Personaje p = (Personaje) o;
			if((nombre == p.nombre) && (vida == p.vida)){
				inicio = true;
			}
		}
		return inicio;
	}
	public final String getIdVida(){
		return id + " " + vida;
	}
}