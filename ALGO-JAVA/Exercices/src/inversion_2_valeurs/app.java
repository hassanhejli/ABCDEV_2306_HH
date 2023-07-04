package inversion_2_valeurs;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("entrez la valeur de A");
		a = sc.nextInt();
		System.out.println("entrez la valeur de B");
		b = sc.nextInt();
		
		System.out.println("les valeurs de A  et B avant inversion sont:" + " " + a + " " +  b);
		
		c = b;
		b = a;
		a = c;
		
		System.out.println("les valeurs de A  et B apres inversion sont:" + " " + a + " " +  b);
		
		sc.close();
		
		
	}

}
