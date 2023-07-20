package exo_age;

import java.util.Scanner;

public class App {
	/*
	 VARIABLES
	 age est un entier
	 DEBUT DU PROGRAMME
	 ECRIRE " entrer votre age"
	 LIRE <-- age
	 	DEBUT SI
	 	SI age < 0
	 	ECRIRE "vous n'etes pas ne"
	 	SINON SI age < 18
	 	ECRIRE "vous etes mineur"
	 	SINON
	 	ECRIRE "vous etes majeur"
	 	FIN SI
	 FIN DU PROGRAMME
	 */

	public static void main(String[] args) {
		
		// declaration des variables
		int age;
		
		// on ouvre le scanner
		Scanner sc = new Scanner(System.in);
		
		// on demande a l'utilisateur d'entrer son age
		System.out.println("quel est votre âge?");
		
		// on affecte la valeur a la variable age
		age = sc.nextInt();
		
			// on ouvre une condition pour les sorties de sortie en fonction de la variable age
			if (age <= 0) 
			{
				System.out.println ("vous n'etes pas ne");
			}
			else if (age < 18) 
			{
				System.out.println("Vous êtes mineur");
			}
			else if (age > 130) 
			{
				System.out.println("vous etes mort");
			}
			else {
				System.out.println("vous etes majeur");
			}
	
	
	sc.close();


	}

}
