package KaamelottCharacter;

import KaamelottCapacities.Attack;

public class Crossbowman extends Character {

    public Crossbowman(String name) {
       
        super(name,"Crossbowman");
        this.characteristic.put(Characteristic.STRENGTH,50);
        this.characteristic.put(Characteristic.DEXTERITY,30);
        this.characteristic.put(Characteristic.INTELLIGENCE,50);
        this.characteristic.put(Characteristic.HEALTH,200);
        this.characteristic.put(Characteristic.DEFENSE,20);
        addCapacity(new Attack(this.getDmg(),"Hit",this,this)); 
    }
     
}
