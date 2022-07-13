
package model;

import java.io.Serializable;

/**
 *
 * @author Mario
 */
public class Memorandum implements Serializable{
    private int Date;
    //fecha
    private String addressee;
    //destinario
    private String Theme;
    //tema
    private String message;
    //mensaje
    private String signing;
    //firma

    public Memorandum(int Date, String addressee, String Theme, String message, String signing) {
        this.Date = Date;
        this.addressee = addressee;
        this.Theme = Theme;
        this.message = message;
        this.signing = signing;
    }

    public Memorandum() {
    }

    public int getDate() {
        return Date;
    }

    public void setDate(int Date) {
        this.Date = Date;
    }

    public String getaddressee() {
        return addressee;
    }

    public void setaddressee (String addressee) {
        this.addressee = addressee;
    }

    public String getTheme() {
        return Theme;
    }

    public void setTheme(String Theme) {
        this.Theme = Theme;
    }

    public String getmessage() {
        return message;
    }

    public void setmessage(String message) {
        this.message = message;
    }

    public String getsigning() {
        return signing;
    }

    public void setsigning(String signing) {
        this.signing = signing;
    }

    @Override
    public String toString() {
        return "Memorandum{" + "Date=" + Date + ", addressee=" + addressee + ", Theme=" + Theme + ", message=" + message + ", Signing=" + signing + '}';
    }
    
    
    
}