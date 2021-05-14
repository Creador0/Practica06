package com.softgame.poo1game.hilos;
import javax.swing.JLabel;
public class Hilo extends Thread{
	private JLabel etiqueta;
	private String nombre;
	
	public Hilo(String nombre, JLabel etiqueta){
		this.nombre = nombre;
		this.etiqueta = etiqueta;
	}
	
	public void run(){
		String str = "";
		for(int i = 0; i <= 30; i++){
			str = etiqueta.getText();
			char c = str.charAt(str.length() - 1);
			str += c;
			etiqueta.setText(str);
			int n = (int) (Math.random()*1001);
			try{
				Thread.sleep(n);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
		}
		str += " HECHO";
		etiqueta.setText(str);
	}
}