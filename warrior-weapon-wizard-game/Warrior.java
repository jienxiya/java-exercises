/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warrior.weapon.wizard;

/**
 *
 * @author 2ndyrGroupB
 */
public class Warrior {
    private String name = "Warrior Maria";
    private int lifePoints = 10;
    private Weapons weapon;
    
    public void Warior(){
        
    }
   public void Warior(String name, int lifePoints, Weapons weapon){
        this.name = name;
        this.lifePoints = lifePoints;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public Weapons getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapons weapon) {
        this.weapon = weapon;
    }

    public void hit(Warrior Maria) {
        this.lifePoints = lifePoints;
    }

}
