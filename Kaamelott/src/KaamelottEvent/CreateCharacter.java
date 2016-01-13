/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KaamelottEvent;

import KaamelottControl.DisplayText;
import KaamelottControl.Team;
import KaamelottCharacter.*;

/**
 *
 * @author nitnek
 */
public class CreateCharacter implements Event{
    

    private DisplayText display;   
    private final int type=1;
    public CreateCharacter(DisplayText display) {
        this.display = display;
    }

    public int getType() {
        return type;
    }
    
    
    
    public String askName(){
        String message="Chose the name of your hero";
        return display.getMessage(message);
    }
    public int askType(){
        
        int min=1;
        int max=5;
        String mess="Chose a class"+"\n";
        
        //bloc d'ajout des classes
            mess=mess+" 1.Crossbowman"+"\n"
            +" 2.Druid"+"\n"
            +" 3.Knight"+"\n"
            +" 4.Thief"+"\n"
            +" 5.Warrior"+"\n";
        String messError="Chose a Number between "+min +" and "+max;
        
        return display.getNumber(min,max,mess,messError);
    }
    
    public void addCharac(Team team){
        KaamelottCharacter.Character charac;
        int choice=askType();
        String name=askName();
        switch (choice) {
            case 1:  charac = new Crossbowman(name);
                     break;
            case 2:  charac = new Druid(name);
                     break;
            case 3:  charac = new Knight(name);
                     break;
            case 4:  charac = new Thief(name);
                     break;
            case 5:  charac = new Warrior(name);
                     break;
            default: {display.displayError(1);
                    charac=new Crossbowman(name);
                     break;}
        }
    
    
        charac.addPotions();                
        team.addCharacterTeam(charac)  ;
    }
    
    
    
}
