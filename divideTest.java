package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class divideTest {

    @Test
    public void testDivideByNumber() {
        JunitTesting test = new JunitTesting();
        int numerator = 25;
        int denominator = 5;
        double output;
        if (denominator == 0) {
        	Exception exception = assertThrows(ArithmeticException.class, () -> test.divide(numerator, denominator));
        	assertEquals("Denominator cannot be zero", exception.getMessage());
        } else {
        	output = test.divide(numerator, denominator);
        	assertEquals(5, output);
        	System.out.println("Test 3 Successful");
        }
    }

}