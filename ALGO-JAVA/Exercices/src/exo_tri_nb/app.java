

package exo_tri_nb;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		
		int a;
		int b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entrez le nombre a");
		a = sc.nextInt(); 
		System.out.println("entrez le nombre b");
		b = sc.nextInt(); 
		
		if (a < b) {
			System.out.println("la valeur "+ a + " est plus petite que la valeur  " + b);
		}
		
		else if(b < a) {
			System.out.println("la valeur "+ b + " est plus petite que la valeur  " + a); 
		}else {
			System.out.println("les deux valeurs " + a + " et " + b + " sont egales");
		}
		
		sc.close();
	}
}
