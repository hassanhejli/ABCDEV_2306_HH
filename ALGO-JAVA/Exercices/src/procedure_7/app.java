package procedure_7;

import java.util.Scanner;

public class app {
	
	// declaration de procedure
	public static double pourcentage(double a, double b)
	{
		
		double total;
		total = (a/b)*100;
		return total;
	}

	public static void main(String[] args) {
		
		// declaration des variable
		int carteBancaire;
		int cheque;
		int virementAuto;
		int paiementTotal;
		
		// on ouvre le scanner
		Scanner hasscan = new Scanner(System.in);
		
		// on demande a l'utilisateur d'entrer le nombre de paiement par cb
		System.out.println(" veuillez entrez le nombre de paiement par carte bancaire");
		carteBancaire = hasscan.nextInt();
		// on demande a l'utilisateur d'entrer le nombre de paiement par cheque
		System.out.println(" veuillez entrez le nombre de paiement par cheque");
		cheque = hasscan.nextInt();
		// on demande a l'utilisateur d'entrer le nombre de paiement par virement
		System.out.println(" veuillez entrez le nombre de paiement par virement automatique");
		virementAuto = hasscan.nextInt();
		
		// on affecte la valeur paiementtotal
		paiementTotal = carteBancaire + cheque + virementAuto;
		
		// on affiche dans la console 
		System.out.println("Vous avez emis " + paiementTotal + " ordre de debit dont ");
		System.out.println("          " + Math.round(pourcentage(carteBancaire,paiementTotal)*100.0)/100.0 + " % par carte bleue");
		System.out.println("          " + Math.round(pourcentage(cheque,paiementTotal)*100.0)/100.0 + " % par cheque");
		System.out.println("          " + Math.round(pourcentage(virementAuto,paiementTotal)*100.0)/100.0 + " % par virement auto");
		
		// on ferme le scanner
		hasscan.close();

	}

}
