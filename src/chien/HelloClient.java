/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chien;
import Commun.*;
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
        
            try {
                // Récupération d'un stub sur l'objet serveur.
                // Calcul de l’URL du serveur
                URL = "//" + InetAddress.getLocalHost().getHostName() + ":"
                        + port + "/mon_serveur";
                Chaterface obj = (Chaterface) Naming.lookup(URL);
                // Appel d'une méthode sur l'objet distant.
                Scanner sc = new Scanner(System.in);
                System.out.println("Saisissez un message : ");
                String message = sc.nextLine();  
                
                Requete req = new Requete(ClientID, message);
                
                System.out.println(obj.requeteClient(req));
            } catch (Exception exc) {
                System.out.println("Wouaf wouaf !");
            }
    }
}