package jalon_algo_niveau4;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		
		int position = 2;
		int nb;
		String resultat = "t0\t1";
		long nbPrecedent = 0;
		long nbCourant = 1;
		long nbSuivant;
		
		Scanner hasscan = new Scanner(System.in);
		
		System.out.println("Combien de nombres de la suite de Fibonacci souhaitez vous affiché: ");
		System.out.println("tapez la touche 0 pour quitter le programme");
		nb = hasscan.nextInt();
		
		
		if(nb!=0) // si nombre est inegal a zero
		{
			
			if (nb > 2) // si nombre est superieur a 2
			{
				while(position < nb) // tant que position est inferieur a nombre
				{
					nbSuivant = nbPrecedent + nbCourant;
					resultat = resultat + "n\t" + nbSuivant;
					nbPrecedent = nbCourant;
					nbCourant = nbSuivant;
					position +=1;	
				}
			}
			else // sinon nombre = 2  
			{
			nb = 2;
			}
		
			System.out.println("les " + nb + " premiers nombres de la suite de Fibonacci sont \n" + resultat);
			System.out.println(nb + " nombres affichés");
		}
	
	else //sinon si nombre = 0 alors sortie du programme
	{
		System.exit(0);
	}
	hasscan.close();
}
}


