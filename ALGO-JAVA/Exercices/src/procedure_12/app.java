package procedure_12;

import java.util.Scanner;

public class app {
	
	//declaration fonction
	public static String nombreVoyelles(String chaineCaractere )
	{
		String voyelles = "";
		
		
		
			if (voyelles == "a" || voyelles == "e " || voyelles == "i "
					|| voyelles == "o" || voyelles == "u" || voyelles == "y")
			{
				for(int i = 0; i <= voyelles.length();i++)
				{
					System.out.println("le nombre de voyelle est de :" + voyelles);
				}
			}
		
		return voyelles;
	}
	
	

	public static void main(String[] args) {
	
		// declaration variable
		String phrase;

		//ouverture scanner
		Scanner hasscan = new Scanner(System.in);
				
		System.out.println("veuillez entrer une chaine de caractere");
		phrase = hasscan.next();
		
		nombreVoyelles(phrase);
		
		// fermeture scanner
		hasscan.close();

	}

}
