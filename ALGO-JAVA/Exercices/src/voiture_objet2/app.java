package voiture_objet2;

public class app {

	public static void main(String[] args) {
		
		voiture_exo2_objet maGov = new voiture_exo2_objet("mercedes", 89990);
		
		double test1 = maGov.afficher();
		
		maGov.setMarque("audi");
		
		String test2 = maGov.affiche();
		

	}

}
