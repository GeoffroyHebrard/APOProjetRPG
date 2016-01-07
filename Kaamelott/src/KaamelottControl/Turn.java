package KaamelottControl;


public class Turn {
    private HumanController HC;
    private Team teamA;
    private Team teamB;
    private boolean tour;

    public Turn(HumanController HC, Team teamA, Team teamB) {
        this.HC = HC;
        this.teamA = teamA;
        this.teamB = teamB;
    }
    
   public Character choseCharacter(){
       Team team;
       if (!tour){
           team=teamA;
       } 
       else
       {
           team=teamB;
       }
       
   } 
}
