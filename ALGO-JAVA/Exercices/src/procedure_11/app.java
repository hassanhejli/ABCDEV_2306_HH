package procedure_11;

import java.util.Scanner;

public class app {
	
	// on declare la fonction
	public static int addition(int a, int b, int c, int d, int e)
	{
		int somme;
		somme = a + b + c + d + e;
		System.out.println("la somme des 5 chiffres est de: " + somme);
		return somme;
	}

	public static void main(String[] args) {
		
		// declaration variables
		int chiffre1, chiffre2, chiffre3, chiffre4, chiffre5, sommeChiffre;
		
		// ouverture scanner
		Scanner hasscan = new Scanner(System.in);
		
		// on demande d'entrer les cinq chiffres et on les lit
		System.out.println("entrez le 1er chiffre");
		chiffre1 = hasscan.nextInt();
		System.out.println("entrez le 2eme chiffre");
		chiffre2 = hasscan.nextInt();
		System.out.println("entrez le 3eme chiffre");
		chiffre3 = hasscan.nextInt();
		System.out.println("entrez le 4eme chiffre");
		chiffre4 = hasscan.nextInt();
		System.out.println("entrez le 5eme chiffre");
		chiffre5 = hasscan.nextInt();
		
		//on fait appel a la procedure addition
		addition(chiffre1, chiffre2, chiffre3, chiffre4, chiffre5);
		
		// fermeture scanner
		hasscan.close();

	}

}
