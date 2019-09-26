public class milesToKm {
    public static void main(String args[]) {
      final double CONVERSION_FACTOR = 1.60935;
      
      int miles = 5;
      double km;
      
      km = miles * CONVERSION_FACTOR;
      
      System.out.println(miles + " miles in kilometers is " + km + ".");
    }
}