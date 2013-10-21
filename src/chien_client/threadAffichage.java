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
    
    public threadAffichage(String name, Chaterface obj) {
        super(name);
        this.obj = obj;
        this.stop = false;
    }
    
    public void run() {
        Fenetre fenetre = new Fenetre();
        LinkedList<String> ls = new LinkedList<String>();
        //Affichage toutes les 100ms 
        while (!stop) {
            try {
                ls = obj.displayAll();
            } catch (RemoteException ex) {
                ex.printStackTrace();
            }
            fenetre.affiche(ls);
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
    }
}
