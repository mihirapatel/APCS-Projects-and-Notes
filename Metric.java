//Mihira Patel
//Period 2
//10/13/17
//Metric Conversions

import java.util.Scanner;

public class Metric{
  
  public static void main (String [] args){
    
    Scanner input = new Scanner(System.in);
    double usernum;
    int selec;
    double a;
    
    System.out.println("What is the temperature of this room?");
    
    usernum = input.nextDouble();
    
    System.out.println("Please 1 to convert from C to F and press 2 convert from F to C");
    
    selec = input.nextInt();
    
    if (selec == 1){
      usernum = CtoF(usernum);
    }
    
    else if (selec == 2){
      usernum = FtoC(usernum);
    }
    
    else{
      System.out.println("bad input");
    }
    
    if (selec == 1 || selec == 2){
      System.out.print(usernum);
    }
    
  }
  
  public static double CtoF(double a){
    
    a = (a*9/5) + 32;
    return a;
    
  }
  
  public static double FtoC(double a){
    
    a = (a - 32)*5/9;
    return a;
    
  }
    

}