/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chatperche;
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
    
    String message;
    // Implémentation du constructeur
    public ChatPerche(String msg) throws java.rmi.RemoteException {
        message = msg;
    }
    // Implémentation de la méthode distante
    public void sayHello() throws java.rmi.RemoteException {
        System.out.println(message);
    }
    
    public static void main(String args[]) {
        int port=2069;
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
            Chaterface obj = new ChatPerche("Dindon");
            // Calcul de l’URL du serveur
            URL = "//" + InetAddress.getLocalHost().getHostName() + ":"
                    + port + "/mon_serveur";
            Naming.rebind(URL, obj);
        } catch (Exception exc) {
             System.out.println("Error de dromadaire (comprendre réseau)");
        }
}

}