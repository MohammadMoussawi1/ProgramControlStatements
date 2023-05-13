import java.util.Random;

public class FindMinMax {

    public static void main(String[] args) {

        // Initialize variables for min and max
        int min = 100;
        int max = 1;

        // Generate 10 random integers from 1 to 100
        Random random = new Random();
        int count = 1;
        while (count <= 10) {
            int num = random.nextInt(100) + 1;
            System.out.println("Random number " + count + ": " + num);

            // Check if the number is the new min or max
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }

            count++;
        }

        // Print the min and max values
        System.out.println("The smallest number is: " + min);
        System.out.println("The largest number is: " + max);
    }
}
