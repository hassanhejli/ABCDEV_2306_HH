package tableau_8;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		
		// on declare les variables
				int vali, i, plusGrand = 0;
						
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
		
		// on bouvle pour entrer les valeurs dans le tableau
		for (i = 0; i < vali; i++)
		{
			tabNb[i] = hasscan.nextInt();
		}
		
		// on boucle pourselectionner la valeur la plus grande 
		for (i = 0; i < tabNb.length; i++)
		{
			
			if(tabNb[i] >= plusGrand)
			{
				plusGrand = tabNb[i];
			}
		}

		// on affiche la valeur la plus grande dans la console
		System.out.println("Le nombre le plus grand est : "+ plusGrand);
		
		// on ferme le scanner
		hasscan.close();
	}

}
