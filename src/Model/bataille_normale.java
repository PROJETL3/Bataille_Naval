

package Model;

public class bataille_normale {
	
	Navire n_v;
	Coordonnee cor;

	Champ ch = new Champ(10,10);

	public  bataille_normale(Navire n_v,Coordonnee cor)
	{
		this.n_v= n_v;
		this.cor=cor;
		
	}

	/**
	 *  devine la position du navire
	 * @param nv
	 * @param pos
	 * @return boolean
	 */
	public boolean devine_pos(Navire nv, Coordonnee pos) 
	{
		pos= nv.getCoordonnee();
		return true;
	}
	
	/**
	 * tenter de tirer
	 * @param hm
	 */
	public void tente_tire(humain hm) 
	{  if(devine_pos(n_v, cor))
		{
		    hm.tir(cor);
		}
		
	}
}
