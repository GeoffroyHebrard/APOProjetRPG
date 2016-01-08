package KaamelottCapacities;
import KaamelottItemization.Actionnable;

public abstract class Capacity implements Actionnable {
    
    private String name;

    public Capacity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
}
