// Import the scanner package to accept user input
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        /*
        This program's function is to convert temperature in Fahrenheit to Celsius
        inputted by the user and to display the answer to 2 decimal places.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter degree in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Use the formula provided
        double celsius = (fahrenheit - 32) / 1.8;

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        // "%.2f" formats the output to 2 decimal places
        System.out.printf("Temperature in Celsius: " + "%.2f",celsius);
    }
}