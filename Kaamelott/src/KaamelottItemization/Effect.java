package KaamelottItemization;
import KaamelottCharacter.Characteristic;
import KaamelottCharacter.Character;



public class Effect {

    private Character target;
    private int value;
    private Characteristic characteristic;


    public Effect(Character target, int value,Characteristic characteristic/*, int duration*/) {
        this.target = target;
        this.value = value;
        /*this.duration = duration;*/
    }

    public Character getTarget() {
        return target;
    }
    
    

    /*public int getDuration() {
        return duration;
    }
*/
    public int getValue() {
        return value;
    }
    
    public void applyEffect(){
        target.setCharac(value,characteristic);
    }
    
}
