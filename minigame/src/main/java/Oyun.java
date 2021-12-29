/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FM
 */
public class Oyun {
   
    private int oyuncu1_skor = 0;
    private int oyuncu2_skor = 0;
    
    
    public void savas(int[][] oyuncu1,int[][] oyuncu2){
        
        int i,j;
        
        
        for(i = 0;i<5;i++){
            
            for(j = 0;j<2;j++){
            
                if(oyuncu1[i][j] > oyuncu2[i][j]){
                    
                    System.out.println("Oyuncu 1 Karakteri = Savasci\nOyuncu 2 Karakteri = Koylu");
                    System.out.println("Oyuncu 1 "+(i+1)+". turu kazandi");
                    this.oyuncu1_skor++;
                    break;
                }
                else if(oyuncu2[i][j]> oyuncu1[i][j] ){
                    System.out.println("Oyuncu 1 Karakteri = Koylu\nOyuncu 2 Karakteri = Savasci");
                    System.out.println("Oyuncu 2 "+(i+1)+". turu kazandi");
                    this.oyuncu2_skor++;
                    break;
                }
                else{
                    if(oyuncu1[i][j+1] > oyuncu2[i][j+1]){
                        if(oyuncu1[i][j] == 0){
                            System.out.println("Oyuncu 1 ve Oyuncu 2 koylu");
                        }
                        else{
                            System.out.println("Oyuncu 1 ve Oyuncu 2 savasci");
                        }
                        System.out.println("Oyuncu 1 Guc = "+oyuncu1[i][j+1]+"\nOyuncu 2 Guc = "+oyuncu2[i][j+1]);
                        System.out.println("Oyuncu 1 "+(i+1)+". turu kazandi");
                        this.oyuncu1_skor++;
                        break;
                    }
                    else if(oyuncu2[i][j+1] > oyuncu1[i][j+1]){
                        if(oyuncu1[i][j] == 0){
                            System.out.println("Oyuncu 1 ve Oyuncu 2 koylu");
                        }
                        else{
                            System.out.println("Oyuncu 1 ve Oyuncu 2 savasci");
                        }
                        System.out.println("Oyuncu 1 Guc = "+oyuncu1[i][j+1]+"\nOyuncu 2 Guc = "+oyuncu2[i][j+1]);
                        System.out.println("Oyuncu 2 "+(i+1)+". turu kazandi");
                        this.oyuncu2_skor++;
                        break;                  
                    }
                    else{
                        if(oyuncu1[i][j] == 0){
                            System.out.println("Oyuncu 1 ve Oyuncu 2 koylu");
                        }
                        else{
                            System.out.println("Oyuncu 1 ve Oyuncu 2 savasci");
                        }
                        System.out.println("Oyuncu 1 Guc = "+oyuncu1[i][j+1]+"\nOyuncu 2 Guc = "+oyuncu2[i][j+1]);
                        System.out.println("Tur Berabere");
                        break;
                    }
                    
                }
            
            
            }
            System.out.println("---------------------------------------------------");

        }
        if(this.oyuncu1_skor>this.oyuncu2_skor){
            System.out.println("Oyuncu 1 skor = "+this.oyuncu1_skor+"\nOyuncu 2 skor = "+this.oyuncu2_skor);
            System.out.println("Oyuncu 1 Kazandi");
            
        }
        else if(this.oyuncu2_skor > this.oyuncu1_skor){
            System.out.println("Oyuncu 1 skor = "+this.oyuncu1_skor+"\nOyuncu 2 skor = "+this.oyuncu2_skor);
            System.out.println("Oyuncu 2 Kazandi");
        }
        else{
            System.out.println("Oyuncu 1 skor = "+this.oyuncu1_skor+"\nOyuncu 2 skor = "+this.oyuncu2_skor);
            System.out.println("Oyun Berabere");
        }
    
    }
    
    
    
}
