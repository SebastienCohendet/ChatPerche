/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Commun;

/**
 *
 * @author Sebastien
 */
public class Requete implements java.io.Serializable {
    protected int ClientID=0;
    protected String message;
    
    public Requete(int id, String msg) {
       message=msg;
       ClientID=id;
    }

    public int getClientID() {
        return ClientID;
    }

    public String getMessage() {
        return message;
    }

    public void setClientID(int ClientID) {
        this.ClientID = ClientID;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
    
}
