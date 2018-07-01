public class car{
  
  String name;
  double totalPrice;
  String totalOptions;
  
  //default
  public car(){
    name = "Camry";
    totalPrice = 32000;
    totalOptions = " ";
  }
  //custom
  public car(String carName, int price, String option){ 
    name = carName; 
    totalPrice = price;
    totalOptions = option;
  }
  
  //getters
  public String getName(){
    return name;
  }
  
  public double getTotalPrice(){
    return totalPrice;
  }
  
  public String getTotalOptions(){
    return totalOptions;
  }
  
  //setters
  public void setName(String newName){
    name = newName;
  }
  
  public void setTotalPrice(double newPrice){
    totalPrice = newPrice;
  }
  
  public void setTotalOptions(String newTotalOptions){
    totalOptions = newTotalOptions + ", " + totalOptions ;
  }  

}