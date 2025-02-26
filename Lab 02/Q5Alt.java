import java.util.Random;

/*
Q5 but with a while loop :D
 */
public class Q5Alt {
    public static void main(String[] args) {
        Random r = new Random();

        int num = r.nextInt(10001);
        System.out.println("The randomly generated number: " + num);
        int sum = 0;

        while (num > 0){
            sum += num % 10;
            num /= 10;
        }

        System.out.println("The sum of the digits: " + sum);
    }
}
