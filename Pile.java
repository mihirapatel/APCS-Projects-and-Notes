public class Pile{
  
  private int stones;
  private int decrease;
  
  //default
  public Pile(){
    stones = 0;
    decrease = 0;
  }
  
  //custom
  public Pile(int s, int d){
    stones = s;
    decrease = d;
  }
  
  //getters
  public int getStones(){
    return stones;
  }
  
  public int getDecrease(){
    return decrease;
  }
  
  //setters
  public void setStones(int newStones){
    stones = newStones;
  }
  
  public void setDecrease(int newDecrease){
    decrease = newDecrease;
  }
  
  //method to decrease
  public int decreaseStones(int stones, int decrease){
    stones = stones - decrease;
    return stones;
    
  }

}