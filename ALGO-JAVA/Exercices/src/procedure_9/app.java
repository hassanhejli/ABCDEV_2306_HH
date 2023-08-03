package procedure_9;

import java.util.Scanner;

public class app {
	
	// declaration fonction booleene 
	public static boolean estDivisible(int a, int b)
	{
		boolean divise;
		if (a %b == 0)
		{
			divise = true;
			System.out.println("l'entier " + a + " est divisible par l'entier " + b);
		}
		else
		{
			divise = false;
			System.out.println("l'entier " + a + " n'est pas divisible par l'entier " + b);
		}
		
		return divise;
	}

	public static void main(String[] args) {
		
		// declaration variable
		int nombre1, nombre2;
		
		// on ouvre le scanner
		Scanner hasscan = new Scanner(System.in);
		
		// on demande a l'utilisateur d'entrer un 1er nombre et on le lit
		System.out.println("entrez un nombre entier");
		nombre1 = hasscan.nextInt();
		
		// on demande a l'utilisateur d'entrer un 2nd nombre et on le lit
		System.out.println("entrez un nombre entier");
		nombre2 = hasscan.nextInt();
		
		// on fait appel a la fonction estDivisible
		estDivisible(nombre1, nombre2);
		
		// on ferme le scanner
		hasscan.close();
		
		

	}

}
