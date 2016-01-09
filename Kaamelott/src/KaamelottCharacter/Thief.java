package KaamelottCharacter;

import KaamelottCapacities.Attack;

public class Thief extends Character {
    
    public Thief(String name) {

        super(name,"Thief");
        this.characteristic.put(Characteristic.STRENGTH,60);
        this.characteristic.put(Characteristic.DEXTERITY,40);
        this.characteristic.put(Characteristic.INTELLIGENCE,50);
        this.characteristic.put(Characteristic.HEALTH,200);
        this.characteristic.put(Characteristic.DEFENSE,30);
        addCapacity(new Attack(this.getDmg(),"Hit"));       
    }
}
