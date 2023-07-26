package tableau_2;

import java.util.Scanner;

public class app {
	
	

	public static void main(String[] args) {
		
		/*
		 char[] tab = new char[6];
		
		 tab[0] = 'a';
		 tab[1] = 'e';
		 tab[2] = 'i';
		 tab[3] = 'o';
		 tab[4] = 'u';
		 tab[5] = 'y';
		 
		 System.out.println(tab[5]);//juste pour verifier dans la console
		 
		 */
		
		String[] tab = new String[7];
		int jour;
				
			tab[0] = "lundi";
			tab[1] = "mardi";
			tab[2] = "mercredi";
			tab[3] = "jeudi";
			tab[4] = "vendredi";
			tab[5] = "samedi";
			tab[6] = "dimanche";
		
			Scanner hasscan = new Scanner(System.in);
			
			System.out.println("entrez le jour de la semaine de 1 à 7");
			jour = hasscan.nextInt();
			
		if (jour == 1)
		{
			System.out.println(" nous sommes " + tab[0]);
		}
		else if (jour == 2)
		{
			System.out.println(" nous sommes " + tab[1]);
		}
		else if (jour == 3)
		{
			System.out.println(" nous sommes " + tab[2]);
		}
		else if (jour == 4)
		{
			System.out.println(" nous sommes " + tab[3]);
		}
		else if (jour == 5)
		{
			System.out.println(" nous sommes " + tab[4]);
		}
		else if (jour == 6)
		{
			System.out.println(" nous sommes " + tab[5]);
		}
		else if (jour == 7)
		{
			System.out.println(" nous sommes " + tab[6]);
		}
		else
		{
			System.out.println("erreur de saisie");
		}
		
		hasscan.close();
			
			
			
			
		 }

}
