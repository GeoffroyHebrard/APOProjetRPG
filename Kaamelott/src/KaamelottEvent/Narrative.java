/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KaamelottEvent;

import KaamelottControl.DisplayText;
import KaamelottControl.Team;
import java.util.List;

/**
 *
 * @author nitnek
 */
public class Narrative implements Event{
    private List<String> narration;
    private DisplayText display;
    private final int type=3;
    private Team team;
    private int numTell;

    public Narrative(List<String> narration, DisplayText display,Team team,int numTell) {
        this.narration = narration;
        this.display = display;
        this.team=team;
        this.numTell=numTell;
    }

    public int getType() {
        return type;
    }
    

   
    
    public void addMess(String mess){
        narration.add(mess);
    }
    
    public void Tell(){
        switch(numTell){
            case 1:narration.add("In 1587, "+team.getCharacterI(0).getName()+", "+team.getCharacterI(1).getName()+" and "+team.getCharacterI(2).getName());
        narration.add("were coming back to Britain and, as "+team.getCharacterI(0).getName()+" took excalibur from the rock, ");
        narration.add("everybody accepted him as the king of Kaamelott.");
        narration.add("But there was still much to do to acquire the Holy Graal.... ");
                break;
            default: 
                break;
        }
        
        display.display("\n" );
        for(int i=0;i<narration.size();i++)
        {
            display.display(narration.get(i));
            try {
                    Thread.sleep(3000);     //milliseconds
                } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        display.display("\n " );
        
    }
    
}
