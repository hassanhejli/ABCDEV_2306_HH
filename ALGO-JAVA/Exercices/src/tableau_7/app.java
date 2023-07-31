package tableau_7;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		int nomb;
		int vali;
		int i;
		int sommePos = 0;
		int sommeNeg = 0;
		
		// on ouvre le scanner
		Scanner hasscan = new Scanner(System.in);
		
		// on demande a l'utilisateur de saisir le nombre de valeur qu'il va entrer
		System.out.println(" saisissez le nombre de valeurs que vous souhaitez saisir dans le tableau");
		// on lit le nombre de valeur
		vali = hasscan.nextInt();
		// on declare un tableau qui comporte le nombre de valeur entré
		int tabNb[]  = new int [vali];
		
		// on demande a l'utilisateur de saisir les valeurs
		System.out.println("saisissez vos valeurs");
		// on lit la valeur
		nomb = hasscan.nextInt();
		
		// pour i en entree a zero et en sortie egale au nombre de valeur entré par l'utilisateur on repete l'action
		for (i = 0; i < vali; i++)
		{
			tabNb[i] = hasscan.nextInt();
			tabNb[i]+=1;
		}
		
		System.out.print(tabNb [i]);
		
		// on ferme le scanner
		hasscan.close();

	}

}
