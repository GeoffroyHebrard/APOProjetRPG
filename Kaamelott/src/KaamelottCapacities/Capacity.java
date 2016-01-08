package KaamelottCapacities;
import KaamelottItemization.Actionnable;
import KaamelottItemization.Effect;

public abstract class Capacity implements Actionnable {
    
    private String name;
    private Effect effect;

    public Capacity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

     public Effect getEffect() {
        return effect;
    }
    
}
