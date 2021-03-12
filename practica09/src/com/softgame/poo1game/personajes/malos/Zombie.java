package com.softgame.poo1game.personajes.malos;
import com.softgame.poo1game.personajes.Personaje;
public class Zombie extends Personaje{
	boolean ataque;
	
	public boolean getAtaque(){
		return ataque;
	}
	
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
	
	public String getDetalle(){
		return super.getDetalle() + " " + ataque;
	}
	
	public void decVida(){
		if(!ataque){
			super.decVida(3);
		}else{
			super.decVida(2);
		}
	}
	
	public void decVida(int dec){
		if(!ataque){
			super.decVida(dec * 3);
		}else{
			super.decVida(dec * 2);
		}
	}
	public boolean equals(boolean o){
		boolean inicio = false;
		if((o != null) && o instanceof Zombie){
			Zombie z = (Zombie) o;
			if((nombre == z.nombre) && (vida == z.vida) && (ataque == z.ataque)){
				inicio = true;
			}
		}
		return inicio;
	}
}