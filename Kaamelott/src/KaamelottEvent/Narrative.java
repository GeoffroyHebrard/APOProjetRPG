/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KaamelottEvent;

import KaamelottControl.DisplayText;
import java.util.List;

/**
 *
 * @author nitnek
 */
public class Narrative implements Event{
    private List<String> narration;
    private DisplayText display;
    private final int type=3; 

    public Narrative(List<String> narration, DisplayText display) {
        this.narration = narration;
        this.display = display;
    }

    public int getType() {
        return type;
    }

   
    
    public void addMess(String mess){
        narration.add(mess);
    }
    
    public void Tell(){
        for(int i=0;i<narration.size();i++)
        {
            display.display(narration.get(i));
        }
        
    }
    
}
