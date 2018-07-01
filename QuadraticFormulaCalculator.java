
  
import java.util.*;

public class QuadraticFormulaCalculator{
  
  public static void main (String [] args){
    
    Scanner input = new Scanner (System.in);
    
    double a, b, c;
    int x = 1;
    int y;
    
    
    while (x == 1){
      
       System.out.println("Enter three values for a, b, and c to calulcate the quadratic equation.");
       System.out.print("Enter a: ");
       a = input.nextDouble();
       System.out.print("Enter b: ");
       b = input.nextDouble();
       System.out.print("Enter c: ");
       c = input.nextDouble();
    
       double h = quad(a, b, c);
       System.out.println("Your positive solution is: " + h);
    
       System.out.println("Do you want to run again? Enter 1 for yes, 0 for no.");
       y = input.nextInt();
       
       if (y == 1){
         x = 1;
       }
       
       else if (y == 0){
         x = 0;
       }
     }
    
    while (x == 0){     
      System.out.println("Thank you!"); 
      x = 2;
    }
    
  }
  
  public static double quad(double a, double b, double c){
      
    double d = ((b*b) - (4*a*c));
    double e = Math.sqrt(d);
    double f = (-b + e); 
    double g = f/(2*a);
    
    return g;
    
  
  }




}