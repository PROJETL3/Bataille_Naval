
package Model;

public class alerte_rouge extends bataille_normale {

	public alerte_rouge(Navire n_v, Coordonnee cor) {
		
		super(n_v,cor);
	}
	/**
	 * * selection des coordonnee verticales
	 * @param Coordonnee c
	 * @param , int y
	 * 
	 * */
	

	public int selection_cord_vert(Coordonnee c, int y) //selection de la coordonnee verticale
	{
		int Y= c.y;
				
		return Y;
	}
	/**
	 * * parcourir la coordonn�e horizontale 
	 * @param int x
	 * @param  Coordonnee c
	 * @param int y
	 */
	public int coor_horis(int x, Coordonnee c,int y)
	{
	     if (y == selection_cord_vert(c,y) )
		
	      {
			  for(int i=y;i<carte.size(); i++)   // parcours la coordonn�e horizontale dans la grille 'carte'
				    for(int j=c.x;j<carte.size();j++ )
			         	{
				              	x=c.x;
				        }
			
			  return x;
	    }
   }
		
	 /**
		 * * indication de la distance
		 * @param double distance 
		 * @param  humain hm
		 * @param  int x
		 * @param  int y
		 * @param  Coordonnee c
			
		 **/

		public double indication_distance(double distance , humain hm,int x, int y, Coordonnee c)// si la case qui est touch� est vide , on retur
		{  
	             if(hm.tir(cor)==1);
		     {
		    	 distance= Math.sqrt(c.x*c.x+c.y*c.y);
			       
		     }
			
			
			return distance;
			
			
		}
	
	
}
