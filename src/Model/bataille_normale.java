package Model;

public class bataille_normale {
	
	Navire n_v;
	Coordonnee cor;

	public  bataille_normale(Navire n_v,Coordonnee cor)
	{
		this.n_v= n_v;
		this.cor=cor;
		
	}

	
	public boolean devine_pos(Navire nv, Coordonnee pos) // cette fonction renvoie la postion des navire
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
}
