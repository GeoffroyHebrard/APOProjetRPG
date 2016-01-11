package KaamelottControl;
import KaamelottCharacter.Character;
import KaamelottCharacter.Characteristic;
import KaamelottItemization.Effect;

public abstract class Action {

    private String name;
    private Character target;
    private Character source;
    private int vitesse;

    public Action(String name,Character target, Character source) {
        this.target = target;
        this.source = source;
        this.vitesse=target.getCharacteristic().get(Characteristic.DEXTERITY);
        this.name=name;
         
    }  

    public Action(String name) {
        this.name = name;
        this.vitesse=0;
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

    public String getName() {
        return name;
    }

    public void setSource(Character source) {
        this.source = source;
    }
    
    
    
    
}
