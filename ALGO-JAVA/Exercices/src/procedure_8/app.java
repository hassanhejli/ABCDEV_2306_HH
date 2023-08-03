package procedure_8;
import java.util.Scanner;
public class app {
	
	//declaration fonction
	public static void plusGrand(int a, int i, int[] tabNb)
	{
		int grandCh=0;
		
		// pour i en entree a zero et i en sortie la longueur du tableau =  afficher le plus grand nombre
		for (i = 0; i < tabNb.length; i++)
		{
		
			if(tabNb[i] >= grandCh)
			{
				grandCh= tabNb[i];
			}
		}
		System.out.println(grandCh);
	}

	public static void main(String[] args) {
		
		// declaration variables
		int nbSaisie, i;
		
		// ouverture scanner
		Scanner hasscan = new Scanner(System.in);
		
		// demande de saisir le nombre voulu dans le tableau
		System.out.println("veuillez entrez le nombre de valeurs que vous souhaitez entrez: ");
		nbSaisie = hasscan.nextInt();
		
		// lire le nombre du tableau
		int[] tabNombre = new int[nbSaisie];
		
		
		// demande d'entrer les nombres
		System.out.println("entrez vos nombres");
		
		// lire chaque nombre saisi
		for (i = 0; i < nbSaisie; i++)
		{
			tabNombre[i] = hasscan.nextInt();
		}
		
		// appel de la procedure plusgrand
		plusGrand(nbSaisie, i, tabNombre);
		
		
		// fermeture scanner
		hasscan.close();
		

	}

}
