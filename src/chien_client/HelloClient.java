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
        int ClientID=-1;
        
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
                        ClientID = Integer.parseInt(reponse.substring(11));
                    else if (reponse.startsWith("Good bye"))
                        ClientID=-1; //déconnection superficielle du client par id mis à -1

                    System.out.println(reponse);
                    
                    
                }
            } catch (Exception exc) {
                exc.printStackTrace();;
            }
    } 
}
