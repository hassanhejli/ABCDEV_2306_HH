package procedure_3;

import java.util.Scanner;

public class app {
	
	/*
	 FONCTION Reel moyenne (reel a, reel b)
	 	moyenne est un Reel
	 	moyenne <-- (a+b)/2
	 	retourne Moyenne
	 FIN FONCTION
	 VARIABLE
	 	nombre1 est un reel
	 	nombre2 est un reel
	 DEBUT DU PROGRAMME
	 	Ecrire "saisir le 1er nombre"
	 	Lire nombre1
	 	Ecrire "saisir le 2nd nombre"
	 	Lire nombre2
	 	Ecrire "la moyenne des deux nombres est: ", moyenne(nombre1,nombre2)
	 FIN DU PROGRAMME
	 
	 */
	
	// declaration fonction moyenne
	public static double calculMoyenne (double a,double b)
	{
		double moyenne;
		moyenne = ((a+b)/2);
		
		return moyenne;
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
		
		// on affiche la moyenne dans la console au moyen de la procedure
		System.out.print("la moyenne des deux nombres est égale à: " + calculMoyenne(nombre1,nombre2));
		
		// on ferme le scanner
		hasscan.close();
	}

}
