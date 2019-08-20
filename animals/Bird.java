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
public class Bird extends Animals implements FlyingCreatures{
    
    @Override
    public void eat(){
        System.out.println(super.getName() + " can eat");
    }
    
    @Override
    public void drink(){
        System.out.println(super.getName() + " can drink");
    }
    
    @Override
    public void sleep(){
        System.out.println(super.getName() + " can sleep");
    }
    
    @Override
    public void fly(){
        System.out.println("FFFlllyyyy");
    }
}
