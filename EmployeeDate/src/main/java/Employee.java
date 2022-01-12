/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FM
 */
public class Employee {
    private String name;
    private String lastName;
    private Date dateOfBirth;
    private Date hireOfDate;
    
    
    public Employee(String name,String lastName,Date dateOfBirth,Date dateOfHire){
  
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.hireOfDate = dateOfHire;
    
    }
    
    public String toString(){
    
        return String.format("Name:%s\nLast Name:%s\nDate Of Birth:%s\nDate Of Hire:%s",this.name,this.lastName,this.dateOfBirth,this.hireOfDate);
    }
 }
