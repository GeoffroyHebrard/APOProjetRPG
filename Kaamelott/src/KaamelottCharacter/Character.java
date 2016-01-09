package KaamelottCharacter;
import KaamelottCapacities.Capacity;
import KaamelottControl.Action;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Character {
    
    public final int MAXSTRENGTH = 999;
    public final int MAXDEXTERITY = 100;
    public final int MAXINTELLIGENCE = 100;
    public final int MAXHEALTH = 100;
    public final int MAXDEFENSE = 100;
    
    public final int MAXARMOREQUIPMENT = 2;
    public final int MAXWEAPONEQUIPMENT = 1;
    public final int MAXEQUIPMENT = 3;

    protected String name;
    protected String className;
    protected int level;
    protected int maxWeight;
    protected Map<Characteristic, Integer> characteristic;
    private List<Capacity> capacities;

    public Character(String name, String className) {
        this.name = name;
        this.className = className;
        this.level =1;
        this.maxWeight = 500;
        this.characteristic = new HashMap<>();
        this.characteristic.put(Characteristic.HEALTH, 150 + 2 * level + 3);
        characteristic.put(Characteristic.STRENGTH, 0);
        characteristic.put(Characteristic.DEXTERITY, 0);
        characteristic.put(Characteristic.INTELLIGENCE, 0);
        characteristic.put(Characteristic.DEFENSE, 0);
        capacities = new ArrayList<>();   
        }
    
    public String getName() {
        return name;
    }
    
    public Map<Characteristic, Integer> getCharacteristic() {
        return this.characteristic;
    }

    public int getLevel() {
        return level;
    }
    
    public int getMaxWeight() {
        return maxWeight;
    }
    
    public void setCharac(int value,Characteristic charac){
        this.characteristic.put(charac, 0);
    }
    
    public int getCharac(Characteristic charac){
        return this.characteristic.get(charac);
        
    }
    
    public final int getDmg(){
        return characteristic.get(Characteristic.STRENGTH);
          
    }

    public boolean isAlive() {
        if (0 >= this.characteristic.get(Characteristic.HEALTH)) {
            return false;
        }
        return true; 
    }
    public final void addCapacity(Capacity cap){
        capacities.add(cap);
}
    public int getNbCapacity(){
        return capacities.size();
    }
    public List<Capacity> getCapacities(){
        return capacities;
    }
    public Capacity getCapacityI(int i){
        return capacities.get(i);
    }
    
    public String getNameCapacityI(int i){
        return capacities.get(i).getName();
    }
    
    
    
    
    
    
}
