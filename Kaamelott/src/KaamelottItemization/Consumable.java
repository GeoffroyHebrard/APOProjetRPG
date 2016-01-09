package KaamelottItemization;

import KaamelottCharacter.Character;


public class Consumable extends Item {
    private Effect effect;

    public Consumable(Effect effect, char name, int weight, Character target, Character source) {
        super(name, weight, target, source);
        this.effect = effect;
    }

    

    public Effect getEffect() {
        return effect;
    }
    
    
    
}
    

