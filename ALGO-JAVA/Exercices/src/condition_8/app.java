package condition_8;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		/* variables
		 * nombre est un entier
		 * prix est un reel
		 * 
		 * debut du programme
		 * ecrire "entrez le nombre de photocopie"
		 * lire <-- nombre
		 * debut si 
		 * si nombre <=10
		 * alors
		 * prix = nombre * 0.10
		 * sinon si nombre >10 et nombre <= 30
		 * alors
		 * prix = ((nombre - 10) * 0.09) + 1
		 * sinon 
		 * alors prix = ((nombre - 30) * 0.08) + 2.80
		 * fin si
		 * fin du programme
		 */
		 
		int nombre;
		double prix;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entrez le nombre de photocopie");
		nombre = sc.nextInt();
		
		if (nombre <= 10) {
			prix = nombre * 0.10;
		}else if (nombre > 10 && nombre <=30) {
			prix = ((nombre - 10) * 0.09) + 1;
		}else {
			prix = ((nombre - 30) * 0.08) + 2.80;
		}
		System.out.println("le prix est de  " + prix + " euros");
		 
		 sc.close();
	}

}
