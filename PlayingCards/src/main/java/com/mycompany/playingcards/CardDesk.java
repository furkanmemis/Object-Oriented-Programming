package com.mycompany.playingcards;
import java.util.*;

public class CardDesk {
    
    private Card[] desk;
    private int DeskSize = 52;
    
    public CardDesk(){
    
        String [] no = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        String [] type = {"Spades","Hearts","Diamonds","Clubs"};
        
        desk = new Card[DeskSize];
        
        for(int i = 0;i<desk.length;i++){
        
                
            desk[i] = new Card(no[i%13],type[i/13]);
        
        }
 
    }
    public void ShowCard(){
    
        
        for(int i = 0;i<52;i++){
            
            System.out.println(desk[i].showCard());
        
        }
    }
    
    
    public void MixDesk(){
    
        Random rnd = new Random();

        for(int i = 0;i<52;i++){
        
            int no = rnd.nextInt(DeskSize);
            
            Card tmp = desk[i];
            
            desk[i] = desk[no];
            
            desk[no] = tmp;
        }
    
    
    
    
    
    
    }
    
    
    
    
    
    
    
}
