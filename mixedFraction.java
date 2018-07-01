public class mixedFraction extends Fractions{
  
  private int wholeNumber;
  
  //default
  public mixedFraction(){
    super();
    wholeNumber = 1;
  }
  
  //custom
  public mixedFraction(int n, int d, int w){
    super(n, d);
    wholeNumber = w;
  }
  
  //getter
  public int getWholeNumber(){
    return wholeNumber;
  }

  //setter
  public void setWholeNumber(int newWholeNumber){
    wholeNumber = newWholeNumber;
  }
  
  public static mixedFraction convert(Fractions a){
    int num = a.getNum();
    int den = a.getDen();
    int w = num/den;
    int n = num%den;
    int d = den;
    
    mixedFraction answer = new mixedFraction(n, d, w);
    return answer;
  }
  
  public void printMixedFraction(){
    System.out.println(wholeNumber + " " + super.getNum() + "/" + super.getDen());
  }







}