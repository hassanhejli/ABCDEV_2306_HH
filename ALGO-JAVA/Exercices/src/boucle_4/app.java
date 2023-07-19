package boucle_4;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		
		int nombre;
		int somme = 0;
		int i;
		
		
		Scanner hasscan = new Scanner(System.in);
		
		System.out.println("saisissez un nombre, nous afficherons la somme des entiers jusqu'a ce nombre : ");
		nombre = hasscan.nextInt();
		
		for (i=0; i<= nombre; i++)
		{
			somme +=i;
		}
		
		System.out.println("pour le nombre saisi " + nombre + " la somme des entiers est : " + somme);
		
		hasscan.close();
		
	}

}
