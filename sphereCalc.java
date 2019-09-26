public class sphereCalc
{
    public static void main(String args[]) {
      double radius = 2;
      final double PI = Math.PI;
      
      double volume = (4 * PI * Math.pow(radius, 3))/3;
      double surfaceArea = 4 * PI * Math.pow(radius, 2);
      System.out.println("Sphere volume: " + volume + " units^3");
      System.out.println("Sphere surface area: " + surfaceArea + " units^2");
    }
}