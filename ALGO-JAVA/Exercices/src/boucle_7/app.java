package boucle_7;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		
		int nombre;
		int plusGrand;
		int position;
		int i = 0;

		Scanner sc = new Scanner(System.in);

		plusGrand = 0;
		position = 0;

		
		
		
		while (i <= 20)
		{		System.out.println("Saisir un nombre");
				nombre = sc.nextInt();
				i++;
				if (nombre>plusGrand)
				{
					plusGrand = nombre;
					position = i;
				}		
		}
		
		System.out.println("Le nombre le plus grand est : "+plusGrand);
		System.out.println("Il a ete saisi en position numero : "+position);
		sc.close();


	}

}
