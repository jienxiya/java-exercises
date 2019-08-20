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
public class Dishes {
    private String dishName;
    private int timeRequired;
    private double price;
    private ArrayList<Ingredient> ingredient;

    public Dishes() {
    }

    public Dishes(String dishName, int timeRequired, double price, ArrayList<Ingredient> ingredient) {
        this.dishName = dishName;
        this.timeRequired = timeRequired;
        this.price = price;
        this.ingredient = ingredient;
    }

    public ArrayList<Ingredient> getIngredient() {
        return ingredient;
    }

    public void setIngredient(ArrayList<Ingredient> ingredient) {
        this.ingredient = ingredient;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public int getTimeRequired() {
        return timeRequired;
    }

    public void setTimeRequired(int timeRequired) {
        this.timeRequired = timeRequired;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public void addIngredient(Ingredient ing){
        ingredient.add(ing);
    }
    
    public String displayDishInfo(){
        return String.format("Dish: %s \nTime Required in Cooking: %d \nPrice: %f \nIngredients: %s", dishName, timeRequired, price, ingredient);
    }
   
    @Override
    public String toString(){
        return String.format("%s",dishName);
    }
}
