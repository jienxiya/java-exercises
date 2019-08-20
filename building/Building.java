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
public abstract class Building {
    private int numRooms;
    
    public Building(){
    
    }

    public Building(int numRooms) {
        this.numRooms = numRooms;
    }
    
    public int getNumRooms() {
        return numRooms;
    }

    public void setNumRooms(int numRooms) {
        this.numRooms = numRooms;
    }
      
    public abstract void bellRing();
}
