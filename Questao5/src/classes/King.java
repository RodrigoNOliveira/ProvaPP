package classes;

import intefaces.WeaponBehavior;

public class King extends Character{

    

    public King() {
    }

    public King(WeaponBehavior weapon) {
        super(weapon);
    }

    @Override
    public void fight() {
        System.out.println("O rei esta lutando");
    }

}
