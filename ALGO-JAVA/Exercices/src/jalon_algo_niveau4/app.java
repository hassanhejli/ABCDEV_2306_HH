package jalon_algo_niveau4;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		
		// on initialize les variables
		int position = 2;
		int nb;
		String resultat = "\t0\n\t1";
		long nbPrecedent = 0;
		long nbCourant = 1;
		long nbSuivant;
		
		// on ouvre le scanner
		Scanner hasscan = new Scanner(System.in);
		
		
		do // tant que l'utilisateur ne tape pas 0, faire
		{
			
		// on affiche les message a l'utilisateur
		System.out.println("Combien de nombres de la suite de Fibonacci souhaitez vous afficher : ");
		System.out.println("tapez la touche 0 pour quitter le programme");
		nb = hasscan.nextInt();
		
			if (nb == 0) // si nombre egal zero sortir du programme 
			{
				System.exit(0);
			}
			else if (nb > 2) // sinon si nombre est superieur a 2
			{
				while(position < nb) // tant que position est inferieur a nombre faire
				{
					nbSuivant = nbPrecedent + nbCourant;
					resultat = resultat + "\n\t" + nbSuivant;
					nbPrecedent = nbCourant;
					nbCourant = nbSuivant;
					position +=1;	
				}
			}
			else // sinon nombre = 2  
			{
			nb = 2;
			}
		
			// on affiche les resultats a l'utilisateur
			System.out.println("les " + nb + " premiers nombres de la suite de Fibonacci sont \n" + resultat);
			System.out.println(nb + " nombres affiches");
		}
		while (nb!=0); 
	
		
	// on ferme le scanner
	hasscan.close();
}
}


