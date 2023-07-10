package condition_3;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entrez un nombre");
		a = sc.nextInt();
		System.out.println("entrez un nombre");
		b = sc.nextInt();
		if ((a < 0 && b < 0) || (a > 0 && b> 0)) {
			System.out.println("le produit de  " + a + "  et  " + b +  "  est un produit positif");
			
		}else {
			System.out.println("le produit de  " + a + "  et  " + b +  "  est un produit negatif");
			
		}
		
		sc.close();

	}

}
