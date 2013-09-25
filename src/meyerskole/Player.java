/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package meyerskole;

/**
 *
 * @author Kim Vammen
 */
public class Player {
    private int point;
    private Cup cup;
    
    public Player(){
        point =0;
        cup = new Cup();
    }
    
    public void addPoint(){
        point++;
    }
    
    public int getPoint(){
        return point;
    }
    
    public void resetPoint(){
        point = 0;
    }
    
    public void shake (){
        cup.shake();
    }
    
    public int getValue(){
        return cup.getValue();
    }
    
    public int cheat (int value){
        Cup cheatCup = new Cup();
        do{
            cheatCup.shake();
        } while (cheatCup.getValue() < value);
        
        return cheatCup.getValue();
    }
    
    public int play(int value){
        int move;
        
        if (value > 54 && Math.random() * 100 < 36){
            move = 0;
        } else if (Math.random() * 100 < 61 && value > 74){
            move = 0;
        } else {
            shake();
            if (cup.getValue() >= value){
                move = cup.getValue();
            }else {
                move = cheat (value);
            }  
        }
        return move;
    }
    
    
    
}
