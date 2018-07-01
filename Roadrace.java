//Mihira Patel

import java.util.*;

public class Roadrace{
   
  public static void main (String [] args){
    
    Scanner input = new Scanner (System.in);
    
    //RUNNER 1  
    Runner runner1 = new Runner();
    System.out.println("Enter runner 1 time: ");
    runner1.setTime(input.nextInt());
    System.out.println("Enter runner 1 sex (enter 1 for female or 0 for male): ");
    runner1.setSex(input.nextInt());
    
    //RUNNER 2  
    Runner runner2 = new Runner();
    System.out.println("Enter runner 2 time: ");
    runner2.setTime(input.nextInt());
    System.out.println("Enter runner 2 sex (enter 1 for female or 0 for male): ");
    runner2.setSex(input.nextInt());
    
    //RUNNER 3  
    Runner runner3 = new Runner();
    System.out.println("Enter runner 3 time: ");
    runner3.setTime(input.nextInt());
    System.out.println("Enter runner 3 sex (enter 1 for female or 0 for male): ");
    runner3.setSex(input.nextInt());
    
    //RUNNER 4 
    Runner runner4 = new Runner();
    System.out.println("Enter runner 4 time: ");
    runner4.setTime(input.nextInt());
    System.out.println("Enter runner 4 sex (enter 1 for female or 0 for male): ");
    runner4.setSex(input.nextInt());
    
    //RUNNER 5  
    Runner runner5 = new Runner();
    System.out.println("Enter runner 5 time: ");
    runner5.setTime(input.nextInt());
    System.out.println("Enter runner 5 sex (enter 1 for female or 0 for male): ");
    runner5.setSex(input.nextInt());
    
    //RUNNER 6  
    Runner runner6 = new Runner();
    System.out.println("Enter runner 6 time: ");
    runner6.setTime(input.nextInt());
    System.out.println("Enter runner 6 sex (enter 1 for female or 0 for male): ");
    runner6.setSex(input.nextInt());
    
    //RUNNER 7  
    Runner runner7 = new Runner();
    System.out.println("Enter runner 7 time: ");
    runner7.setTime(input.nextInt());
    System.out.println("Enter runner 7 sex (enter 1 for female or 0 for male): ");
    runner7.setSex(input.nextInt());
    
    //OUTPUT
    //OVERALL WINNER
    int [] overallWinA = overall(runner1, runner2, runner3, runner4, runner5, runner6, runner7);
    int overallWin = overallWinA[0];
    int overallWin2 = overallWinA[1];
    System.out.println(overallWin);
    
    
    //FEMALE WINNER
    int[]female = female(runner1, runner2, runner3, runner4, runner5, runner6, runner7);
    
    for (int i = 0; i < female.length; i++){
      if (female[i] != 0 && female[i] != overallWin && female[i] != overallWin2){
        System.out.println(female[i]);
        break;
      }
    }
    
    //MALE WINNERS
    int[] male = male(runner1, runner2, runner3, runner4, runner5, runner6, runner7);
    
    for (int i = 0; i < male.length; i++){
      if (male[i] != 0 && male[i] != overallWin && male[i] != overallWin2){
        System.out.println(male[i]);
        System.out.println(male[i+1]);
        break;
      }
    }
     
  }//main ends
  
  public static int [] overall(Runner runner1, Runner runner2, Runner runner3, Runner runner4, Runner runner5, Runner runner6, Runner runner7){
  
    int [] overall = new int [7];
    
    overall[0] = runner1.getTime();
    overall[1] = runner2.getTime();
    overall[2] = runner3.getTime();
    overall[3] = runner4.getTime();
    overall[4] = runner5.getTime();
    overall[5] = runner6.getTime();
    overall[6] = runner7.getTime();
          
    //sort array
    int run = 1;
    int placeholder = 0;
    
    while (run < 7){
      
      if (overall[0] >= overall[1]){
        placeholder = overall[0];
        overall[0] = overall[1];
        overall[1] = placeholder;
      }
      
      if (overall[1] >= overall[2]){
        placeholder = overall[1];
        overall[1] = overall[2];
        overall[2] = placeholder;
      }
      
      if (overall[2] >= overall[3]){
        placeholder = overall[2];
        overall[2] = overall[3];
        overall[3] = placeholder;
      }
      
      if (overall[3] >= overall[4]){
        placeholder = overall[3];
        overall[3] = overall[4];
        overall[4] = placeholder;
      }
      
      if (overall[4] >= overall[5]){
        placeholder = overall[4];
        overall[4] = overall[5];
        overall[5] = placeholder;
      }
      
      if (overall[5] >= overall[6]){
        placeholder = overall[5];
        overall[5] = overall[6];
        overall[6] = placeholder;
      }
      
      run++;
    }
    
    return overall;
    
  }//overall method ends
  
