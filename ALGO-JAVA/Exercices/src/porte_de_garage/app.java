package porte_de_garage;

public class app {

	public static void main(String[] args) {
		
		porte_2_garage porte1 = new porte_2_garage(48, 26, 55, 2.3 , 2.5, "blanche" , false, true, true, false);
		
		boolean test10 = porte1.ouvrir();
		boolean test20 = porte1.fermer();
		boolean test30 = porte1.ouvrirPartiellement();
		boolean test40 = porte1.verrouiller();
		boolean test50 = porte1.deverrouiller();
		

	}

}
