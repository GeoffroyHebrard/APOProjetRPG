package KaamelottCharacter;

public class Thief extends Character {
    
    public Thief(String name) {

        super(name,"Thief");
        this.characteristic.put(characteristic.STRENGTH,60);
        this.characteristic.put(characteristic.DEXTIRITY,40);
        this.characteristic.put(characteristic.INTELLIGENCE,50);
        this.characteristic.put(characteristic.HEALTH,200);
        this.characteristic.put(characteristic.DEFENSE,30);
        
    }
}
