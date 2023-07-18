package condition_12;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		
		int jour;
		int mois;
		int annee;
		boolean conditionBisextile;
		
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("entrez la date du jour (de 1 a 31) : "); // on demande le numero du jour
		jour = sc.nextInt();
		System.out.println("entrez la date du mois (de 1 a 12) : "); // on demande le numero du mois
		mois = sc.nextInt();
		System.out.println("entrez la date de l'annee :"); // on demande le numero d'annee
		annee = sc.nextInt();
		
		// on determine la condition pour une annee bisextile
		conditionBisextile = ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0));
		
		
	
		// on determine si la date est valide dans le cas d'une annee bisextile pour fevrier
		if (conditionBisextile && mois==2 && jour > 29)
		{
			System.out.println("cette date est invalide");
		}
		else if (!conditionBisextile && mois==2 && jour > 28)
		{
			System.out.println("cette date est invalide");
		}
		else 
		{
			//ici on verifie le nombre de jour des autres mois de l'annee
			if ((mois ==1 || mois==3 || mois==5 || mois==7 ||mois==8 || mois==10 || mois==12) && (jour > 31))
			{
				System.out.println("cette date est invalide");
			}
			else if ((mois==4 || mois==6 || mois==9 || mois==11) && (jour > 30))
			{
				System.out.println("cette date est invalide");
			}
			else if (mois > 12)
			{
				System.out.println("cette date est invalide");
			}
			else 
			{
				System.out.println("cette date est valide");
			}
		}
		
		
		
		sc.close();
		
	}

}
