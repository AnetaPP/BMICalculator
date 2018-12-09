import jdk.internal.util.xml.impl.Input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        BMICalculator newCalc = new BMICalculator();
//        String bmi1 = newCalc.calculate(80,175);
//        System.out.println(bmi1);
//        String bmi2 = newCalc.interpret(bmi1);
//        System.out.println(bmi2);


        Scanner scanner = new Scanner(System.in);
        double height = 0.00;
        double weight = 0.00;
        System.out.println("Please enter your height in centimeters: ");

        while(height<=0.00){
            try{
                height = scanner.nextDouble();
                if(height<=0.00){
                    System.out.println("Incorrect height. Please enter your height again:");}
                    }catch(InputMismatchException ex) {
                System.out.println("Incorrect height. Please enter your height again:");
                scanner.next();
            }
        }

        System.out.println("Please enter your weight in kilograms: ");

        while(weight<=0.00) {
            try{
                weight = scanner.nextDouble();
                if(weight<=0.00){
                System.out.println("Incorrect weight. Please enter your weight again:");
                }
            }catch(InputMismatchException ex) {
                System.out.println("Incorrect weight. Please enter your weight again:");
                scanner.next();

            }
        }

            BMICalculator bmicalc = new BMICalculator();
            String newbmi = bmicalc.calculate(weight, height);
            String result = bmicalc.interpret(newbmi);
            System.out.println("Your result is " + newbmi + ", which means you are " + result + ".");

    }
}

