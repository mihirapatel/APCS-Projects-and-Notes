import java.util.*;

public class graduation{

  public static void main (String [] args){
    
    String name1, name2, name3, name4, name5;
    double gpa1, gpa2, gpa3, gpa4, gpa5;
    String NAME1, NAME2, NAME3, NAME4, NAME5;
    double GPA1, GPA2, GPA3, GPA4, GPA5;
    
    Scanner input = new Scanner(System.in);
    
    //student 1
    System.out.println("Enter the first name.");
    name1 = input.nextLine();      
    System.out.println("Enter GPA1.");    
    gpa1 = input.nextDouble();
    student student1 = new student(name1, gpa1);
    NAME1 = student1.getName();
    GPA1 = student1.getGPA();
    
    //student2
    System.out.println("Enter the second name.");
    name2 = input.nextLine();
    input.nextLine(); 
    System.out.println("Enter GPA2.");
    gpa2 = input.nextDouble();
    student student2 = new student(name2, gpa2);
    NAME2 = student2.getName();
    GPA2 = student2.getGPA();

    //student3 
    System.out.println("Enter the third name.");
    name3 = input.nextLine();
    input.nextLine(); 
    System.out.println("Enter GPA3.");
    gpa3 = input.nextDouble();
    student student3 = new student(name3, gpa3);
    NAME3 = student3.getName();
    GPA3 = student3.getGPA();
   
   //student4  
    System.out.println("Enter the fourth name.");
    name4 = input.nextLine();
    input.nextLine(); 
    System.out.println("Enter GPA4.");
    gpa4 = input.nextDouble();
    student student4 = new student(name4, gpa4);
    NAME4 = student4.getName();
    GPA4 = student4.getGPA();

    //student5    
    System.out.println("Enter the fifth name.");
    name5 = input.nextLine();
    input.nextLine(); 
    System.out.println("Enter GPA5.");
    gpa5 = input.nextDouble();
    student student5 = new student(name5, gpa5);
    NAME5 = student5.getName();
    GPA5 = student5.getGPA();

  
    double gpaSwitch, run;
    String nameSwitch;
    run = 1;
      
    while (run < 5) {  
      if (GPA1 <= GPA2) {  
       gpaSwitch = GPA1; 
       GPA1 = GPA2; 
       GPA2 = gpaSwitch;
       
       nameSwitch = NAME1;
       NAME1 = NAME2;
       NAME2 = nameSwitch;
      } 
      
      if (GPA2 <= GPA3) {  
       gpaSwitch = GPA2; 
       GPA2 = GPA3; 
       GPA3 = gpaSwitch;
       
       nameSwitch = NAME2;
       NAME2 = NAME3;
       NAME3 = nameSwitch;
      }
      
      if (GPA3 <= GPA4) {  
       gpaSwitch = GPA3; 
       GPA3 = GPA4; 
       GPA4 = gpaSwitch;
       
       nameSwitch = NAME3;
       NAME3 = NAME4;
       NAME4 = nameSwitch;
      }
      
      if (GPA4 <= GPA5) {  
       gpaSwitch = GPA4; 
       GPA4 = GPA5; 
       GPA5 = gpaSwitch;
       
       nameSwitch = NAME4;
       NAME4 = NAME5;
       NAME5 = nameSwitch;
      }
      run++;
     } 
    
    System.out.println(NAME1 + " " + GPA1 + " Valedictorian");
    System.out.println(NAME2 + " " + GPA2 + " 2nd runner up");
    System.out.println(NAME3 + " " + GPA3 + " 3rd runner up");
    System.out.println(NAME4 + " " + GPA4 + " 4th runner up");
    System.out.println(NAME5 + " " + GPA5 + " 5th runner up");
 
  }

}