package KaamelottItemization;

import KaamelottCharacter.Character;

public class Armor extends Item{

    private int defense;

    public Armor(int defense, char name, int weight, Character target, Character source) {
        super(name, weight, target, source);
        this.defense = defense;
    }

    
    
    
  
}
