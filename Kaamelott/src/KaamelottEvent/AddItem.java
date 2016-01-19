/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KaamelottEvent;

import KaamelottCharacter.Characteristic;
import KaamelottControl.DisplayText;
import KaamelottControl.Team;
import KaamelottItemization.*;

/**
 *
 * @author nitnek
 */
public class AddItem implements Event{
    private final int type=4;
    private Team team;
    private int nbItem; 

    public AddItem(Team team, int nbItem) {
        this.team = team;
        this.nbItem = nbItem;
    }

    public int getType() {
        return type;
    }
    /*public void characGetsItem(){
        team.getCharacterI(nbCharac).addEquipment(item);
        
    
    }*/
    
    public void doAddItem(){
    DisplayText display=new DisplayText();
    int nbCharac=0;
    String characteristic;
    Item item;
    int nbWeaponStrength=1;
    int nbWeaponIntelligence=1+nbWeaponStrength;
    int nbArmor=1+nbWeaponIntelligence;
        switch(nbItem){
            case 1:
                item= new Weapon(40,"Excalibur",10,Characteristic.STRENGTH);
                break;
            case 2:
                item= new Weapon(40,"Magic stick",10,Characteristic.INTELLIGENCE);
                break;
            default:
                item= new Armor(0,"Thornmail",10);
                break;
        }
        if (nbItem>nbWeaponStrength)
        {
            if (nbItem>nbWeaponIntelligence)
                characteristic=" Defense";
            else
                 characteristic=" Intelligence";  
        }
        else
           characteristic="Srength";
        
        if(nbItem!=1){
            String mess="Chose which character will get this:"+item.getName()+"(+"+item.getValue()+" "+characteristic+") \n";
            for (int i=0;i<team.getTeamNumber();i++)
            {
                mess=mess+i+"-"+team.getCharacterI(i).getName()+"\n";
            }
            
            String messError="Please chose a number between 0 and "+team.getTeamNumber();
            nbCharac=display.getNumber(0,team.getTeamNumber(),mess,messError);
            
        }
        team.getCharacterI(nbCharac).addEquipment(item);
        display.display(team.getCharacterI(nbCharac).getName()+" obtained "+item.getName());
    }
}
