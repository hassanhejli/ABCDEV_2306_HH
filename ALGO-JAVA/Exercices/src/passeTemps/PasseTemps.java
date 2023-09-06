package passeTemps;

public class PasseTemps {

	// attributs
	private String horloge;
	private int heure;
	private int minute;
	private int seconde;
	private boolean alarme;
	private boolean sonnerie;
	

// constructeur par default
public PasseTemps()
{
	horloge = "";
	heure = 00;
	minute = 00;
	seconde = 00;
	alarme = true;
	sonnerie = false;
	
}

// constructeur avec parametres
public PasseTemps(String _horloge, int _heure, int _minute, int _seconde, boolean _alarme, boolean _sonnerie)
{
	this.horloge = _horloge;
	this.heure = _heure;
	this.minute = _minute;
	this.seconde = _seconde;
	this.alarme = _alarme;
	this.sonnerie = _sonnerie;
}

// accesseurs
public String get_horloge()
{
	return horloge;
}
public int get_heure()
{
	return heure;
}

public int get_minute()
{
	return minute;
}
public int get_seconde()
{
	return seconde;
}
public boolean get_alarme()
{
	return alarme;
}
public boolean get_sonnerie()
{
	return sonnerie;
}

//mutateurs
public void sethorloge(String _horloge)
{
	horloge = _horloge;
}
public void setheure(int _heure)
{
	heure = _heure;
}
public void setminute(int _minute)
{
	minute = _minute;
}
public void setseconde(int _seconde)
{
	seconde = _seconde;
}
public void setalarme(boolean _alarme)
{
	alarme = _alarme;
}
public void setsonnerie(boolean _sonnerie)
{
	sonnerie = _sonnerie;
}

//methodes

public boolean sonnerieNouvelleHeure()
{
	if (this.heure < 23 && this.minute == 59 && this.seconde == 59)
	{
		this.heure = this.heure + 1;
		this.minute = 00;
		this.seconde = 00;
		this.sonnerie = true;
		return true;
	}
	else if (this.heure == 23 && this.minute == 59 && this.seconde == 59)
	{
		this.heure = 00;
		this.minute = 00;
		this.seconde = 00;
		this.sonnerie = true;
		return true;
	}
	else
	{
		this.sonnerie = false;
		return false;
	}
}
	
	public boolean nouvelleMinute()
	{
		if (this.minute < 59 && this.seconde == 59)
		{
			this.minute = this.minute + 1;
			this.seconde = 00;
			return true;
		}
		else if (this.minute == 59 && this.seconde == 59)
		{
			this.minute = 00;
			this.seconde = 00;
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
public boolean nouvelleSeconde()
{
	if (this.seconde < 59)
	{
		this.seconde = this.seconde + 1;
		return true;
	}
	else if (this.seconde == 59)
	{
		this.seconde = 00;
		return true;
	}
	else 
	{
		return false;
	}
}

public void quelleHeureEstIl()
{
	String ilEst = this.heure + " " +  this.minute + " " + this.seconde ;
	System.out.println(ilEst);
}





}