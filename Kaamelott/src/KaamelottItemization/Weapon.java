package KaamelottItemization;

import KaamelottCharacter.Character;

public class Weapon implements Item {

    private int damage;
    private String name;
    private int weigth;

    public Weapon(int damage, String name, int weigth) {
        this.damage = damage;
        this.name = name;
        this.weigth = weigth;
    }

    
    
}
