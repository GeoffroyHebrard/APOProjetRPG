/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KaamelottEvent;

import KaamelottCapacities.Capacity;
import KaamelottControl.Team;

/**
 *
 * @author Kalo
 */
public class AddCapacity implements Event {
    private final int Type=0;
    private Capacity capacity;
    private int nbCharac;
    private int nbCapacity;
    private Team team;
    public int getType() {
        return Type;
    }

    public AddCapacity(int nbCharac,Capacity capacity) {
        this.nbCharac = nbCharac;
        this.capacity = capacity;
        
    }

    public AddCapacity(int nbCharac, int nbCapacity) {
        this.nbCharac = nbCharac;
        this.nbCapacity = nbCapacity;
    }
    
    
    public void doAddCapacity(Team team){
        team.getCharacterI(nbCharac).addCapacity(capacity);
    }
    
}
