package classes;

import intefaces.WeaponBehavior;

public class KnifeBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("Arma utilizada: Knife");
    }
    
}
