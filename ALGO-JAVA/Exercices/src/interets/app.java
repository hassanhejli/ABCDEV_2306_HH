package interets;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		
		double Somme;
		double Interet;
		int Annees;
		double ISimple;
		double IComp;
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir la somme");
		Somme = sc.nextDouble();
		System.out.println("Saisir l'interet");
		Interet = sc.nextDouble();
		System.out.println("Saisir le nombre annees");
		Annees = sc.nextInt();
		
		ISimple = Somme * (1+Annees*Interet/100d);
		IComp = Somme * (1+Interet/100d) * Annees; 
		
		System.out.println(" l'interet simple est de" + " " + ISimple + "l'interet composé est de " + " " + IComp); 
		
		 
		

	}

}
