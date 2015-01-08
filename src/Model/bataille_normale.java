

package Model;

public class bataille_normale {
	
	Navire n_v;
	Coordonnee cor;

	public  bataille_normale(Navire n_v,Coordonnee cor)
	{
		this.n_v= n_v;
		this.cor=cor;
		
	}

	/**
	 *  devine  la position du navire
	 * @param Navire nv
	 * @param Coordonne pos
	 *
	*/
	public boolean devine_pos(Navire nv, Coordonnee pos) 
	{
		pos= nv.getCoordonnee();
		return true;
	}
	
	
	/**
	  
	 * tentrer de  tirer 
	 * @param humain  hm
	 * 
	 cette methode va appeler la fonction tirer
	 **/
	public void tente_tire(humain hm) 
	{  if(devine_pos(n_v, cor))
		{
		    hm.tir(cor);
		}
		
	}
}
