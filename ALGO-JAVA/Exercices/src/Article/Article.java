package Article;

public class Article {
	
	// ATTRIBUTS
	
	private String reference;
	private String designation;
	private double prixHT;
	public static double tauxTVA = 21;
	
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
		this.reference = _reference;
	}
	public void setDesignation(String _designation)
	{
		this.designation = _designation;
	}
	public void setPrixHT(double _prixHT)
	{
		this.prixHT = _prixHT;
	}
	
	
	// METHODES
	
	public double prixTTC()
	{
		double _prixTTC = this.prixHT + ((this.prixHT * tauxTVA)/100);
		return _prixTTC;
	}
	
	public String afficherArticle()
	{
		return "Reference: " + this.get_reference()
		+"\nDesignation: " + this.get_reference()
		+"\nPrixHT: " + this.get_prixHT();
		
	}
	
	

}
