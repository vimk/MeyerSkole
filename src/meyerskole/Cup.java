/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package meyerskole;

/**
 *
 * @author Kim Vammen
 */
public class Cup {
    private Die d1; 
    private Die d2;
    
    public Cup(){
        d1 = new Die();
        d2 = new Die();
    }
    
    public void shake(){
        d1.roll();
        d2.roll();
    }
    
    public int getValue (){
        int value;
        
        if ((d1.getValue() == 1 && d2.getValue() == 2) || (d1.getValue() == 2 && d2.getValue() == 1)){
            value = 100;
        } else if ((d1.getValue() == 1 && d2.getValue() == 3) || (d1.getValue() == 3 && d2.getValue() == 1)){
            value = 80;
        } else if (d1.getValue() == d2.getValue()){
            value = 65 + d1.getValue() + d2.getValue();
        } else{
            if (d1.getValue() > d2.getValue()){
                value = d1.getValue() * 10 + d2.getValue();
            } else{
                value = d2.getValue() * 10 + d1.getValue();
            }
        }
        return value;
    }
    
   public static String valueToString(int value){
        String result;
        
        if (value == 100){
            result = "Meyer";
        }         
        else if (value == 80){
            result = "Lille meyer";
        }
        else if (value == 77){    
            result = "Par 6";
        }
        else if (value == 75){
            result = "Par 5";
        }
        else if (value == 73){
            result = "Par 4";
        }
        else if (value == 71){
            result = "Par 3";
        }
        else if (value == 69){
            result = "Par 2";
        }
        else if (value == 67){
            result = "Par 1";
        }
        else {
            result = String.valueOf(value);
        }
        
        return result;
    }
    
}
