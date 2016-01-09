package KaamelottCharacter;

import KaamelottCapacities.Attack;

public class Knight extends Character {
    
    public Knight(String name) {
       
        super(name,"Knight");
        this.characteristic.put(Characteristic.STRENGTH,60);
        this.characteristic.put(Characteristic.DEXTERITY,15);
        this.characteristic.put(Characteristic.INTELLIGENCE,30);
        this.characteristic.put(Characteristic.HEALTH,200);
        this.characteristic.put(Characteristic.DEFENSE,30);
        addCapacity(new Attack(this.getDmg(),"Hit",this,this)); 
        
    }
}
