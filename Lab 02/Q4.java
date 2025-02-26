// Import the scanner package to accept user input
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        /*
        This program's functions is to convert the seconds inputted by the user
        into hours, minutes and seconds.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of seconds: ");
        int total_sec = scanner.nextInt();

        // An hour is 3600 seconds
        int hour = total_sec / 3600;
        // A minute is 60 seconds
        int min = (total_sec % 3600) / 60;
        int sec = total_sec % 60;

        // "%d" signifies that the variable is a decimal integer
        System.out.printf("%d seconds is %d hours, %d minutes and %d seconds\n",
                total_sec, hour, min, sec);
        /*
        You can also do:
        System.out.println(total_sec + " seconds is " + hour + " hours, " + min + " minutes and " + sec + "seconds");
         */
    }
}
