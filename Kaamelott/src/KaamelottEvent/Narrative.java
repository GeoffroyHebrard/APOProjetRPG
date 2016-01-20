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
            case 2:narration.add("But they still are people who don't agree with that and try to stop you ");
            narration.add("Your team try to find a druid who cause trouble,");
            narration.add("he has send 2 acolytes to stop you in your quest...\n\n");   
            narration.add("After drinking some goat's milk at the tavern , you go back to your home,");
            narration.add("you run into a dangerous enemy...");
                break;  
            case 3:narration.add("After your Amazing fight, you will looking for more information,");
            narration.add("about your enemy and ask people.\n");
            narration.add("However, some guys want to kick your ass! ");
                break;
            case 4:narration.add("Now you know it's not easy to ask people for information,");
            narration.add("you are careful and ask at 3 guys who look weak.\n");
            narration.add("They think you are insulting them cause they are redhead ");
                break;    
            case 5:narration.add("Your bravery attract someone to come with you in your adventure");
                break; 
            case 6:narration.add("Your new mate had some problem with the Russian mafia ");
            narration.add("Dragunov , IG0R and Apalkov come to take your money");
            narration.add("You don't have enough money and they become ANGRY ");
                break;
            case 7:narration.add("After all your fight, your are hungry and you looking for something to eat");
            narration.add("You find a pizzeria !");
            narration.add("However, 4 guys hungrier than you want your pizza");
                break;
            case 8:narration.add("The pizzaiolo come with you, this 4 guys always came here, ");
            narration.add("and stole lot of pizza !");
                break;
             case 9:narration.add("Lucky as you are, the pizzaiolo has information about the well-known dark Druid ");
            narration.add("You now know where find you enemy \n! ");
            narration.add("You walk 3 days and find your enemy in a cavern ! ");
                break;
            case 10:narration.add("You Win !");
                narration.add("You can pre-purchase the futur DLC to play the next adventure !");
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
