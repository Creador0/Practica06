package com.softgame.poo1game.pruebas;
import com.softgame.poo1game.personajes.Personaje;
public class PruebaPersonaje{
	public static void main(String[] args) {
		Personaje per01 = new Personaje("Oscar");
		Personaje per02 = new Personaje("Erick");
		per02.setEdad(10);		
		Personaje per03 = new Personaje("Wendy");
		per03.setEdad(1);		
		Personaje per04 = new Personaje("Lesly");
		outfor:
		for (int i=0; i<3; i++) {
			System.out.println();
			int ed = (int)(Math.random()*250);
			if(per01.setEdad(ed)){
				System.out.println(per01.getDetalle()+" se modifico la edad");
			}else{
				System.out.println(per01.getDetalle()+" sin modificacion en edad "+ ed);
			}
			ed = (int)(Math.random()*250);
			if(per02.setEdad(ed)){
				System.out.println(per02.getDetalle()+" se modifico la edad");
			}else{
				System.out.println(per02.getDetalle()+" sin modificacion en edad "+ ed);
			}
			ed = (int)(Math.random()*250);
			if(per03.setEdad(ed)){
				System.out.println(per03.getDetalle()+" se modifico la edad");
			}else{
				System.out.println(per03.getDetalle()+" sin modificacion en edad "+ ed);
			}
			do{
				ed = (int)(Math.random()*250);
				System.out.println(ed);
				if (ed==150) {
					System.out.println("***Bingo 150***");
					break outfor;
				}
			}while(!per04.setEdad(ed));
			System.out.println(per04.getDetalle());
		}			
	}
}