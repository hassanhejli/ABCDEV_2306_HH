package Article;

public class Article {
	
	// ATTRIBUTS
	
	private String reference;
	private String designation;
	private double prixHT;
	public final int tauxTVA = 21;
	
	// CONSTRUCTEUR PAR DEFAULT
	
	public Article()
	{
		reference = "";
		designation = "";
		prixHT = 0;
	}
		
	
	// CONSTRUCTEUR AVEC PARAMETRES
	
	public Article(String _reference, String _designation, double _prixHT)
	{
		this.reference = _reference;
		this.designation = _designation;
		this.prixHT = _prixHT;
		
	}
	
	// GETTERS
	
	public String get_reference()
	{
		return reference;
	}
	public String get_designation()
	{
		return designation;
	}
	public double get_prixHT()
	{
		return prixHT;
	}
	
	// setters
	
	public void setReference(String _reference)
	{
		reference = _reference;
	}
	public void setDesignation(String _designation)
	{
		designation = _designation;
	}
	public void setPrixHT(double _prixHT)
	{
		prixHT = _prixHT;
	}
	
	public void prixTTC()
	{
		double _prixTTC = this.prixHT + ((this.prixHT * tauxTVA)/100);
		System.out.println(_prixTTC);
	}
	
	public void afficherArticle()
	{
		System.out.println(this.designation + " " + this.reference + " " + this.prixHT);
	}
	
	

}
