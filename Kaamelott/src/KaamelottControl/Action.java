package KaamelottControl;
import KaamelottCharacter.Character;
import KaamelottCharacter.Characteristic;
import KaamelottItemization.Actionnable;

public class Action {

    private String name;
    private Character target;
    private Character source;
    private Actionnable actionnable;
    private int vitesse;

    public Action(Character target, Character source, Actionnable actionnable) {
        this.target = target;
        this.source = source;
        this.actionnable = actionnable;
        this.vitesse=target.getCharacteristic().get(Characteristic.DEXTERITY);
         
    }  
    
    
    
}
