package surface;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		double Rayon;
		Double Angle;
		Double Aire;
		
		final double pi = Math.PI;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("saisir le rayon");
		Rayon = sc.nextDouble();
		System.out.println("saisir l'angle");
		Angle = sc.nextDouble();
		
		Aire = (pi * Math.pow(Rayon, 2) * Angle/360);
		
		System.out.println("l'aire du secteur circulaire est de" + " " +  Aire);
		
		sc.close();
		

	}

}
