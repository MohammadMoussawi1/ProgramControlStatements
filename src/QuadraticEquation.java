import java.util.Scanner;
public class QuadraticEquation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get input values of a, b, and c from the user
        System.out.print("Enter a: ");
        double a = input.nextDouble();

        // Check if a is not zero
        if (a == 0) {
            System.out.println("a cannot be zero!");
            return;
        }

        System.out.print("Enter b: ");
        double b = input.nextDouble();

        System.out.print("Enter c: ");
        double c = input.nextDouble();

        // Calculate delta
        double delta = Math.pow(b, 2) - 4 * a * c;

        // Determine the number of roots
        int numberOfRoots = 0;
        if (delta > 0) {
            numberOfRoots = 2;
        } else if (delta == 0) {
            numberOfRoots = 1;
        }

        // Calculate roots based on the number of roots
        switch (numberOfRoots) {
            case 1:
                double x = -b / (2 * a);
                System.out.printf("a = %.2f, b = %.2f, c = %.2f, x = %.2f", a, b, c, x);
                break;
            case 2:
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("a = %.2f, b = %.2f, c = %.2f, x1 = %.2f, x2 = %.2f", a, b, c, x1, x2);
                break;
            default:
                System.out.println("No real roots exist!");
                break;
        }

        input.close();
    }
}
