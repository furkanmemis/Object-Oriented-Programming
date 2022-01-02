/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FM
 */
public class Card {
    
    
    private char card_value;
    private boolean card_gues = false;
    
    public Card(char card_value){
    
        this.card_value = card_value;
    
    }

    public char getCard_value() {
        return card_value;
    }

    public void setCard_value(char card_value) {
        this.card_value = card_value;
    }

    public boolean isCard_gues() {
        return card_gues;
    }

    public void setCard_gues(boolean card_gues) {
        this.card_gues = card_gues;
    }
    
    
    
    
    
    
    
    
}
