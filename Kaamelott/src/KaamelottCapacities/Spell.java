/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KaamelottCapacities;

import KaamelottCharacter.Characteristic;
import KaamelottItemization.Effect;
import java.util.Map;

/**
 *
 * @author Kalo
 */
public class Spell extends Capacity{
    private Effect effect;
    private int power;
    
    public Spell(String name, KaamelottCharacter.Character target, KaamelottCharacter.Character source) {
        super(name, target, source);
        effect= new Effect();
    }

    public Spell(int power, String name) {
        super(name);
        this.power = power;
    }
    
    
    @Override
    public Effect doEffect()
    {
        Map<Characteristic, Integer> characteristic = getTarget().getCharacteristic(); 
    
        power=100*getSource().getCharacteristic().get(Characteristic.INTELLIGENCE);
        int dextTar=getTarget().getCharacteristic().get(Characteristic.DEXTERITY);
        int dextSrc=getSource().getCharacteristic().get(Characteristic.DEXTERITY);
        int defTar=getTarget().getCharacteristic().get(Characteristic.DEFENSE);
        
        int randomNum =(int)(Math.random()*100); 
        int dodge =dextTar-dextSrc;
        if (dodge>=randomNum)
            {power=0;}
        power=power*(100-defTar)/100;
        
        return effect = new Effect(getTarget(),-power,Characteristic.HEALTH);
    }

    public Effect getEffect() {
        return effect;
    }

    
    
}
