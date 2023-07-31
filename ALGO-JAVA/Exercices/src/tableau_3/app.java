package tableau_3;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		
		// declaration des variables
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
		int tabNb[] = new int [vali];
		
		// on demande a l'utilisateur de saisir les valeurs
		System.out.println("saisissez vos valeurs");
		// on lit la valeur
		nomb = hasscan.nextInt();
		
		// pour i en entree a zero et en sortie egale au nombre de valeur entré par l'utilisateur on repete l'action
		for (i = 0; i < vali; i++)
		{
			tabNb[i] = hasscan.nextInt();
			// on trie les valeurs positif et negatif et on les additionne entre elles 
			if (tabNb[i] > 0)
			{
				sommePos += 1;
			}
			else 
			{
				sommeNeg += 1;
			}
		}
		
		// on affiche a la console le nombre de valeur positif et le nombre de valeur negatives
		System.out.println("le nombre de valeur positives saisi est de : " + sommePos);
		System.out.println("le nombre de valeur negatives saisi est de : " + sommeNeg);
		
		// on ferme le scanner
		hasscan.close();
		
	}

}
