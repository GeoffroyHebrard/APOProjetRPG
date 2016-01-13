/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KaamelottEvent;

import KaamelottControl.*;


/**
 *
 * @author p1511544
 */
public class Fight implements Event {
    private Team teamA;
    private Team teamB;
    private final int type=2;
    private DisplayText display;
    private Controller contA;
    private Controller contB;
    private int xp;

    public Fight(Team teamA, Team teamB,DisplayText display,int xp) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.display=display;
        this.contA=new HumanController();
        this.contB=new AIController();
        this.xp=xp;
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
        Turn turn=new Turn(teamA,teamB,contA,contB); 
        while (teamA.isTeamAlive()&&teamB.isTeamAlive())
        {
            turn.PlayTurn();
        }
        if(teamA.isTeamAlive())
            display.display("ou overcame your ennemy, Well done !");
        else
            display.display("You have been defeated");
        
        for (int i=0;i<teamA.getTeamNumber();i++)
        {
         if (teamA.getCharacterI(i).earnXp(xp)){
             display.display("You earned a level with"+ teamA.getCharacterI(i).getName());
         }
        }
    }
    
}
