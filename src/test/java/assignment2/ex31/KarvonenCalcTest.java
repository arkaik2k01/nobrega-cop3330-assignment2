package assignment2.ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KarvonenCalcTest
{

    @Test
    void getTargetHeartRate()
    {
        //Given...
        KarvonenCalc test = new KarvonenCalc(65, 22);

        //When restHR 65 and age 22 and intensity 60, expected...
        double expected = 145;
        double result = test.getTargetHeartRate(60);

        assertEquals(expected,result, 0.0001);
    }

    @Test
    void getTargetHeartRate_2()
    {
        //Given...
        KarvonenCalc test = new KarvonenCalc(65, 22);

        //When restHR 65 and age 22 and intensity 65, expected...
        double expected = 151;
        double result = test.getTargetHeartRate(65);

        assertEquals(expected,result, 0.0001);
    }
}