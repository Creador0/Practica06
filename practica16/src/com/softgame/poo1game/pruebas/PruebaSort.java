package com.softgame.poo1game.pruebas;
import com.softgame.poo1game.personajes.Personaje;
import com.softgame.poo1game.personajes.buenos.Planta;
import com.softgame.poo1game.personajes.malos.Zombie;
import com.softgame.poo1game.utils.SortId;
import java.util.TreeSet;
import java.util.LinkedList;
import java.util.Collections;
public class PruebaSort{
	public static void main(String[] args) {
		TreeSet<Personaje> ts = new TreeSet<Personaje>();
		ts.add(new Planta("Cristian",70));
		ts.add(new Planta("Karen",50));
		ts.add(new Zombie("Hanna",80,false));
		ts.add(new Zombie("Erick",false));
		ts.add(new Zombie("Esmeralda",80,false));
		ts.add(new Planta("Miguel",99));
		ts.add(new Planta("Jaime",50));
		ts.add(new Zombie("Cristian",80,false));
		ts.add(new Zombie("Miguel",80,false));
		ts.add(new Planta("Karen",50));
		for (Personaje p:ts) {
			System.out.println(p);
		}
		System.out.println("****");
		LinkedList<Personaje> ls = new LinkedList<Personaje>();
		ls.add(new Planta("Cristian",70));
		ls.add(new Planta("Karen",50));
		ls.add(new Zombie("Hanna",80,false));
		ls.add(new Zombie("Erick",false));
		ls.add(new Zombie("Esmeralda",80,false));
		ls.add(new Planta("Miguel",99));
		ls.add(new Planta("Jaime",50));
		ls.add(new Zombie("Cristian",80,false));
		ls.add(new Zombie("Miguel",80,false));
		ls.add(new Planta("Karen",50));
		Collections.sort(ls, new SortId());
		for (Personaje p:ls) {
			System.out.println(p);
		}
	}
}