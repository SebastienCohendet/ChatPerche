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
    protected static int ClientID=0;
    protected String message;
    
    public Requete(int id, String msg) {
       message=msg;
       ClientID=id;
    }

    public static int getClientID() {
        return ClientID;
    }

    public String getMessage() {
        return message;
    }

    public static void setClientID(int ClientID) {
        Requete.ClientID = ClientID;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
    
}
