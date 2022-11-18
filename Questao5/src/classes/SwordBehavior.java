package classes;

import intefaces.WeaponBehavior;

public class SwordBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("Arma utilizada: Espada");
    }
    
}
