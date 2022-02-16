/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FM
 */
public class Radio {
        
    protected String Color;
    protected String Model;
    private boolean OpenOrClose = false;
    final static private int maxVolume = 100;
    private int Volume = 50;
    final static private int minVolume = 0;
    final static private double minFrequency = 80.0;
    final static private double maxFrequency = 100.0;
    private double Frequency = 90.0;


    public Radio(String color,String model){
        this.Color = color;
        this.Model = model;
    }
    


    public String getModel(){
        return this.Model;
    }
    public void setModel(String NewModel){
        this.Model = NewModel;
    }
    public String getColor(){
        return this.Color;
    }
    public void setColor(String NewColor){
        this.Color = NewColor;
    }


    public boolean RadioOnOff(){
        
        if(this.OpenOrClose == false){
            this.OpenOrClose = true;
        }
        else{
            this.OpenOrClose = false;
        }

        return this.OpenOrClose;
    }

    public double ChangeFrequency(double newFrequency){
        double f = this.Frequency + newFrequency;
        
        if(f > this.maxFrequency){
            this.Frequency = this.maxFrequency;
        }
        else if(f < this.minFrequency){
            this.Frequency = this.minFrequency;
        }
        else{
            this.Frequency = f;
        }


        return this.Frequency;
    }

    public int ChangeVolume(int newVolume){
        int v = this.Volume + newVolume;

        if(v > this.maxVolume){
            this.Volume = this.maxVolume;
        }
        else if(v < this.minVolume){
            this.Volume = this.minVolume;
        }
        else{
            this.Volume = v;
        }


        return this.Volume;
    }


    public void RadioStatus(){
        if(this.OpenOrClose == true){
                System.out.println("Open/Close: "+this.OpenOrClose+"\nRadio Model: "+this.Model+"\nRadio Color: "+this.Color+
        "\nRadio Frequency: "+this.Frequency+"\nRadio Volume: "+this.Volume);
        }
        else{
            System.out.println("Open/Close: "+this.OpenOrClose+"\nRadio Model: "+this.Model+"\nRadio Color: "+this.Color);
        
        }
        
    }


}
