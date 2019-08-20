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
public class School extends Building{
    private int numLibrary;
    
    public School(){
    
    }
    
    public int getNumLibrary(){
        return numLibrary;
    }
    
    public void setNumLibrary(int numLibrary){
        this.numLibrary = numLibrary;
    }
    
    @Override
    public void bellRing(){
        System.out.println("Criiinnggg...Criiinnggg...Criinnngg");
    }
}
