package jalon_algo_niveau1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		String prenom;
		String nom;
		int departement;
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entrez votre prenom");
		prenom = sc.next();
		System.out.println("entrez votre nom");
		nom = sc.next();
		System.out.println("entrez votre code de département (à 2 chiffres)");
		departement = sc.nextInt();
		System.out.println("choisissez entre 2 adresses mails" + "  " + prenom + "." + nom + departement + "@arfp.asso.fr" + "  " + "ou" +  " " + nom + departement + prenom + "@arfp.asso.fr");
	
		
		sc.close();

	}

}
