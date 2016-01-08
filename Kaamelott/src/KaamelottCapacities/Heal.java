package KaamelottCapacities;
import KaamelottItemization.Effect;
import KaamelottCharacter.Characteristic;
import KaamelottCharacter.Character;

public class Heal extends Capacity {

    private int healthPoint;
    private Character target;
    private Effect effect;

    public Heal(int healthPoint, Character target, Effect effect, String name) {
        super(name);
        this.healthPoint = healthPoint;
        this.target = target;
        this.effect = effect;
    }
    

 
    
    
    public void Healing()
    {
        effect = new Effect(target,healthPoint,Characteristic.HEALTH);
    }
}
