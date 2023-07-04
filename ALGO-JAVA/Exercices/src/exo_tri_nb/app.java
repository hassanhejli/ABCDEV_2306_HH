

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
			System.out.println(a + " " + b);
		}
		
		else {
			System.out.println(b + " " + a);
		}
		
		sc.close();
	}
}
