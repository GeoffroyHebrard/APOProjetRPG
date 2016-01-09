package KaamelottCapacities;
import KaamelottCharacter.Character;
import KaamelottControl.Action;
import KaamelottItemization.Effect;

public abstract class Capacity extends Action {
    
    private String name;
    private Effect effect;

    public Capacity(String name, Character target, Character source) {
        super(target, source);
        this.name = name;
        effect=new Effect();
    }

    

    public String getName() {
        return name;
    }

     public Effect getEffect() {
        return effect;
    }
    
}
