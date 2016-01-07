package KaamelottItemization;

import KaamelottCharacter.Characteristic;
import java.util.ArrayList;

public class Item {

    private final char name;
    
    private final int weight;
    
    ArrayList<Effect> listEffects = new ArrayList();

    
    public Item(char name, int weight) {
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