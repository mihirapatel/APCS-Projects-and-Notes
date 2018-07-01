public class location{

  String name;
  double tempF;
  
  public location(){
    name = "Fremont";
    tempF = 70;
  }
  
  public location(String n, double t){
    name = n;
    tempF = t;
  }
    
  public void setName(String newName){
    name = newName;
  }
  
  public void setTemp(double newTemp){
    tempF = newTemp;
  }
  
  public String getName(){
    return name;
  }
  
  public double getTemp(){
    return tempF;
  }
  
  public double covertCel(){
    
    double tempC = 0;
    tempC = tempF - 32;
    tempC *= 5/9;
    
    return tempC;
  }
  
  
}