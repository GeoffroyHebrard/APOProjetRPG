package KaamelottItemization;

import KaamelottCharacter.Characteristic;
import java.util.ArrayList;

public class Item {

    private final char name;

    private final int weight;
    
    ArrayList<Effect> listEffects = new ArrayList();

    public void untitledMethod() {
    }
    
    public Item(char name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    
    public void addEffect(Effect eff){
        listEffects.add(eff);  
    }
    
    public int getEffect(Characteristic ch){
        int i;
        for(i=0;i<listEffects.size();i++){
            if(listEffects.get(i).getCharacteristic()==ch){
            return listEffects.get(i).getValue();
        }
        }
        return -1;
    }

    public char getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    
}