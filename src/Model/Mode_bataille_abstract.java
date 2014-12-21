package Model;

public abstract class Mode_bataille_abstract {

	
	private String Joueur,Un_joueur,deux_joueur;
	private String I_A;
	Coordonnee cor;
	Navire nav;
	humain hum_1;
	humain hum_2;
	IA ia_1;
	IA ia_2;
	 humain hm;
	private String Type;
	int y;
    int x;
	 double distance;

	public Mode_bataille_abstract(String joueur, String type,Coordonnee cor,Navire nv,humain hum1,humain hum2,IA ia1, IA ia2 ) 
	{
		this.Joueur= joueur;
	    this.Type=type;
	    this.hum_1=hum1;
	    this.hum_2=hum2;
		this.ia_1=ia1;
		this.ia_2=ia2;
	    }
	public void choix_mode_jeu(String joueur){
		
	switch(joueur)
	{	       
	        case "IA"   :          //appel à la fonctione
		 
	               ia_1.tir(cor);
		    break;
	
		    case "Un_joueur" :       //appel � la fonctione 
		    	                        
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
		
	
 //la deuxieme chose : le choix des types de bataille
	
	
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
	
	
/*public boolean tout_est_coulé( cuirasse cu_1,cuirasse cu_2,zodiaque z,sm s_m,pa p_a )	// vérfie que tous les bateaux sont coulés

{  String t[][]={{cu_1,t},cu_2,z,s_m,p_a};
	for(String e:t){
	if(   )
	{
		
	}
	}

 }
*/	




}
