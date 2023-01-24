/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author thran
 */
public class Address {
    String street;
    int apt;
    String city;
    String state;
    int zipcode;
    
    String pstreet;
    int papt;
    String pcity;
    String pstate;
    int pzipcode;
    
    
    public Address(){
        this.street="";
        this.apt=0;
        this.city="";
        this.state="";
        this.zipcode=0;
        
        this.pstreet="";
        this.papt=0;
        this.pcity="";
        this.pstate="";
        this.pzipcode=0;
        
        
        
        
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
    
    public int getApt() {
        return apt;
    }

    public void setApt(int apt) {
        this.apt = apt;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }
    
    public String getpStreet() {
        return pstreet;
    }

    public void setpStreet(String pstreet) {
        this.pstreet = pstreet;
    }
    
    public int getpApt() {
        return papt;
    }

    public void setpApt(int papt) {
        this.papt = papt;
    }
    public String getpCity() {
        return pcity;
    }

    public void setpCity(String pcity) {
        this.pcity = pcity;
    }
    public String getpState() {
        return pstate;
    }

    public void setpState(String pstate) {
        this.pstate = pstate;
    }
    public int getpZipcode() {
        return pzipcode;
    }

    public void setpZipcode(int pzipcode) {
        this.pzipcode = pzipcode;
    }
    
    
}
