package boucle_5;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		
		int nombre;
		int somme = 1;
		int i;
		
		
		Scanner hasscan = new Scanner(System.in);
		
		System.out.println("saisissez un nombre, nous afficherons le produit des entiers jusqu'a ce nombre : ");
		nombre = hasscan.nextInt();
		
		for (i=1; i<= nombre; i++)
		{
			somme = somme * i;
		}
		
		System.out.println("pour le nombre saisi " + nombre + " le produit des entiers est : " + somme);
		
		hasscan.close();

	}

}
