
package com.mycompany.playingcards;

/**
 *
 * @author FM
 */
public class Card {
    private String CardNumber;
    private String CardType;
    
    public Card(String no,String type){
    
        this.CardNumber = no;
        this.CardType = type;
    }
    
    public String showCard(){
    
        return this.CardNumber+" "+this.CardType;
    }

}
