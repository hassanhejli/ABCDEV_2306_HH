package tableau_3;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {

		int nomb;
		int vali;
		int i;
		int sommePos = 0;
		int sommeNeg = 0;
		
		
		
		Scanner hasscan = new Scanner(System.in);
		
		System.out.println(" saisissez le nombre de valeurs que vous souhaitez saisir dans le tableau");
		vali = hasscan.nextInt();
		int tabNb[] = new int [vali];
		
		System.out.println("saisissez vos valeurs");
		nomb = hasscan.nextInt();
		
		for (i = 0; i < vali; i++)
		{
			tabNb[i] = hasscan.nextInt();
			if (tabNb[i] > 0)
			{
				sommePos += 1;
			}
			else 
			{
				sommeNeg += 1;
			}
		}
		
		System.out.println("le nombre de valeur positives saisi est de : " + sommePos);
		System.out.println("le nombre de valeur negatives saisi est de : " + sommeNeg);
		hasscan.close();
		
	}

}
