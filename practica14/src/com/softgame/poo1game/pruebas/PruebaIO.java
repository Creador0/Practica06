package com.softgame.poo1game.pruebas;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.ArrayList;
import com.softgame.poo1game.personajes.buenos.Planta;
import com.softgame.poo1game.personajes.malos.Zombie;
import com.softgame.poo1game.personajes.Personaje;
public class PruebaIO{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre del archivo con extencion: ");
		String cad = sc.nextLine();
		String path = System.getProperty("user.home");
		path += System.getProperty("file.separator") + cad.trim();
		System.out.println(path);

		File input = new File(path);
		if(input.exists()){
			System.out.println("Si existe: ");
			ArrayList<Personaje> personajes = new ArrayList<Personaje>();
			try{
				FileReader fr = new FileReader(input);
				BufferedReader br = new BufferedReader(fr);
				String line = null;
				int count = Integer.parseInt(br.readLine());
				int i=0;

				while(i<count){
					line=br.readLine();
					String[] partes = line.split(",");
					if (partes[0].equals("Z")){
						personajes.add(new Zombie(partes[1]));
					}else{
						personajes.add(new Planta(partes[1]));
					}
					i++;
				}
				System.out.println("Personajes de preg16:"+ personajes);
				System.out.println();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			String path2 = System.getProperty("user.home");
			path2 += System.getProperty("file.separator")+"pvsz.out";
			try {
				FileOutputStream fos = new FileOutputStream (path2);
				ObjectOutputStream oos = new ObjectOutputStream (fos);
				for (Personaje p: personajes) {
					oos.writeObject(p);
					System.out.println(p);
				}
				System.out.println("Personajes guardados");
				oos.close ();
				System.out.println("Tamanio de personajes: "+personajes.size());

			} catch (IOException e) {
				e.printStackTrace ();
			}
			
		}else{
			System.out.println("El archivo no existe. Fin del programa");
		}
	}
}