package condition_6;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		/*variables h, m, s en Numérique
Début
Ecrire "Entrez les heures, puis les minutes, puis les secondes : "
Lire h, m, s
m=m+1
si h= 23 & m=59 alors
h = 0
m = 0
sinon si minute = 59 alors
h=heure + 1
sinon
m = m + 1
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
		 
		 if (heure == 23 && minute == 59) {
			 heure = 00;
			 minute = 00;
		 }else if (minute == 59) {
			 minute = 00;
			 heure = heure + 1; 
		 }else  {
			 minute = minute + 1;	 
		 }
		
		 System.out.println("dans une minute il sera  " + heure + " heures" + " " + minute + " minutes");
		 
		 sc.close();
	}

}
