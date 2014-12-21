package Model;

public class mission_radar extends bataille_normale {

	
	public mission_radar(Navire n_v, Coordonnee cor) 
	{
		
		super(n_v,cor);
		
	}

	
		
	public boolean devine_pos(Navire nv, Coordonnee pos) // cette fonction renvoie la postion des navire
	{
		pos= nv.getCoordonnee();
		return true;
	}
	public void tente_tire(humain hm) // cette methode va appeler la fonction tirer
	{  if(devine_pos(n_v, cor))
		{
		    hm.tir(cor);
		}
		
	}	
	public double indication_distance(double distance , humain hm,int x, int y, Coordonnee c)// si la case qui est touché est vide , on retur
	{  
             if(hm.tir(cor)==1);
	     {
	    	 distance= Math.sqrt(c.x*c.x+c.y*c.y);
		       
	     }
		
		
		return distance;
		
		
	}
}
