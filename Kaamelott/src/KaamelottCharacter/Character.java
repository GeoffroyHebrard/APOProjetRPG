package KaamelottCharacter;
import KaamelottCapacities.Capacity;
import KaamelottControl.DisplayText;
import KaamelottItemization.Armor;
import KaamelottItemization.Consumable;
import KaamelottItemization.Effect;
import KaamelottItemization.Item;
import KaamelottItemization.Weapon;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Character {
    
    public final int MAXSTRENGTH = 200;
    public final int MAXDEXTERITY = 100;
    public final int MAXINTELLIGENCE = 100;
    public final int MAXHEALTH = 1000;
    public final int MAXDEFENSE = 100;

    protected String name;
    protected String className;
    protected int hp;  
    protected int level;
    protected int maxWeight;
    protected Map<Characteristic, Integer> characteristic;
    private List<Capacity> capacities;
    private List<Consumable> consumables;
    private int experience;
    private List<Item> equipment;
    DisplayText display;


    
    public Character(String name, String className,int level) {
        this.name = name;
        this.className = className;
        this.level =level;
        maxWeight = 500;
        experience=0;
        characteristic = new HashMap<>();
        capacities = new ArrayList<>();  
        consumables= new ArrayList<>();
        equipment= new ArrayList<>();
        display=new DisplayText();
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
    
    public int setCharac(int value,Characteristic charac){ 
        int test=this.getCharac(charac)+value;
        if (charac==Characteristic.HEALTH){
                if(test>=hp) test=hp;
                if(test<=0) test = 0;
                }
        
            
        this.characteristic.put(charac,test);
        return test;
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
    
    public int getHp(){
        return characteristic.get(Characteristic.HEALTH);
    }

    public List<Consumable> getConsumables() {
        return consumables;
    }
    
    public void addPotions(){
        Effect effect = new Effect(this,200, Characteristic.HEALTH);
        Consumable potion = new Consumable(effect,5,"potion",this,this);
        consumables.add(potion);
    }
    public void addKillerParchment(){
        Effect effect = new Effect(this,-200, Characteristic.HEALTH);
        Consumable KP = new Consumable(effect,2,"Killer Parchment",this,this);
        consumables.add(KP);
    }
            
            
    public Consumable getConsumableI(int i)
    {
        return consumables.get(i);
    }
    
    public boolean levelUp(){
        int limit=this.level*100;
        if (this.experience>=limit){
            this.level=this.level+1;
            this.experience=this.experience-limit;
            this.hp=hp+100*this.level;
            setCharac(100,Characteristic.HEALTH);
            setCharac(2,Characteristic.DEFENSE);
            setCharac(2,Characteristic.DEXTERITY);
            setCharac(2,Characteristic.STRENGTH);
            setCharac(2,Characteristic.INTELLIGENCE);
            return true;
            
        }
        return false;
    }
    
    public boolean earnXp(int xp){
        this.experience=this.experience+xp;
        return levelUp();
    }
    
    public Item getEquipmentI(int i){
        return equipment.get(i);
        
    }
    
    public void addEquipment(Item item){
        equipment.add(item);
    }

    public void equip() {
        int max=equipment.size();
        String mess="Which equipment do you wish to equip ? \n";
        for (int i=0;i<max;i++)
           {
               if (this.getEquipmentI(i).isEquiped())
                   mess=mess+"(Equiped)";
               mess=mess+i+"-"+this.getEquipmentI(i).getName()+"(+";
               mess=mess+this.getEquipmentI(i).getValue()+this.getEquipmentI(i).getCharac()+" )\n";

           }
        mess=mess+max+"- Return";
        String messError="Please chose a number between 0 and "+max;
        int value=display.getNumber(0,max,mess,messError);
        if (value==max)
            return ;
        if(this.getEquipmentI(value) instanceof Armor){
            this.desequipArmor();
        }
        else
        {
            this.desequipWeapon();
        }
        equipment.get(value).equipItem(this);
    }
    public void useConsumable() {
        int max=consumables.size();
        String mess="Which consumable do you wish to use ? ";
        for (int i=0;i<consumables.size();i++)
           {
               if(this.consumables.get(i).getNumber()>0)
                mess=mess+"\n"+i+"-"+this.getConsumableI(i).getName()+" ("+this.getConsumableI(i).getNumber()+")\n";
               else 
                   max--;
           }
        mess=mess+max+"- Return";
        String messError="Please chose a number between 0 and "+max;
        int value=display.getNumber(0,max,mess,messError);
        if (value==max)
            return ;
        consumables.get(value).doEffect().applyEffect(this);
    }
    
    public void stats() {
        display.display(this.name+" : Level "+this.level);
        display.display("Health="+this.characteristic.get(Characteristic.HEALTH)+"/"+this.hp);
        display.display("Strength="+this.characteristic.get(Characteristic.STRENGTH));
        display.display("Defense="+this.characteristic.get(Characteristic.DEFENSE));
        display.display("Dexterity="+this.characteristic.get(Characteristic.DEXTERITY));
        display.display("Intelligence="+this.characteristic.get(Characteristic.INTELLIGENCE));
        
        
    }
    
    public void desequipArmor(){
        for (int i=0;i<equipment.size();i++)
        {
            if (getEquipmentI(i)instanceof Armor ){
                this.getEquipmentI(i).dropItem(this);
            }       
        }      
    }
    
    public void desequipWeapon(){
        for (int i=0;i<equipment.size();i++)
        {
            if (getEquipmentI(i)instanceof Weapon ){
                this.getEquipmentI(i).dropItem(this);
            }       
        }      
    }
}
