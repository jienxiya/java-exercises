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
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        WeekdaysMenu wkdays = new WeekdaysMenu("Weekdays Menu", new ArrayList<>());
        WeekendMenu wkend = new WeekendMenu("Weekend Menu", new ArrayList<>());
        
        Dishes cake = new Dishes("Cake",30,300,new ArrayList<>());
        Dishes adobo = new Dishes("Adobong Manok",30,250,new ArrayList<>());
        Dishes spag = new Dishes("Spaghetti",30,100,new ArrayList<>());
        Dishes roastChicken = new Dishes("Roast Chicken",30,150,new ArrayList<>());
        Dishes vegLasagna = new Dishes("Vegestables Lasagna",30,200,new ArrayList<>());
        Dishes porkSinigang = new Dishes("Pork Sinigang",30,50,new ArrayList<>());
        Dishes lechonPaksiw = new Dishes("Lechon Paksiw",30,70,new ArrayList<>());
        Dishes topSilog = new Dishes("Topsilog",30,15,new ArrayList<>());
        Dishes porkSteak = new Dishes("Pork Steak",30,70,new ArrayList<>());
        
        //cake ingredients
        Ingredient ing = new Ingredient("Flour");
        Ingredient ing1 = new Ingredient("Egg");
        
        //adobo ingredients
        Ingredient a1 = new Ingredient("Chicken");
        Ingredient a2 = new Ingredient("Garlic");
        Ingredient a3 = new Ingredient("vinegar");
        Ingredient a4 = new Ingredient("Soy Sauce");
        
        //spaghetti ingredients
        Ingredient pasta = new Ingredient("Pasta");
        Ingredient sauce = new Ingredient("Spaghetti Sauce");
        Ingredient cheese = new Ingredient("Cheese");
        Ingredient ketchup = new Ingredient("Ketchup");
        
        //Roast Chicken ingredients
        Ingredient wholeChicken = new Ingredient("1 (3 pounds) whole Chicken, giblets removed");
        Ingredient salt = new Ingredient("Salt and Black Pepper");
        Ingredient onionPowder = new Ingredient("1 tablespoon onion powder.");
        Ingredient margarine = new Ingredient("1/2 cup margarine, divided");
        Ingredient celery = new Ingredient("1 stalk celery, leaves removed.");
        
        //Vegetable Lasagna ingredients
        Ingredient lasagnaNoodles = new Ingredient("1 (16 ounce) package lasagna noodles.");
        Ingredient mushroom = new Ingredient("1 pound fresh mushrooms, sliced.");
        Ingredient pepper = new Ingredient("3/4 cup chopped green bell pepper.");
        Ingredient onion = new Ingredient("3/4 cup chopped onion.");
        Ingredient garlic = new Ingredient("3 cloves garlic, minced.");
        Ingredient oil = new Ingredient("2 tablespoons vegetable oil.");
        
        //Pork Sinigang ingredients
        Ingredient pork = new Ingredient("2 lbs pork liempo; cut 2 inches chunks.");
        Ingredient tamarind = new Ingredient("1 package tamarind sinigang soup mix.");
        Ingredient tomato = new Ingredient("1 tomato.");
        Ingredient onio = new Ingredient("1 onion.");
        Ingredient taro = new Ingredient("1 taro.");
        Ingredient chili = new Ingredient("long chilli pepper.");
        Ingredient radish = new Ingredient("1 medium size radish.");
        Ingredient sbeans = new Ingredient("3 string beans.");
        
        //Lechon Paksiw ingredients
        Ingredient roastPig = new Ingredient("Left over roast pig.");
        Ingredient vinegar = new Ingredient("Vinegar.");
        Ingredient paminta = new Ingredient("Pepper");
        Ingredient sibuyas = new Ingredient("Onion.");
   
        
        //adding cake ingredients into the array of dishes
        cake.addIngredient(ing);
        cake.addIngredient(ing1);
        
        //adding adobo ingredients into the array of dishes
        adobo.addIngredient(a1);
        adobo.addIngredient(a2);
        adobo.addIngredient(a3);
        adobo.addIngredient(a4);
        
        //adding spaghetti ingredients into the array of dishes
        spag.addIngredient(pasta);
        spag.addIngredient(sauce);
        spag.addIngredient(cheese);
        spag.addIngredient(ketchup);
        
        //adding roast chicken ingredients into the array of dishes
        roastChicken.addIngredient(wholeChicken);
        roastChicken.addIngredient(salt);
        roastChicken.addIngredient(onionPowder);
        roastChicken.addIngredient(margarine);
        roastChicken.addIngredient(celery);
        
        //adding vegetable lasagna ingredients into the array of dishes
        vegLasagna.addIngredient(lasagnaNoodles);
        vegLasagna.addIngredient(mushroom);
        vegLasagna.addIngredient(pepper);
        vegLasagna.addIngredient(onion);
        vegLasagna.addIngredient(garlic);
        vegLasagna.addIngredient(oil);
        
        //adding Pork Sinigang  ingredients into the array of dishes
        porkSinigang.addIngredient(pork);
        porkSinigang.addIngredient(tamarind);
        porkSinigang.addIngredient(tomato);
        porkSinigang.addIngredient(onio);
        porkSinigang.addIngredient(taro);
        porkSinigang.addIngredient(chili);
        porkSinigang.addIngredient(radish);
        porkSinigang.addIngredient(sbeans);
        
        //adding Pork Sinigang  ingredients into the array of dishes
        lechonPaksiw.addIngredient(roastPig);
        lechonPaksiw.addIngredient(vinegar);
        lechonPaksiw.addIngredient(paminta);
        lechonPaksiw.addIngredient(sibuyas);
        
//        System.out.println(cake.displayDishInfo());
//        System.out.println(adobo.displayDishInfo());
//        System.out.println(spag.displayDishInfo());
//        System.out.println(vegLasagna.displayDishInfo());
   
        //adding dishes into weekdays menu
        wkdays.addDish(cake);
        wkdays.addDish(adobo);
        wkdays.addDish(spag);
        wkdays.addDish(porkSinigang);
        wkdays.addDish(lechonPaksiw);
        wkdays.addDish(topSilog);
        
//        wkdays.displayDishes();
//        wkdays.generateRandom();
        
        //adding dishes into weekend menu
        wkend.addDish(adobo);
        wkend.addDish(roastChicken);
        wkend.addDish(vegLasagna);
        wkend.addDish(porkSteak);
        wkend.addDish(cake);
        
//        wkend.displayDishes();
//        wkend.generateRandom();

                
        
       
       
        
        
        
    }
}
