package com.softgame.poo1game.personajes.malos;
import com.softgame.poo1game.personajes.Personaje;
public final class Zombie extends Personaje{
	boolean ataque;
	public Zombie(String nombre, int vida, boolean ataque){
		super(nombre,vida);
		this.ataque = ataque;
	}
	public Zombie(String nombre, boolean ataque){
		this(nombre,3,ataque);
	}
	
	public Zombie(String nombre){
		this(nombre,3,false);
	}
	public boolean getAtaque(){
		return ataque;
	}
	public String getDetalle(){
		return super.toString() + " " + ataque;
	}
	
	public void decVida(){
		decVida(1);
	}
	
	public void decVida(int dec){
		if(!ataque){
			super.decVida(dec * 3);
		}else{
			super.decVida(dec * 2);
		}
	}
	public boolean equals(Object x){
		return ((super.equals(x)) && (x instanceof Zombie) && (ataque==((Zombie)x).ataque));
	}
	
	public void setNombre(String nombre){
		if(nombre.length() >= 3 && nombre.length() <= 8){
			this.nombre = nombre;
	}
}