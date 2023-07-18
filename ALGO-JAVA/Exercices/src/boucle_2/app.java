package boucle_2;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		int nombre = 0;
		
Scanner hassan = new Scanner(System.in);		
		
		while (nombre < 10 || nombre > 20)
		{
			System.out.println("entrez un nombre compris entre 10 et 20");
			nombre = hassan.nextInt();
			if (nombre < 10)
			{
				System.out.println("plus grand");
			}
			else if (nombre > 20)
			{
				System.out.println("plus petit");
			}
		}
		hassan.close();
	}

}
