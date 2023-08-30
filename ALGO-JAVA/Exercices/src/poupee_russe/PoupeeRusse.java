package poupee_russe;

public class PoupeeRusse {
	
	// attributs
	public int taille;
	boolean estOuverte;
	boolean estFermee;
	boolean estDansPoupee;
	boolean contientPoupee;
	public boolean peutSouvrir;
	public boolean peutSeFermer;
	public boolean peutContenir;
	public boolean peutEtreContenue;
	
	
	// constructeur
	public PoupeeRusse(int _taille, boolean _estOuverte,  boolean _estDansPoupee, boolean _contientPoupee, boolean _estFermee, 
					boolean _peutSouvrir, boolean _peutSeFermer, boolean _peutContenir, Boolean _peutEtreContenue)
	{
		this.taille = _taille;
		this.estOuverte = _estOuverte;
		this.estFermee = _estFermee;
		this.estDansPoupee = _estDansPoupee;
		this.contientPoupee = _contientPoupee;
		this.peutSouvrir = _peutSouvrir;
		this.peutSeFermer = _peutSeFermer;
		this.peutContenir = _peutContenir;
		this.peutEtreContenue = _peutEtreContenue;
		
	}
	
	// methodes
	
	public boolean ouvrir()
	{
		
		if (this.estFermee && !this.estDansPoupee)
		{
			this.peutSouvrir = true;
			return true;
		}
		else
		{
			this.peutSouvrir = false;
			return false;
		}
	}
	
	public boolean fermer()
	{
		if (this.estOuverte && !this.estDansPoupee)
		{
			this.peutSeFermer = true;
			return true;
		}
		else
		{
			this.peutSeFermer = false;
			return false;
		}
	}
	
	public boolean placerDans(PoupeeRusse poupeeRusse, PoupeeRusse p)
	{
		if (poupeeRusse.taille< p.taille)
		{
			if (poupeeRusse.estFermee && !poupeeRusse.estDansPoupee && p.estOuverte && !p.contientPoupee)
			{
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
	
	
	public boolean sortirDe(PoupeeRusse poupeeRusse, PoupeeRusse p)
	{
		if (p.estOuverte && poupeeRusse.taille < p.taille)
		{
			if (poupeeRusse.estDansPoupee)
			{
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
	

}
