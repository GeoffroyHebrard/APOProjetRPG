package KaamelottCharacter;

import KaamelottCapacities.Attack;

public class Druid extends Character {
    
    public Druid(String name) {
       
        super(name,"Druid");
        this.characteristic.put(Characteristic.STRENGTH,50);
        this.characteristic.put(Characteristic.DEXTERITY,15);
        this.characteristic.put(Characteristic.INTELLIGENCE,70);
        this.characteristic.put(Characteristic.HEALTH,200);
        this.characteristic.put(Characteristic.DEFENSE,20);
        addCapacity(new Attack(this.getDmg(),"Hit",this,this));  
    }
}
