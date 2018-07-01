import java.util.*;

public class ElevenRules{
  
  public static void main (String [] args){
    
    Scanner input = new Scanner (System.in);
  
    int number = input.nextInt();
    
    int twoDigit = truncminus7(number);
    
    boolean divBy11 = twodigitchecker(twoDigit);
    
    if (divBy11){
      System.out.println("\tYES");
    }
    
    else{
      System.out.println("\tNO");
    }

   }//main class ends
  
  public static int truncminus7(int a){
   
    int x;
    int y = 1;
    int twodigitholder = 0;
    
    while (y == 1){   
      if (a%10 != 0){
        System.out.print(a);
        x = a%10; 
        a /= 10;
        
        if(a/10 != 0){
          System.out.println("\t" + a + "-" + x);
        }
        
        if(a/10 == 0){
          twodigitholder = a;
        }
        
        a -= x;
        
        if (twodigitholder%11 != 0){
          break;
        }

      }
      
      else{
        break;
      } 
    } 
    
    return a; 
  }//trunc minus ends
  
  public static boolean twodigitchecker(int a){
    if (a%11 == 0){
      return true;
    }
    
    else{
      return false;
    }
  }//checker ends
  
 
}