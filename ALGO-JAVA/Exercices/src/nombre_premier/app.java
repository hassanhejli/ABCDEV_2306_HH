package nombre_premier;

import java.util.Scanner;

public class app {
	/* variables
	 * reste est un entier
	 * n est un entier
	 * flag est un booleen
	 * 
	 * 	debut du programme
	 * 	ecrire "entrez un nombre"
	 * 	lire <--n
	 * 		debut pour
	 * 		i=2 i inferieur à i/2 ajouter 1 a chaque fois
	 * 		lire reste<-- n modulo de i
	 * 		debut si
	 * 		si reste = zero
	 * 		alors arreter la bloucle
	 * 		sinon
	 * 		continuer la boucle
	 * 		fin si
	 * 		fin pour
	 * 		debut si
	 * 		si flag est vrai
	 * 		alors
	 * 		ecrire "n" +  "est un nombre premier"
	 * 		sinon 
	 * 		ecrire "n" + "n'est pas un nombre premier"
	 * 		fin si
	 * 	fin du programme
	 */
	public static void main(String[] args) {
		
			int reste;
			boolean flag = true;
			int nbr = 17;
		  
		  Scanner sc = new Scanner(System.in);
		     System.out.println("entrez un nombre");  
		     nbr = sc.nextInt();
		     
		  for(int i=2; i <= nbr/2; i++)
		  {
		     //nombre est divisible par lui-meme
		     reste = nbr%i;
		            
		     //si le reste est 0, alors arrete la boucle. Sinon continuer la boucle
		     if(reste == 0)
		     {
		        flag = false;
		        break;
		     }
		  }
		  //si flag est true, alors nombre est premier, sinon non premier
		  if(flag)
		     System.out.println(nbr + " est un nombre premier");
		  else
		     System.out.println(nbr + " n'est pas un nombre premier");
		  
		  sc.close();
	}
}
