import java.util.Scanner;

public class whatDay {
    public static void main(String args[]) {
      Scanner keyboard = new Scanner(System.in);
      int userAge = -1;
      String currentDay;
      boolean weekday = true;
      
      System.out.println("What is your age?");
      if(keyboard.hasNextInt()) 
      {
        userAge = keyboard.nextInt();
      }
      else
      {
        System.out.println("Invalid age");    
      }
      
      boolean validated = false;
      while (validated == false)
      {
          System.out.println("What day is it?");
          currentDay = keyboard.next();
          if (currentDay.equalsIgnoreCase("monday"))
          {
               weekday = true;
               validated = true;
          }
          else if (currentDay.equalsIgnoreCase("tuesday"))
          {
               weekday = true;
               validated = true;
          }
          else if (currentDay.equalsIgnoreCase("wednesday"))
          {
               weekday = true;
               validated = true;
          }
          else if (currentDay.equalsIgnoreCase("thursday"))
          {
               weekday = true;
               validated = true;
          }
          else if (currentDay.equalsIgnoreCase("friday"))
          {
               weekday = true;
               validated = true;
          }
          else if (currentDay.equalsIgnoreCase("saturday"))
          {
               weekday = false;
               validated = true;
          }
          else if (currentDay.equalsIgnoreCase("sunday"))
          {
               weekday = false;
               validated = true;
          }
      }
      
      if (weekday == true)
      {
          if (userAge < 18)
          {
              System.out.println("Today is a school day!");
          }
          else
          {
              System.out.println("Today is a work day!");
          }
      }
      else
      {
          System.out.println("Celebrate!");
      }
    }
}