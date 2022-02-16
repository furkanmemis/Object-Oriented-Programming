/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author FM
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Radio radio = new Radio("Black","X7-B9-515216");
        radio.RadioStatus();
        radio.RadioOnOff();
        System.out.println("---------------------");
        radio.RadioStatus();
        
        radio.ChangeVolume(-19);
        radio.ChangeFrequency(10.2);
        System.out.println("---------------------");
        radio.RadioStatus();
        
        radio.RadioOnOff();
        System.out.println("---------------------");
        radio.RadioStatus();


    }
    
}
