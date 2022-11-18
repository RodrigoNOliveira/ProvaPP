package classes;

import intefaces.WeaponBehavior;

public class Knight extends Character{

    

    public Knight() {
    }

    public Knight(WeaponBehavior weapon) {
        super(weapon);
    }

    @Override
    public void fight() {
        System.out.println("O cavaleiro esta lutando");
    }
    
}
