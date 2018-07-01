//Mihira Patel
//Car Dealership 
import java.util.*;

public class Dealership{
  
  public static void main (String [] args){
    
    int customize = 0;
    String seatType;
  
    Scanner input = new Scanner (System.in);
    
    car car1 = new car();
    System.out.println("Hello! Welcome to Mihira's Dealership! Here is your default car:");
    System.out.println("Your car is a " + car1.getName() + ".");
    System.out.println("Your total price is $" + car1.getTotalPrice() + ".");
    System.out.println("Your car options are cloth seats, no heated seats, no sunroof, not keyless, no upgraded audio system, no bluetooth, and no aux.");
    System.out.println();
    
    System.out.println("To customze your car, press 1.");
    customize = input.nextInt();
    
    while (customize == 1){
      
      //change seats
      seatsOption(car1);
      
      //change heated seats
      heatedSeatsOption(car1);
      
      //change sunroof
      sunroofOption(car1);
      
      //change keys
      keylessOption(car1);
      
      //change audio system
      audioSystemOption(car1);
      
      //change bluetooth
      bluetoothOption(car1);
      
      //change aux
      auxOption(car1);
      
      customize = 0;
    }
    
    //tax
    car1.setTotalPrice(calcTax(car1.totalPrice));
    

    //display
    display(car1);
  }
  
  public static double calcTax(double tax){ 
    tax *= 1.095;
    return tax;
  }
  
  public static void display(car car1){
    System.out.println();
    System.out.println("Your car is a " + car1.getName() + ".");
    System.out.println("Your total price is $" + car1.getTotalPrice());
    System.out.println("Your car options are " + car1.getTotalOptions());
    System.out.println();
    System.out.println("Thank you for shopping at Mihira's Dealership!");
  }
  
  //change seats
  public static car seatsOption(car car1){
    
    Scanner input = new Scanner (System.in);
    
    int seatType;
    System.out.println("What kind of seats do you want, leather or cloth? The cost for leather is $500 and for cloth it is $0. Press 1 for leather and 2 for cloth.");
    seatType = input.nextInt();
    
    if (seatType == 1){
      car1.setTotalPrice(car1.getTotalPrice() + 500);
      car1.setTotalOptions("leather seats");
    }
    
    else{
      car1.setTotalOptions("cloth seats");
    }
    
    return car1;

  }
  
  //change heated seats
  public static car heatedSeatsOption(car car1){
    
    Scanner input = new Scanner (System.in);
    
    int heatSeat;
    System.out.println("Would you like heated seats? The cost for heated seats is $600. Press 1 for yes, 2 for no.");
    heatSeat = input.nextInt();
    
    if(heatSeat == 1){
      car1.setTotalPrice(car1.getTotalPrice() + 600);
      car1.setTotalOptions("heated seats");
    }
    
    else{
      car1.setTotalOptions("no heated seats");
    }
    
    return car1;
  }
  
  //change sunroof
  public static car sunroofOption(car car1){
    
    Scanner input = new Scanner (System.in);
    
    int sunroof;
    System.out.println("Would you like a sunroof? The cost for a sunroof is $1000. Press 1 for yes, 2 for no.");
    sunroof = input.nextInt();
    
    if(sunroof == 1){
      car1.setTotalPrice(car1.getTotalPrice() + 1000);
      car1.setTotalOptions("sunroof");
    }
    
    else{
      car1.setTotalOptions("no sunroof");
    }
    
    return car1;
  }
  
 
  //change keys
  public static car keylessOption(car car1){
    
    Scanner input = new Scanner (System.in);
    
    int keyless;
    System.out.println("Would you like a keyless car? The cost for a keyless car is $100. Press 1 for yes, 2 for no.");
    keyless = input.nextInt();
    
    if(keyless == 1){
      car1.setTotalPrice(car1.getTotalPrice() + 100);
      car1.setTotalOptions("keyless");
    }
    
    else{
      car1.setTotalOptions("not keyless");
    }
    
    return car1;
  }
  
  //change audio system
  public static car audioSystemOption(car car1){
    
    Scanner input = new Scanner (System.in);
    
    int audio;
    System.out.println("Would you like an upgraded audio system? The cost for an upgraded audio system is $300. Press 1 for yes, 2 for no.");
    audio = input.nextInt();
    
    if(audio == 1){
      car1.setTotalPrice(car1.getTotalPrice() + 300);
      car1.setTotalOptions("upgraded audio system");
    }
    
    else{
      car1.setTotalOptions("no upgraded audio system");
    }
    
    return car1;
  }
  
  //change bluetooth
  public static car bluetoothOption(car car1){
    
    Scanner input = new Scanner (System.in);
    
    int blue;
    System.out.println("Would you like bluetooth? The cost for bluetooth is $200. Press 1 for yes, 2 for no.");
    blue = input.nextInt();
    
    if(blue == 1){
      car1.setTotalPrice(car1.getTotalPrice() + 200);
      car1.setTotalOptions("bluetooth");
    }
    
    else{
      car1.setTotalOptions("no bluetooth");
    }
    
    return car1;
  }
  
  //change aux
  public static car auxOption(car car1){
    
    Scanner input = new Scanner (System.in);
    
    int aux;
    System.out.println("Would you like an aux cord? The cost for an aux cord is $60. Press 1 for yes, 2 for no.");
    aux = input.nextInt();
    
    if(aux == 1){
      car1.setTotalPrice(car1.getTotalPrice() + 60);
      car1.setTotalOptions("aux");
    }
    
    else{
      car1.setTotalOptions("no aux");
    }
    
    return car1;
  }
}