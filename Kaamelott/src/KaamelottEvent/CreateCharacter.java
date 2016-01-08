/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KaamelottEvent;

import KaamelottControl.DisplayText;

/**
 *
 * @author nitnek
 */
public class CreateCharacter implements Event{
    DisplayText display;
    Character character;
    public void askName(){
        display.getMessage();
    }
    public void askType(){
        
        int min=1;
        int max=5;
        String mess="Choississez une classe";
        
        //bloc d'ajout des classes
            mess=mess+"//"+" 1.Crossbowman";
            mess=mess+"//"+" 2.Druid";
            mess=mess+"//"+" 3.Knight";
            mess=mess+"//"+" 4.Thief";
            mess=mess+"//"+" 5.Warrior";
        String messError="Choisissez un nombre entre "+min +" et "+"max";
        
        display.getNumber(min,max,mess,messError);
    }
    
}
