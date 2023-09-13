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
	
	// GETTERS
	
	public int get_force()
	{
		return force;
	}
	public int get_vitesseMarche()
	{
		return vitesseMarche;
	}
	public int get_vitesseRotation()
	{
		return vitesseRotation;
	}
	
	// SETTERS
	
	public void setForce(int _force)
	{
		force = _force;
	}
	public void setVitesseMarche(int _vitesseMarche)
	{
		vitesseMarche = _vitesseMarche;
	}
	public void setVitesseRotation(int _vitesseRotation)
	{
		vitesseRotation = _vitesseRotation;
	}
	
	// fonction qui retourne une fonction pour chaque variable de l'enum
	
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
	
	// fonction pour faire avancer ou reculer le robot
	
	public boolean marcher (int _avantArriere) 
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
	
	// fonction pour faire tourner gauche ou droite le robot 
	
	public boolean tourner ( int _sens) 
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
	
	// fonction pour detruire l'adversaire
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
	
	// fonction pour attaquer qui augmente la valeur du robot
	
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
	
	// fonction pour multiplier la force du robot
	
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
	
	// fonction pour multiplier la vitesse du robot
	
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
	
	
	
}
