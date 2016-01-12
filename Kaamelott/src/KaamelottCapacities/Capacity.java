package KaamelottCapacities;
import KaamelottCharacter.Character;
import KaamelottControl.Action;
import KaamelottItemization.Effect;

public abstract class Capacity extends Action {
    
    private Effect effect;

    public Capacity(String name, Character target, Character source) {
        super(name,target, source);
        effect=new Effect();
    }

    public Capacity(String name) {
        super(name);
    }

     public abstract Effect doEffect();
     public abstract Effect getEffect();
     public abstract int getValue();
 
    
}
