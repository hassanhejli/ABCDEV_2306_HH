package revision_1_2;

import java.util.Scanner;

public class app {
	/*
	 VARIABLES
	 rayon est un entier
	 aire est un reel
	 volume est un reel
	 CONSTANTES
	 pi est un reel
	 DEBUT DU PROGRAMME
	 ECRIRE "entrez la valeur du rayon"
	 LIRE <-- rayon
	 pi <-- 3.1415
	 aire <-- (4 * pi)* rayon au carre
	 volume <-- ((4*pi)/3) * rayon au cube
	 ECRIRE "pour un rayon de" + rayon + "d'une sphere, son aire est de" + aire + "et son volume est de" + volume
	 FIN DU PROGRAMME
	 */

	public static void main(String[] args) {
		
		// Declaration des variables
		int rayon;
		double aire;
		double volume;
		final double pi = Math.PI;
		
		// on ouvre le scanner
		Scanner hasscan = new Scanner(System.in);
		
		// on demande a l'utilisateur d'entrer la valeur du rayon et on l'affecte a la variable rayon
		System.out.println("entrez la valeur du rayon");
		rayon = hasscan.nextInt();
		
		// on affecte les calculs correspondant aux variables aire et volume
		aire = (4*pi) * Math.pow(rayon, 2);
		volume = ((4/3)*pi) * Math.pow(rayon, 3);
		
		// on determine deux chiffres apres la virgule
		aire = Math.round(aire * 100.0)/100.0;
		volume = Math.round(volume * 100.0)/100.0;
		
		// on affiche dans la console l'aire et le volume d'une sphere pour un rayon donne
		System.out.println("pour un rayon de : " + rayon + " d'une sphere, son aire est de : " + aire + " et son volume est de : " + volume);
		
		// on ferme le scanner
		hasscan.close();
	}

}
