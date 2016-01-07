package KaamelottItemization;

public class Weapon extends Item {

    private int damage;

    public Weapon(int damage, char name, int weight) {
        super(name, weight);
        this.damage = damage;
    }
    
}
