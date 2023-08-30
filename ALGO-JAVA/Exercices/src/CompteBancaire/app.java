package CompteBancaire;

public class app {

	public static void main(String[] args) {
		
		
		
		compteBancaire comptePriv = new compteBancaire(1852.36);
		
		double test3 = comptePriv.afficher();
		double test1 = comptePriv.retirer();
		double test2 = comptePriv.deposer();
		

	}

}

