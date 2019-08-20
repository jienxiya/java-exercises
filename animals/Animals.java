/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

/**
 *
 * @author 2ndyrGroupC
 */
public abstract class Animals {
 private String name;
 private String animalType;
 
 
 public Animals(){
 
 }
 
 public String getName(){
     return name;
 }   
 
 public void setName(String name){
     this.name = name;
 }
 
 public String getAnimalType(){
     return animalType;
 }
 
 public void setAnimalType(String animalType){
     this.animalType = animalType;
 }
 
 public abstract void eat();
 
 public abstract void drink();
 
 public abstract void sleep();
 
 @Override
 public String toString(){
     return String.format("%s: %s", name, animalType);
 }
}
