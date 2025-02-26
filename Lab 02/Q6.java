// Import the scanner package to accept user input
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount of water in gram: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double init_temp = scanner.nextDouble();
        init_temp = (init_temp - 32) / 1.8;
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double final_temp = scanner.nextDouble();
        final_temp = (final_temp - 32) / 1.8;

        // Follow the formula given
        double q = (weight / 1000) * (final_temp - init_temp) * 4184;

        // "%e" formats the number as how it is in the output given
        // "%n" to signify a new line
        System.out.printf("The energy needed is %e%n", q);
    }
}
