package exemple_objet;

public class Bouteille 
	{
	
	//attributs
	private final double capaciteEnL;
	private double contenanceEnL;
	private Boolean estOuverte;
	private String marque;
		
	
		// constructeur par default
		public Bouteille()
		{
			marque = " ";
			contenanceEnL = 0.9;
			capaciteEnL = 1;
			estOuverte = true;
		}
		
		// constructeur avec parametres
		public Bouteille (String _marque, double _capaciteEnL, double _contenanceEnL, boolean _estOuverte)
		{
			this.marque = _marque;
			this.contenanceEnL = _contenanceEnL;
			this.capaciteEnL = _capaciteEnL;
			this.estOuverte = _estOuverte;
		}	
		
		
		public boolean ouvrir()
		{
			if (!this.estOuverte)
			{
				this.estOuverte = true;
				System.out.println("ouvrez la bouteille");
				return true;
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
				System.out.println("fermez la bouteille");
						return true;
			}
			else 
			{
				return false;
			}
		}
		
		
		public boolean vider()
		{
			boolean estRempli;
			
			if (this.contenanceEnL < this.capaciteEnL/2)
			{
				estRempli = false;
				System.out.println("veuillez remplir la bouteille");
				return estRempli;
			}
			else 
			{
				return true;
			}
		}
		
		public boolean remplir(double quantiteEnL)
		{
			double plein = quantiteEnL + capaciteEnL;
			
			
			if (this.estOuverte)
			{
				if (plein <= capaciteEnL)
				{
					this.contenanceEnL = plein;
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
