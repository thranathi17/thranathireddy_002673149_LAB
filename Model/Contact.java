/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author thran
 */
public class Contact {
    
    long ofcphoneNumber;
    String ofcemailID;
    
    long perphoneNumber;
    String peremailID;
    
    
    
    public Contact() {
        
    }

    public long getofcPhoneNumber() {
        return ofcphoneNumber;
    }

    public void setofcPhoneNumber(long ofcphoneNumber) {
        this.ofcphoneNumber = ofcphoneNumber;
    }

    public String getofcEmailID() {
        return ofcemailID;
    }

    public void setofcEmailID(String ofcemailID) {
        this.ofcemailID = ofcemailID;
    }
    public long getperPhoneNumber() {
        return perphoneNumber;
    }

    public void setperPhoneNumber(long perphoneNumber) {
        this.perphoneNumber = perphoneNumber;
    }

    public String getperEmailID() {
        return peremailID;
    }

    public void setperEmailID(String peremailID) {
        this.peremailID = peremailID;
    }
    
    
    
    
}
