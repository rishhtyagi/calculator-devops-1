import org.junit.Test;
import static org.junit.Assert.*;

public class Testing {
    private static final double DELTA = 1e-9;
    Calculator calculator = new Calculator();

    @Test
    public void squareRoot_True(){
        assertEquals("True: Square Root of number ", 10.0, calculator.squareRoot(100), DELTA);
        assertEquals("True: Square Root of number ", Double.NaN , calculator.squareRoot(-15), DELTA);
        assertEquals("True: Square Root of number ", 6.708203932499369, calculator.squareRoot(45), DELTA);
    }

    @Test
    public void squareRoot_False(){
        assertNotEquals("False: Square Root of number ", 1.0, calculator.squareRoot(20), DELTA);
        assertNotEquals("False: Square Root of number ", 1.0, calculator.squareRoot(-40), DELTA);
        assertNotEquals("False: Square Root of number ", 1.0, calculator.squareRoot(15), DELTA);
    }

    @Test
    public void factorial_True(){
        assertEquals("True: Factorial of number for True positive", 24.0, calculator.factorial(4), DELTA);
        assertEquals("True: Factorial of number for True positive", 362880.0, calculator.factorial(9), DELTA);
        assertEquals("True: Factorial of number for True positive", -1.0, calculator.factorial(-36), DELTA);
        assertEquals("True: Factorial of number for True positive", 3628800.0, calculator.factorial(10), DELTA);
    }

    @Test
    public void factorial_False(){
        assertNotEquals("False: Factorial of number for False positive", 1.0, calculator.factorial(7), DELTA);
        assertNotEquals("False: Factorial of number for False positive", 1.0, calculator.factorial(15), DELTA);
        assertNotEquals("False: Factorial of number for False positive", 1.0, calculator.factorial(-6), DELTA);


    }

    @Test
    public void naturalLog_True(){
        assertEquals("True: Factorial of number for True positive", 6.907755278982137, calculator.naturalLog(1000), DELTA);
        assertEquals("True: Factorial of number for True positive", 13.579592002661323, calculator.naturalLog(789845), DELTA);
        assertEquals("True: Factorial of number for True positive", Double.NaN, calculator.naturalLog(-100), DELTA);
    }

    @Test
    public void naturalLog_False(){
        assertNotEquals("False: Factorial of number for False positive", 1,calculator.naturalLog(84616), DELTA);
        assertNotEquals("False: Factorial of number for False positive", 1,calculator.naturalLog(661656), DELTA);
        assertNotEquals("False: Factorial of number for False positive", 1, calculator.naturalLog(-33265), DELTA);
    }

    @Test
    public void mypower_True(){
        assertEquals("True: Factorial of number for True positive", 243.0, calculator.pow(3, 5), DELTA);
        assertEquals("True: Factorial of number for True positive", 1296,  calculator.pow(6,4), DELTA);
        assertEquals("True: Factorial of number for True positive", Double.NaN,  calculator.pow(-22,0.256), DELTA);
    }

    @Test
    public void mypower_False(){
        assertNotEquals("False: Factorial of number for False positive", 1.0,  calculator.pow(124, 2), DELTA);
        assertNotEquals("False: Factorial of number for False positive", 1.0, calculator.pow(84,62), DELTA);
        assertNotEquals("False: Factorial of number for False positive", 1.0, calculator.pow(-73,45), DELTA);
    }

}
