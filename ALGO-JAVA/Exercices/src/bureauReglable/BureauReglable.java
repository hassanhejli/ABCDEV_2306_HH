package bureauReglable;

public class BureauReglable {
	
	//ATTRIBUTS
	final int hauteurMax;
	final int hauteurMin;
	private int hauteurCourante;
	private int[] position = new int[3];
	private boolean estHauteurMax;
	private boolean estHauteurMin;

	
	
	
	// CONSTRUCTEUR AVEC PARAMETRES
	BureauReglable( int _hauteurMax, int _hauteurMin, int _hauteurCourante, int _position1,
					int _position2, int _position3, boolean _estHauteurMax, boolean _estHauteurMin)
	{
		this.hauteurMax = _hauteurMax;
		this.hauteurMin = _hauteurMin;
		this.hauteurCourante = _hauteurCourante;
		this.position[0] = _position1;
		this.position[1] = _position2;
		this.position[2] = _position3;
		this.estHauteurMax = _estHauteurMax;
		this.estHauteurMin = _estHauteurMin;
	}
	
	// GETTERS
	public int get_hauteurMax()
	{
		return hauteurMax;
	}
	public int get_hauteurMin()
	{
		return hauteurMin;
	}
	public int get_hauteurCourante()
	{
		return hauteurCourante;
	}
	public int get_position1()
	{
		return position[0];
	}
	public int get_position2()
	{
		return position[1];
	}
	public int get_position3()
	{
		return position[2];
	}
	public boolean get_estHauteurMax()
	{
		return estHauteurMax;
	}
	public boolean get_estHauteurMin()
	{
		return estHauteurMin;
	}
	
	//SETTERS
	
	
	public void sethauteurCourante(int _hauteurCourante)
	{
		hauteurCourante = _hauteurCourante;
	}
	public void setestHauteurMax(boolean _estHauteurMax)
	{
		estHauteurMax = _estHauteurMax;
	}
	public void setestHauteurMin(boolean _estHauteurMin)
	{
		estHauteurMin = _estHauteurMin;
	}
	
	// METHODES
	public boolean monter(int hauteur)
	{
		if (this.hauteurCourante + hauteur < this.hauteurMax)
		{
			this.hauteurCourante = this.hauteurCourante + hauteur;
			this.estHauteurMax = false;
			return true;
		}
		else if (this.hauteurCourante + hauteur == this.hauteurMax)
		{
			this.hauteurCourante = this.hauteurCourante + hauteur;
			this.estHauteurMax = true;
			return true;
		}
		else
		{
			this.estHauteurMax = true;
			return false;
		}
	}
	
	public boolean descendre(int hauteur)
	{
		if (this.hauteurCourante + hauteur > this.hauteurMin)
		{
			this.hauteurCourante = this.hauteurCourante + hauteur;
			this.estHauteurMin = false;
			return true;
		}
		else if (this.hauteurCourante + hauteur == this.hauteurMin)
		{
			this.hauteurCourante = this.hauteurCourante + hauteur;
			this.estHauteurMin = true;
			return true;
		}
		else
		{
			this.estHauteurMin = true;
			return false;
		}
	}
	
	public boolean choisirPosition(int index)
	{
		
		if (index > 0 && index <= this.position.length)
		{
			this.hauteurCourante = position[index -1];
			return true;
		} else {
			return false;
		}
	}
	
	
	
	
	
}
