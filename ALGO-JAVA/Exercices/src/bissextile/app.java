package bissextile;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		int a;
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("entrez une année");
		a = sc.nextInt();
		if ((a % 4 == 0 && a % 100 > 0) || (a % 400 == 0)) {
			System.out.println("cette année est bissextile");
		} else {
			System.out.println("cette annee n'est pas bissextile");
		}
	sc.close();


	}

}
