import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class BMICalculator implements Calculator<String> {


    public String calculate(double ...params) throws IllegalArgumentException{
       double weight = params[0];
       double height = params[1];

        if(weight >0 & height>0) {
           double bmi = weight / Math.pow(height / 100, 2);
           DecimalFormat f = new DecimalFormat("##.00", DecimalFormatSymbols.getInstance(Locale.US));
           return f.format(bmi);
       } throw new IllegalArgumentException();
    }

    public String interpret(String bmi){


        String  bmiChart [][] = {
                {"0","Very severely underweight "},
                {"15","Severely underweight"},
                {"16","Underweight"},
                {"18.5","Normal (healthy weight)"},
                {"25","Overweight"},
                {"30","Obese Class I (Moderately obese)"},
                {"35","Obese Class II (Severely obese)"},
                {"40","Obese Class III (Very severely obese)"},
                {"45","Obese Class IV (Morbidly Obese)"},
                {"50","Obese Class V (Super Obese)"},
                {"60","Obese Class VI (Hyper Obese)"},
                {"100000","Out of bounds"}
        };

        double bmiD = Double.parseDouble(bmi);

        for( int i = 0;i<(bmiChart.length-1);i++){

            double temp = Double.parseDouble(bmiChart[i][0]);
            double nextTemp = Double.parseDouble(bmiChart[i+1][0]);

           if(bmiD < nextTemp) return bmiChart [i][1];
        }



        return null;
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
