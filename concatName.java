public class concatName {
    public static void main(String args[]) {
      String firstName = "Nathan";
      String lastName = "Dilla";

      String fullName = firstName + " " + lastName;

      System.out.println(fullName);
      
      System.out.println("First Name length: " + firstName.length());
      System.out.println("Last Name length: " + lastName.length());
      System.out.println("Name length: " + firstName.length());
      
      System.out.println("First Name length: " + fullName.length());
      
      System.out.println(fullName.toUpperCase());
    }
}