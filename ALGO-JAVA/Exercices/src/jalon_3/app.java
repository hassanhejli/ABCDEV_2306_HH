package jalon_3;

import java.util.Scanner;

public class app {

	/*
	 VARIABLES
	 	nombre est un entier
	 	i est un entier
	 	
	 DEBUT DU PROGRAMME
	 		Ecrire "entrez un nombre"
	 		Lire nombre
	 		i<-- 0
	 		DEBUT POUR
	 		POUR i <= 10
	 		Faire i++
	 		ecrire i * nombre = nombre
	 		FIN POUR
	 		Ecrire "souhaitez vous une autre table"
	 		DEBUT SI
	 		SI OUI
	 		Ecrire entrez nombre
	 		Lire nombre
	 		i <-- 0
	 		DEBUT tant que
	 		tant que i <= 10
	 		FAIRE i++
	 		FIN TANT QUE
	 		SINON
	 		FIN DU PROGRAMME
	 		
	 		
	 */
	public static void main(String[] args) {
		
		// declaration des variables
		int nombre;
		int i;
		String test = null;
		
		// on ouvre le scanner
		Scanner hasscan = new Scanner(System.in);
	
	
		// on demande a l'utilisateur d'ecrire un nombre entre 1 et 10
		System.out.println("Saisir un nombre entre 1 et 10");
		
		// on affecte la variable nombre
		nombre = hasscan.nextInt();
		
		// on affecte la variable i
		i = 1;
		
		
		for(i = 1; i <= 10; i++)
		{
			System.out.println(i +  " * " + nombre +  " = " + (nombre = nombre * i));
	

		System.out.println("souhaitez vous afficher une autre table ? oui(o) ou non(n)");
		
			if ((test.equals("o")) || (test.equals("O")))
			{
				for(i = 1; i <= 10; i++)
				{
					System.out.println(i +  " * " + nombre +  " = " + (nombre = nombre * i));
					System.out.println("souhaitez vous afficher une autre table ? oui(o) ou non(n)");
				}
			}
			else 
			{
				System.exit(0);
			}

		}
		
		hasscan.close();
	}

}
