package Vue;

import java.awt.GridBagLayout;

import javax.swing.JFrame;


public class Vue extends JFrame
{
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		JFrame frame = new JFrame("fram");			// crée  + nomme la fenetre
		frame.setName("nam");
		//JLabel label = new JLabel("IcI");			//on crée un label 
		frame.setBounds(10, 20, 1300, 600);		//regle la position et la taille
		//frame.getContentPane().add(label);			//on ajoute le label créé
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fermeture du frame
		
		//setContentPane(new AfficheImage("C:\\impress2.gif"));
		//getContentPane().setLayout(new BorderLayout()); 
		grille j1,j2;
		choix_pannel panel;

		frame.setLayout(new GridBagLayout());
		
		
		frame.setVisible(true);

	}
	
	
	
}
