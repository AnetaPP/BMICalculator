import java.text.DecimalFormat;

public class BMICalculator implements Calculator {

    private double weight;
    private double height;
    private static double bmi;
    private String interp;

    @Override
    public String calculate(double weight, double height) {
        bmi = weight/Math.pow(height/100,2);
        DecimalFormat f = new DecimalFormat("##.00");
        return f.format(bmi);
    }

    public String interpret(String bmi){
        return interp;
    }

}
//Very severely underweight 	            	    15
//Severely underweight      	            15  	16
//Underweight 	                            16  	18.5
//Normal (healthy weight) 	               18.5 	25
//Overweight 	                            25 	    30
//Obese Class I (Moderately obese) 	        30 	    35
//Obese Class II (Severely obese) 	        35 	    40
//Obese Class III (Very severely obese) 	40 	    45
//Obese Class IV (Morbidly Obese) 	        45 	    50
//Obese Class V (Super Obese) 	            50 	    60
//Obese Class VI (Hyper Obese) 	            60
