package procedure_5;
import java.util.Scanner;

public class app {
	
	// declaration procedure
	public static void dateValide (int j, int m, int a)
	{
		boolean bissextile;
	
		// on determine la condition pour une annee bisextile
		bissextile = ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0));
				
		// on determine si la date est valide dans le cas d'une annee bisextile pour fevrier
		if (bissextile && m==2 && j > 29)
		{
			System.out.println("cette date est invalide");
		}
		// on determine si la date est valide dans le cas d'une annee non bisextile pour fevrier
		else if (!bissextile && m==2 && j > 28)
		{
			System.out.println("cette date est invalide");
		}
		else 
		{
			//ici on verifie le nombre de jour des mois comportant 31 jours dans l'annee
			if ((m ==1 || m==3 || m==5 || m==7 ||m==8 || m==10 || m==12) && (j > 31))
			{
				System.out.println("cette date est invalide");
			}
			//ici on verifie le nombre de jour des mois comportant 30 jours dans l'annee
			else if ((m==4 || m==6 || m==9 || m==11) && (j> 30))
			{
				System.out.println("cette date est invalide");
			}
			//ici on verifie que le nombre de mois ne depasse pas 12
			else if (m > 12) 
			{
				System.out.println("cette date est invalide");
			} 
			// tout les autres cas sont automatiquement valide
			else 
			{
				System.out.println("cette date est valide");
			}
		}
	}
	
	public static void main(String[] args) {
		
		// on declare les variables
		int jour, mois, annee;
		
		// on ouvre le scanner
		Scanner hasscan = new Scanner(System.in);
		
		// on demande a l'utilisateur d'entrez le jour, le mois et l'annee voulu et on lit chacun d'eux
		System.out.println("veuillez entrez le jour de 1 à 31");
		jour = hasscan.nextInt();
		System.out.println("veuillez entrez le mois de 1 à 12");
		mois = hasscan.nextInt();
		System.out.println("veuillez entrez l'annee voulue");
		annee = hasscan.nextInt();
		
		// on fait appel a la procedure dateValide pour determiner si la date est valide ou non
		dateValide(jour, mois, annee);
		
		hasscan.close();

	}

}
