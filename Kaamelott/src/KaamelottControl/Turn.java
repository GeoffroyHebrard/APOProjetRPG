package KaamelottControl;
import KaamelottCharacter.Character;


public class Turn {
    private final Team teamA;
    private final Team teamB;
    private boolean tour;
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
        tour=false;
    }
    
   public Character choseCharacter(Controller cont,boolean source){
       Team team;
       String mess;
       if (source)
       
           mess="Choisissez votre personnage";
           
       
       else
           mess="Choisissez la cible";
       
       if (tour^source){ //ou exclusif
           team=teamA;
       } 
       else
       {
           team=teamB;
       }
           for (int i=0;i<team.getTeamNumber();i++)
           {
               mess=mess+i+team.getCharacI(i).getName();
           }
     int numCharac= enterCharac(cont,team.getTeamNumber()-1,mess);
     return team.getCharacI(numCharac);
   } 
   
   public int enterCharac(Controller Cont,int max,String mess){

       
     if (Cont instanceof HumanController )
     {
       return display.getNumber(0,max,mess,"Veuillez choisir un des entiers proposés");}
     else 
         return 400;
   }
   
   public Action choseAction(Character character){
       int max=character.getNbCapacity();
        String mess="Choisissez une action";
        
        for(int i=0; i<max; i++) 
            {mess=mess+"//"+character.getNameCapacityI(i);}
          
        max--;
            String messError="choisissez un nombre en 0 et "+max;
       int num= display.getNumber(0,max,mess,messError); 
       
       return character.getCapacityI(num);
   }
   
   public void PlayTurn(){
       HumanController HC=new HumanController();
       Character characterA=choseCharacter(HC,true);
       actionA=choseAction(characterA);
       Character targetA=choseCharacter(HC,false);
       
       Character characterB=choseCharacter(HC,false);
       actionB=choseAction(characterB);
       actionB.setTarget(choseCharacter(HC,true));
                
   }
   
}
