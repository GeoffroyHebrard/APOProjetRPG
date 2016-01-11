package KaamelottCapacities;
import KaamelottItemization.Effect;
import KaamelottCharacter.Characteristic;
import KaamelottCharacter.Character;

public class Heal extends Capacity {

    private int healthPoint;
    private Effect effect;


    public Heal(int healthPoint, Effect effect, String name, Character target, Character source) {
        super(name, target, source);
        this.healthPoint = healthPoint;
        this.effect = effect;
    }
    
      
    
    @Override
    public Effect doEffect()
    {
        return effect = new Effect(getTarget(),healthPoint,Characteristic.HEALTH);
    }

    public Effect getEffect() {
        return effect;
    }

 
    
    
}
