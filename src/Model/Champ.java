package Model;

/**
 * @version 1.3
 * @author Abdel, Fatimaezzahra, Hajar, Jude;
 */

import java.util.ArrayList;
import java.util.HashMap;

public class Champ {
																			// création du hashmap ( la grille )
	HashMap<Navire,Coordonnee> leChamp =new HashMap<Navire, Coordonnee>(); 	// Un navire à plusieurs coordonnee
	ArrayList<Coordonnee> lesTire = new ArrayList<Coordonnee>();
	
	public Champ()
	{	
		// création du hashmap ( la grille )
HashMap<Navire,Coordonnee> leChamp =new HashMap<Navire, Coordonnee>(); 	// Un navire à plusieurs coordonnee
ArrayList<Coordonnee> lesTire = new ArrayList<Coordonnee>();


	}
	
	public int PositionNavire(Navire pn,Coordonnee nc)
	{
		int verifnav,i;							//déclaration des variables
		verifnav=VerificationNavire(nc, pn);	//vérification des position donné par l'utilisatateur
		if(verifnav==0)
		{
			i=AjoutNavire(pn,nc);
			return(i);
		}
		else return(verifnav);					//erreur liée a la vérification
	}
	
	public int AjoutNavire(Navire an,Coordonnee ac)
	{
		int i;
		ac.etat=1;						//modification de l'obj coord. on lui ajoute un bateau
		leChamp.put(an,ac);				// insertion dans le hashmap de l'entete du bateau
		for(i=0;i>=an.taille;i++)			//insertion pour le reste du bateau
		{
			if (an.horizontal) 				
			{
				ac.x=ac.x+1;
			}
			else ac.y++;
			leChamp.put(an, ac);
		}
		return i;
	}
	
	public int Tire(Coordonnee tc)
	{
		int veriftire;
		boolean verifcont;
		
		veriftire=VerificationTire(tc);
		if(veriftire==0)
		{
			verifcont=leChamp.containsKey(tc);
			if(verifcont) return (0);			// indique qu'il y a un objet a la position donné
			else return (1);					// indique que aucun objet ce trouve a cette emplacement mais le tire sera effectué
		}
		else return(veriftire+100);				// indique que le tire n'a pas fonctionner a cause de la verification
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
				return(1);								// 0 indique qu'il n'y a aucun soucis sur le tire
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
		else return(-1);								// -4 indique que les coordonné indiquer ne sont pas correct		
	}
	
	public int VerificationNavire(Coordonnee vnc,Navire vnn)
	{
		int taillemax=10;
		int taillemin=0;
		int Rtaillemax=(taillemax-vnn.taille)+1;
		if(vnn.horizontal)
		{
			if(vnc.x>=taillemin&&vnc.x<=Rtaillemax&&vnc.y>=taillemin&&vnc.y<=taillemax)
			{
				if(vnc.etat==-1)
				{
					vnc.etat=1;
					return(0);								// 0 indique qu'il n'y a aucun soucis sur le tire
				}
				else return(-3);							// -3 indique que le tire essayer a déjà été essayer
			}
			else return(-6);								// -1 indique que les coordonné indiquer ne sont pas correct	
		}
		else
		{
			if(vnc.x>=taillemin&&vnc.x<=taillemax&&vnc.y>=taillemin&&vnc.y<=Rtaillemax)
			{
				if(vnc.etat==-1)
				{
					vnc.etat=1;
					return(0);								// 0 indique qu'il n'y a aucun soucis sur le tire
				}
				else return(-3);							// -3 indique que le tire essayer a déjà été essayer
			}
			else return(-5);								// -1 indique que les coordonné indiquer ne sont pas correct	
		}
	}
	
} //endprog
