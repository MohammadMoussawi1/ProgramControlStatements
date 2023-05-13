import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMICalculator {
    public static void main(String[] args) throws IOException {

        float heightMoussawi, weightMoussawi , bmiMoussawi;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("The program will calculate your BMI");
        System.out.println("Enter your height in cm (and press Enter): ");
        heightMoussawi = Float.parseFloat(br.readLine())/100;
        System.out.println("Enter your weight (and press Enter): ");
        weightMoussawi = Float.parseFloat(br.readLine());

        bmiMoussawi = (float) (weightMoussawi / (Math.pow(heightMoussawi, 2)));
        System.out.printf("Your BMI is: " + "%2.2f, \n", bmiMoussawi);

        if(bmiMoussawi<16){
            System.out.println("You are starving");
        } else if((bmiMoussawi >= 16)&&(bmiMoussawi < 16.99)){
            System.out.println("You're emaciated");
        } else if((bmiMoussawi >= 17)&&(bmiMoussawi < 18.49)){
            System.out.println("You're underweight");
        } else if((bmiMoussawi >= 18.50)&&(bmiMoussawi < 22.99)){
            System.out.println("You are in the low range of the norm");
        } else if((bmiMoussawi>= 23)&&(bmiMoussawi < 24.99)){
            System.out.println("You're in the high range of the norm");
        } else if((bmiMoussawi >= 25)&&(bmiMoussawi < 27.49)){
            System.out.println("You are overweight (pre-obese)");
        } else if((bmiMoussawi>= 27.50)&&(bmiMoussawi < 29.99)){
            System.out.println("You're overweight");
        } else if((bmiMoussawi >= 30)&&(bmiMoussawi < 34.99)){
            System.out.println("You have 1st degree obesity");
        } else if((bmiMoussawi >= 35)&&(bmiMoussawi < 39.99)){
            System.out.println("You have 2nd degree obesity");
        } else if((bmiMoussawi> 40)){
            System.out.println("You have 3rd degree obesity");
        }

    }
}