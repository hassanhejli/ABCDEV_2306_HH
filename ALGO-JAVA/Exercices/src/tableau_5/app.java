package tableau_5;

import java.util.Scanner;

public class app 
{

	public static void main(String[] args) 
	{
		
		// on ouvre le scanner 
		Scanner hasscan = new Scanner(System.in);
		
		// on declare les variables tab1, tab2 et i pour la boucle for
		int tab1 [] = { 4,8,7,9,1,5,4,6};
		int tab2 [] = { 7,6,5,2,1,3,7,4};
		int i;
		
		// on declare la variable tab3
		int tab3[] = new int [8];
		
		// on boucle pour faire la somme des deux tableaux 
		for (i = 0; i < tab1.length; i++)
		{
			tab3[i] = tab1[i] + tab2[i];
			System.out.println(tab3[i]);
		}
		 // on ferme le scanner
		hasscan.close();

	}
}

