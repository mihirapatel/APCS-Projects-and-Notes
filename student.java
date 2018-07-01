public class student{

  String name;
  double gpa;
  
  //default
  public student(){ 
    name = "James Lin";
    gpa = 4.0;
  }
  
  //custom
  public student(String n, double g){ 
    name = n;
    gpa = g;
  }
  
  //getters
  public String getName(){
    return name;
  }
  
  public double getGPA(){
    return gpa;
  }
  
  //setters
  public void setName(String newName){
    name = newName;
  }
  
  public void setGPA(double newGPA){
    gpa = newGPA;
  }
  
}