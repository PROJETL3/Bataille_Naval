package Model;

public class alerte_rouge extends bataille_normale {

	public alerte_rouge(Navire n_v, Coordonnee cor) {
		
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
			
			  return x;
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
