public class twoPointDistance {
    public static void main(String args[]) {
      double distance;
      double x1 = 2;
      double x2 = 2;
      double y1 = 1;
      double y2 = 1;
      
      double compareX = Math.pow((x1 - x2), 2);
      double compareY = Math.pow((y1 - y2), 2);
      distance = Math.sqrt(compareX + compareY);
      
      System.out.println(distance);
    }
}