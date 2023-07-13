package kilometre_miles;

import java.util.Scanner;

public class app {
	/*
	 * variables 
	 * kilo est un reel
	 * miles est un reel
	 * kiloerror est une chaine de caracteres
	 * verif est un booleen
	 * 
	 * debut du programme
	 * debut tant que
	 * tant que
	 * verif est faux
	 * ecrire "entrez le nombre de kilometre"
	 * lire <-- kilo
	 * 	debut si
	 * 	si kilo est un reel
	 * 	alors
	 * 		debut si
	 * 		si kilo est < a 0.01 ou > a 1 milion
	 * 		alors
	 * 		ecrire "entree invalide"
	 * 		sinon verif est vrai
	 * 		fin si
	 * 	sinon 
	 * 	lire kiloerror
	 * 		debut si
	 * 		si kiloerror est egal a (q) ou a (Q)
	 * 		alors
	 * 		quitter le programme
	 * 		sinon
	 * 		ecrire entree invalide
	 * 		fin si
	 * 	fin si
	 * fin tant que
	 * miles <-- kilo / 1.609
	 * ecrire kilo + " kilometres devient " + miles + "miles"
	 * fin du programme
	 * 
	 * 
	 * 
	 * 		
	 * 
	 */

	public static void main(String[] args) {
	
			double Kilo = 0;
			double Miles = 0;
			String kiloError;
			boolean Verif = false;
			
		Scanner scanner = new Scanner(System.in);
			while (Verif == false) 
			{	
			System.out.println("Entrez le nombre de kilometres");
			if (scanner.hasNextDouble()) //methode qui detecte le type de la saisie et renvoie true ou false selon le type renseigné
				{
				Kilo = scanner.nextDouble(); //ici un double renseigne
					if (Kilo < 0.01 || Kilo > 1000000)
					{
						System.out.println("entree invalide!");
					}else 
						{
							Verif = true;
							
						}
			}else // les autres types passent dans le else comme ici une chaine de caracteres
			{
				kiloError = scanner.next();
					if ((kiloError.equals("q")) || (kiloError.equals("Q"))) 
					{
					System.exit(0);//permet de quitter le programme
					}else 
					{
						System.out.println("entree invalide!");
					}
			}
		}

			Miles = Math.round((Kilo / 1.609) *100.0)/100.0;
			System.out.println(Kilo + "km donne: " + Miles + "  miles");
			scanner.close();
	}
}
	

			


