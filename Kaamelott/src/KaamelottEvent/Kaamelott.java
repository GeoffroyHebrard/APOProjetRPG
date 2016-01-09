/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KaamelottEvent;

import KaamelottControl.DisplayText;
import KaamelottControl.Team;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nitnek
 */
public class Kaamelott {
    public static void main(String [] args)
	{
        List<Event> events=new ArrayList<Event>();
        List<Team> teams=new ArrayList<Team>();
        
        
            DisplayText display=new DisplayText();
		Scenario scenario=new Scenario(events,display,teams);
                scenario.makeScenario();
                scenario.readScenario();
                
	}
}
