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
    
    public void display(String mess){
        message=mess;
        System.out.println(message);
    }
    
    public String getMessage(){
        String str = sc.nextLine();
        return str;
    }
    public int getInteger(){
        String mes = getMessage();
        int messageRet = Integer.parseInt(mes);
        return messageRet;
       
    }
    public int getNumber(int min,int max,String mess,String messError){
        
        display(mess);
        int number=getInteger();
        while(number>max || number<min){
            display(messError);
            display(mess);
            number=getInteger();
        }
        return number;
    }
    
            
}
