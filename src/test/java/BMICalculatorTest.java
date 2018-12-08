import org.junit.Before;
import org.junit.runner.RunWith;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class BMICalculatorTest {

    BMICalculator calc;

    @Before
    public void setUp() {
        calc = new BMICalculator();
    }

    @Test
    @Parameters({"50.00 ,175.00, 16.33",
                "60.00 ,165.00, 22.04",
                "100.00,155.00, 41.62"})
    public void testBMICalculatorCalculateBMI(double weight, double height, String exp){

        assertEquals(exp,calc.calculate(weight,height));
    }

    @Test(expected = IllegalArgumentException.class)
    @Parameters({"-50.00 ,175.00",
                 "60.00 ,-3.00",
                 "0 ,1.75",
                    "0,0"})
    public void testBMICalculatorIllegalArguments(double weight, double height) {
        calc.calculate(weight, height);
    }

    @Test
    @Parameters({"17, Severely underweight",
                "23,Normal (healthy weight)",
                    "28.5, Overweight"})
    public void testInterpretation(String bmi, String label){
        assertEquals(label,calc.interpret(bmi));
    }



}
