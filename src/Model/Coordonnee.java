package Model;

import Enum.Etat;

/**
 * @version 2.1
 * @author Abdel, Fatimaezzahra, Hajar, Jude;
 */
public class Coordonnee {
    
    public int x;	// coordonnee x
    public int y;	// coordonnee y
    //int etat; 		// -1 rien , -2 tire sur rien, 1 bateau, 2 tire sur bateau
    Etat etat;
    
    public Coordonnee(int X,int Y,int T)
    {
        this.x=X;
        this.y=Y;
        this.etat=Etat.Rien;		// de base la coordonnee à rien càd la case est créate avec rien dedans (pas de bateau ni de tire)
    }
    
    public int getX()
    {
    	return this.x ;
    }

    public int getY()
    {
    	return this.y;
    }
    
    public Etat getEtat()
    {
    	return(this.etat);
    }
    
    public void SetX(int x)
    {
    	this.x=x;
	}

	public void SetY(int y)
	{
		this.y=y;
	}
	
	public void SetEtat(Etat etat)
	{
		this.etat=etat;
	}
    
}

