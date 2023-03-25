package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class divideNegTest {

    @Test
    public void testDivideByZero() {
        JunitTesting test = new JunitTesting();
        int numerator = 25;
        int denominator = 0;
        double output;
        if (denominator == 0) {
        	Exception exception = assertThrows(ArithmeticException.class, () -> test.divide(numerator, denominator));
        	assertEquals("Denominator cannot be zero", exception.getMessage());
        	System.out.println("Test 2 Successful");
        } else {
        	output = test.divide(numerator, denominator);
        	assertEquals(0,output);
        }
    }

}