package chien_client;

/**
 *
 * @author max
 */
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import javax.swing.JPanel;

  
public class ContenuFenetre extends JPanel {
	
	private String stringToDisplay;
	
	public void paintComponent(Graphics g){
		
            //Effacer fenetre
	    g.setColor(Color.white);
	    g.fillRect(0, 0, 600, 600);

            // Affiche stringToDisplay
            g.setColor(Color.black);
            g.drawString(stringToDisplay, 10, 10);

	}
	
	public void setString(String s) {
		this.stringToDisplay = s;
	}
	
}
