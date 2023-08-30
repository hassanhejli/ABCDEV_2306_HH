package exemple_objet;


public class app {
	
	

	public static void main(String[] args) {
		
		Bouteille cristaline = new Bouteille("cristaline" , 1.25 , 1.5 , true);
		
		
		boolean test1 = cristaline.fermer();
		boolean test2 = cristaline.ouvrir();
		boolean test3 = cristaline.fermer();
		boolean test4 = cristaline.remplir(0.5);
		boolean test5 = cristaline.vider();
		boolean test6 = cristaline.remplir(1);
		
		Bouteille coca = new Bouteille("coca cola" , 1.5 , 1.5, false);
		
		boolean test7 = coca.remplir(1.5);
		boolean test8 = coca.vider();
		
	}

}
