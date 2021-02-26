package com.softgame.poo1game.pruebas;
import com.softgame.poo1game.personajes.Personaje;
public class PruebaPersonaje{
	public static void main(String args[]){
		Personaje per01 = new Personaje("Omar");
		per01.setEdad(200);
		Personaje per02 = new Personaje("Erick");
		per02.setEdad(10);
		Personaje per03 = new Personaje("Wendy");
		per03.setEdad(1);
		Personaje per04 = new Personaje("Lesly");
		per04.setEdad(-10);
		for(int i = 0;i < 3;i++){
			int ed = (int)(Math.random()*251);
			if(per01.setEdad(ed)){
				System.out.println(per01.getDetalle()+" Se modificó la edad");
			}else{
				System.out.println(per01.getDetalle() + " sin modificación en edad a " + ed);
			}
			int ed = (int)(Math.random()*251);
			if(per02.setEdad(ed)){
				System.out.println(per02.getDetalle()+" Se modificó la edad");
			}else{
				System.out.println(per02.getDetalle() + " sin modificación en edad a " + ed);
			}
			int ed = (int)(Math.random()*251);
			if(per01.setEdad(ed)){
				System.out.println(per03.getDetalle()+" Se modificó la edad");
			}else{
				System.out.println(per03.getDetalle() + " sin modificación en edad a " + ed);
			}
			do{
				ed = (int)(Math.random()*251);
				System.out.println(ed);
				if(ed==150){
					System.out.println("*** Bingo ***");
					continue outfor;
				}
			}while(!per04.setEdad(ed));
			System.out.println(per04.getDetalle());
		}
	}
}
