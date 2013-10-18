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
    
}