package com.softgame.poo1game.personajes.buenos;
import com.softgame.poo1game.personajes.Personaje;
public class Planta extends Personaje {
	private char escudo;
	public Planta(String nombre, int vida, char escudo){
		super(nombre,vida);
		this.escudo = escudo;
	}
	public Planta(String nombre, char escudo){
		this(nombre,3,escudo);
	}
	public Planta(String nombre, int vida){
		this(nombre,vida,'A');
	}
	public Planta(String nombre){
		this(nombre,3,'A');
	}
	public char getEscudo(){
		return escudo;
	}
	public String toString(){
		return super.toString()+"\t"+"{"+escudo+"}";
	}

	public void setNombre(String nombre){
		if(nombre.length()>5 && nombre.length()<10){
		this.nombre = nombre;
		}
	}

	public void decVida(){
		decVida(1);
	}
	public void decVida(int danio){
		if (escudo=='A'){
			super.decVida(danio*2);
		}else {
			super.decVida(danio);
		}
	}
	public boolean equals(Object x){
		boolean result = false;
		if ((x != null) && (x instanceof Planta)){
			Planta y = (Planta) x;
			if ((nombre==y.nombre)&&(vida==y.vida)&&(escudo==y.escudo)){
				result = true;
			}
		}
		return result;
	}
}