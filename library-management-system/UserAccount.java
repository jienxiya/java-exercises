


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Renan Bargaso|Mary Jane Paller|Lealyn Eulin|Princess Duran
 */
public class UserAccount{
    private Name name;
    private int idNumber;
    private int pin;

    public UserAccount() {
    }

    public UserAccount(Name name){
        this.name = name;
    }
    
    public UserAccount(int pin) {
        this.pin = pin;
    }
    
    public UserAccount(Name name, int pin) {
        this.name = name;
        this.pin = pin;
    }
    
  
    public UserAccount(Name name, int pin,int idNumber) {
        this.idNumber = idNumber;
        this.name = name;
        this.pin = pin;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
    
    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
    
    public String toString() {
        return String.format("\nName: %s\nID Number: %s",name,idNumber);
    }
    
   

}
