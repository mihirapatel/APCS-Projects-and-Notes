import java.util.*;
//Mihira Patel
//Shiranthi Jawahar
//Period 2
//9/14/17

/*ATM Machine
 * 1 user
 * password
 * view balance
 * withdraw
 * deposit
 */

public class ATMMachine{
  
  public static void main(String [] args){
    
    Scanner input = new Scanner(System.in);
    
    int balance, password, z, y, x, view, withdraw, deposit, a, b;
    
    
    balance = 10000;
    password = 9120;
    b = 0; 
    a = 1;
    
    while (a == 1){
       
      System.out.println("Enter the password: ");
      y = input.nextInt();
      
      if (y == password){
        b = 1;
      } 
      
      else {
        b = 0;  
      }
      
      a = 0;
      
      while (b == 1){
        
       System.out.println("What would you like to do? Enter 1 to view balance, 2 to withdraw, and 3 to deposit."); 
       x = input.nextInt();
        
       if (x == 1){
         System.out.println("Balance: $" + balance);
         System.out.println("Would you like to continue? Press 1 to continue and 2 to stop.");
         b = input.nextInt();
       }
        
       else if (x == 2){
         System.out.println("How much money would you like to withdraw?");
         z = input.nextInt();
         balance = balance - z;
         System.out.println("New balance: $" + balance);
         System.out.println("Would you like to continue? Press 1 to continue and 2 to stop.");
         b = input.nextInt();
       }
        
       else if (x == 3){
         System.out.println("How much money would you like to deposit?");
         a = input.nextInt();
         balance = balance + a;
         System.out.println("New balance: $" + balance);
         System.out.println("Would you like to continue? Press 1 to continue and 2 to stop.");
         b = input.nextInt();    
       } 
        
      }
       
      while (b == 0){
        System.out.println("Wrong password. Press 1 to try again, and 2 to stop.");
        a = input.nextInt();
          
         if (a == 1){
           b = 3;
         }
          
         else if (a == 2){
           b = 2;
         } 
       }
     }
    
     if (b == 2){
       System.out.println("Thank you!");
       a = 3;     
     }
  }

}