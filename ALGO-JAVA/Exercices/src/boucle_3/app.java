package boucle_3;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		
		int nombre;
		int i = 1;
		
		Scanner hasscan = new Scanner(System.in);
		
		System.out.println("entrez un nombre: ");
		nombre = hasscan.nextInt();
		
		while(i <= 10)
		{
			nombre += 1;
			System.out.println(nombre);
			i++;
		}
		
		hasscan.close();
			
			
	}
}
