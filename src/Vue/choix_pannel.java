/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;
import java.awt.*;
import java.awt.Panel;
import java.awt.Label;

/**
 *
 * @author Jude
 */
public class choix_pannel { 
    public choix_pannel(){ 
       Panel choix=new Panel();
       choix.setBackground(Color.ORANGE);  
       choix.setLayout(new GridLayout(20,0));
       choix.add(new Label(""));
       choix.add(new Label("Choix1"));
       choix.add(new Label(""));
       choix.add(new Button("Choix2"));
       choix.add(new Button("Choix3")); 
       choix.add(new Button("Choix4")); 
       choix.add(new Button("Choix5")); 
       choix.add(new Button("Choix6"));
       choix.add(new Button("Choix7")); 
       choix.add(new Label(""));
       choix.add(new Button("Choix8")); 
       choix.add(new Button("Choix9"));
    }  
    
}
