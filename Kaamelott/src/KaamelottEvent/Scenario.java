/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KaamelottEvent;

import KaamelottCapacities.*;
import KaamelottCharacter.Characteristic;
import KaamelottCharacter.*;
import KaamelottControl.*;
import KaamelottControl.DisplayText;
import KaamelottItemization.*;
import java.util.ArrayList;
import java.util.List;


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
        addEvent(makeCreateCharacter());
        addEvent(makeCreateCharacter());
        addEvent(makeTell(1));
        gainObject(1);
        gainObject(2);
        addSpells();       
        addEvent(makeFight(teams.get(0),teams.get(1)));
        addEvent(makeTell(2));
        addEvent(makeFight(teams.get(0),teams.get(2)));
             
    }
    
    public void addSpells(){
        
        Capacity capacity = new Spell(40,"Fireball");
        addEvent(makeCapacity(capacity,0));
    }
    
    public void createTeams(){
        addTeam();    
        //team 1
        addTeam();
        teams.get(1).fillTeam(3);
        //team 2
        addTeam();
        teams.get(2).addCharacterTeam(new Crossbowman("Michel"));
        teams.get(2).addCharacterTeam(new Druid("Elias"));

    }
    
    public void gainObject(int  nbItem){
        AddItem addItem= new AddItem(teams.get(0),nbItem);
         addEvent(addItem);
    }
    
    public Fight makeFight(Team teamA,Team teamB )
    {        

        Fight fight=new Fight(teamA,teamB,display,150);
        return fight;
    }
    
    public CreateCharacter makeCreateCharacter()
    {
        CreateCharacter create=new CreateCharacter(display);
        return create;
    }
    
    public Narrative makeTell(int numTell)
    {
        List<String> narration= new ArrayList();
        
        Narrative tell =new Narrative(narration,display,teams.get(0),numTell);   
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
            case 4:  ((AddItem)events.get(i)).doAddItem();
                     break;
            
            default: {
                     break;}
            
            } 
            String message="Chose an action \n 1. Use Potion"+"\n"
            +" 2. Equip Character"+"\n"
            +" 3. View Stats"+"\n"
            +" 4. Continue adventure"+"\n";
            
            String messError="Chose a number between "+1 +" and "+4;
        
        int number=0;
        if(events.get(i).getType()==2 ||events.get(i).getType()==0){
        while (number!=4){
        number=display.getNumber(1,4,message,messError);
        switch (number) {
            case 1:  teams.get(0).takeObject();
                     break;
            case 2:  
                    teams.get(0).equipCharacter();                   
                     break;
            case 3:  
                    teams.get(0).showStats();
                     break;
            case 4:
            
            default: {
                     break;}
            
                    }     
                }
            } 
        }
    }
    
}
