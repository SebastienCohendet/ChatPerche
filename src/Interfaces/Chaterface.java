/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Sebastien
 */
public interface Chaterface extends java.rmi.Remote {
    
    public void send(String message) throws java.rmi.RemoteException;
    
}