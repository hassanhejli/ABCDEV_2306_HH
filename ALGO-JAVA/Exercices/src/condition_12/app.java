package condition_12;

import java.util.Scanner;

public class app { 
	
	/*
	 * VARIABLES
	 * 
	 * jour est un entier
	 * mois est un entier
	 * annee est un entier
	 * conditionBisextile est un booleen
	 * 
	 * DEBUT DU PROGRAMME
	 * ecrire "entrez la date du jour (de 1 a 31):"
	 * lire <-- jour
	 * ecrire "entrez la date du mois (de 1 a 12):"
	 * lire <-- mois
	 * ecrire "entrez la date de l'annee :"
	 * lire <-- annee
	 * 
	 * conditionBisextile = annee % 4 == 0 et annee % 100 != 0 ou annee % 400 == 0
	 * 
	 * DEBUT SI
	 * SI
	 * conditionBisextile est vrai que mois = 2 et que jour > 29
	 * ALORS
	 * ecrire "cette date est invalide"
	 * SINON SI 
	 * conditionBisextile est FAUX que mois = 2 et que jour > 28
	 * ecrire "cette date est invalide"
	 * SINON
	 * 		DEBUT SI
	 * 		SI
	 * 		mois = 1 ou 3 ou 5 ou 7 ou 8 ou 10 ou 12 et que jour > 31
	 * 		ALORS
	 * 		ecrire "cette date est invalide"
	 * 		SINON SI
	 * 		mois = 4 ou 6 ou 9 ou 11 et qur jour > 30
	 * 		ALORS
	 * 		ecrire "cette date est invalide"
	 * 		SINON SI
	 * 		mois > 12
	 * 		ALORS
	 * 		ecrire "cette date est invalide"
	 * 		SINON
	 * 		ecrire "cette date est valide"
	 * 		FIN SI
	 * FIN SI
	 * FIN DU PROGRAMME
	 */

	public static void main(String[] args) {
		
		int jour;
		int mois;
		int annee;
		boolean conditionBisextile;
		
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("entrez la date du jour (de 1 a 31) : "); // on demande la date du du jour
		jour = sc.nextInt();
		System.out.println("entrez la date du mois (de 1 a 12) : "); // on demande la date du du mois
		mois = sc.nextInt();
		System.out.println("entrez la date de l'annee :"); // on demande l'annee
		annee = sc.nextInt();
		
		// on determine la condition pour une annee bisextile
		conditionBisextile = ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0));
		
		
	
		// on determine si la date est valide dans le cas d'une annee bisextile pour fevrier
		if (conditionBisextile && mois==2 && jour > 29)
		{
			System.out.println("cette date est invalide");
		}
		// on determine si la date est valide dans le cas d'une annee non bisextile pour fevrier
		else if (!conditionBisextile && mois==2 && jour > 28)
		{
			System.out.println("cette date est invalide");
		}
		else 
		{
			//ici on verifie le nombre de jour des mois comportant 31 jours dans l'annee
			if ((mois ==1 || mois==3 || mois==5 || mois==7 ||mois==8 || mois==10 || mois==12) && (jour > 31))
			{
				System.out.println("cette date est invalide");
			}
			//ici on verifie le nombre de jour des mois comportant 30 jours dans l'annee
			else if ((mois==4 || mois==6 || mois==9 || mois==11) && (jour > 30))
			{
				System.out.println("cette date est invalide");
			}
			//ici on verifie que le nombre de mois ne depasse pas 12
			else if (mois > 12) 
			{
				System.out.println("cette date est invalide");
			} // tout les autres cas sont automatiquement valide
			else 
			{
				System.out.println("cette date est valide");
			}
		}
		
		
		sc.close();
		
	}

}
