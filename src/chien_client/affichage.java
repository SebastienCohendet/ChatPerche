/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chien_client;

/**
 *
 * @author Sebastien
 */
public class affichage extends Thread {

    public affichage(String name) {
        super(name);
    }
    
    public void run() {
        Fenetre fenetre = new Fenetre();
        //Affichage toutes les 100ms 
            while (true) {
                fenetre.affiche(obj.displayAll());
                try {
                    Thread.sleep(100);
                 } 
                 catch (InterruptedException e) {
                    e.printStackTrace();
                 }
            }
    }
}
