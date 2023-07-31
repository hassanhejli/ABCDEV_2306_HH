package boucle_9;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		
		int chevauxPartant;
		int chevauxJouer;
		int ordre;
		int desordre;
		
		
		Scanner hasscan = new Scanner(System.in);
		
		System.out.println("entrez le nombre de chevaux partants : ");
		chevauxPartant = hasscan.nextInt();
		
		System.out.println("entrez le nombre de chevaux que vous souhaitez jouer (3) ou (4) ou (5)");
		chevauxJouer = hasscan.nextInt();
		desordre = chevauxJouer * (chevauxPartant * chevauxJouer);
		ordre = chevauxJouer * (chevauxPartant * (chevauxPartant - chevauxJouer));
		
		if (chevauxJouer == 3)
		{
			System.out.println("votre chance de gagner au tierce est de 1 sur " + ordre + " dans l'ordre");
			System.out.println("votre chance de gagner au tierce est de 1 sur " + desordre + " dans le desordre");
			
		}
		else if (chevauxJouer == 4)
		{
			System.out.println("votre chance de gagner au quarte est de 1 sur " + ordre + " dans l'ordre");
			System.out.println("votre chance de gagner au quarte est de 1 sur " + desordre + " dans le desordre");
		}
		else if (chevauxJouer == 5)
		{
			System.out.println("votre chance de gagner au quinte est de 1 sur " + ordre + " dans l'ordre");
			System.out.println("votre chance de gagner au quinte est de 1 sur " + desordre + " dans le desordre");
		}
		else
		{
			System.out.println("saisie invalide vous ne pouvez jouer que (3) ou (4) ou (5) chevaux");
		}
		
		hasscan.close();

	}

}
