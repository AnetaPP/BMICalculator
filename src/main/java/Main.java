import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        BMICalculator newCalc = new BMICalculator();
//        String bmi1 = newCalc.calculate(80,175);
//        System.out.println(bmi1);
//        String bmi2 = newCalc.interpret(bmi1);
//        System.out.println(bmi2);


        Scanner scanner = new Scanner(System.in);
        double height;
        double weight;

            try{
                System.out.println("Please enter your height in centimeters: ");
                height = scanner.nextDouble();
                    }catch(IllegalArgumentException ex) {
                System.out.println("Enter again");
            }

            try{
                System.out.println("Please enter your weight in kilograms: ");
                weight = scanner.nextDouble();
                    }catch(IllegalArgumentException ex) {
                System.out.println("Enter again");
            }

            BMICalculator bmicalc = new BMICalculator();
            String newbmi = bmicalc.calculate(weight, height);
            String result = bmicalc.interpret(newbmi);
            System.out.println("Your result is " + newbmi + ", which means you are " + result + ".");

        }
    }
}
