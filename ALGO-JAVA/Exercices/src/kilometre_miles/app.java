package kilometre_miles;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
	
			double Kilo = 0;
			double Miles = 0;
			String kiloError;
			boolean Verif = false;
			
		Scanner scanner = new Scanner(System.in);
			while (Verif == false) 
			{	
			System.out.println("Entrez le nombre de kilometres");
			if (scanner.hasNextDouble()) //methode qui detecte le type de la saisie et renvoie true ou false selon le type renseigné
				{
				Kilo = scanner.nextDouble(); //ici un double renseigne
					if (Kilo < 0.01 || Kilo > 1000000)
					{
						System.out.println("entree invalide!");
					}else 
						{
							Verif = true;
							scanner.close();
						}
				}else // les autres types passent dans le else comme ici une chaine de caracteres
				{
				kiloError = scanner.next();
					if ((kiloError.equals("q")) || (kiloError.equals("Q"))) 
					{
					System.exit(0);//permet de quitter le programme
					}else 
						{
							System.out.println("entree invalide!");
						}
					}
				}

			Miles = Math.round((Kilo / 1.609) *100.0)/100.0;
			System.out.println(Kilo + "km donne: " + Miles + "  miles");
	}
}
	

			


