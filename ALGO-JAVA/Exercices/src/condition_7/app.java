package condition_7;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		int heure;
		int minute;
		int seconde;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entrez l'heure");
		 heure = sc.nextInt();
		 System.out.println("entrez les minutes");
		 minute = sc.nextInt();
		 System.out.println("entrez les secondes");
		 seconde = sc.nextInt();
		 
		 if (heure == 23 && minute == 59 && seconde == 59) {
			 heure = 00;
			 minute = 00;
			 seconde = 00;
		 }else if (minute == 59 && seconde ==59) {
			 heure = heure + 1;
			 minute = 00; 
			 seconde = 00;
		 }else if (seconde == 59){
			 minute = minute + 1;
			 seconde = 0;
		 }
		 else {
			 seconde = seconde + 1;
		 }
		
		 System.out.println("dans une minute il sera  " + heure + " heures" + " " + minute + " minutes et " + seconde + " secondes");
		 
		 sc.close();

	}

}
