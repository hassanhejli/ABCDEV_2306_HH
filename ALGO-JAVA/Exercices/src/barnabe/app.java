package barnabe;

import java.util.Scanner;

public class app {
	/*
	 VARIABLES
	 argentBarnabe est un reel
	 nombreMagasin est un entier
	 verifi est un booleen
	 
	 DEBUT DU PROGRAMME
	 Ecrire "saisir argent barnabe"
	 Lire argentBarnabe
	 	DEBUT TANT QUE
	 	TANT QUE
	 	argentBarnabe > 0
	 	Alors verifi est vrai
	 		DEBUT SI
	 		SI argentbarnabe /2 +1 > 1
	 		Alors argentBarnabe = argentBarnabe - (argentBarnabe/2) + 1
	 		nombre magasin = nombre magasin + 1
	 		SINON
	 		argentBarnabe = argentBarnabe - argentBarnabe
	 		nombreMagasin = nombreMagasin +1
	 		FIN SI
	 	FIN TANT QUE
	 	verifi = faux
	 	Ecrire "barnabe est alle dans " + nombreMagasin
	 FIN DU PROGRAMME
	 */

	public static void main(String[] args) {
		double argentBarnabe;
		int nombreMagasins = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("saisir argent barnabe");
		argentBarnabe = sc.nextDouble();
		while (argentBarnabe >= 1)
		{
			// on verifie que l'argent de barnabe est superieur a un
			if (argentBarnabe - ((argentBarnabe /2) + 1) > 0) {
				argentBarnabe -= (argentBarnabe/2) + 1;
				nombreMagasins ++;
			} else {
				argentBarnabe = argentBarnabe - argentBarnabe;
				nombreMagasins ++;	
			}
			
			System.out.println("barnabe est alle dans " + nombreMagasins);
			System.out.println("barnabe a maintenand " + argentBarnabe);
		}
		
		// on passe dans le cas ou l'argent de barnabe n'est pas superieur a 1
			System.out.println("barnabe est alle dans  " + nombreMagasins + " magasins");
		
		
		
		sc.close();
	}

}
