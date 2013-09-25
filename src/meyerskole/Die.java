/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package meyerskole;

import java.util.Random;

public class Die {
    
    public final static int MAX_VALUE =6;
    private int value;
    
    public Die(){
        roll();
    }
    
    public int getValue (){
        return value; 
    }
    
    public void roll(){
        Random ran = new Random();
        value = ran.nextInt(MAX_VALUE)+1;
    }
}
