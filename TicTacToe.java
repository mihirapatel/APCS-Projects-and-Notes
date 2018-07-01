//Mihira Patel
//10-10-17
//Period 2
//Tic Tac Toe

import java.util.*;

public class TicTacToe{
  
  public static String A = "a";
  public static String B = "b";    
  public static String C = "c";    
  public static String D = "d";    
  public static String E = "e";   
  public static String F = "f";    
  public static String G = "g";    
  public static String H = "h";   
  public static String I = "i";
  public static String X = "x";
  public static String O = "o";
  public static int z = 0;
  
  public static void main (String [] args){
    
    Scanner input = new Scanner (System.in);
    
    String name1, name2;
    int counter = 0;
    int play = 1;
      
    System.out.println("Player 1: enter your name");
    name1 = input.nextLine();
      
    System.out.println("Player 2: enter your name");
    name2 = input.nextLine();
      
    System.out.println();
      
    System.out.println("Player 1 is x and Player 2 is o. Here is the board.");
      
    System.out.println();
      
    //initial board
    System.out.println("        |        |        ");    
    System.out.println("  " + A + "     |   " + B + "    |    " + C + "  ");    
    System.out.println("        |        |        ");    
    System.out.println("________|________|________");   
    System.out.println("        |        |        ");    
    System.out.println("  " + D + "     |   " + E + "    |    " + F + "  ");    
    System.out.println("        |        |        ");    
    System.out.println("________|________|________");
    System.out.println("        |        |        ");
    System.out.println("  " + G + "     |   " + H + "    |    " + I + "  ");
    System.out.println("        |        |        "); 
      
    System.out.println();
      
    while (z == 0){
        
      System.out.println("Player 1: Enter the box you want to place x at. Make sure it is lowercase.");
      String p1position = input.nextLine();
        
      //call method to print board with new values
      printboard(p1position, "x");
        
      //counts how many turns have happened
      counter++;
        
      //check if player 1 wins, if z = 1, break loop 
      int p1win = winner(A, B, C, D, E, F, G, H, I);
        
      if (p1win == 1){
        z = 1;
        break;
      }
        
      //if there is a tie
      if (counter == 9 && z == 0){
        z = 3;
        break;
      }
        
      System.out.println("Player 2: Enter the box you want to place o at. Make sure it is uppercase.");
      String p2position = input.nextLine();
        
      //call method to print board with new values
      printboard(p2position, "o");
        
      //counts how many turns have happened
      counter++; 
        
      //check if player 2 wins, if z = 2, break loop
      int p2win = winner(A, B, C, D, E, F, G, H, I);
        
      if (p2win == 2){
        z = 2;
        break;
      } 
    }//while loop to actually play ends
      
    if (z == 1){
      System.out.println(name1 + " wins!");
      System.out.println("Thank you for playing!");
    }
      
    else if (z == 2){
      System.out.println(name2 + " wins!");
      System.out.println("Thank you for playing!");
    }
      
    else if (z == 3){
      System.out.println(name1 + " and " + name2 + " tie!");
      System.out.println("Thank you for playing!");
    }
      
  }//main class
  
  public static void printboard(String position, String move){
    
    if (position.equals("a")){
      A = move;
    }
    
    else if (position.equals("b")){
      B = move;
    }
    
    else if (position.equals("c")){
      C = move;
    }
    
    else if (position.equals("d")){
      D = move;
    }
    
    else if (position.equals("e")){
      E = move;
    }
    
    else if (position.equals("f")){
      F = move;
    }
    
    else if (position.equals("g")){
      G = move;
    }
    
    else if (position.equals("h")){
      H = move;
    }
    
    else if (position.equals("i")){
      I = move;
    }

    System.out.println("        |        |        ");    
    System.out.println("  " + A + "     |   " + B + "    |    " + C + "  ");    
    System.out.println("        |        |        ");    
    System.out.println("________|________|________");   
    System.out.println("        |        |        ");    
    System.out.println("  " + D + "     |   " + E + "    |    " + F + "  ");    
    System.out.println("        |        |        ");    
    System.out.println("________|________|________");
    System.out.println("        |        |        ");
    System.out.println("  " + G + "     |   " + H + "    |    " + I + "  ");
    System.out.println("        |        |        "); 
    System.out.println();

  }//print board class ends
  
  public static int winner(String a, String b, String c, String d, String e, String f, String g, String h, String i){
    
    //Player 1 wins
    
      if (a.equals("x") && b.equals("x") && c.equals("x")){
        z = 1;
      }
      
      else if (d.equals("x") && e.equals("x") && f.equals("x")){
        z = 1;
      }
      
      else if (g.equals("x") && h.equals("x") && i.equals("x")){
        z = 1;
      }
      
      else if (a.equals("x") && e.equals("x") && i.equals("x")){
        z = 1;
      }
      
      else if (a.equals("x") && d.equals("x") && g.equals("x")){
        z = 1;
      }
      
      else if (b.equals("x") && e.equals("x") && h.equals("x")){
        z = 1;
      }
      
      else if (c.equals("x") && f.equals("x") && i.equals("x")){
        z = 1;
      }
      
      else if (a.equals("x") && e.equals("x") && i.equals("x")){
        z = 1;
      }
      
      else if (c.equals("x") && e.equals("x") && g.equals("x")){
        z = 1;
      }
      
      //Player 2 wins
      
      if (a.equals("o") && b.equals("o") && c.equals("o")){
        z = 2;
      }
      
      else if (d.equals("o") && e.equals("o") && f.equals("o")){
        z = 2;
      }
      
      else if (g.equals("o") && h.equals("o") && i.equals("o")){
        z = 2;
      }
      
      else if (a.equals("o") && e.equals("o") && i.equals("o")){
        z = 2;
      }
      
      else if (a.equals("o") && d.equals("o") && g.equals("o")){
        z = 2;
      }
      
      else if (b.equals("o") && e.equals("o") && h.equals("o")){
        z = 2;
      }
      
      else if (c.equals("o") && f.equals("o") && i.equals("o")){
        z = 2;
      }
      
      else if (a.equals("o") && e.equals("o") && i.equals("o")){
        z = 2;
      }
      
      else if (c.equals("o") && e.equals("o") && g.equals("o")){
        z = 2;
      }
               
      return z;
  
  }//check winner method ends 
  
}//public class TicTacToe ends


