package KaamelottItemization;

import KaamelottCharacter.Character;

public class Weapon extends Item {

    private int damage;

    public Weapon(int damage, char name, int weight, Character target, Character source) {
        super(name, weight, target, source);
        this.damage = damage;
    }

    
    
}