  public static int[] female(Runner runner1, Runner runner2, Runner runner3, Runner runner4, Runner runner5, Runner runner6, Runner runner7){
    
    int [] female = new int[7];
    
    if (runner1.getSex() == 1)
      female[0] = runner1.getTime();
    
    if (runner2.getSex() == 1)
      female[1] = runner2.getTime();
    
    if (runner3.getSex() == 1)
      female[2] = runner3.getTime();
    
    if (runner4.getSex() == 1)
      female[3] = runner4.getTime();
    
    if (runner5.getSex() == 1)
      female[4] = runner5.getTime();
    
    if (runner6.getSex() == 1)
      female[5] = runner6.getTime();
    
    if (runner7.getSex() == 1)
      female[6] = runner7.getTime();
    
    //sort array
    int run = 1;
    int placeholder = 0;
    
    while (run < 7){
      
      if (female[0] >= female[1]){
        placeholder = female[0];
        female[0] = female[1];
        female[1] = placeholder;
      }
      
      if (female[1] >= female[2]){
        placeholder = female[1];
        female[1] = female[2];
        female[2] = placeholder;
      }
      
      if (female[2] >= female[3]){
        placeholder = female[2];
        female[2] = female[3];
        female[3] = placeholder;
      }
      
      if (female[3] >= female[4]){
        placeholder = female[3];
        female[3] = female[4];
        female[4] = placeholder;
      }
      
      if (female[4] >= female[5]){
        placeholder = female[4];
        female[4] = female[5];
        female[5] = placeholder;
      }
      
      if (female[5] >= female[6]){
        placeholder = female[5];
        female[5] = female[6];
        female[6] = placeholder;
      }
      
      run++;
    }
       
    return female;
    
  }//female method ends
  
  public static int[] male(Runner runner1, Runner runner2, Runner runner3, Runner runner4, Runner runner5, Runner runner6, Runner runner7){
    
    int [] male = new int[7];
    
    if (runner1.getSex() == 0)
      male[0] = runner1.getTime();
    
    if (runner2.getSex() == 0)
      male[1] = runner2.getTime();
    
    if (runner3.getSex() == 0)
      male[2] = runner3.getTime();
    
    if (runner4.getSex() == 0)
      male[3] = runner4.getTime();
    
    if (runner5.getSex() == 0)
      male[4] = runner5.getTime();
    
    if (runner6.getSex() == 0)
      male[5] = runner6.getTime();
    
    if (runner7.getSex() == 0)
      male[6] = runner7.getTime();
    
    //sort array
    int run = 1;
    int placeholder = 0;
    
    while (run < 7){
      
      if (male[0] >= male[1]){
        placeholder = male[0];
        male[0] = male[1];
        male[1] = placeholder;
      }
      
      if (male[1] >= male[2]){
        placeholder = male[1];
        male[1] = male[2];
        male[2] = placeholder;
      }
      
      if (male[2] >= male[3]){
        placeholder = male[2];
        male[2] = male[3];
        male[3] = placeholder;
      }
      
      if (male[3] >= male[4]){
        placeholder = male[3];
        male[3] = male[4];
        male[4] = placeholder;
      }
      
      if (male[4] >= male[5]){
        placeholder = male[4];
        male[4] = male[5];
        male[5] = placeholder;
      }
      
      if (male[5] >= male[6]){
        placeholder = male[5];
        male[5] = male[6];
        male[6] = placeholder;
      }
          
      run++;
    }
       
    return male;
    
  }//male method ends
   
    
}