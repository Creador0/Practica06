package com.softgame.poo1game.utils;
public class Utileria{
	private static int contadorID = 1;
	private Utileria(){
		
	}
	public static int getID(){
		return contadorID = contadorID + 1;
	}
	
}