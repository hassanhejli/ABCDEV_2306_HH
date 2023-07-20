package boucle_4;

import java.util.Scanner;

public class app {

	/*
	 VARIABLES
	 	nombre est un entier
	 	somme est un entier
	 	i est un entier
	 DEBUT DU PROGRAMME
	 	Ecrire "saisissez un nombre, nous afficherons la somme des entiers jusqu'a ce nombre"
	 	Lire nombre
	 	DEBUT POUR
	 	POUR i = 0 à nombre
	 	FAIRE somme <-- somme + i
	 	FIN POUR
	 FIN DU PROGRAMME
	 */
	public static void main(String[] args) {
		
		int nombre;
		int somme = 0;
		int i;
		
		
		Scanner hasscan = new Scanner(System.in);
		
		System.out.println("saisissez un nombre, nous afficherons la somme des entiers jusqu'a ce nombre : ");
		nombre = hasscan.nextInt();
		
		for (i=0; i<= nombre; i++)
		{
			somme += i;
		}
		
		System.out.println("pour le nombre saisi " + nombre + " la somme des entiers jusqu'a " + nombre + " est : " + somme);
		
		hasscan.close();
		
	}

}
