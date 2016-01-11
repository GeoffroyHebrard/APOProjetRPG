/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KaamelottEvent;

import KaamelottCapacities.*;
import KaamelottControl.DisplayText;
import java.util.List;
import KaamelottControl.*;
import java.util.ArrayList;


/**
 *
 * @author p1511544
 */
public class Scenario {
    private List<Event> events;
    private DisplayText display;
    private List<Team> teams;
    private List<Capacity> capacities;

    public Scenario(DisplayText display) {
        this.display = display;
        teams=new ArrayList(); 
        events=new ArrayList(); 
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
        teams.add(teamA);
    }
    
    public void makeScenario()
    {
        createTeams();
        addEvent(makeCreateCharacter());
        addSpells();
        
        addEvent(makeFight(teams.get(0),teams.get(1)));
             
    }
    
    public void addSpells(){
        
        Capacity capacity = new Spell(40,"Fireball");
        addEvent(makeCapacity(capacity,0));
    }
    
    public void createTeams(){
        addTeam();      
        addTeam();
        teams.get(1).fillTeam(3);
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
    public AddCapacity makeCapacity(Capacity capacity,int nbCharac)
    {
        
        AddCapacity addCapacity= new AddCapacity(nbCharac,capacity);   
        return addCapacity;
    }
    
     public void readScenario()
    {
        for(int i=0;i<events.size();i++)
        {

            switch (events.get(i).getType()) {
            case 0:  ((AddCapacity)events.get(i)).doAddCapacity(teams.get(0));
                     break;
            case 1:  ((CreateCharacter)events.get(i)).addCharac(teams.get(0));
                     break;
            case 2:  ((Fight)events.get(i)).doFight();
                     break;
            case 3:  ((Narrative)events.get(i)).Tell();
                     break;
            
            default: {
                     break;}
            
            }      
        }        
    }
    
}
