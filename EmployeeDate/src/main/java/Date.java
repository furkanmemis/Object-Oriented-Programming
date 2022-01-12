/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FM
 */
public class Date {
    private int year;
    private int month;
    private int day;
    
    private static final int[] months = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    
    public Date(int year,int month,int day){
        
        this.year = year;
        this.month = checkMonth(month);
        this.day = checkDay(day);
        
    }
    
    private int checkMonth(int month){
    
        if(month>0 && month<=12){
        
            return month;
        }
        else{
            throw new IllegalArgumentException("month out of range");
        }
    }
    private int checkDay(int day){
    
        if(day>0 && day<= months[month]){ 
            return day;
        }
        else if(month == 2 && day == 29 &&(year%400 == 0 || (year%4 == 0 && year%100 != 0))){
        
            return day;
        }
        else{
        
            throw new IllegalArgumentException("day out of range");
        }
  
    }
    
    public String toString(){   
       return String.format("%d.%d.%d",this.day,this.month,this.year);
    }
}
