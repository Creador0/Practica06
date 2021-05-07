package com.softgame.poo1game.utils;
import com.softgame.poo1game.personajes.Personaje;
public class Tablero{
	private static final int MAX_LINE=10;
	private static int idx =-1;
	private static Personaje[] personajes= new Personaje[MAX_LINE];
	private Tablero(){}
	public static void addPersonaje(Personaje p) throws TheException{
		boolean added = false;
		if (((idx+1)<MAX_LINE)){
			idx++;
			personajes[idx]= p;				
			added= true;
		}
		if(!added){
			throw new TheException("No es posible insertar el personaje ", idx);
		}
	}
	public static void delPersonaje() throws TheException{
		boolean deleted = false;
		if (((idx-1)>=-1) && ((idx-1)<=MAX_LINE)){
			personajes[idx]=null;
			deleted= true;
			idx--;
		}
		if(!deleted){
			throw new TheException("No es posible borrar el personaje ", idx);
		}
	}
	public static void showAll(){
		for (Personaje personaje: personajes) {
			if (personaje==null){
				System.out.println("-");
			}else{
				System.out.println(personaje.getNombre());
			}
		}
	}
}