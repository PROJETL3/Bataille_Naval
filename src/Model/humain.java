package com.projet.modele;

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

		direction (pos);
		return false;
		//placer le bateau en fonction de la clé et de la valeur (tête/taille)

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


	public int direction (int s)  // 0 horizontale , 1 verticale
	{
		if (s == 0) {

			/* si position bonne horizontale*/	return 0;
			//sinon  return -1; 
		}


		else {
			/* si position bonne verticale*/ return 1 ;
			//sinon  return -1; 
		}
	}

	void Abandon(String mot) throws IOException
	{

		if (System.in.read()== 'O')  System.out.println("abandon");

		else System.out.println("Abandon Annulé");

	}

	




}