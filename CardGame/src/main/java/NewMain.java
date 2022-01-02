import java.util.*;


/**
 *
 * @author FM
 */
public class NewMain {

    private static Card[][] cards = new Card[4][4];
        
    public static void main(String[] args){
    
        
        cards[0][0] = new Card('A'); 
        cards[0][1] = new Card('H');
        cards[0][2] = new Card('E');
        cards[0][3] = new Card('D');
        cards[1][0] = new Card('B');
        cards[1][1] = new Card('G');
        cards[1][2] = new Card('C');
        cards[1][3] = new Card('F');
        cards[2][0] = new Card('C');
        cards[2][1] = new Card('A');
        cards[2][2] = new Card('D');
        cards[2][3] = new Card('B');
        cards[3][0] = new Card('E');
        cards[3][1] = new Card('F');
        cards[3][2] = new Card('H');
        cards[3][3] = new Card('G');       
        
        while(GameControl() == false){
        
            GameBoard();
            CardGuess();

        }

        
    }
    public static boolean GameControl(){
        
        int i,j;
        
        for(i = 0;i<4;i++){
        
            for(j = 0;j<4;j++){
                
                if(cards[i][j].isCard_gues() == false){
                
                    return false;
                
                }
            
            }
        
        }
    
        return true;
    }
    public static void CardGuess(){
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your first gues(i-j) = ");
        
        int i1 = scanner.nextInt();
        int j1 = scanner.nextInt();
        
        cards[i1][j1].setCard_gues(true);
        GameBoard();
        
        System.out.println("Enter your second gues(i-j) =");
        
        int i2 = scanner.nextInt();
        int j2 = scanner.nextInt();
        
        char c1 = cards[i1][j1].getCard_value();
        char c2 = cards[i2][j2].getCard_value();
        
        if(c1 != c2){
            
            System.out.println("Wrong choose!!");
            cards[i1][j1].setCard_gues(false);
        }
        else{
            
            System.out.println("Correct choose!!");
            cards[i2][j2].setCard_gues(true);
            
        }
    }
    
    
    
    
    
    public static void GameBoard(){
    
    
        int i,j;
        
        for(i = 0;i<4;i++){
        
            for(j = 0;j<4;j++){
            
                if(cards[i][j].isCard_gues() == true){
                
                    System.out.print("["+cards[i][j].getCard_value()+"] ");
                
                }
                else{
                
                    System.out.print("[] ");
                
                }
                
            }
            System.out.println("\n------------\n");

        }
    
    
    }
       
    
}
