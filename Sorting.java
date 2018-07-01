import java.util.*;
public class Sorting{

  public static void main (String [] args){
  
    Scanner input = new Scanner (System.in);
    
    
    int a, b, c, d;
    int x, swap, min; 
    
    x = 1;
    swap = 0;
    min = 0;

    
    System.out.println("Enter an integer a");
    a = input.nextInt();
    System.out.println("Enter an integer b");
    b = input.nextInt();
    System.out.println("Enter an integer c");
    c = input.nextInt();
    System.out.println("Enter an integer d");
    d = input.nextInt();
    
    System.out.println(a + " " + b + " " + c + " " + d);
    
    bubble(x, a, b, c, d, swap);
    selection(x, a, b, c, d, min);

  }
  
  //BUBBLE SORT
  public static void bubble(int x, int a, int b, int c, int d, int swap){
    while (x < 4){
      
      if (a > b) {
        swap = a;
        a = b;
        b = swap;
      }
      
      
      if (b > c){
        swap = b;
        b = c;
        c = swap;
      }
      
      if (c > d){
        swap = c;
        c = d;
        d = swap;
      }
      
      x++;
     
    }
   
    System.out.println(a + " " + b + " " + c + " " + d);
  
  }
  
  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  


}