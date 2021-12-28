import java.util.*;
/**
 *
 * @author FM
 */
public class Karakter {
    
    private int karakter_tur;//0 koylu 1 savasci
    private int guc;
    
    private int[] karakter = new int[2];
    
    
    
    public int[] karakter_olustr(){
        
        Random rnd = new Random();
        
        this.karakter_tur = rnd.nextInt(2);
        this.guc = 1+rnd.nextInt(5);
        
        this.karakter[0] = this.karakter_tur;
        this.karakter[1] = this.guc;
        
        return karakter;
    }
    
    
    
    
}
