package geometry;

public class cercle {
	
	double centre;
	double point;
	
	public cercle (double _point, double _centre)
	{
		this.centre = _centre;
		this.point = _point; 
	}
	

	public double perimetre()
	{
		double pie = 3.14;
		double rayon = 5;
		double peri = (2 * pie * rayon);
		return peri;
	}
	
	public double surface()
	{
		double pie = 3.14;
		double rayon = 5;
		double surf = (2 * rayon) * pie;
		return surf;
	}
	
	public boolean testAppartenance()
	{
		double dx = 0;
		double dy = 0;
		double distance;
		boolean appartient = false;
		if (dx < (point - centre))
		{
			appartient = true;
			return appartient;
			
		}
		else 
		{
			appartient = false;
		}
		return appartient;
	}
}
