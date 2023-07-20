

package exo_tri_nb;

import java.util.Scanner;

public class app {
	/*
	VARIABLES
	nombreA est un entier
	nombreB est en entier
	DEBUT DU PROGRAMME
	ECRIRE "entrez le nombre A"
	LIRE nombreA
	ECRIRE "entrez le nombre B"
	LIRE B
		DEBUT SI
		SI nombreA < nombreB
		ALORS
		ECRIRE "la valeur de nombreA : " + a + " est plus petite que la valeur de nombreB " + b
		SINON SI nombreB < nombreA
		ALORS
		ECRIRE "la valeur de nombreB : " + b + " est plus petite que la valeur de nombreA " + a
		SINON 
		ECRIRE "les deux valeurs " + a + " et " + b + " sont egales"
		FIN SI
	FIN DU PROGRAMME
	
	 */

	public static void main(String[] args) {
		
		int nombreA;
		int nombreB;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entrez le nombre a");
		nombreA = sc.nextInt(); 
		System.out.println("entrez le nombre b");
		nombreB = sc.nextInt(); 
		
		if (nombreA < nombreB) {
			System.out.println("la valeur de "+ nombreA + " est plus petite que la valeur de " + nombreB);
		}
		
		else if(nombreB < nombreA) {
			System.out.println("la valeur de "+ nombreB + " est plus petite que la valeur de " + nombreA); 
		}else {
			System.out.println("les deux valeurs " + nombreA + " et " + nombreB + " sont egales");
		}
		
		sc.close();
	}
}
