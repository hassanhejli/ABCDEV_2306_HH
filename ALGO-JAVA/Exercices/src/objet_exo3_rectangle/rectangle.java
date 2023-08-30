package objet_exo3_rectangle;

public class rectangle {
	
	public double longueur;
	public double largeur;
	
	public rectangle(double _longueur, double _largeur)
	{
		this.longueur = _longueur;
		this.largeur = _largeur;
	}
	
	public double surface()
	{
		double surf;
		surf = (longueur * largeur);
		return surf;
	}
	
	public double perimetre()
	{
		double peri;
		peri = (longueur + largeur) *2;
		return peri;
	}
	

}
