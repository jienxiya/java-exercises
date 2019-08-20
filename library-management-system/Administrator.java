/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Renan Bargaso|Mary Jane Paller|Lealyn Eulin|Princess Duran
 */
public class Administrator extends UserAccount{

    public Administrator() {
    }

    public Administrator(int pin) {
        super(pin);
    }

    public Administrator(Name name) {
        super(name);
    }

    public Administrator(Name name, int pin,int idNumber) {
        super(name, pin, idNumber);
    }
     
    public String toString() {
        return super.toString()+"\nType: Administrator";
    }
    
}
