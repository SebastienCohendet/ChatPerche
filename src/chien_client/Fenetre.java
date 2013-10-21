package chien_client;

/**
 *
 * @author max
 */
import javax.swing.*;
import java.awt.*;


public class Fenetre extends JFrame {

	private ContenuFenetre jpanel = new ContenuFenetre();
	
	public Fenetre(){
		
		super("Application Chat");
		this.setSize(800, 600);
		//Termine le processus lorsqu'on clique sur la croix rouge
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setContentPane(jpanel);
                jpanel.setString("Ouverture de l'application ...");
	
	}
	
	  public void affiche(String s){
		      jpanel.setString(s);
		      jpanel.repaint(); 
	  } 

}