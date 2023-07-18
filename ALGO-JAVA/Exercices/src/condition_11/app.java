package condition_11;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		/*
		 * variables
		 * age est un entier
		 * anneePermis est un booleen
		 * accident est un entier
		 * anciennete est un booleen
		 * tarif est un entier
		 * assure est un booleen
		 * 
		 * debut du programme
		 * ecrire "entrez votre age"
		 * lire <-- age
		 * ecrire "depuis combien d'annee avez vous le permis"
		 * lire <-- annePermis
		 * ecrire "combien avez vous eu d'accident"
		 * lire <-- accident
		 * ecrire "etes vous assure depuis plus de 5 ans"
		 * lire <--anciennete
		 * 	debut si
		 * 	si age < 18
		 * 	alors ecrire "vous ne pouvez etre assure"
		 * sinon si age >18 et inferieur a 25
		 * alors 
		 * 
		 * 
		 * 
		 */
		
		int age;
		int anneePermis;
		int accident;
		int anciennete;
		boolean condition1;
		boolean condition2;
		boolean condition3;
		String tarif;
		int point = 0;
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("entrez votre age : "); // on demande l'age
		age = sc.nextInt();
		
		if (age < 18) // si l'age est inferieur a 18 le programme s'arrete
		{
			System.out.println("nous ne pouvons vous assure");
			System.exit(0);
		}
		
		System.out.println("depuis combien d'années avez vous le permis : "); // on demande les annees de permis
		anneePermis = sc.nextInt();
		
		System.out.println("combien avez vous eu d'accident ? : "); // on demande le nombre d'accidents
		accident = sc.nextInt();
		
		if (accident > 2) // si le nombre d'accident est superieur a 2 le programme s'arrete
		{
			System.out.println("nous ne pouvons vous assure");
			System.exit(0);
		}
		
		System.out.println("depuis combien d'annees êtes vous assure ? : "); // on demande l'anciennete
		anciennete = sc.nextInt();
		
		
		// on affecte les variables condition
		condition1 = age > 25; 
		condition2 = anneePermis > 2;
		condition3 = anciennete > 5;
		
		// on affecte la valeur de point en fonction des conditions
		if (condition1 = false)
		{
			point = point - 1;
		}
		if (condition2 = false)
		{
			point = point - 1;
		}
		if (condition3 = true)
		{
			point = point + 1;
		}
		
		// on determine le tarif en fonction du nombre de point
		
		if (point == 0)
		{ 
			tarif = "rouge";
			System.out.println("nous pouvons vous assurez au tarif " + tarif);
		}
		else if (point == 1)
		{ 
			tarif = "orange";
			System.out.println("nous pouvons vous assurez au tarif " + tarif);
		}
		else if (point == 2)
		{ 
			tarif = "vert";
			System.out.println("nous pouvons vous assurez au tarif " + tarif);
		}
		else if (point == 3)
		{ 
			tarif = "bleu";
			System.out.println("nous pouvons vous assurez au tarif " + tarif);
		}
		else if (point < 0)
		{
			System.out.println("nous ne pouvons pas vous assurez");
		}
		else 
		{ 
			System.out.println("nous ne pouvons pas vous assurez");
		}
		
		
		sc.close();
	}

}
