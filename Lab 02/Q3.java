// Import the random package to allow random number generation
import java.util.Random;

public class Q3 {
    public static void main(String[] args) {
        /*
        This program's function is to generate three random numbers from 10 to 50
        and display the numbers, sum of the numbers and the average in 2 decimal places.
         */

        Random r = new Random();

        int n1 = r.nextInt(10,51);
        int n2 = r.nextInt(10, 51);
        int n3 = r.nextInt(10, 51);

        int sum = n1 + n2 + n3;
        double average = (double) sum / 3;

        System.out.println("The three randomly generated numbers: " + n1 + " " +  n2 + " " + n3);
        System.out.println("The sum of the three numbers: " + sum);
        // "%.2f" formats the output to 2 decimal places
        System.out.printf("The average of the three numbers: " + "%.2f",average);
    }
}
