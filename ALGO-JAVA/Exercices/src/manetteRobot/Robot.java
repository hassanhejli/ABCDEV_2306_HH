package manetteRobot;

public class Robot 
{

	// ATTRIBUTS
	
	private int force, vitesseMarche, vitesseRotation;
	private double posX, posY, angle;
	public enum Action
	{
		detruire, attaquer, multiplierForce, multiplierVitesse, avancer, reculer, tournerGauche, tournerDroite
	}
	
	// CONSTRUCTEUR
	
	public Robot (int _force, int _vitesseMarche, int _vitesseRotation)
	{
		this.force = _force;
		this.vitesseMarche = _vitesseMarche;
		this.vitesseRotation = _vitesseRotation;
		this.posX = 0;
		this.posY = 0;
		this.angle = 0;
		
	}
	
	public boolean action (Action _action)
	{
		switch (_action)
		{
		case detruire:
			return destruction(false);
		
		case attaquer:
			return attaque(true);
			
		case multiplierForce:
			return XForce(true);
		
		case multiplierVitesse:
			return Xvitesse(true);
			
		case avancer:
			return marcher(1);
			
		case reculer:
			return marcher(-1);
			
		case tournerGauche:
			return tourner(1);
			
		case tournerDroite:
			return tourner(-1);
			
		default:
			return false;
		}		
	}
	
	public boolean marcher (int _avantArriere) // le parametre definit si le robot avance (1) o u recule (-1)
	{
		if (_avantArriere > 0)
		{
			this.posX = this.posX + vitesseMarche * Math.cos((this.angle * Math.PI) / 180);
			this.posX = Math.round(this.posX * 100) / 100d;
			this.posY = this.posY + vitesseMarche * Math.sin((this.angle * Math.PI) / 180);
			this.posY = Math.round(this.posY * 100) / 100d;
			return true;
		}
		else if (_avantArriere < 0)
		{
			this.posX = this.posX - vitesseMarche * Math.cos((this.angle * Math.PI) / 180);
			this.posX = Math.round(this.posX * 100) / 100d;
			this.posY = this.posY - vitesseMarche * Math.sin((this.angle * Math.PI) / 180);
			this.posY = Math.round(this.posY * 100) / 100d;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public boolean tourner ( int _sens) // le parametre definit si le robot tourne a gauche (1) ou  a droite (-1)
	{
		if (_sens > 0)
		{
			this.angle += vitesseRotation;
		}
		else if (_sens < 0)
		{
			this.angle -= vitesseRotation;
		}
		else
		{
			return false;
		}
		
		if(this.angle >= 360)
		{
			this.angle -= 360;
		}
		else if (this.angle <= 360)
		{
			this.angle += 360;
		}
		return true;
	}
	
	public boolean destruction (boolean destroy)
	{
		if (this.force >= 5)
		{
			destroy = true;
			return true;
		}
		else
		{
			destroy = false;
			return false;
		}
	}
	
	public boolean attaque(boolean attack)
	{
		if (attack = true)
		{
			this.force = this.force + 1;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean XForce(boolean forceMultiple)
	{
		if (forceMultiple = true)
		{
			this.force = this.force +1;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean Xvitesse (boolean vitesseMultiple)
	{
		if (vitesseMultiple = true)
		{
			this.vitesseMarche = this.vitesseMarche + 1;
			this.vitesseRotation = this.vitesseRotation + 1;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int get_force()
	{
		return force;
	}
	
	
	
}
