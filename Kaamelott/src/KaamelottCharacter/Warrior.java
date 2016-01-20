package KaamelottCharacter;

import KaamelottCapacities.Attack;

public class Warrior extends Character {
    
    public Warrior(String name) {
        super(name,"Warrior");
        this.characteristic.put(Characteristic.STRENGTH,30);
        this.characteristic.put(Characteristic.DEXTERITY,20);
        this.characteristic.put(Characteristic.INTELLIGENCE,10);
        this.characteristic.put(Characteristic.HEALTH,250);
        this.characteristic.put(Characteristic.DEFENSE,50);
        addCapacity(new Attack(this.getDmg(),"Staggering blow",this,this));
        hp=getHp();
    }
}
