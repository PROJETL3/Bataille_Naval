package Model;

/**
 * @version 1.4
 * @author Abdel, Fatimaezzahra, Hajar, Jude;
 */

import java.util.HashMap;
import Enum.Etat;

public class Champ {
																		
	// création du hashmap ( la grille )
	public HashMap<Navire,Coordonnee> leChamp =new HashMap<Navire, Coordonnee>(); 	// Un navire à plusieurs coordonnee
	//  public ArrayList<Coordonnee> lesTire = new ArrayList<Coordonnee>();  dans la classe navire
	public final int longueur_champ;
	public final int largeur_champ;
	public Champ(int lo,int la)
	{	
		this.longueur_champ=lo;
		this.largeur_champ=la;
	}
	/**
	 *  Permet d'ajouter un navire 
	 * @param pn   // On a un navire précis a placer
	 * @param nc	// on a les coordonnée de l'entete
	 * @return		// on retourne Vrai si la fonciton c'est bien déroulé
	 */
	public boolean PositionNavire(Navire pn,Coordonnee nc) // positionner un navire
	{
		boolean verifnav, i;							//déclaration des variables
		verifnav=VerificationNavire(nc, pn);	//vérification des position donné par l'utilisatateur
		if(verifnav==true)
		{
			i=AjoutNavire(pn,nc);
			return(i);
		}
		else return(verifnav);					//erreur liée a la vérification
	}
	/**
	 * Ajout du navire dans le hashmap	
	 * @param an	prend en parametre le navire en question
	 * @param ac	avec le coordonnée de l'entete
	 * @return		Vrai si la fonction c'est bien déroulé
	 */
	public boolean AjoutNavire(Navire an,Coordonnee ac)
	{
		int i;
		ac.etat=Etat.Bateau;						//modification de l'obj coord. on lui ajoute un bateau
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
		return true;
	}
	/**
	 *   cette fonction tire la coordonnée donnée
	 * @param tc	la coordonnée en question	
	 * @return	retourne vrai si la fonction c'est bien déroulé
	 */
	public boolean Tire(Coordonnee tc)
	{
		Etat veriftire;
		boolean verifcont;
		
		veriftire=VerificationTire(tc);
		if(veriftire==Etat.Bateau)
		{
			verifcont=leChamp.containsKey(tc);
			if(verifcont) return (true);			// indique qu'il y a un objet a la position donné
			else return (false);					// indique que aucun objet ce trouve a cette emplacement mais le tire sera effectué
		}
		else return(false);				// indique que le tire n'a pas fonctionner a cause de la verification
	}
	/**
	 * 	verifie les coordonné du tire
	 * @param vc	les coordonnée en question
	 * @return		retourne l'état de la coordonnée
	 */
	public Etat VerificationTire(Coordonnee vc)
	{
		int taillemin=0;
		if(vc.x>=taillemin&&vc.x<=this.longueur_champ&&vc.y>=taillemin&&vc.y<=this.largeur_champ)
		{
			if(vc.etat==Etat.Bateau)
			{
				return(Etat.Bateau);								// 0 indique qu'il n'y a aucun soucis sur le tire
			}
			else
			{
				if(vc.etat==Etat.TiresurRien)
				{
					return(Etat.TiresurRien);								// 0 indique qu'il n'y a aucun soucis sur le tire
				}
				return(Etat.Rien);							// -2 indique que le tire essayer a déjà été essayer
					
			}
		}
									// -4 indique que les coordonné indiquer ne sont pas correct		
		else return(null);
	}
	/**
	 * 		Verifie si le navire peut être positionner
	 * @param vnc	les coordonnée de l'entete de la position
	 * @param vnn	le navire en question
	 * @return		retourne vrai si la fonction se déroule sans probleme
	 */
	public boolean VerificationNavire(Coordonnee vnc,Navire vnn)
	{
		int taillemin=0;
		int Rtaillemax=(this.longueur_champ-vnn.taille)+1;
		if(vnn.horizontal)
		{
			if(vnc.x>=taillemin&&vnc.x<=Rtaillemax&&vnc.y>=taillemin&&vnc.y<=this.largeur_champ)
			{
				if(vnc.etat==Etat.Rien)
				{
					return(true);								// 0 indique qu'il n'y a aucun soucis sur le tire
				}
				else return(false);							// -3 indique que le tire essayer a déjà été essayer
			}
			else return(false);								// -1 indique que les coordonné indiquer ne sont pas correct	
		}
		else
		{
			if(vnc.x>=taillemin&&vnc.x<=this.longueur_champ&&vnc.y>=taillemin&&vnc.y<=Rtaillemax)
			{
				if(vnc.etat==Etat.Rien)
				{
					return(true);								// 0 indique qu'il n'y a aucun soucis sur le tire
				}
				else return(false);							// -3 indique que le tire essayer a déjà été essayer
			}
			else return(false);								// -1 indique que les coordonné indiquer ne sont pas correct	
		}
	}
	
} //endprog
