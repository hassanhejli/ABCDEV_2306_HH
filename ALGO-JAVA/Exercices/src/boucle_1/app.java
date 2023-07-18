package boucle_1;

import java.util.Scanner;

public class app {
	/*
	 * VARIABLE 
	 * nombre est un entier
	 * 
	 * DEBUT DU PROGRAMME
	 * nombre <-- o
	 * ecrire "entrez un nombre compris entre 1 et 3"
	 * lire nombre 
	 * DEBUT TANT QUE
	 * TANT QUE 
	 * nombre < 1 ou > 3
	 * ecrire "entrez un nombre compris entre 1 et 3"
	 * FIN TANT QUE
	 * FIN DU PROGRAMME
	 */
	public static void main(String[] args) {
		int nombre = 0;
		
		Scanner hassan = new Scanner(System.in);		
		
		while (nombre < 1 || nombre > 3)
		{
			System.out.println("entrez un nombre compris entre 1 et 3");
			nombre = hassan.nextInt();
		}
		
		hassan.close();

	}

}
