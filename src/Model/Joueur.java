package Model;

abstract class Joueur{

	cuirasse cui1;
	cuirasse cui2;
	zodiaque zod;
	sm sm;
	pa pa;
	Champ Carte; 






	Joueur(String Nom)
	{
		System.out.println("création du joueur "+Nom) ;

		cui1 = new cuirasse("c1");
		cui2 = new cuirasse("c2");
		zod = new zodiaque("zodiaque");
		sm = new sm("sous-marin");
		pa = new pa("porte avion");
		Carte = new Champ();

	}

	public abstract int tir(Coordonnee key);  // coder selon le type de joueur (humain ou IA)




}