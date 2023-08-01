package procedure_1;

import java.util.Scanner;

public class app {
	
	// on cree une procedure pour inverser deux nombres
	public static void inversion (int a, int b)
	{
		int tmp;
		tmp = a;
		a = b;
		b = tmp;
		System.out.println("apres inversion, nombre1 = " + a + " et nombre2 = " + b);	
	}

	public static void main(String[] args) {
		
		// on declare les variables
		int nombre1, nombre2;
		
		// on ouvre le scanner
		Scanner hasscan = new Scanner(System.in);
		
		// on demande a l'utilisateur de saisir le 1er nombre et on le lit
		System.out.println("veuillez saisir le 1er nombre");
		nombre1 = hasscan.nextInt();
		
		// on demande a l'utilisateur de saisir le 2eme nombre et on le lit
		System.out.println("veuillez saisir le 1er nombre");
		nombre2 = hasscan.nextInt();
		
		// on ecrit la valeur des deux nombres avant inversion dans la console
		System.out.println("avant inversion, nombre1 = " + nombre1 + " et nombre2 = " + nombre2);
		
		// on appelle la procedure
		inversion(nombre1, nombre2);
		
		// on ferme le scanner
		hasscan.close();
	}

}
