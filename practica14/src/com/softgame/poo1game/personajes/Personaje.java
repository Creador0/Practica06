package com.softgame.poo1game.personajes;
import com.softgame.poo1game.utils.Utileria;
import java.io.Serializable;
public abstract class Personaje implements Comparable<Personaje>, Serializable{
	protected String nombre; 
	protected int vida;
	protected final int id;
	public Personaje(String nombre, int vida){
		this.nombre = nombre;
		this.vida = vida;
		id= Utileria.getID();
	}
	public Personaje(String nombre){
		this(nombre,3);
	}
	public abstract void setNombre(String nombre);
	
	public String getNombre(){
		return nombre;
	}
 
	public int getVida(){
		return vida;
	}

	public int getId(){
		return id;
	}

	public int compareTo(Personaje p){
		if(nombre.compareTo(p.nombre)==0){
			return p.vida - vida;
		}
		return nombre.compareTo(p.nombre);
	}

	public int hashCode(){
		return nombre.hashCode()+vida*7;
	}

	public boolean setVida(int vida){
		if (vida >= 0 && vida <= 100){
			this.vida = vida;
			return true;
		} else {
			return false;
		}
	}

	public final String getIdVida(){
		return id + "\t" + vida;
	}

	public String toString(){
		return "["+id+"]" + "\t"+ nombre + "\t" + "("+vida+")";
	}
	public void decVida(){
		decVida(1);
	}
	public void decVida(int danio){
		if (vida-danio >=0) {
			vida-= danio;
		}
	}
	public abstract boolean equals(Object x);	
}