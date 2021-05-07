package com.softgame.poo1game.utils;
public class TheException extends Exception{
	private int poss;
	public TheException(String msg, int poss){
		super(msg);
		this.poss= poss;
	}

	public int getPoss(){
		return poss;
	}
}