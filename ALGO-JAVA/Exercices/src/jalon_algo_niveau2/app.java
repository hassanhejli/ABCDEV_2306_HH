package jalon_algo_niveau2;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		/*variables
	    estIlEtudiant est une chaine de caracteres
	    etudiant est un booleen
	    jourDeLaSemaine est un entier
	debut du programme
	    ecrire "etes vous etudiant oui (o) ou non(n)"
	    lire <-- estIlEtudiant
	    debut si
	        si estIlEtudiant = o ou O$alors etudiant = vrai
	        sinon etudiant = faux
	    fin si
	    debut si
	        si etudiant = vrai
	        alors ecrire "quel jour de la semaine : 1 Lundi 2 Mardi 3 Mercredi 4 Jeudi 5 Vendredi 6 Samedi"
	        lire <--jourDeLaSemaine
	        debut si 
	            si jourDeLaSemaine est egale a 3
	            alors ecrire "vous avez droit a une reduction de 20%"
	            sinon si jouDeLaSemaine est egale a 4
	            alors ecrire "vous avez droit a une reduction de 50%"
	            sinon ecrire "vous n'avez droit a aucune reduction"
	            
	        fin si
	    sinon ecrire "vous n'avez droit a aucune reduction"
	    fin si
	fin du programme*/
		
		String estIlEtudiant;
		boolean etudiant;
		int jourDeLaSemaine;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("etes vous etudiant oui(o) ou non(n) ?");
		estIlEtudiant = sc.next();
		if (estIlEtudiant.equals("o") || estIlEtudiant.equals("O")) {
			etudiant = true;
		} else {
			etudiant = false;
		}	if (etudiant) {
			System.out.println("quel jour de la semaine : 1 Lundi 2 Mardi 3 Mercredi 4 Jeudi 5 Vendredi 6 Samedi");
			jourDeLaSemaine = sc.nextInt();
				if (jourDeLaSemaine == 3) {
					System.out.println("vous avez droit a une reduction de 20%");
				}else if (jourDeLaSemaine == 4) {
					System.out.println("vous avez droit a une reduction de 50%");
				}else {
					System.out.println("vous n'avez droit a aucune reduction");
				}
				
		}else {
			System.out.println("vous n'avez droit a aucune reduction");
		}
		sc.close();
	
}
}
