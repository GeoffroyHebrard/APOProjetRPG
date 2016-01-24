package KaamelottControl;
import KaamelottCharacter.Character;
import KaamelottCharacter.Characteristic;
import KaamelottItemization.Consumable;
import KaamelottItemization.Effect;

public abstract class Action {

    private String name;
    private Character target;
    private Character source;
    private int speed;

    public Action(String name,Character target, Character source) {
        this.target = target;
        this.source = source;
        this.speed=target.getCharacteristic().get(Characteristic.DEXTERITY);
        this.name=name;
         
    }  

    public Action(String name) {
        this.name = name;
        this.speed=0;
    }
    
    
    public Character getTarget(){
        return target;
        
    }
    public Character getSource(){
        return source;
        
    }
    
    public void setTarget(Character target)
    {
        this.target=target;
    }
    public abstract Effect doEffect();
    public abstract Effect getEffect();
    public abstract int getValue();

    public String getName() {
        return name;
    }

    public void setSource(Character source) {
        this.source = source;
    }

    public int getSpeed() {
        return speed;
    }
    
    public void setSpeed(){
        if(this instanceof Consumable)
            speed=101;//More than max of dexteririty
        else
            speed=this.getSource().getCharac(Characteristic.DEXTERITY);
        
    }
    
    
    
}
