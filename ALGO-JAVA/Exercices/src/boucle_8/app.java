package boucle_8;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		
		int prix;
		int somme = 0;
		int paye;
		int rendu;
		int i = 0;
		
		
		Scanner hasscan = new Scanner(System.in);
		
		do
		{
			System.out.println("saisissez le prix de vos article, tapez zero une fois terminé");
			prix = hasscan.nextInt();
			somme += prix;
			i++;	
		}
		while(prix != 0);
		
		System.out.println(somme);
		System.out.println("veuillez entrez la somme avec laquelle vous payez");
		paye = hasscan.nextInt();
		
		rendu = paye-somme;
		while(rendu > 0)
		{
			if (rendu >= 10)
			{
				rendu -= 10;
				System.out.println("votre monnaie de 10");
			}
			else if (rendu >= 5)
			{
				rendu -= 5;
			}
			else 
			{
				rendu -= 1;
			}
		}
	}

	

}
