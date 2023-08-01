package procedure_2;

import java.util.Scanner;

public class app {
	
	public static void perimetre (double a, double b, double c)
	{
		double p;
		p = a + b + c;
		System.out.println("le perimetre de ce triangle est de : " + p);
	}
	
	public static void aire (double a, double b, double c)
	{
		double p = a + b+ c;
		double aire;
		aire = ((p/2-a)*(p/2-b)*(p/2-c));
		System.out.println("l'aire de ce triangle est de : " + aire);	
	}

	public static void main(String[] args) {
		
		
		double cote1, cote2, cote3;
		
		Scanner hasscan = new Scanner(System.in);
		
		System.out.println("veuillez entre la valeur du 1er cote");
		cote1 = hasscan.nextInt();
		System.out.println("veuillez entre la valeur du 2eme cote");
		cote2 = hasscan.nextInt();
		System.out.println("veuillez entre la valeur du 3eme cote");
		cote3 = hasscan.nextInt();
		
		perimetre(cote1, cote2, cote3);
		aire (cote1, cote2, cote3);
		
		hasscan.close();
	}

}
