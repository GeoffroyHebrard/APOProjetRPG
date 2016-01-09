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
    
    public Character getCharacI(int num){
        return this.characters.get(num);
    }
    
    public boolean isTeamAlive()
    {
        for(int i=0 ; i<(characters.size()) ;i++)
        {
            if(!(characters.get(i).isAlive()))
            {
                return false;
            }
        }
        return true;
    }
    
    
    
   
}
