package condition_2;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		
int nombre;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entrez un nombre");
		nombre = sc.nextInt();
		if (nombre < 0) {
			System.out.println(nombre +  "  est un nombre negatif");
			
		}else if (nombre > 0){
			System.out.println(nombre + "  est un nombre positif");
			
		}
		else {
			System.out.println(nombre + "  est egal a zero");
		}
		
		sc.close();

	}

}
