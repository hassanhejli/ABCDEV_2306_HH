package procedure_6;

import java.util.Scanner;

public class app {

	// on declare la procedure inversion
	public static void inversion(String str)
	{
        String newStr = "";
        
        for(int i = str.length() - 1; i >= 0; i--)
        {
            newStr = newStr + str.charAt(i);
        }
        System.out.println("votre chaine de caractere apres inversion est : " + newStr);
    }
	
	
	public static void main(String[] args) {
		
		// on declare les variables
		String caractere;
		
		// on ouvre le scanner
		Scanner hasscan = new Scanner(System.in);
		
		// on demande a l'utilisateur d'entrez une chaine de caractere et on la lit
		System.out.println("veuillez entrez une chaine de caractere");
		caractere = hasscan.nextLine();	
		
		// on affiche la chaine de caractere que l'utilisateur a entrer
		System.out.println("votre chaine de caractere avant inversion est : " + caractere);
		
		// on fait appel a la procedure inversion
		inversion (caractere);
		
		// on ferme le scanner
		hasscan.close();

	}

}
