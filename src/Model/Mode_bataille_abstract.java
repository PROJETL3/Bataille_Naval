
/**
	 * fait appel à toutes les methodes
	 * 
	 */

package Model;

public abstract class Mode_bataille_abstract {

	
	//private String Joueur,Un_joueur,deux_joueur;
	private String I_A;
	Coordonnee cor;
	Navire nav;
	humain hum_2;
	humain hum_1;
	IA ia_1;
	IA ia_2;
	 humain hm;
	 
	private String Type;
	int y;
    int x;
	 double distance;

	public Mode_bataille_abstract(String joueur, String type,Coordonnee cor,Navire nv,humain hum1,humain hum2,IA ia1, IA ia2 ) 
	{
		//this.Joueur= joueur;
	    this.Type=type;
		this.ia_1=ia1;
		this.ia_2=ia2;
	    }
	/**
	 * choisir les modes de jeux 
	 * @param joueur  le joueur va choisis le mode de jeux
	 */
	public void choix_mode_jeu(String joueur){
		
	
		
	switch(joueur)
	{
	
	
	
	        case "IA"   :          //appel à la fonctione
		 
	               ia_1.tir(cor);
		    break;
	
		    case "Un_joueur" :
		    	//appel � la fonctione 
		    	
		    	        
		    	hum_1.placer_bateau( nav , cor) ;
		    	hum_1.tir(cor);
		
		case "deux_joueur":
			
			
			
			hum_1.placer_bateau( nav , cor) ;
		
			hum_2.placer_bateau( nav , cor) ;
		
		//   appel à la methode 
			
			
	    	hum_1.tir(cor);
	    	hum_2.tir(cor);
	    	
	
	}
	}
	/**
	 * choisir les types de batailles
	 * @param bt_n	fait appel a une méthode de la classe bataillle normal
	 * @param ms_r	fait appel a une méthode de la classe mission radar
	 * @param ms_a	fait appel a une méthode de la classe mission artillerie
	 * @param al_r	fait appel a une méthode de la classe alerte rouge
	 * @param choix_jeu
	 */
	public void bataille(bataille_normale bt_n, mission_radar ms_r, mission_arti ms_a, alerte_rouge al_r, Model.bataille_normale choix_jeu)
	
    {
	   
		if(choix_jeu==bt_n)
	            { 
	                 bt_n.tente_tire( hm); 	   
	            }
		
	     else if( choix_jeu==ms_r)
	            { 
	    	       ms_r.tente_tire( hm);
		           ms_r.indication_distance(distance, hm, x, y,cor);
	            }
               
			
	      else if(choix_jeu== ms_a)
	            {
	              ms_a.selection_cord_vert(cor, y) ;
	              ms_a.coor_horis( x, cor, y);
	              ms_a.tente_tire( hm);
	              
	            }
	       else 
	         {
	                al_r.selection_cord_vert(cor, y);
	                al_r.coor_horis(x, cor, y);
	                al_r.indication_distance(distance, hm, x, y, cor);
	                
	          }
     }

	/**
	 *  Pour choisir le type de jeux vérifie si tous les bateaux sont coulés
	 * @param cu_1
	 * @param cu_2
	 * @param z
	 * @param s_m
	 * @param p_a
	 * @return
	 */
public boolean tout_est_coulé( CuirasseFurtif cu_1,CuirasseFurtif cu_2,Zodiac z,SousMarinNucleaire s_m,PorteAvion p_a )	// vérfie que tous les bateaux sont coulés

{  
	cu_1.estCoule();
	cu_2.estCoule();
	z.estCoule();
	s_m.estCoule();
	p_a.estCoule();

return true;
	
		

 }
	




}
