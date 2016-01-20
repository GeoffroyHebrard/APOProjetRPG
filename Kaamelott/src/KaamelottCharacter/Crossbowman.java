package KaamelottCharacter;

import KaamelottCapacities.Attack;

public class Crossbowman extends Character {

    public Crossbowman(String name) {
       
        super(name,"Crossbowman");
        this.characteristic.put(Characteristic.STRENGTH,40);
        this.characteristic.put(Characteristic.DEXTERITY,40);
        this.characteristic.put(Characteristic.INTELLIGENCE,20);
        this.characteristic.put(Characteristic.HEALTH,150);
        this.characteristic.put(Characteristic.DEFENSE,20);
        addCapacity(new Attack(this.getDmg(),"Blow arrow",this,this)); 
        hp=getHp();
    }
     
}
