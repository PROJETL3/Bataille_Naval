package Model;

public class mission_radar extends bataille_normale {

	
	public mission_radar(Navire n_v, Coordonnee cor) 
	{
		
		super(n_v,cor);
		
	}

	/**
	 * (non-Javadoc)
	 * @see Model.bataille_normale#devine_pos(Model.Navire, Model.Coordonnee)
	 * 
	 *  * renvoie la position du navire
	 * @param Navire nv
	 * @param Coordonne pos
	 */
		
	public boolean devine_pos(Navire nv, Coordonnee pos) 
	{
		pos= nv.getCoordonnee();
		return true;
	}
	/**
	 * appel à la methode tirer 
	 * @param humain  hm
	 * */
	public void tente_tire(humain hm) // cette methode va appeler la fonction tirer
	{  if(devine_pos(n_v, cor))
		{
		    hm.tir(cor);
		}
		
	}	

/**
	
	
	 * indication de la distance
	 * @param double distance 
	 * @param  humain hm
	 * @param  int x
	 * @param  int y
	 * @param  Coordonnee c
	
	 **/
	public double indication_distance(double distance , humain hm,int x, int y, Coordonnee c)
	{  
             if(hm.tir(cor)==1);
	     {
	    	 distance= Math.sqrt(c.x*c.x+c.y*c.y);
		       
	     }
		
		
		return distance;
		
		
	}
}
