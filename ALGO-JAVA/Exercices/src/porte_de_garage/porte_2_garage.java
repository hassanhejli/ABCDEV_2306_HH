package porte_de_garage;

public class porte_2_garage {
	
	//attributs
	
	final int degreMax;
	final int degreMin;
	public int degreOuverture;
	public double largeurEnM;
	public double longueurEnM;
	public String couleur;
	public boolean electrique;
	public boolean sectionnelle;
	public boolean estOuverte;
	public boolean estVerrouiller;
	
	
	// constructeur par default
	public porte_2_garage()
	{
		degreMax = 45;
		degreMin = 15;
		degreOuverture = 30;
		largeurEnM = 2.3;
		longueurEnM = 2.5;
		couleur = " ";
		electrique = true;
		sectionnelle = false;
		estOuverte = false;
		estVerrouiller = true;
	}
	
	public porte_2_garage(int _degreMax, int _degreMin, int _degreOuverture, double _largeurEnM , double _longueurEnM , String _couleur ,
							boolean _electrique , boolean _sectionnelle ,
							boolean _estOuverte , boolean _estVerrouiller)
			
	{
		this.degreMax = _degreMax;
		this.degreMin = _degreMin;
		this.degreOuverture = _degreOuverture;
		this.largeurEnM = _largeurEnM;
		this.longueurEnM = _longueurEnM;
		this.couleur = _couleur;
		this.electrique = _electrique;
		this.sectionnelle = _sectionnelle;
		this.estOuverte = _estOuverte;
		this.estVerrouiller = _estVerrouiller;
		
	}
	
	public boolean ouvrir()
	{
		if (!this.estOuverte && !this.estVerrouiller)
		{
			this.estOuverte = true;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean ouvrirPartiellement()
	{
		if (!this.estOuverte && !this.estVerrouiller)
		{
			if (this.degreMin < this.degreOuverture && this.degreOuverture < this.degreMax)
				{
				this.estOuverte = true;
				return true;
				}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	
	public boolean fermer()
	{
		if (this.estOuverte)
		{
			this.estOuverte = false;
					return true;
		}
		else 
		{
			return false;
		}
	}
	
	public boolean verrouiller()
	{
		if (!this.estOuverte && !this.estVerrouiller)
		{
			this.estVerrouiller = true;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean deverrouiller()
	{
		if (!this.estOuverte && this.estVerrouiller)
		{
			this.estVerrouiller = false;
					return true;
		}
		else 
		{
			return false;
		}
	}
	

	
	
}
