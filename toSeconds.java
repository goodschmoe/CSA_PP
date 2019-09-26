public class toSeconds {
    //------------------------------------------------------------------------------
    // Calculate the number of seconds, given time in hours and minutes
    //------------------------------------------------------------------------------
    public static void main(String args[]) {
      int hours = 0;
      int minutes = 5;
      int seconds = 13;
      int[] initialTime = {hours, minutes};
      
      final int MINUTES_PER_HOUR = 60;
      final int SECONDS_PER_MINUTE = 60;
      
      minutes = (hours * MINUTES_PER_HOUR) + minutes;
      
      int finalSeconds = (minutes * SECONDS_PER_MINUTE) + seconds;

      System.out.println("In " + initialTime[0] + " hours and " + initialTime[1] + " minutes, there is a total of " + finalSeconds + " seconds.");
    }
}