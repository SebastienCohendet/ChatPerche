/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chatperche_serveur;

/**
 *
 * @author max
 */
public class Message {
    
    protected static int idCourant = 0;
    
    protected int clientID;
    protected String message;
    protected int messageID;

    public Message() {
    }

    public Message(String message, int clientID) {
        this.clientID = clientID;
        this.message = message;
        this.messageID = Message.idCourant;
        Message.idCourant++;
    }

    public int getClientID() {
        return clientID;
    }

    public String getMessage() {
        return message;
    }
    
    
    
    
    
}
