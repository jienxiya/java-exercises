/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

import java.util.ArrayList;

/**
 *
 * @author 2ndyrGroupC
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Zoo zootopia = new Zoo(new ArrayList<>(),"Zootopia");
        Bird dove = new Bird();
        Fish tilapia = new Fish();
        
        
        tilapia.setName("Tilapia");
        tilapia.setAnimalType("Fresh water animal");
        tilapia.eat();
        tilapia.drink();
        tilapia.sleep();
        tilapia.swim();
        
        dove.setName("Dove");
        dove.setAnimalType("White Dove");
        dove.eat();
        dove.drink();
        dove.sleep();
        dove.fly();
        
        zootopia.addAnimal(tilapia);
        zootopia.addAnimal(dove);
        zootopia.displayAnimal();
        
        
        
        
        
    }
}
