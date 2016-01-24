package KaamelottItemization;

import KaamelottCharacter.Character;
import KaamelottCharacter.Characteristic;

public class Armor implements Item{

    private int defense;
    private String name;
    private int weigth;
    private boolean equiped; 

    public Armor(int defense, String name, int weigth) {
        this.defense = defense;
        this.name = name;
        this.weigth = weigth;
        equiped=false; 
        
    }

    @Override
    public void equipItem(Character character){
        this.equiped=true;
        character.setCharac(defense,Characteristic.DEFENSE);
    }

    public void dropItem(Character character){
        if(isEquiped()){
        this.equiped=false;
        character.setCharac(-defense,Characteristic.DEFENSE);
        }
    }
    
    public boolean isEquiped(){
        return equiped;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return defense;
    }
    
        public String getCharac(){
        return " Defense";
    }
  
}
