package Model;

import java.io.IOException;

import Enum.Etat;

	/**
	 * 
	 * @author Abdel,Fatima,Hajar,Jude
	 * Class Joueur permettant la s�lection du joueur	
	 */

public class humain {
	
	/**
	 * Attribut qui permettront par la suite de gerer les diff�rentes m�thodes utilis�es par le joueur
	 */

	CuirasseFurtif cui2;
	Zodiac zod;
	SousMarin sm;
	pa pa;
	Champ Carte; 
	private String nom;

	/**
	 * Constructeur permettant d'initaliser le joueur avec la cr�ation des bateaux
	 * d'une carte 
	 * @param Nom variable permettant lors de l'initalisation de nommer le joueur
	 */

	humain(String Nom)
	{	
		this.nom=Nom;
		System.out.println("création du joueur "+Nom) ;

		cui1 = new cuirasse("c1");
		cui2 = new cuirasse("c2");
		zod = new zodiaque("na3na");
		sm = new sm("sous-marin");
		pa = new pa("porte avion");
		Carte = new Champ();

	}




	/**
	 * Fonction permettant de placer ses bateau, la validit� de l'emplacement est g�r�e par la classe Champ
	 * @param bat d�fini le bateau voulu
	 * @param c Informe le Champ de la coordonne souhait�e par le joueur
	 * @return Si le bateau est bien plac� ...
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
	 * @param key Donne la case vis�e
	 * @return Retourne un r�sultat selon la validit� du tir
	 */
	
	
	public int tir(Coordonnee key)
	{
		int veriftire;
		
		veriftire=VerificationTire(key);
		if (veriftire == 0){
		if(Carte.Tire(key)==1) 
		{
			System.out.println("Case vide touch�");
			return 1; 
		}

		if(Carte.Tire(key)==0)  
		{
			System.out.println("Bateau touch�");
			return 0;
		}
		}
		else return -1;

	}

		/**
		 * Methode qui verifie la validit� du tir
		 * @param vc Prend en charge la coordonn�e  choisit par le tir pour la v�rifier
		 * @return Retourne un entier selon la validit� du tir
		 */

	public int VerificationTire(Coordonnee vc)
	{
		int taillemax=10;
		int taillemin=0;
		if(vc.x>=taillemin&&vc.x<=taillemax&&vc.y>=taillemin&&vc.y<=taillemax)
		{
			//if{vc.etat==
		}
		else return(-1);								// -1 indique que les coordonné indiquer ne sont pas correct		
	}
 
		/**
		 * @return Retourne le nom du joueur
		 */

	String get_nom()
	{
		return nom;
	}



}