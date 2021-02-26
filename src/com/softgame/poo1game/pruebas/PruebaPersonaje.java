package com.softgame.poo1game.pruebas;
import com.softgame.poo1game.personajes.Personaje;
public class PruebaPersonaje{
	public static void main(String args[]){
		Personaje per01 = new Personaje("Aline");
		per01.setEdad(200);
		Personaje per02 = new Personaje("Erick");
		per02.setEdad(10);
		Personaje per03 = new Personaje("Alan");
		per03.setEdad(1);
		Personaje per04 = new Personaje("Lesly");
		per04.setEdad(-10);
	}
}