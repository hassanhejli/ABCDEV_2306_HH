package condition_6;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		
		
		String []temps = null;
		int donnee = Integer.parseInt(temps[0]);
		int heure = donnee/60;
		int minute = donnee %60;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entrez l'heure");
		 heure = sc.nextInt();
		 System.out.println("entrez les minutes");
		 minute = sc.nextInt();
		 System.out.println(donnee + " minutes vaut " + heure + "h" + minute);
		 
		 sc.close();
	}

}
