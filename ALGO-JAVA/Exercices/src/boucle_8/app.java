package boucle_8;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		
		int prix;
		int somme = 0;
		int paye;
		int rendu;
		int i = 0;
		int j;
		
		
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
				System.out.println("pour votre monnaie voici un billet de 10 s'il vous plait ");
			}
			else if (rendu >= 5)
			{
				rendu -= 5;
				System.out.println("pour votre monnaie voici un billet de 5 s'il vous plait ");
			}
			else 
			{
				rendu -= 1;
				System.out.println("pour votre monnaie voici une piece de 1 s'il vous plait");
			}
		}
	}

	

}
