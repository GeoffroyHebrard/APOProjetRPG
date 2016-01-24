package KaamelottCharacter;

import KaamelottCapacities.Attack;

public class Crossbowman extends Character {

    public Crossbowman(String name) {
       
        this(name,1);
    }
     
    public Crossbowman(String name,int level) {
       
        super(name,"Crossbowman",level);
        this.characteristic.put(Characteristic.STRENGTH,40+2*(level-1));
        this.characteristic.put(Characteristic.DEXTERITY,40+2*(level-1));
        this.characteristic.put(Characteristic.INTELLIGENCE,20+2*(level-1));
        this.characteristic.put(Characteristic.HEALTH,150+100*(level-1));
        this.characteristic.put(Characteristic.DEFENSE,20+2*(level-1));
        addCapacity(new Attack(this.getDmg(),"Blow arrow",this,this)); 
        hp=getHp();
    }
}
