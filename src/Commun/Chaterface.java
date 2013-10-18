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
    
    public int connect() throws java.rmi.RemoteException;
    
    public void bye(int id) throws java.rmi.RemoteException;
    
    public String who() throws java.rmi.RemoteException;
    
    public void send(String message) throws java.rmi.RemoteException;

}
