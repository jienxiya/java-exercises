/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package building;

/**
 *
 * @author 2ndyrGroupC
 */
public class House extends Building{
    private int numKitchen;
    
    
    public House(){
    
    }
    
    public int getNumKitchen(){
        return numKitchen;
    }
    
    public void setNumKitchen(int numKitchen){
        this.numKitchen = numKitchen;
    }
    
    @Override
    public void bellRing(){
        System.out.println("Ding Dong... Ding Dong");
    }
}
