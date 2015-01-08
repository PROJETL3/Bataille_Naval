
package Model;

public class mission_arti extends bataille_normale{

	public mission_arti(Navire n_v, Coordonnee cor) {
		
		super(n_v,cor);
		
	}	
	
	/**
	  * selection des coordonnees verticales
	 * @param Coordonnee c
	 * @param , int y
	 */
	public int selection_cord_vert(Coordonnee c, int y) 
	{
		int Y= c.y;
				
		return Y;
	}
	/**
	 * 
	 * parcourir la coordonnée horizontale dans la grille 'carte'
	 * @param int x
	 * @param  Coordonnee c
	 * @param int y
	
	 **/

	public int coor_horis(int x, Coordonnee c,int y)
	{
		if (y == selection_cord_vert(c,y) )
		{
			for(int i=y;i<carte.size(); i++)   
				for(int j=c.x;j<carte.size();j++ )
				{
					x=c.x;
				}
		}
		
			return x;
	}
		
	/** appel à la methode tirer 
	 * @param humain  hm
	 * 
	 * 
	  */

	public void tente_tire(humain hm) 
	{  if(devine_pos(n_v, cor))
		{
		    hm.tir(cor);
		}
	}

}
