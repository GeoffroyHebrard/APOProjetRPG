package KaamelottCharacter;

public class Warrior extends Character {
    
    public Warrior(String name) {
        super(name,"Warrior");
        this.characteristic.put(characteristic.STRENGTH,60);
        this.characteristic.put(characteristic.DEXTIRITY,40);
        this.characteristic.put(characteristic.INTELLIGENCE,50);
        this.characteristic.put(characteristic.HEALTH,200);
        this.characteristic.put(characteristic.DEFENSE,30);
        
    }
}
