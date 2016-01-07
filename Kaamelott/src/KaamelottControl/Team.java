/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KaamelottControl;
import java.util.ArrayList;
import java.util.List;
import KaamelottCharacter.Character;


/**
 *
 * @author p1511544
 */
public class Team {
    private List<Character> characters;
    protected int teamNumber;
    
    
    public Team(int teamNumber) {
        this.teamNumber = teamNumber;
        characters = new ArrayList<>();
    }
    
    public void addCharacterTeam(Character character) {
        characters.add(character);
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
    
    
    
    
    
    
    
    
    
    
    
    
}
