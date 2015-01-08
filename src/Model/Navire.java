package Model;



	public class  Navire  {
		protected Coordonnee coordonnee;// Position du navire"Entête"
		protected String nom;
		protected int taille ;
		protected int cptnbrdeTouche=0 ; 
		public boolean horizontal;
		 
	
	public Navire (  String n  , int T){  //, Coordonnee c
			//coordonnee =c;
			nom=n ;
			taille=T;
			
		}		

	protected void nbrtouch() { // Incrementer le nombre des tires
			cptnbrdeTouche++;
	}
		

	protected boolean estTouche( Coordonnee Tir){ //savoir si le navire est touché ainsi que l'incrementation
													// des nombres de tires
			if (coordonnee==Tir){
				this.nbrtouch();
				System.out.println(this.getNom()+ "est touché");
				return true;
			}
			
		 return false;
		 
	}

	protected boolean estCoule(){    // Verifier si le navire est coulé
		if(this.getTaille() == this.getCptnbrdeTouche()) {
			System.out.println(this.getNom()+ "est coulé");
			return true;
		}
		else
			return false;}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public Coordonnee getCoordonnee() {
		return coordonnee;
	}

	public void setCoordonnee( Coordonnee coordonnee) {
		this.coordonnee = coordonnee;
	}

	public int getCptnbrdeTouche() {
		return cptnbrdeTouche;
	}

	public void setCptnbrdeTouche(int cptnbrdeTouche) {
		this.cptnbrdeTouche=cptnbrdeTouche;
	}
			
}
