import java.util.Scanner;

public class intValidate {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
      int userInput = -1;
      
      System.out.println("Enter a value greater than 10: ");
      userInput = keyboard.nextInt();
      while (userInput < 11)
      {
          System.out.println("Please enter a value greater than 10: ");
          userInput = keyboard.nextInt();
      }
      System.out.println("Yummy!");
}
}