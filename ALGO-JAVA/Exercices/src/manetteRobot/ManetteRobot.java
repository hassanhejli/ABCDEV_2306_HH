package manetteRobot;

import manetteRobot.Robot.Action;

public class ManetteRobot 
{
	
	// ATTRIBUTS
	
	private Robot terminator;
	private boolean boutonStart;
	private boolean boutonReset;
	public enum Bouton
	{
		boutonA, boutonB, boutonX, boutonY, flecheHaut, flecheBas, flecheGauche, flecheDroite
	}
	
	// CONSTRUCTEUR
	
	public ManetteRobot ( Robot _terminator, boolean _boutonStart, boolean _boutonReset)
	{
		this.terminator = _terminator;
		this.boutonStart = _boutonStart;
		this.boutonReset = _boutonReset;
	}
	
	
	
	// ON ASSOCIE CHAQUE BOUTON A UNE FONCTION DU ROBOT
	
	public boolean commande (Bouton _Bouton)
	{
		switch(_Bouton)
		{
		case boutonA:
			terminator.action(Action.detruire);
			
		case boutonB:
			terminator.action(Action.attaquer);
			
		case boutonX:
			terminator.action(Action.multiplierForce);
			
		case boutonY:
			terminator.action(Action.multiplierVitesse);
		
		case flecheHaut:
			terminator.action(Action.avancer);
			
		case flecheBas:
			terminator.action(Action.reculer);
			
		case flecheGauche:
			terminator.action(Action.tournerGauche);
			
		case flecheDroite:
			terminator.action(Action.tournerDroite);
			
		default:
			return false;
		}
		
	}
	
}
