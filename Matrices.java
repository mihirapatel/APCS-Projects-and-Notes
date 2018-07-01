import java.util.*;

public class Matrices{

  public static void main (String [] args){
  
    Scanner input = new Scanner (System.in);
    
    //first equation
    System.out.println("What is the x coefficient of the first equation?");
    double x1 = input.nextDouble();
    System.out.println("What is the y coefficient of the first equation?");
    double y1 = input.nextDouble();
    System.out.println("What is the constant of the first equation?");
    double c1 = input.nextDouble();
    
    //second equation
    System.out.println("What is the x coefficient of the second equation?");
    double x2 = input.nextDouble();
    System.out.println("What is the y coefficient of the second equation?");
    double y2 = input.nextDouble();
    System.out.println("What is the constant of the second equation?");
    double c2 = input.nextDouble();
    
    double [][] matrix = new double [2][3];
    matrix[0][0] = x1;
    matrix[0][1] = y1;
    matrix[0][2] = c1;
    matrix[1][0] = x2;
    matrix[1][1] = y2;
    matrix[1][2] = c2;
    
    for(int i = 0; i < 2; i++){
      for (int j = 0; j < 3; j++){
        System.out.print(matrix[i][j] + " " );
      }
      System.out.println();
    }
    
    //step 1
    double newx1 = x1;
    x1 = x1/newx1;
    y1 = y1/newx1;
    c1 = c1/newx1;
    
    //step 2
    double newx2 = x2;
    x2 = x2 - (newx2*x1);
    y2 = y2 - (newx2*y1);
    c2 = c2 - (newx2*c1);
    
    //step3
    double newy2 = y2;
    x2 = x2 * (1/newy2);
    y2 = y2 * (1/newy2);
    c2 = c2 * (1/newy2);

    //step 4
    double newy1 = y1;
    x1 = x1 - (x2*newy1);
    y1 = y1 - (y2*newy1);
    c1 = c1 - (c2*newy1);
    
    matrix[0][0] = x1;
    matrix[0][1] = y1;
    matrix[0][2] = c1;
    matrix[1][0] = x2;
    matrix[1][1] = y2;
    matrix[1][2] = c2;
    
    for(int i = 0; i < 2; i++){
      for (int j = 0; j < 3; j++){
        System.out.print(matrix[i][j] + " " );
      }
      System.out.println();
    }
    
    System.out.println("x = " + c1 + "\ny = " + c2);
  
  }
  





}