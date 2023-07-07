package jalon_algo_niveau2;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		boolean Verif;
		String etudiant;
		int jour;
		int pos1;
		int pos2;
		int pos3;
		int pos4;
		int pos5;
		int pos6;
		int pos7;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("etes vous étudiant, tapez (O) pour oui, ou tapez (N) pour non");
		etudiant = sc.next();
		if ((etudiant.equals("n")) || (etudiant.equals("N"))) {
			Verif = false;
			System.out.println("vous n'avez droit à aucune reduction");	
		}else if ((etudiant.equals("o")) || (etudiant.equals("O"))) {
			Verif = true;
			System.out.println("tapez le jour souhaité de (1) a (7)");
			jour = sc.nextInt();
			if ( jour == 3);{	
				pos3 = sc.nextInt();

				System.out.println("vous avez droit a une reduction de 20%");
			}
			}else if (jour == 4);{
				pos4 == sc.nextInt();
				System.out.println("vous avez droit a une reduction de 50%");
				else if (jour = 1 || jour = 2 || jour = 5 || jour = 6 || jour = 7);{
					System.out.println("vous n'avez droit a aucune reduction");
				}
			}else {
				System.out.println("entree invalide");
			}
	}

}
