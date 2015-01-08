
package Model;

public class mission_arti extends bataille_normale{

	public mission_arti(Navire n_v, Coordonnee cor) {
		
		super(n_v,cor);
		
	}
	/**
	 * selection des coordonnée verticales
	 * @param c
	 * @param y
	 * @return
	 */
	public int selection_cord_vert(Coordonnee c, int y) 
	{
		int Y= c.y;
				
		return Y;
	}
	/**
	 * Parcourir la coordonnee horizontale dans la grille "carte"
	 * @param x
	 * @param c
	 * @param y
	 * @return
	 */
	public int coor_horis(int x, Coordonnee c,int y)
	{
		if (y == selection_cord_vert(c,y) )
		{
			for(int i=y;i<ch.largeur_champ; i++)   
				for(int j=c.x;j<ch.longueur_champ;j++ )
				{
					x=c.x;
				}
		}
		
			return x;
	}
	/**
	 * 
	 */
	public void tente_tire(humain hm) 
	{  if(devine_pos(n_v, cor))
		{
		    hm.tir(cor);
		}
	}

}
