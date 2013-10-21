package chien_client;

/**
 *
 * @author max
 */
import chatperche_serveur.Message;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JPanel;

  
public class ContenuFenetre extends JPanel {
	
	private LinkedList<String> stringsToDisplay;
	
	public void paintComponent(Graphics g){
		
            //Effacer fenetre
	    g.setColor(Color.white);
	    g.fillRect(0, 0, 600, 600);

            // Affiche stringsToDisplay
            g.setColor(Color.black);
            int i=10;
            Iterator<String> itr = this.stringsToDisplay.iterator();
            while (itr.hasNext()){
                String s = itr.next();
                g.drawString(s, 10, 10+i);
                i += 10;
            }
            

	}
	
	public void setString(LinkedList<String> ls) {
		this.stringsToDisplay = ls;
	}
	
}
