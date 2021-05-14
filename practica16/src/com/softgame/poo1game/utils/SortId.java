package com.softgame.poo1game.utils;
import java.util.Comparator;
import com.softgame.poo1game.personajes.Personaje;
public class SortId implements Comparator<Personaje>{
	public int compare(Personaje p1, Personaje p2){
		if (p1.getId()==p2.getId()) {
			return 0;
		} 
		return (p1.getId() > p2.getId()) ? 1 : -1;
	}
}