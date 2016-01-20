package KaamelottCharacter;

import KaamelottCapacities.Attack;

public class Thief extends Character {
    
    public Thief(String name) {

        super(name,"Thief");
        this.characteristic.put(Characteristic.STRENGTH,20);
        this.characteristic.put(Characteristic.DEXTERITY,40);
        this.characteristic.put(Characteristic.INTELLIGENCE,10);
        this.characteristic.put(Characteristic.HEALTH,180);
        this.characteristic.put(Characteristic.DEFENSE,30);
        addCapacity(new Attack(this.getDmg(),"Traitor's blow",this,this));
        hp=getHp();
    }
}
