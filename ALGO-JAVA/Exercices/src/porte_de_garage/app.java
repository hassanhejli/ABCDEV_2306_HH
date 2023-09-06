package porte_de_garage;

public class app {

	public static void main(String[] args) {
		
		porte_2_garage porte1 = new porte_2_garage("Leroy Merlin", 45, 15, 30, true, false);
		porte_2_garage porte2 = new porte_2_garage("Ikea", 100, 15, 80, false, false);
		
		boolean test10 = porte1.ouvrir();
		boolean test1 = porte2.ouvrir();
		boolean test20 = porte1.fermer();
		boolean test2 = porte2.fermer();
		boolean test40 = porte1.verrouiller();
		boolean test50 = porte1.deverrouiller();
		boolean test30 = porte1.ouvrirPartiellement();
		boolean test4 = porte2.verrouiller();
		boolean test5 = porte2.deverrouiller();
		boolean test3 = porte2.ouvrirPartiellement();
		
		
	}

}
