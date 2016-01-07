package KaamelottCharacter;
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
    protected int level;yyy
    protected int maxWeight;
    protected Map<Characteristic, Integer> characteristic;

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
        
        }
    
    public String getName() {
        return name;
    }
    
    public Map<Characteristic, Integer> getCharacteristic() {
        return characteristic;
    }

    public int getLevel() {
        return level;
    }
    
    public int getMaxWeight() {
        return maxWeight;
    }
    
    
    
    
    
    
    
    
    
}
