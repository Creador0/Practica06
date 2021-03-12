package com.softgame.poo1game.pruebas;
import com.softgame.poo1game.personajes.Personaje;
import com.softgame.poo1game.personajes.buenos.Planta;
import com.softgame.poo1game.personajes.malos.Zombie;

public class PruebaHerencia{
	public static void main(String args[]){
		Personaje[] personajes = new Personaje("Omar",99), new Planta("Karen",50),
		new Zombie("Hanna",80,false), new personajes("Omar",99), new Planta("Karen",50),
		new Zombie("Hanna",80,false);
		
		while(i < personajes.length()){
			for(Personaje p: personajes){
				if(i == p){
					System.out.println("***" + i.toString() + "es identico a" p.toString()
					+ "Son el mismo objeto");
				}
				if(i.equals(p)){
					System.out.println("**" + i.toString() + "es igual a" + p.toString()
					+ "Son diferentes objetos");
				}else{
					System.out.println(i.toString() + "!=" + p.toString());
				}
			}
		}
	}
}