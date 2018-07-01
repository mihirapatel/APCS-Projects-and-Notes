import java.util.*;

/*Calculator
 * Beginning image 
 * 4 operations: add, subtract, multiply, divide 
 * divide: output = answer + remainder
 * "Do you want to run it again?" Press 1 for yes, 2 for no
 * after no, it must say good bye
 */

public class Calculator{
  
  public static void main(String[] args){
  
    Scanner input = new Scanner(System.in);
    
    System.out.println("    /\\");
    System.out.println("   /  \\");
    System.out.println("  / () \\");
    System.out.println(" /______\\");
    System.out.println("|        |");
    System.out.println("|  ____  |");
    System.out.println("|  |  |  |");
    System.out.println("|__|__|__|");
    
    int operation, a, x, y, num1, num2;
    
    a = 1;
    x = 1;
    y = 0;
    operation = 1;
    
    while (a == 1){
      
      System.out.println("What math operation do you want to perform? (input 1 for addition, 2 for subtraction, 3 for multiplication, or 4 for division)");
      operation = input.nextInt();
      
      if (operation > 4 || operation < 1){
        a = 0;
        System.out.println("Enter a number between 1 and 4. Press 1 to try again, and 0 to stop.");
        a = input.nextInt();   
      }
      
      else {
        y = 1;
        a = 2;
      }
      
      while (y == 1){
        
        System.out.print("Enter your first number");
        num1 = input.nextInt();
        System.out.print("Enter your second number");
        num2 = input.nextInt();
        
        if (operation == 1){
          System.out.println("Sum: " + (num1+num2));
          System.out.print("Do you want to do more calculations? Press 1 to continue and 0 to stop.");
          x = input.nextInt();
        }
        
        else if (operation == 2){
          System.out.println("Difference: " + (num1-num2));
          System.out.print("Do you want to do more calculations? Press 1 to continue and 0 to stop.");
          x = input.nextInt();
        }
        
        else if (operation == 3){
          System.out.println("Product: " + (num1*num2));
          System.out.print("Do you want to do more calculations? Press 1 to continue and 0 to stop.");
          x = input.nextInt();          
        }
        
        else if (operation == 4){
          System.out.println("Quotient and remainder: " + (num1/num2) + " remainder " + (num1%num2));
          System.out.print("Do you want to do more calculations? Press 1 to continue and 0 to stop.");
          x = input.nextInt();
        } 
        
        if (x == 1){
          a = 1;
          y = 2;
        }
        
        else if (x == 0){
          a = 0;
          y = 2;
        }
      }  
      
    }
    
    while (a == 0){
      System.out.println("Goodbye. Thank you!");
      a = 2;
    }
   
    input.close();

    }
    
  }

