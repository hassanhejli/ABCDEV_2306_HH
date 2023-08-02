package procedure_3;

import java.util.Scanner;

public class app {
	// declaration procedure moyenne
	public static void moyenne (double a,double b)
	{
		double moyenne;
		moyenne = ((a+b)/2);
		System.out.println("la moyenne des deux nombres est égale à " + moyenne);
	}

	public static void main(String[] args) {
		// declaration variable
		double nombre1, nombre2;
		
		// on ouvre le scanner
		Scanner hasscan = new Scanner(System.in);
		
		// on demande la saisie nombre1 et on le lit
		System.out.println(" veuillez entrez le nombre1 :");
		nombre1 = hasscan.nextDouble();
		
		// on demande la saisie nombre2 et on le lit
		System.out.println(" veuillez entrez le nombre2 :");
		nombre2 = hasscan.nextDouble();
		
		// on fait appel a la procedure moyenne
		moyenne(nombre1, nombre2);
		
		// on ferme le scanner
		hasscan.close();
	}

}
