/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KaamelottEvent;

import KaamelottControl.DisplayText;
import java.util.List;
import KaamelottControl.*;
import java.util.ArrayList;
import javax.xml.stream.events.Characters;


/**
 *
 * @author p1511544
 */
public class Scenario {
    private List<Event> events;
    private DisplayText display;
    private List<Team> teams;

    public Scenario(DisplayText display) {
        this.display = display;
    }

    
    public Scenario(List<Event> events) {
        this.events = events;
    }

    public Scenario(List<Event> events, DisplayText display, List<Team> teams) {
        this.events = events;
        this.display = display;
        this.teams = teams;
    }

    public Scenario(List<Event> events, DisplayText display) {
        this.events = events;
        this.display = display;
    }
  
    public void addEvent(Event event){
        events.add(event);
    }
    public void addTeam(){
        List<KaamelottCharacter.Character> members=new ArrayList();     
        Team teamA=new Team(members,0);
        teams.add(teamA);;
    }
    
    public void makeScenario()
    {
        teams=new ArrayList(); 
        addTeam();
        addTeam();
        teams.get(1).fillTeam(3);
        addEvent(makeCreateCharacter());
        addEvent(makeFight(teams.get(0),teams.get(1)));
        
        
    }
   
    
    public Fight makeFight(Team teamA,Team teamB )
    {
        Fight fight=new Fight(teamA,teamB,display);
        return fight;
    }
    
    public CreateCharacter makeCreateCharacter()
    {
        CreateCharacter create=new CreateCharacter(display);
        return create;
    }
    
    public Narrative makeTell()
    {
        List<String> narration= new ArrayList();
        Narrative tell= new Narrative(narration,display);   
        return tell;
    }
    
     public void readScenario()
    {
        for(int i=0;i<events.size();i++)
        {
            if(events.get(i) instanceof CreateCharacter)
                ((CreateCharacter)events.get(i)).addCharac(teams.get(0));
            else if(events.get(i) instanceof Fight)
            {
                 ((Fight)events.get(i)).doFight();
            }
            else{
                if(events.get(i) instanceof Narrative)
                    ((Narrative)events.get(i)).Tell();
            }
                        
        }        
    }
    
}
