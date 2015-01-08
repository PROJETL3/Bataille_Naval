package Model;
/**
 * 
 * @author Abdel, Fatima, Hajar, Jude
 * Class IA d�rivant de la Classe humain permettant d'initialiser un joueur automate (ordinateur)
 *
 */
public class IA extends humain {
		
	private String nom;
		/**
		 * Constructeur appelant celui de la classe mere
		 * @param nom meme caracteristique que la classe joueur
		 */
	public IA(String nom)
	{
		super(nom,10,10); 
		this.nom=nom;
	}
	
	/**
	 * Redefinition de la classe tir car l'IA tire automatiquement
	 * @return Retourne un entier selon la validit� du tir
	 */

	public int tir()
	{   
		Coordonnee c;
		c = new Coordonnee((int) (Math.random()*10+1),(int) (Math.random()*10+1),(int) (Math.random()*10+1));
		return tir(c);
	}

}