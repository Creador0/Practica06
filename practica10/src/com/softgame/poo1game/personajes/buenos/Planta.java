package com.softgame.poo1game.personajes.buenos;
import com.softgame.poo1game.personajes.Personaje;
public class Planta extends Personaje{
	char escudo;
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
		return super.toString()+" "+escudo;
	}
	
	public void decVida(){
		if(escudo == 'A'){
			super.decVida(2);
		}else{
			super.decVida();
		}
	}
	
	public void decVida(int dec){
		if(escudo == 'A'){
			super.decVida(dec * 2);
		}else{
			super.decVida(dec);
		}
	}
	public boolean equals(Object o){
		boolean inicio = false;
		if((o != null) && (o instanceof Planta)){
			Planta pl = (Planta) o;
			if((nombre == pl.nombre) && (vida == pl.vida) && (escudo == pl.escudo)){
				inicio = true;
			}
		}
		return inicio;
	}
	//Error: non-static method getIdVida() cannot be referenced from a static context
	public String getIdvida(){
		return Personaje.getIdVida() + " " + escudo;
	}
}