package moyenne;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		int A;
		int B;
		int Moyenne;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entrez un nombre");
		A = sc.nextInt();
		System.out.println("entrez un nombre");
		B = sc.nextInt();
		Moyenne = ((A + B)/2);
		System.out.println("la moyenne des deux nombres est égale à" +" " + Moyenne);
		
		sc.close();

	}

}
