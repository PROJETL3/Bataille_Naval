package Model;
/**
 * classe IA 
 * 
 */


public class IA extends humain {

	private String nom;

	public IA(String nom)
	{
		super(nom); 
		this.nom=nom;
	}


	public int tir()
	{   
		Coordonnee c;
		c = new Coordonnee((int) (Math.random()*10+1),(int) (Math.random()*10+1),(int) (Math.random()*10+1));
		return tir(c);
	}

}