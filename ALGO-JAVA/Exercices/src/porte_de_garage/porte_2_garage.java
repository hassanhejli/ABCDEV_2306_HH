package porte_de_garage;

public class porte_2_garage {
	
	//attributs
	
	private final String marque;
	private final int degreMax;
	private final int degreMin;
	private int degreOuverture;
	private boolean estOuverte;
	private boolean estVerrouiller;
	
	
	// constructeur par default
	public porte_2_garage()
	{
		marque = " ";
		degreMax = 45;
		degreMin = 15;
		degreOuverture = 30;
		estOuverte = true;
		estVerrouiller = false;
	}
	
	public porte_2_garage(String _marque, int _degreMax, int _degreMin, int _degreOuverture,
							boolean _estOuverte , boolean _estVerrouiller)
			
	{
		this.marque = _marque;
		this.degreMax = _degreMax;
		this.degreMin = _degreMin;
		this.degreOuverture = _degreOuverture;
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
		if (this.estOuverte && !this.estVerrouiller)
		{
			this.estOuverte = false;
					return false;
		}
		else 
		{
			return true;
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
