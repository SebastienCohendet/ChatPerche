package chien_client;

/**
 *
 * @author max
 */
import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;


public class Fenetre extends JFrame {

	private ContenuFenetre jpanel = new ContenuFenetre();
	
	public Fenetre(){
		
		super("Application Chat");
		this.setSize(600, 600);
		//Termine le processus lorsqu'on clique sur la croix rouge
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setContentPane(jpanel);
                LinkedList<String> attente = new LinkedList<String>();
                attente.add("En attente de connexion");
                jpanel.setString(attente);
	
	}
	
	  public void affiche(LinkedList<String> ls){
		      jpanel.setString(ls);
		      jpanel.repaint(); 
	  } 

}