package jalon_algo_niveau2;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		boolean Verifi;
		String etudiant;
		int jour;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("etes vous étudiant, tapez (O) pour oui, ou tapez (N) pour non");
		etudiant = sc.next();
		if ((etudiant.equals("n")) || (etudiant.equals("N"))) {
			Verifi = false;
			System.out.println("vous n'avez droit à aucune reduction");	
		}else if ((etudiant.equals("o")) || (etudiant.equals("O"))) {
			Verifi = true;
			System.out.println("tapez le jour souhaité de (1) a (7)");
			jour = sc.nextInt();
			if (jour == 3) {
				System.out.println("vous avez droit a 20% de reduction");
			}else if (jour == 4) { 
				System.out.println("vous avez droit a 50% de reduction");
			}else {
				System.out.println("vous n'avez droit a aucune reduction");
			}
		}else {
			System.out.println("saisie invalide");
		}
		
		sc.close();
}
}
