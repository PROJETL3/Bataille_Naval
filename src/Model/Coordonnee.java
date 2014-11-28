package Model;

/**
 * @version 2.1
 * @author Abdel, Fatimaezzahra, Hajar, Jude;
 */
public class Coordonnee {
    
    public int x;	// coordonnee x
    public int y;	// coordonnee y
    int etat; 		// -1 aucune action , 0 il y a un bateau , 1 coord toucher
    
    public Coordonnee(int X,int Y,int T)
    {
        this.x=X;
        this.y=Y;
        this.etat=T;
    }
    
    public int getX()
    {
    	return this.x ;
    }

    public int getY()
    {
    	return this.y;
    }
    
    public int getEtat()
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
	
	public void SetEtat(int etat)
	{
		this.etat=etat;
	}
    
}

