package classes;

import intefaces.WeaponBehavior;

public abstract class Character {

    private WeaponBehavior weapon;


    

    public Character() {
    }

    public Character(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public void setCompWeapon(WeaponBehavior compWeapon){
        this.weapon = compWeapon;
    }

    public void resWeapon(){
        this.weapon.useWeapon();
    }
    
    public abstract void fight();


    
    public WeaponBehavior getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }






}
