package exo_tri_double;

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
		
		if (a < b && b < c) {
			System.out.println (a + " " + b + " " + c);
		}
		else if (a < c && c < b) {
			System.out.println (a + " " + c + " " + b);
		}	
		else if (b < a && a < c) {
			System.out.println (b + " " + a + " " + c);
		}		
		else if (b < c && c < a) {
			System.out.println (b + " " + c + " " + a);
		}		
		else if (c < a && a < b) {
			System.out.println (c + " " + a + " " + b);
		}		
		else {
			System.out.println (c + " " + b + " " + a);
		}		
		
		
		sc.close();	
	
	}
	
}
