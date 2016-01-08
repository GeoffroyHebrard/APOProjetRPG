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
    private DisplayText display;

    public Fight(Team teamA, Team teamB) {
        this.teamA = teamA;
        this.teamB = teamB;
    }
    
    public void doFight(){
        
        Turn turn=new Turn(teamA,teamB); 
        while (teamA.isTeamAlive()&&teamB.isTeamAlive())
        {
            turn.PlayTurn();
        }
        if(teamA.isTeamAlive())
            display.display("vous avez vaincu votre ennemi");
        else
            display.display("vous avez été défait");         
    }
    
}
