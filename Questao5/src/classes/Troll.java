package classes;

import intefaces.WeaponBehavior;

public class Troll extends Character{



    public Troll() {
    }

    public Troll(WeaponBehavior weapon) {
        super(weapon);
    }

    @Override
    public void fight() {
        System.out.println("O troll esta lutando");
    }


}
