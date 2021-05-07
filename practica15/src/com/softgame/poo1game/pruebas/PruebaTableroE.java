package com.softgame.poo1game.pruebas;
import com.softgame.poo1game.personajes.Personaje;
import com.softgame.poo1game.utils.Tablero;
import com.softgame.poo1game.utils.TheException;
import com.softgame.poo1game.personajes.buenos.Planta;
import com.softgame.poo1game.personajes.malos.Zombie;
public class PruebaTableroE{
	public static void main(String[] args) {
		Personaje[] arr={
			new Planta("Giovanna",50),
			new Zombie("Miguel",false),
			new Zombie("Karen",true),
			new Planta("Leonardo",99),
			new Planta("Sebastian",30),
			new Zombie("Hanna"),
			new Planta("Oscar"),
			new Zombie("Brian",false),
			new Planta("Lesly",9),
			new Planta("Vania",10),
			new Zombie("Erick",20,false),
			new Planta("Aline",40)
		};
		for (Personaje p: arr) {
			try{
				Tablero.addPersonaje(p);
			} catch (TheException te){
				System.err.println(te+" "+te.getPoss());
			}
		}
		try{
			Tablero.delPersonaje();
		} catch (TheException te){
			System.err.println(te+" "+te.getPoss());
		}
		Tablero.showAll();
		for (int i=0;i<15;i++) {
			try{
				Tablero.delPersonaje();
			} catch (TheException te){
				System.err.println(te+" "+te.getPoss());
			}
		}		
	}
}