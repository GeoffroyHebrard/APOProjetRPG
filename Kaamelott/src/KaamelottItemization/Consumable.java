package KaamelottItemization;

import KaamelottCharacter.Character;
import KaamelottControl.Action;


public class Consumable extends Action{
    private Effect effect;
    private int nb;
 

    public Consumable(int nb,Effect effect, String name) {
        super(name);
        this.effect = effect;
        this.nb = nb;
    }

    public Consumable(Effect effect, int nb, String name, Character target, Character source) {
        super(name, target, source);
        this.effect = effect;
        this.nb = nb;
    }

   
    public Effect doEffect() {
        nb--;
        return effect;
    }
    public Effect getEffect() {
        return effect;
    }

    public int getNumber() {
        return nb;
    }
    
    public int getValue(){
        return this.getValue();
    }
    
    
}
    

