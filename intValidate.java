import java.util.Scanner;

public class intValidate
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter an integer greater than 10: ");
        
        int userInput = keyboard.nextInt();
        
        while (userInput < 11)
        {
            System.out.println("Please enter an integer greater than 10: ");
            userInput = keyboard.nextInt();
        }
        System.out.println(userInput + " is good!");
        System.out.println("Nathan Dilla's work");
        
    }
}