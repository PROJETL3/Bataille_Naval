package Model;

public abstract class Mode_bataille_abstract {

	
	private String Joueur,IA,Un_joueur,deux_joueur;
	private String Type;
	public Mode_bataille_abstract(String joueur, String type) 
	{
		this.Joueur= joueur;
	    this.Type=type;
	}
	public double choix_mode_jeu(String joueur){
		
	switch(joueur)
	{	       
	        case IA   :          //appel à la fonctione
		 
	               Joueur.tir(Key);
		    break;
	
		    case Un_joueur :       //appel � la fonctione 
		    	                        
		    	Joueur.placer_bateau( bat , c) 
		    	Joueur.tir(key)
		
		case deux_joueur:
	       //   appel à la methode 
		
	}
		
	
 //la deuxieme chose : le choix des types de bataille
	
	
	public double bataille_normale(bataille_normale bt_n, mission_radar ms_r, mission_arti ms_a, alerte_rouge al_r, Model.bataille_normale choix_jeu)
	//bataille_normale b_n, mission_radar ms_r, alerte_rouje a_r,mission_artillerie ms_a)
    {
	   
		if(choix_jeu==bt_n)
	            { 
	        return    appel methode de bataille normale;
	           }
	      else if( choix_jeu==ms_r)
	            {
	         return  apple de la methode mission radar;
	            }
	      else if(choix_jeu==al_r)
	            {
	         return    appel methode alerte rouje;
	             }
	       else
	         {
	       return   appel methode de mission artillerie;
	          }
		return (0.0);
     }
	public int devine_position()
	{
		// appel � la methode position
		return 1;
	}

}
