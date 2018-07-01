public class IncreasingDigits{

  public static void main(String [] args){
  
    System.out.println(isIncreasing(1223));
    System.out.println(isIncreasing(498));
    System.out.println(isIncreasing(1234));
    
  }

  public static boolean isIncreasing(int number){
    
    boolean x = true;
    
    while(number > 10){
      number /= 10;
      counter ++;
      
      if (number/10 == 0){
        run = 0;
        break;
      } 
    }
    
    for (int i = 0; i < counter; i++){
      int a = number%10;
      int b = number%100;
      int c = b/10;
      
      if (c > a){
        x = false;
        break;
      }
      
      else 
        x = true;
      
    }
    
    return x;
  }
  
}