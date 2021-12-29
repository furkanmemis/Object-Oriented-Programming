
/**
 *
 * @author FM
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] oyuncu1_deste = new int[5][2];
        int[][] oyuncu2_deste = new int[5][2];
        int[] deste = new int[2];
        
        
        
        int i,j;
        
        for(i = 0;i<5;i++){
            
            Karakter oyuncu1 = new Karakter();
            Karakter oyuncu2 = new Karakter();
            
            deste = oyuncu1.karakter_olustr();
            oyuncu1_deste[i] = deste;
            
            deste = oyuncu2.karakter_olustr();
            oyuncu2_deste[i] = deste;
            
        }
        Oyun oyun = new Oyun();
        
        oyun.savas(oyuncu1_deste, oyuncu2_deste);
        
        
    }
    
}
