import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicCalculator {
    public static void main(String[] args) throws IOException {

        float firstNumberMoussawi, secondNumberMoussawi, sum, substraction, product, quotient;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("The program calculates sum, difference, product and quotient for two numbers.");
        System.out.println("Enter the first number (and press Enter): ");
        firstNumberMoussawi = Float.parseFloat(br.readLine());
        System.out.println("Enter the second number (and press Enter): ");
        secondNumberMoussawi = Float.parseFloat(br.readLine());

        sum = firstNumberMoussawi+ secondNumberMoussawi;
        substraction = firstNumberMoussawi - secondNumberMoussawi;
        product = firstNumberMoussawi * secondNumberMoussawi;
        quotient = firstNumberMoussawi / secondNumberMoussawi;

        System.out.printf("You entered two numbers, the first is: " + "%2.2f", firstNumberMoussawi);
        System.out.printf(" and the second is: " + "%2.2f", secondNumberMoussawi);

        System.out.println(); //blank line

        System.out.printf("Sum = " + "%2.2f, \n", + sum);
        System.out.printf("Difference = " + "%2.2f, \n", + substraction);
        System.out.printf("Product = " + "%2.2f, \n", + product);
        System.out.printf("Quotient = " + "%2.2f, \n", + quotient);
    }
}