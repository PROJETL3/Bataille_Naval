package Model;

import java.io.IOException;

public class humain extends Joueur {

	int test;
	private String nom;

	public humain(String nom)
	{
		super(nom);
		this.nom=nom;
	}

	boolean placer_bateau(int key , int value , int pos)
	{


		return false;
		//placer le bateau en fonction de la cl� et de la valeur (t�te/taille)

		//si position correcte retourner vrai
		//sinon retourner faux
	}


	public int tir(int key, int value)
	{
		// gerer par le champ

		if (test == -1) return -1;
		if (test == 0) return 0 ;
		else return 1;
	}



	void Abandon(String mot) throws IOException
	{

		if (System.in.read()== 'O')  System.out.println("abandon");

		else System.out.println("Abandon Annul�");

	}

	




}