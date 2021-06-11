package assignment2.ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest
{

    @Test
    void calculateMonthsToPay()
    {
        //Given
        Calculator test = new Calculator(5000, 12, 100);
        int result = test.calculateMonthsUntilPaidOff();

        //expected
        int expected = 70;

        assertEquals(expected, result);
    }
}