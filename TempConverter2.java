public class TempConverter
{
    //----------------------------------------------------------------------------
    //  Computes the Celsius equivalent of a specific Fahrenheit
    //  value using the formula C = (F-32)(5/9)
    //----------------------------------------------------------------------------
    public static void main(String args[]) 
    {
     final int BASE = 32;
     final double CONVERSION_FACTOR = 5.0 / 9.0;
     
     double celsiusTemp;
     int fahrenheitTemp = 24; // value to convert
     
     celsiusTemp = (fahrenheitTemp - BASE) * CONVERSION_FACTOR;
     
      System.out.println("Celsius Temperature: " + celsiusTemp);
      System.out.println("Fahrenheit Equivalent: " + fahrenheitTemp);
    }
}