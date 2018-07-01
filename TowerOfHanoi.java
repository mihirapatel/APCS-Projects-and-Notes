import java.util.*;
public class TowerOfHanoi{

  public static void main (String [] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter the number of tiles:");
    int n = input.nextInt();
   
    move(n, "A", "B", "C");

  }

  public static void move(int n, String A, String B, String C){
    
    if(n == 1){
      System.out.println("Move 1 to " + C);
    }
        
    else{
      move(n-1, A, C, B);
      System.out.println("Move " + n + " to " + C);
      move(n-1, B, A, C);
    }
    
    
  }
  
}
    
      
      
    
    
    
    

    
    
    
   
    


