package boucle_3_for;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		
		int nombre;
		int i = 1;
		
		Scanner hasscan = new Scanner(System.in);
		
		System.out.println("entrez un nombre: ");
		nombre = hasscan.nextInt();
		
		for (i =1; i<=10; i++)
		{
			nombre += 1;
			System.out.println(nombre);
		}
		
		hasscan.close();


	}

}
