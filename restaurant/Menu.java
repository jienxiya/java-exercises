/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.util.ArrayList;

/**
 *
 * @author 2ndyrGroupC
 */
public abstract class Menu {
    private String menuType;
    ArrayList<Dishes> arrayOfDishes;

    public Menu() {
    }

    public Menu(String menuType, ArrayList<Dishes> arrayOfDishes) {
        this.menuType = menuType;
        this.arrayOfDishes = arrayOfDishes;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public ArrayList<Dishes> getArrayOfDishes() {
        return arrayOfDishes;
    }

    public void setArrayOfDishes(ArrayList<Dishes> arrayOfDishes) {
        this.arrayOfDishes = arrayOfDishes;
    }
    
    public void addDish(Dishes another){
        arrayOfDishes.add(another);
    }
    
    public abstract void generateRandom();
    
    public void displayDishes(){
        System.out.println("Available Dishes are: ");
        for(Dishes another:arrayOfDishes){
            System.out.println(another);
        }
    }
    
}
