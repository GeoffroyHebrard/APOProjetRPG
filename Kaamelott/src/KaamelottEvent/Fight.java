/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KaamelottEvent;

import KaamelottControl.Team;
import KaamelottControl.Turn;
import KaamelottControl.DisplayText;

/**
 *
 * @author p1511544
 */
public class Fight implements Event {
    private Team teamA;
    private Team teamB;
    private final int type=2;
    private DisplayText display;

    public Fight(Team teamA, Team teamB,DisplayText display) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.display=display;
    }

    public int getType() {
        return type;
    }
    
    
    public void doFight(){
        
        String message="You're beginning a fight against: \n";
        for (int i=0;i<teamB.getTeamNumber();i++)
        {
         message=message+teamB.getCharacterI(i).getName()+"\n";   
        }
        display.display(message);
        Turn turn=new Turn(teamA,teamB); 
        while (teamA.isTeamAlive()&&teamB.isTeamAlive())
        {
            turn.PlayTurn();
        }
        if(teamA.isTeamAlive())
            display.display("you overcame your ennemy, Well done !");
        else
            display.display("you have been defeated");         
    }
    
}
