
package Model;

public class alerte_rouge extends bataille_normale {

	
	public alerte_rouge(Navire n_v, Coordonnee cor) {
		
		super(n_v,cor);
	}
	
/**
 * selection des coordonnee verticales
 * @param c
 * @param y
 * @return
 */
	public int selection_cord_vert(Coordonnee c, int y) //selection de la coordonnee verticale
	{
		int Y= c.y;
				
		return Y;
	}
	/**
	 * parcourir la coordonne horizontale
	 * @param x
	 * @param c
	 * @param y
	 * @return
	 */
	public int coor_horis(int x, Coordonnee c,int y)
	{
	     if (y == selection_cord_vert(c,y) )
		
	      {
			  for(int i=y;i<ch.longueur_champ; i++)   // parcours la coordonn�e horizontale dans la grille 'carte'
				    for(int j=c.x;j<ch.largeur_champ;j++ )
			         	{
				              	x=c.x;
				        }
			
			  return x;
	    }
		return y;
   }
		
/**
 * indication de la distance
 * @param distance
 * @param hm
 * @param x
 * @param y
 * @param c
 * @return
 */
		public double indication_distance(double distance , humain hm,int x, int y, Coordonnee c)// si la case qui est touch� est vide , on retur
		{  
	             if(hm.tir(cor)==1);
		     {
		    	 distance= Math.sqrt(c.x*c.x+c.y*c.y);
			       
		     }
			
			
			return distance;
			
			
		}
	
	
}
