package condition_6;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		/*variables h, m, s en Numérique
Début
Ecrire "Entrez les heures, puis les minutes, puis les secondes : "
Lire h, m, s
m=m+1
si m=60 alors
m=0
h=h+1
Finsi
si h=24 alors
h=0
Finsi
Ecrire "Dans une seconde, il sera ",h,"heures",m,"minutes",s,"secondes"
Fin*/

		
		
		
		int heure;
		int minute;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entrez l'heure");
		 heure = sc.nextInt();
		 System.out.println("entrez les minutes");
		 minute = sc.nextInt();
		 if (minute == 60) {
			 minute = 0;
			 heure = heure + 1;
			 System.out.println("dans une minute il sera  " + heure + " heures" + " " + minute + " minutes");
			 
		 }else {
			 minute = minute + 1;
			 heure = heure;
			 System.out.println("dans une minute il sera  " + heure + " heures" + " " + minute + " minutes");
		 }if (heure == 24) {
			 heure = 00;
			 minute = minute + 1;
			 System.out.println("dans une minute il sera  " + heure + " heures" + " " + minute + " minutes");	 
		 }else {
			heure = heure + 1;
			 System.out.println("dans une minute il sera  " + heure + " heures" + " " + minute + " minutes");	 
		 }
		
		 
		 sc.close();
	}

}
