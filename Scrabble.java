//Mihira Patel
//Period 2
//Scrabble

import java.util.*;

public class Scrabble{

  public static void main (String [] args){
    
    int board [][] = new int[4][10];
    
    int points = 0;
    
    Scanner input = new Scanner(System.in);
    
    printBoard(board);
    
    System.out.println();
    
    System.out.print("Enter a four letter word in ALL CAPS:");
    String word = input.nextLine();

    String letter1 = word.substring(0,1);
    String letter2 = word.substring(1,2);
    String letter3 = word.substring(2,3);
    String letter4 = word.substring(3,4);
    
    System.out.println();
    
    for (int i = 1; i <= 5; i++){
      
      ////////////////////////////////////////////////////////////////////////
      
      //LETTER POINTS
      int letter1points = 0;
      int letter2points = 0;
      int letter3points = 0;
      int letter4points = 0;
      
      //ONE POINT
      if(letter1.equals("A") || letter1.equals("E")){
        letter1points += 1;
      }
      
      if(letter2.equals("A") || letter2.equals("E")){
        letter2points += 1;
      }
      
      if(letter3.equals("A") || letter3.equals("E")){
        letter3points += 1;
      }
      
      if(letter4.equals("A") || letter4.equals("E")){
        letter4points += 1;
      }
      
      //TWO POINTS
      if(letter1.equals("D") || letter1.equals("R")){
        letter1points += 2;
      }
      
      if(letter2.equals("D") || letter2.equals("R")){
        letter2points += 2;
      }
      
      if(letter3.equals("D") || letter3.equals("R")){
        letter3points += 2;
      }
      
      if(letter4.equals("D") || letter4.equals("R")){
        letter4points += 2;
      }
      
      //THREE POINTS
      if(letter1.equals("B") || letter1.equals("M")){
        letter1points += 3;
      }
      
      if(letter2.equals("B") || letter2.equals("M")){
        letter2points += 3;
      }
      
      if(letter3.equals("B") || letter3.equals("M")){
        letter3points += 3;
      }
      
      if(letter4.equals("B") || letter4.equals("M")){
        letter4points += 3;
      }
      
      //FOUR POINTS
      if(letter1.equals("V") || letter1.equals("Y")){
        letter1points += 4;
      }
      
      if(letter2.equals("V") || letter2.equals("Y")){
        letter2points += 4;
      }
      
      if(letter3.equals("V") || letter3.equals("Y")){
        letter3points += 4;
      }
      
      if(letter4.equals("V") || letter4.equals("Y")){
        letter4points += 4;
      }
      
      //EIGHT POINTS
      if(letter1.equals("J") || letter1.equals("X")){
        letter1points += 8;
      }
      
      if(letter2.equals("J") || letter2.equals("X")){
        letter2points += 8;
      }
      
      if(letter3.equals("J") || letter3.equals("X")){
        letter3points += 8;
      }
      
      if(letter4.equals("J") || letter4.equals("X")){
        letter4points += 8;
      }
      
      ////////////////////////////////////////////////////////////////////////
      
      System.out.println("What number do you want start your word at?");
      System.out.print(i + ". ");
      int start = input.nextInt();
      
      //DOUBLE LETTER
      if(start == 3 || start == 9 || start == 15 || start == 21 || start == 27 || start == 33 || start == 39){
        letter1points*=2; 
      }
      
      if((start+1) == 3 || (start+1) == 9 || (start+1) == 15 || (start+1) == 21 || (start+1) == 27 || (start+1) == 33 || (start+1) == 39){
        letter2points*=2; 
      }
      
      if((start+2) == 3 || (start+2) == 9 || (start+2) == 15 || (start+2) == 21 || (start+2) == 27 || (start+2) == 33 || (start+2) == 39){
        letter3points*=2; 
      }
      
      if((start+3) == 3 || (start+3) == 9 || (start+3) == 15 || (start+3) == 21 || (start+3) == 27 || (start+3) == 33 || (start+3) == 39){
        letter4points*=2; 
      }
      
      //TRIPLE LETTER
      if(start == 5 || start == 10 || start == 20 || start == 25 || start == 30 || start == 35 || start == 40){
        letter1points*=3; 
      }
      
      if((start+1) == 5 || (start+1) == 10 || (start+1) == 20 || (start+1) == 25 || (start+1) == 30 || (start+1) == 35 || (start+1) == 40){
        letter2points*=3; 
      }
      
      if((start+2) == 5 || (start+2) == 10 || (start+2) == 20 || (start+2) == 25 || (start+2) == 30 || (start+2) == 35 || (start+2) == 40){
        letter3points*=3; 
      }
      
      if((start+3) == 5 || (start+3) == 10 || (start+3) == 20 || (start+3) == 25 || (start+3) == 30 || (start+3) == 35 || (start+3) == 40){
        letter4points*=3; 
      }
      
      //DOUBLE WORD
      int doubleWordCounter = 0;
      if(start == 7 || start ==  14 || start == 26){
        doubleWordCounter = 1;
      }
      
      if((start+1) == 7 || (start+1) ==  14 || (start+1) == 28){
        doubleWordCounter = 1;
      }
      
      if((start+2) == 7 || (start+2) ==  14 || (start+2) == 28){
        doubleWordCounter = 1;
      }
      
      if((start+3) == 7 || (start+3) ==  14 || (start+3) == 28){
        doubleWordCounter = 1;
      }
      
      //TRIPLE WORD
      int tripleWordCounter = 0;
      if(start == 8 || start ==  16 || start == 24 || start == 32){
        tripleWordCounter = 1;
      }
      
      if((start+1) == 8 || (start+1) ==  16 || (start+1) == 24 || (start+1) == 32){
        tripleWordCounter = 1;
      }
      
      if((start+2) == 8 || (start+2) ==  16 || (start+2) == 24 || (start+2) == 32){
        tripleWordCounter = 1;
      }
      
      if((start+3) == 8 || (start+3) ==  16 || (start+3) == 24 || (start+3) == 32){
        tripleWordCounter = 1;
      }
      
      //ADDING UP ALL POINTS
      int x = letter1points + letter2points + letter3points + letter4points;
      
      System.out.println("Total Points: " + finalPoints(x, doubleWordCounter, tripleWordCounter));
      System.out.println();
    }
    
  }
  
  public static int finalPoints(int x, int doubleWordCounter, int tripleWordCounter){
   
    if (doubleWordCounter == 1){
      x*=2;
    }
    
    if (tripleWordCounter == 1){
      x*=3;
    }
    
    return x;
  }

  public static void printBoard(int board[][]){
    int z = 1;
    
    for (int r = 0; r < board.length; r++){
      for (int c = 0; c < board[0].length; c++){
        
        if(z < 10){
          System.out.print("[0" + z + "]");
        }
        
        else{
          System.out.print("[" + z + "]");
        }
        z++;
        
      }
      System.out.println();
    }
  }
    
}