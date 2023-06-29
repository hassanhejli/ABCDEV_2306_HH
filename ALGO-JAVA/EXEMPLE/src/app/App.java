package app;

import java.util.Scanner;

public class App {

	public static void main(String[] args)
	{
		float rayon;
		double volume;
		double aire;
		final double PI = Math.PI;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("saisir rayon:");
		rayon = sc.nextFloat();
		aire = 4 * PI*Math.pow(rayon, 2);
		aire = Math.round(aire * 1000.0)/1000.0;
		System.out.println("l'aire de la sphere est de" + aire);
		volume = (4d/3) * PI * Math.pow(rayon, 3);
		volume = Math.round(volume * 1000.0) / 1000.0;
		System.out.println("le volume de la sphere est de" + volume);
		
		sc.close();
	}
		
}
		
