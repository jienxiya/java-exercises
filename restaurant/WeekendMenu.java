/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author 2ndyrGroupC
 */
public class WeekendMenu extends Menu {

    public WeekendMenu() {
    }

    public WeekendMenu(String menuType, ArrayList<Dishes> arrayOfDishes) {
        super(menuType, arrayOfDishes);
    }
    
    @Override
    public void generateRandom(){
        Random r = new Random();
 
        int index = r.nextInt(arrayOfDishes.size());
        Dishes another = arrayOfDishes.get(index);
        another.setPrice(another.getPrice()-20);
        System.out.println("Special Dish for today is: " + another);       
    }
}
