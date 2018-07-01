//Mihira Patel
//9/8/17
//Period 2
//Mad Libs 
  
 /*Mad Libs Intructions
 * 20 inputs
 * at least one math operation
 * spaces
 * tenses
 */

import java.util.*;

public class MadLibs{

  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in); 
    
    //variables
    String day1, name1, place1, name2, adj1, food1, container1, adj2, liquid1, transportation1, verb1, noun1, verb2, verb3, verb4, noun2, job1, item1, item2, fastfood1;
    int num1, num2, finalnum;
   
    
    //inputs
    System.out.println("Input a day of the week");
    day1 = input.nextLine();
    System.out.println("Input a name (girl)");
    name1 = input.nextLine();
    System.out.println("Input a place");
    place1 = input.nextLine();
    System.out.println("Input a name (girl)");
    name2 = input.nextLine();
    
    System.out.println("Input an adjective");
    adj1 = input.nextLine();
    System.out.println("Input a food (plural)");
    food1 = input.nextLine();
    System.out.println("Input a container (singular)");
    container1 = input.nextLine();
    System.out.println("Input an adjective");
    adj2 = input.nextLine();
    System.out.println("Input a liquid");
    liquid1 = input.nextLine();
    
    System.out.println("Input a mode of transportation (noun)");
    transportation1 = input.nextLine();
                       
    System.out.println("Input a verb (present tense)");
    verb1 = input.nextLine();
    System.out.println("Input a plural noun");
    noun1 = input.nextLine();
    
    System.out.println("Input a verb (present tense)");
    verb2 = input.nextLine();
    System.out.println("Input an item (plural- ex: shoes)");
    item1 = input.nextLine();
    System.out.println("Input a verb (past tense)");
    verb3 = input.nextLine();
    System.out.println("Input a noun");
    noun2 = input.nextLine();
    
    System.out.println("Input an occupation");
    job1 = input.nextLine();
    System.out.println("Input an item");
    item2 = input.nextLine();
    System.out.println("Input a verb (-ing ending)");
    verb4 = input.nextLine();
    
    System.out.println("Input a number");
    num1 = input.nextInt();
    System.out.println("Input a food place");
    fastfood1 = input.next();
    
    System.out.println("Input a number");
    num2 = input.nextInt();
    
    //PEMDAS operation
    finalnum = (num1+num2)*12;
    

    //outputs
    System.out.println("On " + day1 + ", " + name1 + " went to the " + place1 + " with " + name2 + ".");
    System.out.println(name1 + " packed " + adj1 + " " + food1 + " and a " + container1 + " filled with " + adj2 + " " + liquid1 + ".");
    System.out.println(name2 + " drove her " + transportation1 + " to the " + place1 + ".");
    System.out.println("When they got there, they had no space to " + verb1 + " because there were so many " + noun1 + " everywhere.");
    System.out.println(name1 + " and " + name2 + " wanted to learn how to " + verb2 + " so they rented a pair of " + item1 + " and " + verb3 + " into the " + noun2 + ".");
    System.out.println("A " + job1 + " blew on his " + item2 + " because someone was " + verb4 + " too far into the " + noun2 + ".");
    System.out.println("Eventually, the tide was too high and no one was allowed to " + verb2 + ".");
    System.out.println("After spending the day at the " + place1 + ", " + name1 + " and " + name2 + " went to get some food at " + fastfood1 + ".");
    System.out.println(name1 + " brought $" + num1 + " and " + name2 + " had $" + num2 + ", for a total of $" + (num1+num2) + ".");
    System.out.println("However, when they ordered their food, the total amound came out to $" + finalnum + ", so they had to go back home.");  

    input.close();
  }

}
