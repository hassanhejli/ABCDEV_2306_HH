package condition_10;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		/*
		variables
		candidat1 est un entier
		candidat2 est un entier
		candidat3 est un entier
		candidat4 est un entier
		pos1 est un entier
		pos2 est un entier
		pos3 est un entier
		pos4 est un entier
		verif est un booleen
		
		debut du programme
		ecrire "entrez le score du candidat1"
		lire candidat1
		ecrire "entrez le score du candidat2"
		lire candidat2
		ecrire "entrez le score du candidat3"
		lire candidat3
		ecrire "entrez le score du candidat4"
		lire candidat4
		
		debut si //Test si candidat1 est en premiere position
		si candidat1 > candidat2 et candidat1 > candidat3 et candidat1 > candidat4
		alors pos1 <-- candidat1
		
			debut si //Test si candidat2 est en deuxième position
			si candidat2 > candidat3 et candidat2 > candidat4
			alors pos2 = candidat2
			sinon si //Test si candidat3 est en deuxième position
			candidat3 > candidat2 et candidat3 > candidat4
			alors pos2 = candidat3 
			sinon //Test si candidat4 est en deuxième position
			pos2 = candidat4
			
				debut si //Test si candidat2 est en troisieme position
				si candidat2 > candidat3 et candidat2 > candidat4
				alors pos3 = candidat2
				sinon si //Test si candidat3 est en troisieme position
				candidat3 > candidat2 et candidat3 > candidat4
				alors pos3 = candidat3 
				sinon//Test si candidat4 est en troisieme position
				pos3 = candidat4
				
				 	debut si //Test si candidat2 est en quatrieme position
				 	si candidat2 > candidat3 et candidat2 > candidat4
					alors pos4 = candidat2
					sinon si //Test si candidat3 est en quatrieme position
					candidat3 > candidat2 et candidat3 > candidat4
					alors pos4 = candidat3 
					sinon//Test si candidat4 est en quatrieme position
					pos4 = candidat4
					
					fin si
					
				fin si
				
			fin si
				
		sinon si //Test si candidat2 est en premiere position
		si candidat2 > candidat1 et candidat2 > candidat3 et candidat2 > candidat4
		alors pos1 <-- candidat2
		
			debut si //Test si candidat1 est en deuxième position
			si candidat1 > candidat3 et candidat1 > candidat4
			alors pos2 = candidat2
			sinon si //Test si candidat3 est en deuxième position
			candidat3 > candidat2 et candidat3 > candidat4
			alors pos2 = candidat3 
			sinon //Test si candidat4 est en deuxième position
			pos2 = candidat4
			
				debut si //Test si candidat1 est en troisieme position
				si candidat1 > candidat3 et candidat1 > candidat4
				alors pos3 = candidat1
				sinon si //Test si candidat3 est en troisieme position
				candidat3 < candidat2 et candidat3 < candidat4
				alors pos3 = candidat3 
				sinon//Test si candidat4 est en troisieme position
				pos3 = candidat4
				
				 	debut si //Test si candidat2 est en quatrieme position
				 	si candidat2 < candidat3 et candidat2 < candidat4
					alors pos4 = candidat2
					sinon si //Test si candidat3 est en quatrieme position
					candidat3 < candidat2 et candidat3 < candidat4
					alors pos4 = candidat3 
					sinon//Test si candidat4 est en quatrieme position
					pos4 = candidat4
					fin si	
		 */
		
		int candidat1;
		int candidat2;
		int candidat3;
		int candidat4;
		int score;
		boolean estPremier;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entrez le score du candidat 1 : ");
		candidat1 = sc.nextInt();
		System.out.println("entrez le score du candidat 2 : ");
		candidat2 = sc.nextInt();
		System.out.println("entrez le score du candidat 3 : ");
		candidat3 = sc.nextInt();
		System.out.println("entrez le score du candidat 4 : ");
		candidat4 = sc.nextInt();
		score = candidat1 + candidat2 + candidat3 + candidat4;
		
		

				// ici on determine le premier des candidats
			if ((candidat1 > candidat2) && (candidat1 > candidat3) && (candidat1 > candidat4))
			{
				estPremier = true;
			}
			else 
			{
				estPremier = false;
			}
			
			if (candidat1 > (score/2))
			{
				System.out.println("le candidat 1 est elu des le 1er tour");
			}
			else if (estPremier && candidat1 >= (score / 8))
			{
				System.out.println("le candidat 1 est en ballotage favorable");
			}
			else if (!estPremier && candidat1 >= (score / 8))
			{
				System.out.println("le candidat 1 est en ballotage defavorable");
			}
			else {
				System.out.println("le candidat 1 est battu");
			}
			
			sc.close();
	}

}
