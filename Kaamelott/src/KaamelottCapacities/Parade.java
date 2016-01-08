package KaamelottCapacities;

public class Parade extends Capacity {

    private Attack dmg;
    private Character target;

    public Parade(Attack dmg, Character target, String name) {
        super(name);
        this.dmg = dmg;
        this.target = target;
    }
    
    
  
}
