import java.util.*;

public class Nim{

  public static void main (String [] args){
    
    Scanner input = new Scanner (System.in);
    
    int player1pile = 0;
    int player2pile = 0;
    
    Pile pile1 = new Pile(3, 0);
    Pile pile2 = new Pile(3, 0);
    Pile pile3 = new Pile(3, 0);
    
    display(pile1, pile2, pile3);
    
    System.out.println();
    
    while (!(pile1.getStones() == 0 && pile2.getStones() == 0 && pile3.getStones() == 0)){
      
      //PLAYER 1
      
      System.out.println("Player 1: Which pile do you want to remove stones from? Enter 1 for pile 1, 2 for pile 2, or 3 for pile 3.");
      player1pile = input.nextInt();
    
      //PILE ONE
      if (player1pile == 1){
        
        System.out.println("Player 1: How many stones do you want to remove from pile 1? You can take up to " + pile1.getStones());
        pile1.setDecrease(input.nextInt());
          
        if (pile1.getDecrease() > 0 && pile1.getDecrease() <= 3){
          pile1.setStones(pile1.decreaseStones(pile1.getStones(), pile1.getDecrease()));
        }
          
        else{
          System.out.println("Not in range");
            
          while (pile1.getDecrease() == 0 || pile1.getDecrease() > 3){
            System.out.println("Player 1: How many stones do you want to remove from pile 1? You can take up to " + pile1.getStones());
            pile1.setDecrease(input.nextInt());
              
            if (pile1.getDecrease() > 0 && pile1.getDecrease() <= 3){
              pile1.setStones(pile1.decreaseStones(pile1.getStones(), pile1.getDecrease()));
            }
          }//while ends
        }//else ends   

        if (pile1.getStones() == 0 && pile2.getStones() == 0 && pile3.getStones() == 0){
          System.out.println("Player 1 wins!");
          break;
        }
 
        display(pile1, pile2, pile3);
      
      }//player 1 pile 1 ends
    
      //PILE TWO
      if (player1pile == 2){
        
        System.out.println("Player 1: How many stones do you want to remove from pile 2? You can take up to " + pile2.getStones());
        pile2.setDecrease(input.nextInt());
          
        if (pile2.getDecrease() > 0 && pile2.getDecrease() <= 3){
          pile2.setStones(pile2.decreaseStones(pile2.getStones(), pile2.getDecrease()));
        }
          
        else{
          System.out.println("Not in range");
            
          while (pile2.getDecrease() == 0 || pile2.getDecrease() > 3){
            System.out.println("Player 1: How many stones do you want to remove from pile 2? You can take up to " + pile2.getStones());
            pile2.setDecrease(input.nextInt());
              
            if (pile2.getDecrease() > 0 && pile2.getDecrease() <= 3){
              pile2.setStones(pile1.decreaseStones(pile2.getStones(), pile2.getDecrease()));
            }
          }//while ends
        }//else ends
       
        if (pile1.getStones() == 0 && pile2.getStones() == 0 && pile3.getStones() == 0){
          System.out.println("Player 1 wins!");
          break;
        }
 
        display(pile1, pile2, pile3);      
      
      }//plater 1 pile 2 ends
    
      //PILE THREE
      if (player1pile == 3){

        System.out.println("Player 1: How many stones do you want to remove from pile 3? You can take up to " + pile3.getStones());
        pile3.setDecrease(input.nextInt());
          
        if (pile3.getDecrease() > 0 && pile3.getDecrease() <= 3){
          pile3.setStones(pile3.decreaseStones(pile3.getStones(), pile3.getDecrease()));
        }
          
        else{
          System.out.println("Not in range");
            
          while (pile3.getDecrease() == 0 || pile3.getDecrease() > 3){
            System.out.println("Player 1: How many stones do you want to remove from pile 3? You can take up to " + pile3.getStones());
            pile3.setDecrease(input.nextInt());
              
            if (pile3.getDecrease() > 0 && pile3.getDecrease() <= 3){
              pile3.setStones(pile1.decreaseStones(pile3.getStones(), pile3.getDecrease()));
            }
          }//while ends
        }//else ends

        if (pile1.getStones() == 0 && pile2.getStones() == 0 && pile3.getStones() == 0){
          System.out.println("Player 1 wins!");
          break;
        }
 
        display(pile1, pile2, pile3);
      
      }//player 1 pile 3 ends
    
      
      //PLAYER 2
      System.out.println("Player 2: Which pile do you want to remove stones from? Enter 1 for pile 1, 2 for pile 2, or 3 for pile 3.");
      player2pile = input.nextInt();
    
      //PILE ONE
      if (player2pile == 1){
      
        System.out.println("Player 2: How many stones do you want to remove from pile 1? You can take up to " + pile1.getStones());
        pile1.setDecrease(input.nextInt());
      
        if (pile1.getDecrease() > 0 && pile1.getDecrease() <= 3){
          pile1.setStones(pile1.decreaseStones(pile1.getStones(), pile1.getDecrease()));
        }
      
        else{
          System.out.println("Not in range");
        
          while (pile1.getDecrease() == 0 || pile1.getDecrease() > 3){
            System.out.println("Player 2: How many stones do you want to remove from pile 1? You can take up to " + pile1.getStones());
            pile1.setDecrease(input.nextInt());
          
            if (pile1.getDecrease() > 0 && pile1.getDecrease() <= 3){
              pile1.setStones(pile1.decreaseStones(pile1.getStones(), pile1.getDecrease()));
            }
          }//while ends
        }//else ends
        
        if (pile1.getStones() == 0 && pile2.getStones() == 0 && pile3.getStones() == 0){
          System.out.println("Player 2 wins!");
          break;
        }
        
        display(pile1, pile2, pile3);
      
      }//player 2 pile 1 ends
    
      //PILE TWO
      if (player2pile == 2){
      
        System.out.println("Player 2: How many stones do you want to remove from pile 2? You can take up to " + pile2.getStones());
        pile2.setDecrease(input.nextInt());
      
        if (pile2.getDecrease() > 0 && pile2.getDecrease() <= 3){
          pile2.setStones(pile2.decreaseStones(pile2.getStones(), pile2.getDecrease()));
        }
      
        else{
          System.out.println("Not in range");
        
          while (pile2.getDecrease() == 0 || pile2.getDecrease() > 3){
            System.out.println("Player 2: How many stones do you want to remove from pile 2? You can take up to " + pile2.getStones());
            pile2.setDecrease(input.nextInt());
          
            if (pile2.getDecrease() > 0 && pile2.getDecrease() <= 3){
              pile2.setStones(pile2.decreaseStones(pile2.getStones(), pile2.getDecrease()));
            }
          }//while ends
        }//else ends

        
        if (pile1.getStones() == 0 && pile2.getStones() == 0 && pile3.getStones() == 0){
          System.out.println("Player 2 wins!");
          break;
        }
      
        display(pile1, pile2, pile3);
      
      }//player 2 pile 2 ends
    
      //PILE THREE
      if (player2pile == 3){
        
        System.out.println("Player 2: How many stones do you want to remove from pile 3? You can take up to " + pile3.getStones());
        pile3.setDecrease(input.nextInt());
      
        if (pile3.getDecrease() > 0 && pile3.getDecrease() <= 3){
          pile3.setStones(pile3.decreaseStones(pile3.getStones(), pile3.getDecrease()));
        }
      
        else{
          System.out.println("Not in range");
        
          while (pile3.getDecrease() == 0 || pile3.getDecrease() > 3){
            System.out.println("Player 2: How many stones do you want to remove from pile 3? You can take up to " + pile3.getStones());
            pile3.setDecrease(input.nextInt());
          
            if (pile3.getDecrease() > 0 && pile3.getDecrease() <= 3){
              pile3.setStones(pile3.decreaseStones(pile3.getStones(), pile3.getDecrease()));
            }
          }//while ends
        }//else ends

        
        if (pile1.getStones() == 0 && pile2.getStones() == 0 && pile3.getStones() == 0){
          System.out.println("Player 2 wins!");
          break;
        }
      
        display(pile1, pile2, pile3);
      
      }//player 2 pile 3 ends
    
    }//main while ends
   
  }//main ends
  
  public static void display(Pile pile1, Pile pile2, Pile pile3){
    
    System.out.print("Pile 1: ");
    for (int i = 0; i<pile1.getStones(); i++){
      System.out.print("*");
    }
    
    System.out.println();
    
    System.out.print("Pile 2: ");
    for (int i = 0; i<pile2.getStones(); i++){
      System.out.print("*");
    }
    
    System.out.println();
    
    System.out.print("Pile 3: ");
    for (int i = 0; i<pile3.getStones(); i++){
      System.out.print("*");
    }
    
    System.out.println();
  
  }

}