package voiture_objet2;

public class voiture_exo2_objet {
	
	public String marque;
	public double prix;
	
	public voiture_exo2_objet()
	{
		marque = " ";
		prix = 27899;
		
	}
	
	public voiture_exo2_objet(String _marque, double _prix)
	{
		this.marque = _marque;
		this.prix = _prix;
		
	}
	
	public String getMarque()
	{
		return marque;
	}

	public double getPrix()
	{
		return prix;
	}
	
	public void setMarque(String _marque)
	{
		marque = _marque;
	}
	
	public void setPrix(double _prix)
	{
		prix = _prix;
	}
	
	public double afficher()
	{
		return prix;
	}
	
	public String affiche()
	{
		return marque;
	}
	
}
