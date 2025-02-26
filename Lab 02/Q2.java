// Import the scanner package to accept user input
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        /*
        This program's function is to calculate the monthly payment for a car loan
        using the inputs provided by the user and display the monthly
        payment in 2 decimal places.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of the car: ");
        double p = scanner.nextDouble();
        System.out.print("Enter the down payment: ");
        double d = scanner.nextDouble();
        System.out.print("Enter the interest rate (in %): ");
        double r = scanner.nextDouble();
        System.out.print("Enter the loan duration (in years): ");
        double y = scanner.nextDouble();

        // Use the formula provided
        double m = (p - d) * (1 + (r * y) / 100) / (y * 12);

        // "%.2f" formats the output to 2 decimal places
        System.out.printf("Monthly payment: RM " + "%.2f",m);
    }
}
