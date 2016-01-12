/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KaamelottControl;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author p1306434
 */
public class DisplayText {
    String message;
    Scanner sc;

    public DisplayText(Scanner sc) {
        this.sc = sc;
    }

    public DisplayText() {
    }
    
    

    public DisplayText(String message) {
        this.message = message;
    }
    
    public void display(String mess){
        message=mess;
        System.out.println(message);
    }
    
    public String getMessage(String message){
        display(message);
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        return str;
    }
    public int getInteger(int min){
        message="";
        String mes = getMessage(message);
        int messageRet=min-1;
        try{
        messageRet = Integer.parseInt(mes);
        }
        catch(NumberFormatException e){
            return min-1;
        }
        return messageRet;
       
    }
    public int getNumber(int min,int max,String mess,String messError){
        
        display(mess);
        int number=getInteger(min);
        while(number>max || number<min){
            display(messError);
            display(mess);
            number=getInteger(min);
        }
        return number;
    }
    
    public int getListNumber(int min,List<Integer> listNb,String mess,String messError){
        
        display(mess);
        int number=getInteger(min);
        boolean isin=false;       
            
        while(!isin){
            for(int i=min;i<listNb.size();i++){
                if (listNb.get(i)==number)
                    isin=true;
        }
            
            display(mess);
            if (!isin)
            {
                display(messError);
                number=getInteger(min);
            }
                
        }
        return number;
    }
    
    
    
    public void displayError(int nbError){
        switch (nbError) {
            case 1:  display("non existent type");
                     break;
            /*case 2:  charac = new Crossbowman(name);
                     break;
            case 3:  charac = new Crossbowman(name);
                     break;
            case 4:  charac = new Crossbowman(name);
                     break;
            case 5:  charac = new Crossbowman(name);
                     break;*/
            default: display("Unknown error");
                     break;
    }
    }
    
    
            
}
