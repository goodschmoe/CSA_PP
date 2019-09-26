public class ArithOfTwo
{
    //------------------------------------------------------------------------------------------
    // Takes value of two integers and calculates the sum, difference and product between them
    //------------------------------------------------------------------------------------------
    public static void main(String args[]) {
      int integer1 = 10;
      int integer2 = 13;
      
      int result;
      
      result = integer1 + integer2;
      System.out.println("The sum is " + result);
      result = integer1 - integer2;
      System.out.println("The difference is " + result);
      result = integer1 * integer2;
      System.out.println("The product is " + result);
    }
}