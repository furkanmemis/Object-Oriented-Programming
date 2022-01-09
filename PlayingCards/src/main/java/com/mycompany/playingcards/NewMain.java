
package com.mycompany.playingcards;

/**
 *
 * @author FM
 */
public class NewMain {

    public static void main(String[] args) {
       
        CardDesk cd = new CardDesk();
        
        cd.ShowCard();
        cd.MixDesk();
        System.out.println("-------------");
        cd.ShowCard();

    }
    
}
