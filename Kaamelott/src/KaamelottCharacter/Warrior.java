package KaamelottCharacter;

public class Warrior extends Character {
    
    public Warrior(String name) {
        super(name,"Warrior");
        this.characteristic.put(Characteristic.STRENGTH,60);
        this.characteristic.put(Characteristic.DEXTERITY,40);
        this.characteristic.put(Characteristic.INTELLIGENCE,50);
        this.characteristic.put(Characteristic.HEALTH,200);
        this.characteristic.put(Characteristic.DEFENSE,30);
        
    }
}
