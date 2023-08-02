package procedure_7;

import java.util.Scanner;

public class app {
	
	// declaration de procedure
	public static void pourcentage(double cb, double ch, double va)
	{
		
		double total;
		total = cb + ch +va;
		cb = (cb/total)*100;
		ch = (ch/total)*100;
		va = (va/total)*100;
		
		System.out.println("Vous avez emis " + total + " ordre de debit dont ");
		System.out.println("          " + Math.round(cb*100.0)/100.0 + " % par carte bleue");
		System.out.println("          " + Math.round(ch*100.0)/100.0 + " % par chèque");
		System.out.println("          " + Math.round(va*100.0)/100.0 + " % par virement");
		
	}

	public static void main(String[] args) {
		
		// declaration des variable
		double carteBancaire;
		double cheque;
		double virementAuto;
		
		// on ouvre le scanner
		Scanner hasscan = new Scanner(System.in);
		
		// on demande a l'utilisateur d'entrer le nombre de paiement par cb
		System.out.println(" veuillez entrez le nombre de paiement par carte bancaire");
		carteBancaire = hasscan.nextDouble();
		// on demande a l'utilisateur d'entrer le nombre de paiement par cheque
		System.out.println(" veuillez entrez le nombre de paiement par carte bancaire");
		cheque = hasscan.nextDouble();
		// on demande a l'utilisateur d'entrer le nombre de paiement par virement
		System.out.println(" veuillez entrez le nombre de paiement par carte bancaire");
		virementAuto = hasscan.nextDouble();
		
		
		
		// on fait appel a la procedure pourcentage
		pourcentage(carteBancaire, cheque, virementAuto);
		
		// on ferme le scanner
		hasscan.close();

	}

}
