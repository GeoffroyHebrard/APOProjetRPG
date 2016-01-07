package KaamelottItemization;


public class Consumable extends Item implements Actionnable{
    private Effect effect;

    public Consumable(Effect effect, char name, int weight) {
        super(name, weight);
        this.effect = effect;
    }

    }
    

