package kilometre_miles;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		//
		double kilometres = 0;
		double miles;
		
		Scanner sc = new Scanner(System.in);
		
		if (kilometres < 0.01 && kilometres > 1000000) {
			
			System.out.println("veuillez saisir une nouvelle valeur");
		}
		
		System.out.println("entrez le nombre de km");
		kilometres = sc.nextDouble();
		miles = (kilometres / 1.609);
		
		System.out.println("la valeur en miles de:" + "  " + kilometres + " km " + "  " + "est de" + "  "  + miles + " " + "miles");
		
		sc.close();	

	}

}
