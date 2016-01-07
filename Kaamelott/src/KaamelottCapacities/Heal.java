package KaamelottCapacities;
import KaamelottItemization.Effect;
import KaamelottCharacter.Characteristic;
import KaamelottCharacter.Character;

public class Heal implements Capacity {

    private int healthPoint;
    private Character target;
    private Effect effect;
    
    @Override
    public void use() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Heal(int healthPoint, Character target) {
        this.healthPoint = healthPoint;
        this.target = target;
    }
    
    
    public void Healing()
    {
        effect = new Effect(target,healthPoint,Characteristic.HEALTH);
    }
}
