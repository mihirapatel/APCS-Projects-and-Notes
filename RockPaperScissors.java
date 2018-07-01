import java.util.*;

public class RockPaperScissors{

  public static void main (String [] args){
    
    Scanner input = new Scanner (System.in);
    
    System.out.println("Welcome to Rock, Paper, Scissors!");
    
    //set up names of player one and two
    System.out.print("Enter the name of player 1: ");
    String player1 = input.nextLine();
    
    System.out.print("Enter the name of player 2: ");
    String player2 = input.nextLine();
    
    System.out.println(player1 + " will go first.");
    System.out.println();
    
    //creating and initializing variables for actual game
    boolean play = true;
    String p1move = "";
    String p2move = "";
    
    while (play){
      
      //player 1  
      boolean p1play = true;
      
      while (p1play){
        System.out.println(player1 + ", what is your move? Enter 'rock', 'paper', or 'scissors'.");
        p1move = input.nextLine();
        
        //prints a bunch of lines so that player 2 can't see what player 1 picks
        for (int i = 0; i < 100; i++){
          System.out.println();
        }

        if (!(p1move.equals("rock") || p1move.equals("paper") || p1move.equals("scissors"))){
          System.out.println("Incorrect input. Try again.");
        }
        
        //once they pick a move, their turn is over because this boolean becomes false so the while loop stops running
        else{
          p1play = false;
        }
      }//p1play while ends
      
      System.out.println();
      
      //player 2
      boolean p2play = true;
      
      while (p2play){
        System.out.println(player2 + ", what is your move? Enter 'rock', 'paper', or 'scissors'.");
        p2move = input.nextLine();
        
        if (!(p2move.equals("rock") || p2move.equals("paper") || p2move.equals("scissors"))){
          System.out.println("Incorrect input. Try again.");
        }
        
        //once they pick a move, their turn is over because this boolean becomes false so the while loop stops running
        else{
          p2play = false;
        }
      
      }//p2play while ends
      
      System.out.println();
      
      //cheching for winnwe
      checkForWinner(p1move, p2move, player1, player2);
      play = false;

    }//big play while ends
  }//main ends
  
  
  //METHODS
  
  public static void checkForWinner(String p1move, String p2move,String player1, String player2){
    
    //checks for every possible combination and determines a winner
    if (p1move.equals("rock") && p2move.equals("scissors")){
      System.out.println(player1 + " played " + p1move + ", and " + player2 + " played " + p2move + ".");
      System.out.println(player1 + " wins!");
    }
        
    else if (p1move.equals("scissors") && p2move.equals("rock")){
      System.out.println(player1 + " played " + p1move + ", and " + player2 + " played " + p2move + ".");
      System.out.println(player2 + " wins!");
    }
    
    else if (p1move.equals("paper") && p2move.equals("rock")){
      System.out.println(player1 + " played " + p1move + ", and " + player2 + " played " + p2move + ".");
      System.out.println(player1 + " wins!");
    }
        
    else if (p1move.equals("rock") && p2move.equals("paper")){
      System.out.println(player1 + " played " + p1move + ", and " + player2 + " played " + p2move + ".");
      System.out.println(player2 + " wins!");
    }
    
    else if (p1move.equals("scissors") && p2move.equals("paper")){
      System.out.println(player1 + " played " + p1move + ", and " + player2 + " played " + p2move + ".");
      System.out.println(player1 + " wins!");
    }
        
    else if (p1move.equals("paper") && p2move.equals("scissors")){
      System.out.println(player1 + " played " + p1move + ", and " + player2 + " played " + p2move + ".");
      System.out.println(player2 + " wins!");
    }
    
    else{
      System.out.println(player1 + " played " + p1move + ", and " + player2 + " played " + p2move + ".");
      System.out.println("It's a tie!");
    }

  }
  
}