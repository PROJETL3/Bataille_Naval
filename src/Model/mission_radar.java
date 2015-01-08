package Model;

public class mission_radar extends bataille_normale {

	/**
	 * 
	 * @param n_v
	 * @param cor
	 */
	public mission_radar(Navire n_v, Coordonnee cor) 
	{
		
		super(n_v,cor);
		
	}
	
	public boolean devine_pos(Navire nv, Coordonnee pos) 
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

	/** indication de la distance
	 * 
	 * @param distance
	 * @param hm
	 * @param x
	 * @param y
	 * @param c
	 * @return
	 */
	public double indication_distance(double distance , humain hm,int x, int y, Coordonnee c)
	{  
             if(hm.tir(cor)==1);
	     {
	    	 distance= Math.sqrt(c.x*c.x+c.y*c.y);
		       
	     }
		
		
		return distance;
		
		
	}
}
