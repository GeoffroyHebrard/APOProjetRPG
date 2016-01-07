package KaamelottCharacter;

public class Crossbowman extends Character {

    public Crossbowman(String name) {
       
        super(name,"Crossbowman");
        this.characteristic.put(characteristic.STRENGTH,50);
        this.characteristic.put(characteristic.DEXTIRITY,30);
        this.characteristic.put(characteristic.INTELLIGENCE,50);
        this.characteristic.put(characteristic.HEALTH,200);
        this.characteristic.put(characteristic.DEFENSE,20);
    }
     
}
