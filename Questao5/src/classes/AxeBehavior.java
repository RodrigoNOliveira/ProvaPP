package classes;

import intefaces.WeaponBehavior;

public class AxeBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("Arma utilizada: Machado");
    }
    
}
