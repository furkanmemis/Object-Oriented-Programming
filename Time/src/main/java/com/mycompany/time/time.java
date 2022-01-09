
package com.mycompany.time;

/**
 *
 * @author FM
 */
public class time {
    
    private int hour;
    private int minute;
    private int second;
    private String time;
    
    
    public void setTime(int h,int m,int s){
    
        if((h >= 0 && h <24) && (m >= 0 && m < 60) && (s >= 0 && s < 60)){
        
            this.hour = h;
            this.minute = m;
            this.second = s;
        }
        else{
            
            throw new IllegalArgumentException("hour, minute and/or second was out of range");
        }
    
    }
    public void UniversalTime(){
    
        System.out.println(hour+":"+minute+":"+second);
   
    }
    
    public void TimeConverter(){
       
        if(hour < 12){
        
            this.time = "AM";
        
        }
        else{
            
            this.time = "PM";
        }
        
        
        if(hour != 0 || hour != 12){
            
            this.hour = this.hour % 12;
        }
        
        System.out.println(hour+":"+minute+":"+second+" "+time);
        
        
    }
  
}
    
