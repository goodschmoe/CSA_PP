import java.text.DecimalFormat;

public class triangleArea {
    public static void main(String args[]) {
      double side1 = 2;
      double side2 = 3;
      double side3 = 4;
      
      double s = (side1 + side2 + side3) / 2;
      
      double term1 = s - side1;
      double term2 = s - side2;
      double term3 = s - side3;
      
      double area = Math.sqrt(s * term1 * term2 * term3);

      DecimalFormat numFormat = new DecimalFormat("#.###");

      System.out.println("Area of triangle: " + numFormat.format(area));
    }
}