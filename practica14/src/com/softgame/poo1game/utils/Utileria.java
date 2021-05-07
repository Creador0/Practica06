package com.softgame.poo1game.utils;
public class Utileria{
	private static int contadorID;
	private Utileria(){}
	public static int getID(){
		return ++contadorID;
	}
}