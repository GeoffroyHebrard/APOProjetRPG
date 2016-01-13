/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KaamelottControl;
import java.util.ArrayList;
import java.util.List;
import KaamelottCharacter.Character;
import KaamelottCharacter.*;


/**
 *
 * @author p1511544
 */
public class Team {
    private List<Character> characters;
    protected int teamNumber;

    
    
    public Team() {
        teamNumber=0;
        characters = new ArrayList<>();

    }

    public Team(List<Character> characters, int teamNumber) {
        this.characters = characters;
        this.teamNumber = teamNumber;
    }
    
    
    public void addCharacterTeam(Character character) {
        characters.add(character);
        teamNumber++;
    }
    
    public void fillTeam(int number){
        for(int i=0;i<number;i++){
            this.addCharacterTeam(new Thief("thief"+i)); 
        }
    }
    
    public List<Character> getCharacters(){
        return characters;
    }
    
    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }
    
    public int getTeamNumber() {
        return teamNumber;
    }
    
    public Character getCharacterI(int num){
        
        return this.characters.get(num);
    }
    
    public boolean isTeamAlive()
    {
        for(int i=0 ; i<(characters.size()) ;i++)
        {
            if(characters.get(i).isAlive())
            {
                return true;
            }
        }
        return false;
    }
    public void equipCharacter(){
        DisplayText display=new DisplayText();
        int max=characters.size();
        String mess="Which character do you wish to equip ?\n";
        for (int i=0;i<max;i++)
           {
               mess=mess+i+"-"+this.getCharacterI(i).getName()+"\n";
           }
        String messError="Please chose a number between 0 and "+max;
        mess=mess+max+"- Return";
        int value=display.getNumber(0,max+1,mess,messError);
        if (value==max)
            return ;
        characters.get(value).equip();
    }
    
    public void takeObject(){
        int max=characters.size();
        String mess="Which character do you wish to use a consumable with ?"+"\n";
        for (int i=0;i<max;i++)
            {
                mess=mess+i+"-"+this.getCharacterI(i).getName()+"-"+this.getCharacterI(i).getHp()+"HP"+"\n";
            }
        String messError="Please chose a number between 0 and "+max;
        DisplayText display=new DisplayText();
        mess=mess+max+"- Return";
        int value=display.getNumber(0,max+1,mess,messError);
        if (value==max)
            return ;
        characters.get(value).useConsumable();              
    }        
    
    
    public void showStats(){
            int max=characters.size();
        String mess="Which character do you wish to see stats ?"+"\n";
        for (int i=0;i<max;i++)
            {
                mess=mess+i+"-"+this.getCharacterI(i).getName()+"-"+this.getCharacterI(i).getHp()+"HP"+"\n";
            }
        String messError="Please chose a number between 0 and "+max;
        DisplayText display=new DisplayText();
        mess=mess+max+"- Return";
        int value=display.getNumber(0,max+1,mess,messError);
        if (value==max)
            return ;
        characters.get(value).stats();        
        
        
        
    }
     




    public void showHp(){
        int max=characters.size();
        DisplayText display=new DisplayText();
        for (int i=0;i<max;i++)
            {
                   display.display(this.getCharacterI(i).getName()+"-"+this.getCharacterI(i).getHp()+"HP\n");
            }
        
        
        
    }




}
