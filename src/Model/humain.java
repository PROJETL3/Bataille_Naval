package Model;

import java.io.IOException;

public class humain {


	cuirasse cui2;
	zodiaque zod;
	sm sm;
	pa pa;
	Champ Carte; 
	private String nom;



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






	int placer_bateau(Navire bat ,Coordonnee c)
	{
		Carte.AjoutNavire(bat, c);
		return false;
	}


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


	public int VerificationTire(Coordonnee vc)
	{
		int taillemax=10;
		int taillemin=0;
		if(vc.x>=taillemin&&vc.x<=taillemax&&vc.y>=taillemin&&vc.y<=taillemax)
		{
			if(vc.etat==1)
			{
				vc.etat=2;
				return(1);								// 1 indique qu'il n'y a aucun soucis sur le tire
			}
			else
			{
				if(vc.etat==-1)
				{
					vc.etat=-2;
					return(0);								// 0 indique qu'il n'y a aucun soucis sur le tire
				}
				return(-2);							// -2 indique que le tire essayer a déjà été essayer

			}
		}
		else return(-1);								// -1 indique que les coordonné indiquer ne sont pas correct		
	}


	String get_nom()
	{
		return nom;
	}



}