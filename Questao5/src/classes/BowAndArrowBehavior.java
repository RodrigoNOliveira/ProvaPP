package classes;

import intefaces.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("Arma utilizada: Arco e flecha");
    }
    
}
