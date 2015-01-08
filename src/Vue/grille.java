package Vue;
import java.awt.*;
//import java.awt.event.*;

import javax.swing.*;

public class grille {
	
	public static void main (String[] args)
	{
		JFrame frame = new JFrame("Bataille Naval");			// crée  + nomme la fenetre
		//JLabel label = new JLabel("IcI");			//on crée un label 
		//frame.setBounds(500, 200, 500, 450);		//regle la position et la taille
		//frame.getContentPane().add(label);			//on ajoute le label créé
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fermeture du frame
		
		//frame.pack();
		
// test tableau
		
		int compt=1;
		int compty=1;
		String[][] Cases = new String [13][13];
		JPanel controls = new JPanel();
        controls.setLayout(new GridLayout(0,11));
		for(int x=0;x<=10;x++)
		{
			for(int y=0;y<=10;y++)
			{
				if(x==0&&y==0)
				{
					controls.add(new JButton("REP"));
				}
				else if(x==0)
				{
					controls.add(new JButton("x" + compt));
					controls.setEnabled(false);
					frame.add(controls);
					compt++;
				}
				else if(y==0)
				{
					controls.add(new JButton("y" + compty));
					controls.setEnabled(false);
					frame.add(controls);
					compty++;
				}
				else{
					Cases[x][y]="";
					controls.add(new JButton(Cases[x][y]));
					frame.add(controls);
					
				}
			}		
		}
		frame.pack();
		frame.setVisible(true);	//affiche la frame
        
	/*	button.addActionListener(new ActionListener() {
			 
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// ton traitement 
			}

		});
			
		
/* test down		
		
        JPanel controls = new JPanel();
        controls.setLayout(new GridLayout(5,5));
        JButton b = new JButton("cases");
        controls.add(new JButton("Button 1"));
        controls.add(new JButton("Button 2"));
        controls.add(new JButton("B3"));
        controls.add(new JButton("Long-Named Button 4"));
        controls.add(new JButton("5"));
        controls.add(new JButton("5"));
        controls.add(new JButton("5"));
        controls.add(new JButton("5"));
        controls.add(new JButton("5"));
        controls.add(new JButton("5"));
        controls.add(new JButton("5"));
        controls.add(new JButton("0"));
        controls.add(new JButton("5"));
        controls.add(new JButton("5"));
        controls.add(new JButton("5"));
        controls.add(new JButton("5"));
        controls.add(new JButton("5"));
        controls.add(new JButton("5"));
        controls.add(new JButton("5"));
        controls.add(new JButton("5"));
        controls.add(new JButton("0"));
        controls.add(new JButton("5"));
        controls.add(new JButton("5"));
        controls.add(new JButton("5"));
        controls.add(new JButton("5"));
        frame.add(controls);
        frame.pack();*/
       		
	}

}
