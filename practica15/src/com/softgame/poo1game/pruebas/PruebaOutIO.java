package com.softgame.poo1game.pruebas;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import com.softgame.poo1game.personajes.Personaje;
public class PruebaOutIO{
	public static void main(String[] args) {
		String path2 = System.getProperty("user.home");
		path2 += System.getProperty("file.separator")+"pvsz.out";
		try {
 			FileInputStream fis = new FileInputStream (path2);
 			ObjectInputStream ois = new ObjectInputStream (fis);

 			Object obj = null;
 			while((obj= ois.readObject())!=null){
 				Personaje personajes=(Personaje) obj;
 				System.out.println(personajes);
 			}
 			ois.close ();
 		} catch(FileNotFoundException fnfe){
 			System.err.println(fnfe);
 		} catch(IOException ioe){
 			System.err.println(ioe);
 		} catch (ClassNotFoundException cnfe){
 			System.err.println(cnfe);
 		}
		
		}
	}