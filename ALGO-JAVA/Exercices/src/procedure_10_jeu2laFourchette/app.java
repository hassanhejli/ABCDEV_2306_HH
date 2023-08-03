package procedure_10_jeu2laFourchette;

import java.util.Random;
import java.util.Scanner;

public class app {

	
	public static int nbAleatoire(int nbMin, int nbMax)
	{
		int nombre;
		Random rand = new Random();
		nombre = rand.nextInt(nbMin , nbMax);
		return nombre;
	}
	
	
	
	/*
	 FONCTION entier nbAleatoire(entier min, entier max)
	entier nombre
	nombre <-- est generer aleatoirement
	retourner nombre
Fin Fonction
VARIABLES
	nombreMystere est un entier
	nbJoueur est un entier
	nbOrdi est un entier
	max est un entier
	min est un entier
	essai est un entier
CONSTANTE
	nbEssaiMax = 6

DEBUT DU PROGRAMME
	essai <-- 0
	min <-- 0
	max <-- 100
	nombreMystere <-- nbAleatoire(min,max)
	Debut boucle
	tant que nombreMystere est different de nbJoueur 
				ET nombreMystere est different de nbOrdi 
				ET essai est infèrieur à nbEssaiMax
	Faire
		Ecrire "Saisir un nombre entre ", min," et ",max
		Lire nbJoueur
		nbOrdi <-- nbAleatoire(min,max)
		essai++
		Debut si
			si nbJoueur egale nombreMystere
				Ecrire "Le joueur humain à gagner en ",essai
			sinon
				Debut si
					si nbJoueur < nombreMystere
						Ecrire "C'est plus"
						min <-- nbJoueur
					Sinon
						Ecrire "C'est moins"
						max <-- nbJoueur+1
				Fin SI
		Fin Si
		Debut Si
			si nbOrdi egale nombreMystere
				Ecrire "L'ordi à gagner en ",essai
			sinon
				Debut Si
					si nbOrdi > nombreMystere
						Ecrire "Le nombre choisit par l'ordi est trop grand"
						Debut si 
							Si max > nbOrdi
							max <-- nbOrdi 
						Fin Si
					Sinon
						Ecrire "Le nombre choisit par l'ordi est trop petit"
						Debut Si
							Si min < nbOrdi
							min <-- nbOrdi 
						Fin Si
					Fin Si
		Fin Si
	Fin tant que
	Debut Si 
		Si essai egale nbEssaiMax
			Debut Si
				Si nombreMystere different de nbJoueur
				Ecrire "Le joueur humain a perdu"
			Fin Si
			Debut Si
				Si nombreMystere different de nbOrdi
				Ecrire "L'ordi a perdu
			Fin si
	Fin Si
Fin du programme
	 */
	
	public static void main(String[] args) {
		
		// declaration variable
		int nombreMystere, nbJoueur = 0, nbOrdi = 0, max, min, essai;
		
		// declaration constante
		int nbEssaiMax = 6;
		
		// ouverture scanner
		Scanner hasscan = new Scanner(System.in);
		
		essai = 0;
		min = 0;
		max = 100;
		nombreMystere = nbAleatoire(min,max);
		
		
		while (nombreMystere != nbJoueur && nombreMystere != nbOrdi && essai < nbEssaiMax)
		{
			System.out.println("saisir un nombre entre " + min + " et " + max);
			nbJoueur = hasscan.nextInt();
			nbOrdi = nbAleatoire(min,max);
			System.out.println(nbOrdi);
			essai ++;
			
			if (nbJoueur == nombreMystere)
			{
				System.out.println("Le joueur humain à gagner en "+ essai);
			}
			else
			{
				if (nbJoueur < nombreMystere)
				{
					System.out.println(" c'est plus ");
					min = nbJoueur;
				}
				else
				{
					System.out.println("c'est moins");
					max = nbJoueur+1;
				}
			}
			
			if (nbOrdi == nombreMystere)
			{
				System.out.println("L'ordi à gagner en "+ essai);
			}
			else
			{
				if (nbOrdi > nombreMystere)
				{
					System.out.println("Le nombre choisit par l'ordi est trop grand");
					if (max > nbOrdi)
					{
						max = nbOrdi;
					}
				}
				else 
				{
					System.out.println("Le nombre choisit par l'ordi est trop petit");
					if (min <nbOrdi)
					{
						min = nbOrdi;
					}
				}
			}
		}
		
		if (nombreMystere != nbJoueur)
		{
			System.out.println("Le joueur humain a perdu");
		
		
		if (nombreMystere != nbOrdi)
		{
			System.out.println("L'ordi a perdu");
		}
		}
	
		
		// fermeture scanner
		hasscan.close();
		

	}

}
