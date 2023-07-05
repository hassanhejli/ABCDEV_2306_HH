package kilometre_miles;

import java.text.DecimalFormat;
import java.util.Scanner;

public class app {

	public static void main(String[] args) {
	
		double kilometres = 0;
		double miles;
		boolean resolu = false;
		
		 
		Scanner sc = new Scanner(System.in);
		
		do {
			
		System.out.println("entrez le nombre de km");
		kilometres = sc.nextDouble();
		
		if (kilometres > 0.01 && kilometres < 1000000) {
			
			resolu = true;
			
		}
		
		
		else {
			resolu = false;
			System.out.println("veuillez saisir une nouvelle valeur");
		}
		
		} while (resolu == false) ;
		miles = (kilometres * 0.62);
		
		
		System.out.println("la valeur en miles de:" + "  " + kilometres + " km " + "  " + "est de" + "  "  + miles + " " + "miles");
		
		sc.close();	

	}

}
