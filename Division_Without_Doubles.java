//Mihira Patel
//Almitra Dabholkar
//09/29/17

import java.util.*;

public class Division_Without_Doubles{
  
  public static void main (String [] args){
    
    Scanner input = new Scanner (System.in);
    
    int x, y, z, a, b, d;
    int c = 1;
    
    while (c == 1){
      System.out.println("Enter two integers");
    
      x = input.nextInt();
      y = input.nextInt();
    
      z = (x/y);
    
      a = (x%y);
      b = (100000000*a)/y;

      System.out.println(z + "." + b);
      
      System.out.println("Do you want to continue? Press 1 for yes, and 0 for no");
      c = input.nextInt();
     
    }
        
    System.out.print("Thank you!");
    
    

  }

}

