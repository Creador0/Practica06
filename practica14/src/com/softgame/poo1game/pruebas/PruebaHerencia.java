package com.softgame.poo1game.pruebas;
import com.softgame.poo1game.personajes.Personaje;
import com.softgame.poo1game.personajes.buenos.Planta;
import com.softgame.poo1game.personajes.malos.Zombie;
public class PruebaHerencia{
	public static void main(String[] args) {
		Personaje[] personajes= {
			new Personaje("Omar",99),
			new Planta("Karen",50),
			new Zombie("Hanna",80,false),

			new Personaje("Omar",99),
			new Planta("Karen",50),
			new Zombie("Hanna",80,false)
		};
		System.out.println(personajes[2].getIdVida());
		int i=0;
		while(i<personajes.length){
			for (Personaje p:personajes) {
				if(personajes[i]==p){
					System.out.println("*** "+personajes[i]+" es identico a "+p+", son el mismo objeto ***");
					continue;
				} 
				if (personajes[i].equals(p)) {
					System.out.println("** "+personajes[i]+" es igual a "+p+", son diferentes objetos **");
					continue;
				} 
				System.out.println(personajes[i]+"!="+p);
			}
			i++;
			System.out.println();
		}
	}
}