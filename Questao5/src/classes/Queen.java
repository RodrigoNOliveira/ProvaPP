package classes;

import intefaces.WeaponBehavior;

public class Queen extends Character{




    
    public Queen() {
    }

    public Queen(WeaponBehavior weapon) {
        super(weapon);
    }

    @Override
    public void fight() {
        System.out.println("A rainha esta lutando");
        
    }

    
}
