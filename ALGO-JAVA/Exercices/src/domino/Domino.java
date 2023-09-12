package domino;

public class Domino {
	
	// ATTRIBUTS
	private int faceA;
	private int faceB;
	
	// constructeur par default
	
	public Domino()
	{
		faceA = 0;
		faceB = 0;
	}
	
	// constructeur avec parametres
	
	public Domino(int _faceA, int _faceB)
	{
		this.faceA = _faceA;
		this.faceB = _faceB;
	}
	
	// getters
	
	public int get_faceA()
	{
		return faceA;
	}
	public int get_faceB()
	{
		return faceB;
	}
	
	// setters
	
	public void setFaceA(int _faceA)
	{
		faceA = _faceA;
	}
	public void setFaceB(int _faceB)
	{
		faceB = _faceB;
	}
	
	//METHODES 
	
	public void affichePoints()
	{
		System.out.println("la faceA a une valeur de " + this.faceA + " points");
		System.out.println("la faceB a une valeur de " + this.faceB + " points");
	}
	
	public void valeur()
	{
		int somme = this.faceA + this.faceB;
		System.out.println(somme);
	}
	
	

	public boolean coteAcote(Domino domino2) 
	{
		boolean possible;
		if (this.faceA < this.faceB)
		{
			possible = false;
			return false;
		}
		
		else if(this.faceB < this.faceA)
		{
			possible = false;
			return false;
		}
		else if (this.faceA > this.faceB)
		{
			possible = false;
			return false;
		}
		else if (this.faceB > this.faceA)
		{
			possible = false;
			return false;
		}
		else
		{
			possible = true;
			return true;
		}

	}
	
	

}
