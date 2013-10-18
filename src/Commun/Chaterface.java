/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Commun;

/**
 *
 * @author Sebastien
 */
public interface Chaterface extends java.rmi.Remote {

    public String requeteClient(Requete req) throws java.rmi.RemoteException;
    
    public String connect() throws java.rmi.RemoteException;
    
    public String bye(int id) throws java.rmi.RemoteException;
    
    public String who() throws java.rmi.RemoteException;
    
    public String send(String message, int idUtilisateur) throws java.rmi.RemoteException;
    
    public String displayMessage() throws java.rmi.RemoteException;

}
