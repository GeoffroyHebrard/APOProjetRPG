package KaamelottControl;
import KaamelottCharacter.Character;
import KaamelottItemization.Consumable;
import KaamelottCapacities.*;
import java.util.List;


public class Turn {
    private final Team teamA;
    private final Team teamB;
    DisplayText display;
    private Action actionA;
    private Action actionB;
    private HumanController HC;
    private HumanController C;
    

    public Turn( Team teamA, Team teamB) {
        this.teamA = teamA;
        this.teamB = teamB;
        HC=new HumanController();
        display=new DisplayText();
    }
    
   public Character choseCharacter(Controller cont,int tour){
       Team team;
       String mess;
       String message;
       if (tour%2==0)      
           mess="Chose your character \n";
       else
           mess="Chose your target \n";
       
       if (tour%3==0){ 
           team=teamA;
       } 
       else
       {
           team=teamB;
       }
           for (int i=0;i<team.getTeamNumber();i++)
           {
               if(team.getCharacterI(i).isAlive())
                   message=team.getCharacterI(i).getHp()+"HP\n";
                else
                   message="dead \n";
               if (team.getCharacterI(i).isAlive())
                    mess=mess+i+"-"+team.getCharacterI(i).getName()+" "+message;
           }
     int numCharac= enterCharac(cont,team.getTeamNumber()-1,mess);
     return team.getCharacterI(numCharac);
   } 
   
   public int enterCharac(Controller Cont,int max,String mess){

       
     if (Cont instanceof HumanController )
     {
       return display.getNumber(0,max,mess,"Please chose one of the integers");}
     else 
         return 400;
   }
   
   public Action choseAction(Character character){
        String mess="Chose what to do: \n"+"0-Attack \n"+"1-Use object \n";

            String messError="chose a number between 0 and 1";
       int num= display.getNumber(0,1,mess,messError); 
       if (num==0)
           return choseAttack(character);
       else
           return choseConsumable(character);
   }
   
   public Action choseConsumable(Character character){
       List<Consumable> listConsumables= character.getConsumables();
        String mess="Chose an object to use \n";
        int max=listConsumables.size();
        for(int i=0; i<max; i++) 
            {mess=mess+i+"-"+listConsumables.get(i).getName();}
            mess=mess+"\n"+max+" -Return";
            String messError="chose a number between 0 and "+max;
       int num= display.getNumber(0,max,mess,messError); 
       if(num==max)
           return choseAction(character);
       
       return character.getConsumableI(num);
   }
   
   public Action choseAttack(Character character){
       int max=character.getNbCapacity();
        String mess="Chose an action \n";
        
        for(int i=0; i<max; i++) 
            {mess=mess+i+"-"+character.getNameCapacityI(i)+"\n";}
        mess=mess+max+"-Return";
        
            String messError="chose a number between 0 and "+max;
       int num= display.getNumber(0,max,mess,messError); 
       if(num==max)
            return choseAction(character);
            
       return character.getCapacityI(num);
   }
   
   public void PlayTurn(){
       HumanController HC=new HumanController();
       boolean changeTarget=true;
       Character characterA=choseCharacter(HC,0); // Chose source in team A 
       actionA=choseAction(characterA);
       actionA.setSource(characterA);
       if (actionA instanceof Heal)
            actionB.setTarget(choseCharacter(HC,3)); // Chose target in team A
       if (actionA instanceof Consumable)
           if (((Consumable)actionA).getEffect().getValue()>0)
                changeTarget=false;
            
       if(changeTarget)
            actionA.setTarget(choseCharacter(HC,1)); // Chose target in team B 
       actionA.getEffect().applyEffect(actionA.getTarget());
       
       Character characterB=choseCharacter(HC,2);  // Chose source in team B
       actionB=choseAction(characterB);
       actionB.setSource(characterB);
       actionB.setTarget(choseCharacter(HC,3)); // Chose target in team A
       actionB.getEffect().applyEffect(actionB.getTarget());
                
   }
   
   
   
   
   
   
   
}
