package KaamelottCharacter;

public class Knight extends Character {
    
    public Knight(String name) {
       
        super(name,"Knight");
        this.characteristic.put(characteristic.STRENGTH,60);
        this.characteristic.put(characteristic.DEXTIRITY,15);
        this.characteristic.put(characteristic.INTELLIGENCE,30);
        this.characteristic.put(characteristic.HEALTH,200);
        this.characteristic.put(characteristic.DEFENSE,30);
        
    }
}
