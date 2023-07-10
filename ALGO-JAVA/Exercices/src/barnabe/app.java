package barnabe;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		int argentBarnabe;
		int somme;
		int nombreMagasins = 0;
		boolean verifi = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("saisir argent barnabe");
		argentBarnabe = sc.nextInt();
		while (argentBarnabe > 0);{// on verifie que l'argent de barnabe est superieur a zero
			verifi = true;
			if ((argentBarnabe /2) + 1 >1) {
				argentBarnabe = argentBarnabe - (argentBarnabe/2) + 1;
				nombreMagasins ++;
				
			} else {
				argentBarnabe = argentBarnabe - argentBarnabe;
				nombreMagasins ++;
			}
		
		} // on passe dans le cas ou l'argent de barnabe n'est pas superieur a zero
			verifi = false;
			System.out.println("barnabe est alle dans  " + nombreMagasins);
		
		
		
		sc.close();
	}

}
