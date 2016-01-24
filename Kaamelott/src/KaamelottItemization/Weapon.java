package KaamelottItemization;

import KaamelottCharacter.Character;
import KaamelottCharacter.Characteristic;

public class Weapon implements Item {

    private final int damage;
    private final String name;
    private final int weigth;
    private boolean equiped;
    private final Characteristic characteristic;

    public Weapon(int damage, String name, int weigth,Characteristic characteristic) {
        this.damage = damage;
        this.name = name;
        this.weigth = weigth;
        this.characteristic=characteristic;
    }

    @Override
    public void equipItem(Character character){
        this.equiped=true;
        character.setCharac(damage,characteristic);
    }

    @Override
    public void dropItem(Character character){
        if(isEquiped()){
        this.equiped=false;
        character.setCharac(-damage,characteristic);
        }
    }
    
    @Override
    public boolean isEquiped(){
        return equiped;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getValue() {
        return damage;
    }
    
    @Override
    public String getCharac(){
        if(characteristic==Characteristic.INTELLIGENCE)
            return " Intelligence";
        if(characteristic==Characteristic.STRENGTH)
            return " Damage";
        if(characteristic==Characteristic.DEXTERITY)
            return " Dexterity";
        return "";
        
    }
    
    
}
