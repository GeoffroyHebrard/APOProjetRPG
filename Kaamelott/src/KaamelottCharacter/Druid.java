package KaamelottCharacter;

import KaamelottCapacities.Attack;
import KaamelottCapacities.Capacity;
import KaamelottCapacities.Spell;

public class Druid extends Character {
    
    public Druid(String name) {
       
        super(name,"Druid");
        this.characteristic.put(Characteristic.STRENGTH,20);
        this.characteristic.put(Characteristic.DEXTERITY,15);
        this.characteristic.put(Characteristic.INTELLIGENCE,50);
        this.characteristic.put(Characteristic.HEALTH,200);
        this.characteristic.put(Characteristic.DEFENSE,20);
        addCapacity(new Attack(this.getDmg(),"Stick hit",this,this));
        hp=getHp();
        Capacity capacity = new Spell(-2*characteristic.get(Characteristic.INTELLIGENCE),"Heal");
        this.getCapacities().add(capacity);
    }
}
