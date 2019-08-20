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
public class Weapons {
    private String weapon;
    private int damage;
    
    public void Weapons(){
        
    }
    public void Weapons(String weapon, int damage){
        this.weapon = weapon;
        this.damage = damage;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getDamage() {
        if ("sword".equals(weapon)){
            damage = 4;
            return damage;
        }else{
            damage = 2;
            return damage;
        }
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

}
