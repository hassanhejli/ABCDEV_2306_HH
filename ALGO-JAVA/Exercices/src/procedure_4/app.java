package procedure_4;

import java.util.Scanner;

public class app {

	// declaration procedure
	public static void bissextile (int a)
	{
		if ((a % 4 == 0 && a % 100 > 0) || (a % 400 == 0)) {
			System.out.println("cette année est bissextile");
		} else {
			System.out.println("cette annee n'est pas bissextile");
		}
	}
	
	public static void main(String[] args) {
		
		// declaration variable
		int annee;
		
		// on ouvre le scanner
		Scanner hasscan = new Scanner(System.in);
		
		// on demande d'entrer une annee et on la lit
		System.out.println(" veuillez saisir une annee ");
		annee = hasscan.nextInt();
		
		// on fait appel a la procedure
		bissextile(annee);
		
		// on ferme le scanner
		hasscan.close();
	}

}
