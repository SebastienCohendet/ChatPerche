/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chien_client;

import Commun.Chaterface;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sebastien
 */
public class threadAffichage extends Thread {

    private Chaterface obj;
    
    public threadAffichage(String name, Chaterface obj) {
        super(name);
        this.obj = obj;
    }
    
    public void run() {
        Fenetre fenetre = new Fenetre();
        //Affichage toutes les 100ms 
        while (true) {
            try {
                fenetre.affiche(obj.displayAll());
            } catch (RemoteException ex) {
                System.out.println("Erreur serveur");
            }
            try {
                Thread.sleep(100);
             } 
             catch (InterruptedException e) {
                e.printStackTrace();
             }
        }
    }
}
