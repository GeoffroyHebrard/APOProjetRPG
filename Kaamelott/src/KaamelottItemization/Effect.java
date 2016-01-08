package KaamelottItemization;
import KaamelottCharacter.Characteristic;
import KaamelottCharacter.Character;



public class Effect {

    
    private int value;
    private Characteristic characteristic;


    public Effect(Character target, int value,Characteristic characteristic/*, int duration*/) {
        this.value = value;
        /*this.duration = duration;*/
    }

    public int getValue() {
        return value;
    }
    
    public void applyEffect(Character target){
        target.setCharac(value,characteristic);
    }
    
}
