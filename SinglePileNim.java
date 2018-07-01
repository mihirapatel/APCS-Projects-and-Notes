import java.util.*;

public class SinglePileNim{
  
  public static void main(String [] args){
    
    int stones = 0;
    int run = 1;
    int p1stone, p2stone;
    
    Scanner input = new Scanner (System.in);
    
    System.out.println("Player 1: How many stones do you want to start with?");
    stones = input.nextInt();
    System.out.println("Here is the number of stones:");
    System.out.println(stones);
    
    int maxNum = stones/2;
    while (run == 1){
      
      //PLAYER 1
      System.out.println("Player 1: How many stones do you want to subtract? The maximum number you can subtract is " + maxNum);
      p1stone = input.nextInt();
      
      if (p1stone<=maxNum){
        stones = subtractStones(stones, p1stone);
        maxNum = stones/2;
        
        if (maxNum == 0){
          maxNum = 1;
        }
        
        System.out.println(stones);
        
        if (stones == 0){
          run = 0;
          System.out.println("Player 1 wins!");
          break;
        }
        
      }
      
      else{
        System.out.println("Not in range");
        
        while (p1stone > maxNum){
          System.out.println("Player 1: How many stones do you want to subtract? The maximum number you can subtract is " + maxNum);
          p1stone = input.nextInt();
          
          if (p1stone<=maxNum){
            stones = subtractStones(stones, p1stone);
            maxNum = stones/2;
            
            if (maxNum == 0){
              maxNum = 1;
            }
            
            System.out.println(stones);
            
            if (stones == 0){
              run = 0;
              System.out.println("Player 1 wins!");
            }
            
          }
        }//while ends
      }//else ends
      
      //PLAYER 2
      System.out.println("Player 2: How many stones do you want to subtract? The maximum number you can subtract is " + maxNum);
      p2stone = input.nextInt();
      
      if (p2stone<=maxNum){
        stones = subtractStones(stones, p2stone);
        maxNum = stones/2;
        
        if (maxNum == 0){
              maxNum = 1;
        }
        
        System.out.println(stones);
        
        if (stones == 0){
          run = 0;
          System.out.println("Player 2 wins!");
        }
      }
      
      else{
        System.out.println("Not in range");
        
        while (p2stone > maxNum){
          System.out.println("Player 2: How many stones do you want to subtract? The maximum number you can subtract is " + maxNum);
          p2stone = input.nextInt();
          
          if (p2stone<=maxNum){
            stones = subtractStones(stones, p2stone);
            maxNum = stones/2;
            
            if (maxNum == 0){
              maxNum = 1;
            }
            
            System.out.println(stones);
            
            if (stones == 0){
              run = 0;
              System.out.println("Player 2 wins!");
            }
          }
        }//while ends
      }//else ends

      
    }//while ends
    

  }//main ends
  
  public static int subtractStones(int stones, int subStones){   
    int newNumStones = 0;
    newNumStones = stones - subStones;
    return newNumStones;
  }

}