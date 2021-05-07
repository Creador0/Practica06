package com.softgame.poo1game.personajes.malos;
import com.softgame.poo1game.personajes.Personaje;
public final class Zombie extends Personaje{
	private boolean ataque;
	public Zombie(String nombre, int vida, boolean ataque){
		super(nombre, vida);
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
	public String toString(){
		return super.toString()+"\t"+"{"+ataque+"}";
	}

	public void setNombre(String nombre){
		if(nombre.length()>3 && nombre.length()<8){
		this.nombre = nombre;
		}
	}

	public void decVida(){
		decVida(1);
	}
	public void decVida(int danio){
		if (!ataque){
			super.decVida(danio*3);
		}else{
			super.decVida(danio*2);
		}
	}
	public boolean equals(Object x){
		boolean result = false;
		if ((x != null) && (x instanceof Zombie)){
			Zombie y = (Zombie) x;
			if ((nombre==y.nombre)&&(vida==y.vida)&&(ataque==y.ataque)){
				result = true;
			}
		}
		return result;
	}
}