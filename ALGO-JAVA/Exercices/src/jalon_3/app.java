package jalon_3;

import java.util.Scanner;

public class app {

	/*
	 VARIABLES
	 	nombre est un entier
	 	i est un entier
	 	resultat est un entier
	 	fermetureProg est un booleen
	 	SaisieValide est un booleen
	 	saisieUtilisateur est une chaine de caractere
	 	
	 DEBUT DU PROGRAMME
	 DEBUT FAIRE TANT QUE
	 FAIRE
	 Ecrire "saisir un nombre de 1 à 10"
	 Lire nombre
	 	DEBUT SI
	 	si nombre >=1 et <= 10
	 	saisieValide <-- vrai
	 		DEBUT POUR
	 		POUR i allant de 0 à 10
	 		resultat <-- i * nombre
	 		Ecrire i, "*", nombre, "=", resultat
	 		Ecrire i * nombre = nombre
	 		FIN POUR
	 			DEBUT FAIRE TANT QUE
	 			FAIRE
	 			Ecrire "souhaitez vous afficher une autre table oui(O) ou non(N)"
	 			Lire saisieUtilisateur
	 				DEBUT SI
	 				SI saisieUtilisateur = N
	 				Alors fermetureProg = vrai
	 				Alors saisieValide = vrai
	 				sinon si saisieUtilisateur = O
	 				Alors FermetureProg = false
	 				Alors saisieValide = vrai
	 				sinon saisieValide = faux
	 				FIN SI
	 			tant que saisieValide est faux
	 	FIN SI
	 	tant que fermetureProg est faux
	FIN DU PROGRAMME
	 */
	public static void main(String[] args) {
		
		// declaration des variables
		int nombre;
		int i;
		int resultat;
		boolean fermetureProg;
		boolean saisieValide;
		String saisieUtilisateur;
		
		
		// on ouvre le scanner
		Scanner hasscan = new Scanner(System.in);
		
		
		do
			{
			
			System.out.println("Saisir un nombre entre 1 et 10");
			nombre = hasscan.nextInt();
				if (nombre >= 1 && nombre <= 10)
				{
					saisieValide = true;
					for (i=0; i<=10; i++)
					{
						resultat = i * nombre;
						System.out.println(i + " * " + nombre + " = " + resultat);
					}
						do
						{
							System.out.println("souhaitez vous afficher une autre table oui(O) ou non(N)");
							saisieUtilisateur = hasscan.next();
							if (saisieUtilisateur.equals("n") || saisieUtilisateur.equals("N"))
							{
								fermetureProg = false;
								saisieValide = true;
							}
							else if (saisieUtilisateur.equals("o") || saisieUtilisateur.equals("O"))
							{
								fermetureProg = false;
								saisieValide = true;
								System.out.println("Saisir un nombre entre 1 et 10");
								nombre = hasscan.nextInt();
									if (nombre >= 1 && nombre <= 10)
									{
										saisieValide = true;
										for (i=0; i<=10; i++)
										{
											resultat = i * nombre;
											System.out.println(i + " * " + nombre + " = " + resultat);
										}
									}
							}
							else
							{
								saisieValide = false;
							}
						}while(!saisieValide);
				}
				
			}
		while(fermetureProg = false);
			
			hasscan.close();

		}

	}
	
