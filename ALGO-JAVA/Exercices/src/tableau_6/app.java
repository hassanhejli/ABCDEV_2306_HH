package tableau_6;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		
		
		
		// on declare les variables
		int tab1[] = {4,8,7,12};
		int tab2[] = {3,6};
		int tab3[] = new int [4];
		int i;
		int j;
		int somme = 0;
		
		// on ouvre le scanner
				Scanner hasscan = new Scanner(System.in);
				
		// on boucle pour multiplier les tableaux 1 et 2 et on affiche le resultat en console
		for (i = 0; i < tab1.length; i++)
		{
			
			// on boucle pour additionner les valeurs obtenue et on affiche le resultat en console
			for (j = 0; j < tab2.length; j++)
			{
				somme += tab1[i] * tab2[j];
				System.out.println((tab1[i] + " * " + tab2[j]) + " = " + (tab1[i]  *  tab2[j]));// pour verifier les calculs
				System.out.println(somme);
			}
		}
		System.out.println(somme);

		// on ferme le scanner
		hasscan.close();
		
		
	}

}
