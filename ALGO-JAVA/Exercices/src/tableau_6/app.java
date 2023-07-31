package tableau_6;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		
		// on ouvre le scanner
		Scanner hasscan = new Scanner(System.in);
		
		// on declare les variables
		int tab1[] = {4,8,7,12};
		int tab2[] = {3,6};
		int tab3[] = new int [4];
		int i;
		
		// on boucle pour multiplier les tableaux 1 et 2 et on affiche le resultat en console
		for (i=0; i<tab1.length; i++)
		{
			tab3[i] = tab1[i] * tab2[i];
			System.out.println(tab3[i]);
		}
		
		// on boucle pour additionner les valeurs obtenue et on affiche le resultat en console
		for (i=0; i<tab1.length; i++)
		{
			tab3[i] = tab3[0] + tab3[1] + tab3[2] + tab3[3];
			System.out.println(tab3[i]);
		}
		
		// on ferme le scanner
		hasscan.close();
		
		
	}

}
