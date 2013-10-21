/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chien_client;

import Commun.Chaterface;
import java.rmi.RemoteException;
import java.util.LinkedList;


/**
 *
 * @author Sebastien
 */
public class threadAffichage extends Thread {

    private Chaterface obj;
    private boolean stop;
    Fenetre fenetre;
    
    public threadAffichage(String name, Chaterface obj) {
        super(name);
        this.obj = obj;
    }
    
    public void run() {
        fenetre = new Fenetre();
        LinkedList<String> ls = new LinkedList<String>();
        this.stop = false;
        //Affichage toutes les 100ms 
        while (!stop) {
            try {
                ls = obj.displayAll();
            } catch (RemoteException ex) {
                ex.printStackTrace();
            }
            this.fenetre.affiche(ls);
            try {
                Thread.sleep(100);
             } 
             catch (InterruptedException e) {
                e.printStackTrace();
             }
        }
    }
    

    public void arret() {
        this.stop = true;
        LinkedList<String> attente = new LinkedList<String>();
        attente.add("Vous vous êtes déconnecté ...");
        fenetre.affiche(attente);

    }
}
