package Model;

import java.io.IOException;

import Enum.Etat;

	/**
	 * 
	 * @author Abdel,Fatima,Hajar,Jude
	 * Class Joueur permettant la sélection du joueur	
	 */

public class humain {
	
	/**
	 * Attribut qui permettront par la suite de gerer les différentes méthodes utilisées par le joueur
	 */

	CuirasseFurtif cui2;
	Zodiac zod;
	SousMarin sm;
	pa pa;
	Champ Carte; 
	private String nom;

	/**
	 * Constructeur permettant d'initaliser le joueur avec la création des bateaux
	 * d'une carte 
	 * @param Nom variable permettant lors de l'initalisation de nommer le joueur
	 */

	humain(String Nom)
	{	
		this.nom=Nom;
		System.out.println("crÃ©ation du joueur "+Nom) ;

		cui1 = new cuirasse("c1");
		cui2 = new cuirasse("c2");
		zod = new zodiaque("na3na");
		sm = new sm("sous-marin");
		pa = new pa("porte avion");
		Carte = new Champ();

	}




	/**
	 * Fonction permettant de placer ses bateau, la validité de l'emplacement est gérée par la classe Champ
	 * @param bat défini le bateau voulu
	 * @param c Informe le Champ de la coordonne souhaitée par le joueur
	 * @return Si le bateau est bien placé ...
	 */

	int placer_bateau(Navire bat ,Coordonnee c)
	{
		Carte.AjoutNavire(bat, c);
		if (c.etat == Etat.Bateau)
		{
			System.out.println("Bateau Place");
		}
		
	}
	

	/**
	 * Methode permettant de tirer
	 * @param key Donne la case visée
	 * @return Retourne un résultat selon la validité du tir
	 */
	
	
	public int tir(Coordonnee key)
	{
		int veriftire;
		
		veriftire=VerificationTire(key);
		if (veriftire == 0){
		if(Carte.Tire(key)==1) 
		{
			System.out.println("Case vide touché");
			return 1; 
		}

		if(Carte.Tire(key)==0)  
		{
			System.out.println("Bateau touché");
			return 0;
		}
		}
		else return -1;

	}

		/**
		 * Methode qui verifie la validité du tir
		 * @param vc Prend en charge la coordonnée  choisit par le tir pour la vérifier
		 * @return Retourne un entier selon la validité du tir
		 */

	public int VerificationTire(Coordonnee vc)
	{
		int taillemax=10;
		int taillemin=0;
		if(vc.x>=taillemin&&vc.x<=taillemax&&vc.y>=taillemin&&vc.y<=taillemax)
		{
			//if{vc.etat==
		}
		else return(-1);								// -1 indique que les coordonnÃ© indiquer ne sont pas correct		
	}
 
		/**
		 * @return Retourne le nom du joueur
		 */

	String get_nom()
	{
		return nom;
	}



}