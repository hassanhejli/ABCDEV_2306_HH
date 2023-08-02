package procedure_7;

public class app {
	
	public static void pourcentage(double cb, double ch, double va)
	{
		System.out.println("Nombre de paiement par carte Bleu: " + cb);
		System.out.println("Nombre de paiement par chèque émis: " + ch);
		System.out.println("Nombre de paiement par virement automatique: " + va);
		
		double total;
		total = cb + ch +va;
		cb = (cb/total)*100;
		ch = (ch/total)*100;
		va = (va/total)*100;
		
		System.out.println("Vous avez emis " + cb);
		
		
	}

	public static void main(String[] args) {
	

	}

}
