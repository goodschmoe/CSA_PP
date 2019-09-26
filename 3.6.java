import java.util.Scanner;

public class HiLo {
    public static void main(String args[]) {
        String isPlaying = "Y";
        Scanner keyboard = new Scanner(System.in);
        
        int randomNumber;
        int guess;
      while (isPlaying.equalsIgnoreCase("Y"))
      {
          guess = -1;
          randomNumber = (int)(Math.random() * 100);
          while ((guess != randomNumber) && isPlaying.equalsIgnoreCase("Y"))
          {
              System.out.println("Guess a number from 1-100: ");
              guess = keyboard.nextInt();
              if (guess > randomNumber)
              {
                  System.out.println("Too high!");
                  System.out.println("Enter \"Y\" to continue program.");
                  isPlaying = keyboard.next();
              }
              else if (guess < randomNumber)
              {
                  System.out.println("Too low!");
                  System.out.println("Enter \"Y\" to continue program.");
                  isPlaying = keyboard.next();
              }
              else if (guess == randomNumber)
              {
                  System.out.println("Horray!");
                  System.out.println("Do you want to play again? Enter \"Y\" ");
                  isPlaying = keyboard.next();
              }
          }
      }
      System.out.println("Goodbye!");
    }
}