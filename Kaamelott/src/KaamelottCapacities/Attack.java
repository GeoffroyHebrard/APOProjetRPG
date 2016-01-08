package KaamelottCapacities;
import KaamelottItemization.Effect;
import KaamelottCharacter.Character;
import KaamelottCharacter.Characteristic;
import java.util.HashMap;
import java.util.Map;


public class Attack extends Capacity {
    
    private int dmg;
    private Character target;
    private Character source;
    private Effect effect;
    

    public Attack(int dmg, Character target, Character source, Effect effect, String name) {
        super(name);
        this.dmg = dmg;
        this.target = target;
        this.source = source;
        this.effect = effect;
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
