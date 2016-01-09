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

    public CreateCharacter(DisplayText display) {
        this.display = display;
    }
    
    
    public String askName(){
        String message="Choisissez le nom de votre Héro";
        return display.getMessage(message);
    }
    public int askType(){
        
        int min=1;
        int max=5;
        String mess="Choississez une classe";
        
        //bloc d'ajout des classes
            mess=mess+"//"+" 1.Crossbowman";
            mess=mess+"//"+" 2.Druid";
            mess=mess+"//"+" 3.Knight";
            mess=mess+"//"+" 4.Thief";
            mess=mess+"//"+" 5.Warrior";
        String messError="Choisissez un nombre entre "+min +" et "+max;
        
        return display.getNumber(min,max,mess,messError);
    }
    
    public void addCharac(Team team){
        KaamelottCharacter.Character charac;
        int choix=askType();
        String name=askName();
        switch (choix) {
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
        team.addCharacterTeam(charac)  ;
    }
    
    
    
}
