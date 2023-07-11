package condition_9;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		/*
		 * variable
		 * sexe est une chaine de caractere
		 * age est un entier
		 * debut programme
		 * ecrire "entrez votre sexe (h) pour homme (f) pour femme"
		 * lire sexe
		 * ecrire "entrez votre age"
		 * lire age
		 * debut si
		 * si sexe = h et age > 20 ou  si sexe = f et age >= 18 et <=35
		 * alors impot est vrai
		 * ecrire "vous etes imposable"
		 * sinon impot est faux
		 * ecrire "vous n'etres pas imposable"
		 * fin si
		 * fin programme
		 * 
		 */
		
		String sexe;
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entrez votre sexe (h) pour homme ou (f) pour femme");
		sexe = sc.next();
		System.out.println("entrez votre age");
		age = sc.nextInt();
		if (sexe.equals("h") && age > 20 || sexe.equals("H") && age > 20 || sexe.equals("f") && age >= 18 && age <= 35 || sexe.equals("F") && age >= 18 && age <= 35)
		{
			System.out.println("vous etes imposable");
		}
		else if (sexe.equals("h") && age < 20 || sexe.equals("H") && age < 20 || sexe.equals("f") && age <= 18 && age >= 35 || sexe.equals("F") && age <= 18 && age >= 35)
		{
			System.out.println("vous n'etes pas imposable");
		}
		else 
		{
			System.out.println("erreur de saisie");
		}
		sc.close();
}
}
		
