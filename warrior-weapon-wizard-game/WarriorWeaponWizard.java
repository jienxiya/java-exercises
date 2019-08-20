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
public class WarriorWeaponWizard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Weapons sword = new Weapons();
       Weapons axe = new Weapons();
       Warrior Maria = new Warrior();
       Warrior Juana = new Warrior();
       
       sword.setWeapon("Sword");
       System.out.println("Maria's weapon is "+ sword.getWeapon());
       axe.setWeapon("Axe");
       System.out.println("Juana's weapon is "+axe.getWeapon());
       
       Maria.getName();
       Juana.getName();
       
       if("sword".equals(sword)){
           Warrior.
       }
       
       Maria.hit(Juana);
      
        System.out.println("Juana life point: " + Juana.getLifePoints());
       Juana.hit(Maria);
       System.out.println("Maria life point: " + Maria.getLifePoints());
       Maria.setWeapon(axe);
       Juana.setWeapon(sword);
       Maria.hit(Juana);
       System.out.println("Juana life point: " + Juana.getLifePoints());
       Juana.hit(Maria);
        System.out.println("Maria life point: " + Maria.getLifePoints());
       Maria.getWeapon();
       Juana.getWeapon();
       
       
    }

}
    

