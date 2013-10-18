/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chatperche;

/**
 *
 * @author Sebastien
 */
public interface Chaterface extends java.rmi.Remote {
    
    public void sayHello()
    throws java.rmi.RemoteException;
    
}