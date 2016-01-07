package KaamelottCapacities;
import KaamelottItemization.Effect;
import KaamelottCharacter.Character;
import KaamelottCharacter.Characteristic;
import java.util.HashMap;
import java.util.Map;


public class Attack implements Capacity {
    
    private int dmg;
    private Character target;
    private Character source;
    private Effect effect;
    

    public Attack(int dmg) {
        this.dmg = dmg;
    }

    public Attack(int dmg, Character target, Character source) {
        this.dmg = dmg;
        this.target = target;
        this.source = source;
    }
    

    @Override
    public void use() {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void attackEnnemy()
    {
        Map<Characteristic, Integer> characteristic = target.getCharacteristic(); 
    
        dmg=target.getCharacteristic().get(Characteristic.STRENGTH);
        int dextTar=target.getCharacteristic().get(Characteristic.DEXTERITY);
        int dextSrc=source.getCharacteristic().get(Characteristic.DEXTERITY);
        int defTar=target.getCharacteristic().get(Characteristic.DEFENSE);
        
        int randomNum =(int)(Math.random()*100); 
        int dodge =dextTar-dextSrc;
        if (dodge>=randomNum)
            {dmg=0;}
        dmg=dmg*(100-defTar)/100;
        
        effect = new Effect(target,-dmg,Characteristic.HEALTH);
    }
    
}
