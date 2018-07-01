import java.util.Scanner;

public class StandardDeviation{
  
  public static void main (String [] args){
    
    Scanner input = new Scanner(System.in);
    double val1, val2, val3, val4, val5;
    double usernum;
    int selec;
    
    System.out.println("Please input 5 numbers");
    val1 = input.nextDouble();
    val2 = input.nextDouble();
    val3 = input.nextDouble();
    val4 = input.nextDouble();
    val5 = input.nextDouble();
    
    System.out.println("The mean is " + mean(val1, val2, val3, val4, val5));
    median(val1, val2, val3, val4, val5);
    System.out.println("The mode is " + mode(val1, val2, val3, val4, val5));
   
  }
  
  public static double mean (double a, double b, double c, double d, double e){
    
    a = a + b + c + d + e;
    a = a/5;
    
    return a;
  
  }//mean method end
  
   public static void median (double a, double b, double c, double d, double e){
     
      double switch1, run; 
      run = 1;
      
      while (run < 5) {  
        if (a > b) { 
          switch1 = a; 
          a = b; 
          b = switch1; 
        } 
        
        if (b > c) { 
          switch1 = b; 
          b = c; 
          c = switch1; 
        } 
        
        if (c > d) {  
          switch1 = c; 
          c = d; 
          d = switch1; 
        } 
        
        if (d > e) { 
          switch1 = d; 
          d = e; 
          e = switch1;  
        }
        
        run++;
      }
      
      a = c;
    
     System.out.println("The median is " + a);
   }//median method end

   public static double mode (double a, double b, double c, double d, double e){
     
     double mode = 0;
     
     double switch1, run; 
      run = 1;
      
      while (run < 5) {  
        if (a > b) { 
          switch1 = a; 
          a = b; 
          b = switch1; 
        } 
        
        if (b > c) { 
          switch1 = b; 
          b = c; 
          c = switch1; 
        } 
        
        if (c > d) {  
          switch1 = c; 
          c = d; 
          d = switch1; 
        } 
        
        if (d > e) { 
          switch1 = d; 
          d = e; 
          e = switch1;  
        }
        
        run++;
        
      }
        
      if (a == b && b == c && c == d && d == e){ 
        return a; 
      }  
        
      else if (a == b && b == c && c == d){ 
        return a; 
      } 
        
      else if (b == c && c == d && d == e){
        a = b;
        return a;
      }
        
      else if (a == b && b == c) { 
        return a; 
      } 
        
      else if (b == c && c == d){
        a = b;
        return a;
      }
        
      else if (c == d && d == e){
        a = c;
        return a;
      }
        
      else if (a == b) { 
        return a; 
      }
        
      else if (b == c) { 
        a = b;         
        return a; 
      }
        
      else if (c == d) { 
        a = c;
        return a; 
      }
        
      else if (d == e) { 
        a = d;
        return a; 
      }
        
      else {
        a = 0;
        return a;       
      }
        
        
    }//mode method ending
     

}