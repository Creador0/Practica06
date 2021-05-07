package com.softgame.poo1game.personajes.buenos;
import com.softgame.poo1game.personajes.Personaje;
public abstract class Planta extends Personaje{
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
		return super.toString()+" "+escudo;
	}
	
	public void decVida(){
		decVida(1);
	}
	
	public void decVida(int dec){
		if(escudo == 'A'){
			super.decVida(dec * 2);
		}else{
			super.decVida(dec);
		}
	}
	public boolean equals(Object x){
		boolean bandera_P = false;
		if((x!=null) && (x instanceof Planta)){
			Planta z = (Planta) x;
			if((nombre == z.nombre) && (vida == z.vida) && (escudo == z.escudo)){
				bandera_P = true;
			}
		}
		return bandera_P;
	}
	
	public void setNombre(String nombre){
		if(nombre.length() >= 5 && nombre.length() <= 10){
			this.nombre = nombre;
		}
	}
}