package KaamelottItemization;

import KaamelottCharacter.Character;
import KaamelottControl.Action;
import java.util.ArrayList;

public class Item extends Action{

    private final char name;
    
    private final int weight;
    
    ArrayList<Effect> listEffects = new ArrayList();

    public Item(char name, int weight, Character target, Character source) {
        super(target, source);
        this.name = name;
        this.weight = weight;
    }

     
    public void addEffect(Effect eff){
        listEffects.add(eff);  
    }
    

    public char getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    
}