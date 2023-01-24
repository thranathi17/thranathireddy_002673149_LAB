/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author thran
 */
public class Person {
    private int nuid;
    private String firstName;
    private String lastName;
    private String collegeName;
    Address address;
    Contact contact;
    
    
    
    
    
    public Person() {

    this.nuid= 0;
    this.firstName="";
    this.lastName="";
    this.collegeName="";
    this.address = new Address();
    this.contact= new Contact();
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
    
    public int getNuid() {
        return nuid;
    }

    public void setNuid(int Nuid) {
        this.nuid = nuid;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getlastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }
    public String getcollegeName() {
        return collegeName;
    }

    public void setcollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
    
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    
    }
    
    