package KaamelottCapacities;
import KaamelottItemization.Effect;

public class Attack implements Capacity {
    
    private int dmg;
    private Character target;
    private Character source;
    private Effect effect;
    

    public Attack(int dmg) {
        this.dmg = dmg;
    }

    public Attack(int dmg, Character target, Character source) {
        this.dmg = dmg;
        this.target = target;
        this.source = source;
    }
    

    @Override
    public void use() {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void attackEnnemy()
    {
        dmg=source.attaque
        int randomNum =(int)(Math.random()*100); 
        int dodge =target.characteristic[1]-source.characteristic[1];
        if (dodge>=randomNum)
            {dmg=0;}
        dmg=dmg*(100-target.defense)/100;
        
        effect = new Effect(0,-dmg,0);
    }
    
}
