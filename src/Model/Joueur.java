package Model;

abstract class Joueur{

	private cuirasse cui1;
	private cuirasse cui2;
	private zodiaque zod;
	private sm sm;
	private pa pa;





	Joueur(String Nom)
	{
		System.out.println("création du joueur "+Nom) ;

		cui1 = new cuirasse("c1");
		cui2 = new cuirasse("c2");
		zod = new zodiaque("zodiaque");
		sm = new sm("sous-marin");
		pa = new pa("porte avion");
	}

	public abstract int tir(int x, int y);  // coder selon le type de joueur (humain ou IA)




}