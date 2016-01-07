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

    @Override
    public void use() {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void attackEnnemy()
    {
        effect = new Effect(0,-dmg,0);
    }
    
}
