package boucle_6;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		
		int nombre;
		int i;
		
		
		Scanner hasscan = new Scanner(System.in);
		
		
		int tabNombre [] = new int [20];
		
		
		// on fait une premiere boucle pour que l'utilisateur repete la saisie 20 fois
		for (i = 0; i <= tabNombre.length -1; i++)
		{
			System.out.println("saisissez un nombre : ");
			tabNombre[i] = hasscan.nextInt();
			
		}
		
		hasscan.close();
		
	}

}
