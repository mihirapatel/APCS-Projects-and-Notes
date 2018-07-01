//Mihira Patel
import java.util.*;

public class TwoFractions{

  public static void main (String [] args){
    
    int a, b, c, d;
    int operation;
  
    Scanner input = new Scanner (System.in);
    
    //first fraction
    System.out.println("Enter first numerator:");
    a = input.nextInt();    
    System.out.println("Enter first denominator:");
    b = input.nextInt();
    Fractions fraction1 = new Fractions(a, b);    
    System.out.println("First Fraction: " + a + "/" + b);
    
    //second fraction
    System.out.println("Enter second numerator:");
    c = input.nextInt();   
    System.out.println("Enter second denominator:");
    d = input.nextInt(); 
    Fractions fraction2 = new Fractions(c, d);
    System.out.println("Second Fraction: " + c + "/" + d);
    
    //operation
    System.out.println("Do you want to add, subtract, multiply, or divide? Press 1 to add, 2 to subtract, 3 to multiply, and 4 to divide.");
    operation = input.nextInt();
    
    if(operation == 1){
      add(fraction1, fraction2);
    }
    
    else if(operation == 2){
      subtract(fraction1, fraction2);
    }
    
    else if(operation == 3){
      multiply(fraction1, fraction2);
    }
    
    else{
      divide(fraction1, fraction2);
    }
    
    
    
    
  }// main ends
  
  //simplify
  public static void simplify(int top, int bottom){
    
    int run = 1;
    
    while (run == 1){
      if (top == 0){
        System.out.println("0");
        break;
      }
    
      else if (top%2 == 0 && bottom%2 == 0){
        top/=2;
        bottom/=2;
      }
      
      else if (top%3 == 0 && bottom%3 == 0){
        top/=3;
        bottom/=3;
      }
      
      else if (top%4 == 0 && bottom%4 == 0){
        top/=4;
        bottom/=4;
      }
      
      else if (top%5 == 0 && bottom%5 == 0){
        top/=5;
        bottom/=5;
      }
      
      else if (top%6 == 0 && bottom%6 == 0){
        top/=6;
        bottom/=6;
      }
      
      else if (top%7 == 0 && bottom%7 == 0){
        top/=7;
        bottom/=7;
      }
      
      else if (top%8 == 0 && bottom%8 == 0){
        top/=8;
        bottom/=8;
      }
      
      else if (top%9 == 0 && bottom%9 == 0){
        top/=9;
        bottom/=9;
      }
      
      else if (top%10 == 0 && bottom%10 == 0){
        top/=10;
        bottom/=10;
      } 
      
      else if (top%bottom == 0){
        System.out.println(top/bottom);
        break;
      }
      
      else{
        run = 0;
      }
      
    }
      
    if (top != bottom && top != 0){
      System.out.println(top + "/" + bottom);
      Fractions fractionFinal = new Fractions (top, bottom);
      
    }       
    
  }//simplify method ends
  
  //add
  public static void add(Fractions fraction1, Fractions fraction2){
    int a, b, c, d, top, bottom, placeholder;
    
    placeholder = fraction1.getDen();
    
    a = fraction1.getNum();
    b = fraction1.getDen();
    c = fraction2.getNum();
    d = fraction2.getDen();
    
    //common denomiator 
    if (b != d){
      a = a*d;
      b = b*d;
      c = c*placeholder;
      d = d*placeholder;        
    }
    
    top = a + c;
    bottom = b;
        
    simplify(top, bottom);
    
  }
  
  //subtract
  public static void subtract(Fractions fraction1, Fractions fraction2){
    int a, b, c, d, top, bottom, placeholder;
    
    placeholder = fraction1.getDen();
    
    a = fraction1.getNum();
    b = fraction1.getDen();
    c = fraction2.getNum();
    d = fraction2.getDen();
    
    //common denomiator 
    if (b != d){
      a = a*d;
      b = b*d;
      c = c*placeholder;
      d = d*placeholder;          
    }
    
    top = a - c;
    bottom = b;
        
    simplify(top, bottom);
    
  }
  
  //multiply
  public static void multiply(Fractions fraction1, Fractions fraction2){
    int a, b, c, d, top, bottom;
    
    a = fraction1.getNum();
    b = fraction1.getDen();
    c = fraction2.getNum();
    d = fraction2.getDen();

    top = a * c;
    bottom = b * d;
    
    simplify(top, bottom);
    
  }
  
  //divide
  public static void divide(Fractions fraction1, Fractions fraction2){
    int a, b, c, d, top, bottom;
    
    a = fraction1.getNum();
    b = fraction1.getDen();
    c = fraction2.getNum();
    d = fraction2.getDen();

    top = a * d;
    bottom = b * c;
    
    simplify(top, bottom);
    
  }
  
}

