package Vue;

import javax.swing.JFrame;

public class Vue extends JFrame
{
	private static final long serialVersionUID = 1L;
	public Vue(String P)
	{

		JFrame frame = new JFrame(P);			// crée  + nomme la fenetre
		//JLabel label = new JLabel("IcI");			//on crée un label 
		frame.setBounds(10, 43, 1350, 540);		//regle la position et la taille
		//frame.getContentPane().add(label);			//on ajoute le label créé
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fermeture du frame
		frame.setVisible(true);
		
		
	}
}
