package Model;

import java.io.IOException;

public class humain extends Joueur {


	private String nom;

	public humain(String nom)
	{
		super(nom);
		this.nom=nom;
	}

	boolean placer_bateau(Navire bat ,Coordonnee c)
	{
		return false;
		
	}


	public int tir(Coordonnee key)
	{

		if(Carte.Tire(key)==1) 
		{
			System.out.println("Case vide touché");
			return 1; 
		}

		if(Carte.Tire(key)==0)  
		{
			System.out.println("Bateau touché");
			return 0;
		}

		else return -1;

	}



	void Abandon(String mot) throws IOException
	{

		if (System.in.read()== 'O')  System.out.println("abandon");

		else System.out.println("Abandon Annulï¿½");

	}






}