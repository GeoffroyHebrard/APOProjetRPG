/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KaamelottEvent;

import KaamelottCapacities.*;
import KaamelottControl.DisplayText;
import KaamelottControl.Team;

/**
 *
 * @author Kalo
 */
public class AddCapacity implements Event {
    private final int Type=0;
    private Capacity capacity;
    private Team team;
    public int getType() {
        return Type;
    }


    public AddCapacity( int nbCapacity) {
        this.capacity = getCapacityI(nbCapacity);
    }
    
    
    
    public void doAddCapacity(Team team){
        DisplayText display=new DisplayText();
        String mess="Which character should learn "+capacity.getName() +" ?\n";
        int max=team.getTeamNumber();
        for (int i=0;i<max;i++)
           {
               mess=mess+i+"-"+team.getCharacterI(i).getName()+"\n";
           }
        String messError="Please chose a number between 0 and "+ (max-1);
        int nbCharac=display.getNumber(0,max-1,mess,messError);
        
        team.getCharacterI(nbCharac).addCapacity(capacity);
    }
    
    public Capacity getCapacityI(int nbCapacity){
        Capacity cap;
        switch(nbCapacity){
            case 0: cap=new Spell(40,"Fireball");
                break;
            default:
                cap=new Spell(5,"little Spell");
                break;
                      
        }
        return cap;
    }
}
