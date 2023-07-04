package exo_age;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("quel est votre âge?");
		age = sc.nextInt();
	if (age < 18 && age > 0) {
		System.out.println ("vous êtes mineur");
	}
	
	else if (age > 18) {
		System.out.println("Vous êtes majeur");
	}
	
	else {
	System.out.println("vous n'êtes pas encore né");
		
	}
	
	
	sc.close();


	}

}
