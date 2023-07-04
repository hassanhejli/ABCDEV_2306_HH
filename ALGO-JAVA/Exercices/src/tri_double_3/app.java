package tri_double_3;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		double a;
		double b;
		double c;

		Scanner sc = new Scanner(System.in);
	
		System.out.println("entrez le nombre a");
		a = sc.nextDouble();
		System.out.println("entrez le nombre b");
		b = sc.nextDouble();
		System.out.println("entrez le nombre c");
		c = sc.nextDouble();
		
		if (a < b && a < c) {
			System.out.println ("l'ordre croissant est" + " " + a + " " + b + " " + c);
		
		}
		else if (a < c && c < b) {
			System.out.println ("l'ordre croissant est" + " " + a + " " + c + " " + b);
		}	
		else if (b < a && a < c) {
			System.out.println ("l'ordre croissant est" + " " + b + " " + a + " " + c);
		}		
		else if (b < c && c < a) {
			System.out.println ("l'ordre croissant est" + " " + b + " " + c + " " + a);
		}		
		else if (c < a && a < b) {
			System.out.println ("l'ordre croissant est" + " " + c + " " + a + " " + b);
		}		
		else if (c < b && b < a){
			System.out.println ("l'ordre croissant est" + " " + c + " " + b + " " + a);
		}		
		else {
			System.out.println("veuillez entrer des valeurs differentes");
		}
		
		sc.close();	
	

	}

}
