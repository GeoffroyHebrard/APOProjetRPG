/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KaamelottControl;
import java.util.Scanner;
/**
 *
 * @author p1306434
 */
public class DisplayText {
    String message;
    Scanner sc;

    public DisplayText(String message) {
        this.message = message;
    }
    
    public void display(){
        System.out.println(message);
    }
    
    public String getMessage(){
        String str = sc.nextLine();
        return str;
    }
    public int getEntier(){
        String mes = getMessage();
        int messageRet = Integer.parseInt(mes);
        return messageRet;
       
    }
            
}
