public class Runner{
  
  int time;
  int sex; //1 means female and 0 means male

  public Runner(){
    time = 30;
    sex = 1;
  }
  
  public Runner(int t, int s){
    time = t;
    sex = s;
  }
  
  //setters
  public void setTime(int newTime){
    time = newTime;
  }
  
  public void setSex(int newSex){
    sex = newSex;
  }
  
  //getters
  public int getTime(){
    return time;
  }
  
  public int getSex(){
    return sex;
  }
  
}