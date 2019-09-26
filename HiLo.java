import java.util.Scanner;

public class HiLo {
    public static void main(String args[]) {
        String isPlaying = "Y";
        Scanner keyboard = new Scanner(System.in);
        
        int randomNumber = (int)(Math.random() * 100);
      while (isPlaying.equalsIgnoreCase("Y"))
      {
          System.out.println("Enter \"Y\" to continue program.");
          isPlaying = keyboard.next();
          
          System.out.println("Guess a number: ");
          int guess = keyboard.nextInt();
          if (guess > randomNumber)
          {
              System.out.println("Too high!");
          }
          else if (guess < randomNumber)
          {
              System.out.println("Too low!");
          }
          else if (guess == randomNumber)
          {
              System.out.println("Horray!");
              isPlaying = "N";
          }
      }
      System.out.println("Goodbye!");
    }
}