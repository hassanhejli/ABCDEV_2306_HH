package boucle_3;

import java.util.Scanner;

/*
 Variables
 	nombre est un entier
 	i est un entier
 DEBUT DU PROGRAMME
 	i <-- 1
 	ECRIRE "saisir un nombre"
 	LIRE nombre
 		DEBUT TANT QUE
 		TANT QUE i <=10
 		FAIRE
 		nombre <-- nombre + 1
 		ECRIRE nombre, ""
 		i <-- i + 1
 		FIN TANT QUE
 FIN DU PROGRAMME
 */
public class app {

	public static void main(String[] args) {
		
		int nombre;
		int i = 1;
		
		Scanner hasscan = new Scanner(System.in);
		
		System.out.println("entrez un nombre: ");
		nombre = hasscan.nextInt();
		
		while(i <= 10)
		{
			nombre += 1;
			System.out.print(nombre + " ");
			i++;
		}
		
		hasscan.close();
			
			
	}
}
