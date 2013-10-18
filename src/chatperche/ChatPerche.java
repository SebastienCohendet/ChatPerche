/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chatperche;
import Interfaces.Chaterface;
import java.net.InetAddress;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Sebastien
 */
public class ChatPerche extends UnicastRemoteObject implements Chaterface {

    /**
     * @param args the command line arguments
     */
    
    // Implémentation du constructeur
    public ChatPerche() throws java.rmi.RemoteException {
        System.out.println("Serveur lancé");
    }
    // Implémentation de la méthode distante
    public void send(String message) throws java.rmi.RemoteException {
        System.out.println(message);
    }
    
    public static void main(String args[]) {
        int port=8888;
        String URL;
        
//        try { // transformation d ’une chaîne de caractères en entier
//            Integer I = new Integer(args[0]);
//            port = I.intValue();
//        } catch (Exception ex) {
//            System.out.println(" Please enter: Server <port>");
//            return;
//        }
        try {
            // Création du serveur de nom - rmiregistry
            Registry registry = LocateRegistry.createRegistry(port);
            // Création d ’une instance de l’objet serveur
            Chaterface obj = new ChatPerche();
            // Calcul de l’URL du serveur
            URL = "//" + InetAddress.getLocalHost().getHostName() + ":"
                    + port + "/mon_serveur";
            Naming.rebind(URL, obj);
        } catch (Exception exc) {
             exc.printStackTrace();
        }
}

}