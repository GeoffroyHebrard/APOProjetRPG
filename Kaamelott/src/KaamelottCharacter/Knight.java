package KaamelottCharacter;

import KaamelottCapacities.Attack;
import KaamelottItemization.Item;
import KaamelottItemization.Weapon;

public final class Knight extends Character {
    
    
    public Knight(String name) {
       
        super(name,"Knight");
        this.characteristic.put(Characteristic.STRENGTH,50);
        this.characteristic.put(Characteristic.DEXTERITY,25);
        this.characteristic.put(Characteristic.INTELLIGENCE,0);
        this.characteristic.put(Characteristic.HEALTH,200);
        this.characteristic.put(Characteristic.DEFENSE,30);
        addCapacity(new Attack(this.getDmg(),"Sword hit",this,this));
        hp=getHp();   
        
    }
    
      
}
