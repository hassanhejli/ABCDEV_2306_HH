package Article;

public class app {

	public static void main(String[] args) {
		
		Article sucre = new Article("146ZB2" , "1 kilo de sucre en morceau Beghin", 1.96);
		Article ravioli = new Article("36AZ25", "boite 850g ravioli", 2.36);
		
		sucre.prixTTC();
		ravioli.prixTTC();
		sucre.afficherArticle();
		ravioli.afficherArticle();
		
		sucre.get_prixHT();
		ravioli.get_designation();
		sucre.get_reference();
		
		

	}

}
