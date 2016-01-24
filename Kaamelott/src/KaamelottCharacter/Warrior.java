package KaamelottCharacter;

import KaamelottCapacities.Attack;

public class Warrior extends Character {
    
    public Warrior(String name) {
       this(name,1);
    }
    
    public Warrior(String name,int level) {
        super(name,"Warrior",level);
        this.characteristic.put(Characteristic.STRENGTH,30+2*(level-1));
        this.characteristic.put(Characteristic.DEXTERITY,20+2*(level-1));
        this.characteristic.put(Characteristic.INTELLIGENCE,10+2*(level-1));
        this.characteristic.put(Characteristic.HEALTH,250+100*(level-1));
        this.characteristic.put(Characteristic.DEFENSE,50+2*(level-1));
        addCapacity(new Attack(this.getDmg(),"Staggering blow",this,this));
        hp=getHp();
    }
}
