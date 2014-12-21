package Model;

public class mission_arti extends bataille_normale{

	public mission_arti(Navire n_v, Coordonnee cor) {
		
		super(n_v,cor);
		
	}	
	
	public int selection_cord_vert(Coordonnee c, int y) //selection de la coordonnee verticale
	{
		int Y= c.y;
				
		return Y;
	}
	
	public int coor_horis(int x, Coordonnee c,int y)
	{
		if (y == selection_cord_vert(c,y) )
		{
			for(int i=y;i<carte.size(); i++)   // parcours la coordonnée horizontale dans la grille 'carte'
				for(int j=c.x;j<carte.size();j++ )
				{
					x=c.x;
				}
		}
		
			return x;
	}
		
/*	public boolean devine_pos(Navire nv, Coordonnee pos) // cette fonction renvoie la postion des navire
	{
		pos= nv.getCoordonnee();
		return true;
	}*/
	public void tente_tire(humain hm) // cette methode va appeler la fonction tirer
	{  if(devine_pos(n_v, cor))
		{
		    hm.tir(cor);
		}
	}

}
