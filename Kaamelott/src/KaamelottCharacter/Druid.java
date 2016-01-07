package KaamelottCharacter;

public class Druid extends Character {
    
    public Druid(String name) {
       
        super(name,"Druid");
        this.characteristic.put(characteristic.STRENGTH,50);
        this.characteristic.put(characteristic.DEXTIRITY,15);
        this.characteristic.put(characteristic.INTELLIGENCE,70);
        this.characteristic.put(characteristic.HEALTH,200);
        this.characteristic.put(characteristic.DEFENSE,20);
        
    }
}
