package KaamelottItemization;



public class Effect {

    private int characteristic;
    private int value;
    private int duration;

    public Effect(int characteristic, int value, int duration) {
        this.characteristic = characteristic;
        this.value = value;
        this.duration = duration;
    }
    
    
    public int getCharacteristic() {
        return characteristic;
    }

    public int getDuration() {
        return duration;
    }

    public int getValue() {
        return value;
    }
    
    
}
