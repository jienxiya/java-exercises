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
public class Zoo {
    private String name;
    private ArrayList<Animals> arrayOfAnimal;

    public Zoo() {
    }

    public Zoo(ArrayList<Animals> arrayOfAnimal, String name) {
        this.arrayOfAnimal = arrayOfAnimal;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Animals> getArrayOfAnimal() {
        return arrayOfAnimal;
    }

    public void setArrayOfAnimal(ArrayList<Animals> arrayOfAnimal) {
        this.arrayOfAnimal = arrayOfAnimal;
    }
    
    public void addAnimal(Animals animal){
        arrayOfAnimal.add(animal);
        System.out.println("Animal Successfully added to the Zoo");
    }
    
    public void displayAnimal(){
        System.out.println("Available animals in " + getName() + ":");
        for(Animals hayup:arrayOfAnimal){
            System.out.println(hayup);
        }
    }
   
}
