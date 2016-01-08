package KaamelottControl;
import KaamelottCharacter.Character;
import KaamelottCharacter.Characteristic;
import KaamelottItemization.Actionnable;

public class Action {

    private String name;
    private Character target;
    private Character source;
    private Actionnable action;
    private int vitesse;

    public Action(Character target, Character source, Actionnable action) {
        this.target = target;
        this.source = source;
        this.action = action;
        this.vitesse=target.getCharacteristic().get(Characteristic.DEXTERITY);
         
    }  
}
