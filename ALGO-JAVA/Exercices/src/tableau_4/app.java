package tableau_4;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		
		// declaration des variables valeur, i et somme
		int valeur, i, somme = 0; 
		
		// declaration d'un tableau de 10 valeurs
		int tabNb [] = new int [10]; 
		
		// on ouvre le scanner
		Scanner hasscan = new Scanner(System.in);

		// on demande a l'utilisateur de saisir les valeurs du tableau
		System.out.println("veuillez saisir vos valeurs");
		valeur = hasscan.nextInt();
		
		// pour i avec une entree a zero et une sortie inferieur a 10 on incremente i
		for (i = 0; i < 10; i++)
			{
			 tabNb[i] = hasscan.nextInt(); // chaque nouvelle valeur entre dans le tableau
			}	
		
		// on fait la somme de chaque valeur que l'on a entré dans le tableau
		 for( int i1 : tabNb) 
		 	{
	          somme = somme + i1;
		 	}
		 
		// on affiche a la console la somme obtenue
		System.out.println("la somme des valeurs saisi est de :" + somme);
		
		// on ferme le scanner
		hasscan.close();

	}

}
