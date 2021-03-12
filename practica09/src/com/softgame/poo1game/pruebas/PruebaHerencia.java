package com.softgame.poo1game.pruebas;
import com.softgame.poo1game.personajes.Personaje;
import com.softgame.poo1game.personajes.buenos.Planta;
import com.softgame.poo1game.personajes.malos.Zombie;

public class PruebaHerencia{
	public static void main(String args[]){
		Personaje per01 = new Personaje("Valeria",99);
		Personaje per02 = new Personaje("Octavio");
		Planta plan01 = new Planta("Wendy",10,'B');
		Planta plan02 = new Planta("Ricardo",50);
		Planta plan03 = new Planta("Vania",'C');
		Planta plan04 = new Planta("Alan");
		Zombie zom01 = new Zombie("Karen",80,false);
		Zombie zom02 = new Zombie("Eduardo",true);
		Zombie zom03 = new Zombie("Esmeralda");
	
		Personaje[] personajes = {per01,per02,plan01,plan02,plan03,plan04,zom01,zom02,zom03};
	
		for(Personaje i: personajes){
			System.out.print(i.getDetalle()+"\t");
		
			if(i instanceof Planta){
				System.out.print("Soy planta"+"\n");
			}
		
			if(i instanceof Zombie){
				System.out.print("Soy zombie"+"\n");
			}
		
			int res = (int)(Math.random()*10);
			i.decVida(res);
			System.out.print(i.getDetalle()+"\t");
		
			if(i instanceof Planta){
				System.out.print("Soy planta"+"\n");
			}
		
			if(i instanceof Zombie){
				System.out.print("Soy zombie"+"\n");
			}
			System.out.print("*************");
		}
	}
}