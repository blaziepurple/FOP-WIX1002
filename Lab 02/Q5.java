import java.util.Random;

public class Q5 {
    public static void main(String[] args) {
        /*
        This program's function is to generate a random from 0-10000 and
        display the sum of its digits.
         */

        Random r = new Random();

        int num = r.nextInt(10001);
        System.out.println("The randomly generated number: " + num);

        // a while loop would make this MUCH MUCH simpler >~<
        // alas at this point you haven't learnt it yet

        // Get the last digit, add it to the sum of digits and divide the number by 10
        int sum = 0;
        sum += num % 10;
        num /= 10;
        sum += num % 10;
        num /= 10;
        sum += num % 10;
        num /= 10;
        sum += num % 10;
        num /= 10;
        sum += num % 10;

        System.out.println("The sum of its digits are: " + sum);

    }
}
