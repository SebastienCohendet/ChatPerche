/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chien_client;
import Commun.Chaterface;
import Commun.Requete;
import java.net.InetAddress;

/**
 *
 * @author Sebastien
 */
import java.rmi.*;
import java.util.Scanner;
public class HelloClient {
public static void main(String args[]) {
        String URL;
        int port=8888;
        int ClientID=0;
        Fenetre fenetre = new Fenetre();
            try {
                // Récupération d'un stub sur l'objet serveur.
                // Calcul de l’URL du serveur
                URL = "//" + InetAddress.getLocalHost().getHostName() + ":"
                        + port + "/mon_serveur";
                Chaterface obj = (Chaterface) Naming.lookup(URL);
                
                while(true) {
                    // Appel d'une méthode sur l'objet distant.
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Saisissez un message : ");
                    String message = sc.nextLine();  

                    Requete req = new Requete(ClientID, message);
                    String reponse = obj.requeteClient(req);
                    if (reponse.startsWith("Connecté :"))
                        ClientID= Integer.parseInt(reponse.substring(11));

                    System.out.println(reponse);
                    
                    //Affichage toutes les 100ms 
                    while (true) {
                        fenetre.affiche("resultat du displayAll");
                        try {
                            Thread.sleep(100);
                         } 
                         catch (InterruptedException e) {
                            e.printStackTrace();
                         }
                    }
                }
            } 
            catch (Exception exc) {
                System.out.println("Wouaf wouaf !");
            }
    } 
}