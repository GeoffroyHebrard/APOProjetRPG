package KaamelottControl;
import KaamelottCharacter.Character;
import KaamelottItemization.Actionnable;




public class Turn {
    private Team teamA;
    private Team teamB;
    private boolean tour;
    DisplayText display;
    private Actionnable actionA;
    private Actionnable actionB;
    

    public Turn( Team teamA, Team teamB) {
        this.teamA = teamA;
        this.teamB = teamB;
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
     int numCharac= enterCharac(cont,team.getTeamNumber(),mess);
     return team.getCharacI(numCharac);
   } 
   
   public int enterCharac(Controller Cont,int max,String mess){

       
     if ( ! (Cont instanceof HumanController) )
       return display.getNumber(1,max,mess,"Veuillez choisir un des entiers proposés");
     else 
         return 1;
   }
   
   public Actionnable  choseAction(Character character){
       int max=character.getNbCapacity();
        String mess="Choisissez une action";
        
        for(int i=1; i<=max; i++) 
            {mess=mess+"//"+character.getNameCapacityI(i);}
          
            String messError="choisissez un nombre en 1 et "+max;
       int num= display.getNumber(1,max,mess,messError); 
       return character.getCapacityI(num);
   }
   
   public void PlayTurn(){
       HumanController HC=new HumanController();
       Character characterA=choseCharacter(HC,true);
       Character characterB=choseCharacter(HC,false);
       Character characterC=choseCharacter(HC,true);
       Character characterD=choseCharacter(HC,false);
       
       
   }
   
}
