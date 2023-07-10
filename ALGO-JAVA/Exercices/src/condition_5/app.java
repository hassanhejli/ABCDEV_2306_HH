package condition_5;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entrez l'age de l'enfant");
		 age = sc.nextInt();
		
		if (age >=6 && age <= 7) {

			System.out.println("votre enfant est dans la categorie poussins");
			
		}else if  (age >= 8 && age <= 9) {

			System.out.println("votre enfant est dans la categorie pupilles");
			
		}else if  (age >= 10 && age <= 11) {

			System.out.println("votre enfant est dans la categorie minime");
			
		}else if  (age < 6) {

			System.out.println("votre enfant est dans aucune categorie");
			
		}else {

			System.out.println("votre enfant est cadet");
			
		}
		
		sc.close();
	}

}
