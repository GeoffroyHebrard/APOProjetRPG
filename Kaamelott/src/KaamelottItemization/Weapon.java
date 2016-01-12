package KaamelottItemization;

import KaamelottCharacter.Character;
import KaamelottCharacter.Characteristic;

public class Weapon implements Item {

    private int damage;
    private String name;
    private int weigth;
    private boolean equiped;
    private Characteristic characteristic;

    public Weapon(int damage, String name, int weigth,Characteristic characteristic) {
        this.damage = damage;
        this.name = name;
        this.weigth = weigth;
        this.characteristic=characteristic;
    }

    public void equipItem(Character character){
        this.equiped=true;
        character.setCharac(damage,characteristic);
    }

    public void dropItem(Character character){
        if(isEquiped()){
        this.equiped=false;
        character.setCharac(-damage,characteristic);
        }
    }
    
    public boolean isEquiped(){
        return equiped;
    }

    public String getName() {
        return name;
    }
    
    
}
