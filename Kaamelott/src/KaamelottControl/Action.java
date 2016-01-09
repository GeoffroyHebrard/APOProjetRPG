package KaamelottControl;
import KaamelottCharacter.Character;
import KaamelottCharacter.Characteristic;

public abstract class Action {

    private String name;
    private Character target;
    private Character source;
    private int vitesse;

    public Action(Character target, Character source) {
        this.target = target;
        this.source = source;
        this.vitesse=target.getCharacteristic().get(Characteristic.DEXTERITY);
         
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
    
}
