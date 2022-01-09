package com.mycompany.time;

import java.util.*;
/**
 *
 * @author FM
 */
public class NewMain {

    public static void main(String[] args) {
        Random rnd = new Random();
        int hour = rnd.nextInt(24);
        int minute = rnd.nextInt(60);
        int second = rnd.nextInt(60);
        
        //Step-1
        time time = new time();
        
        time.setTime(0, 0, 0);
        time.UniversalTime();
        time.UniversalTime();

        System.out.println("----------");
        //Step-2
        time.setTime(hour, minute, second);
        time.UniversalTime();
        time.TimeConverter();
        
    }
    
}
