package CompteBancaire;

public class compteBancaire {
	
	public Double solde;
	
	public compteBancaire(double _solde)
	{
		this.solde = _solde;
	}

	public double deposer()
	{
		double depot = 200;
		solde = solde + depot;
		return solde;
	}
	
	public double retirer()
	{
		double retrait = 50;
		solde = solde - retrait;
		return solde;
	}
	
	public double afficher()
	{
		System.out.println(solde);
		return solde;
	}

}
