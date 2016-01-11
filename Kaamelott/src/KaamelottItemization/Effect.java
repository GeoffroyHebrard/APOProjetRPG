package KaamelottItemization;
import KaamelottCharacter.Characteristic;
import KaamelottCharacter.Character;



public class Effect {

    
    private int value;
    private Characteristic characteristic;

    public Effect() {
    }


    public Effect(Character target,int value,Characteristic characteristic) {
        this.value = value;
        this.characteristic =characteristic;
    }

    public int getValue() {
        return value;
    }
    
    public void applyEffect(Character target){
        target.setCharac(value,characteristic);
    }
    
}
