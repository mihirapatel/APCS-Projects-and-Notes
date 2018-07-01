public class Fractions{

  int numerator;
  int denominator;
  
  //default
  public Fractions(){
    numerator = 1;
    denominator = 2;
  }
  
  //custom
  public Fractions(int num, int den){
    numerator = num;
    denominator = den;
  }
  
  //getters
  public int getNum(){
    return numerator;
  }

  public int getDen(){
    return denominator;
  }

  //setters
  public void setNum(int newNum){
    numerator = newNum;
  }
  
  public void setDen1(int newDen){
    denominator = newDen;
  }
  
}