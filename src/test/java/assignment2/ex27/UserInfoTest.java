package assignment2.ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserInfoTest
{

    @Test
    void checkFirstName_true()
    {
        //Given...
        UserInfo test = new UserInfo();
        test.checkFirstName("Miguel");

        //When "Miguel", expected 0
        int result = test.getFirstNameFlag();
        int expected = 0;

        assertEquals(expected, result);
    }

    @Test
    void checkFirstName_oneChar()
    {
        //Given...
        UserInfo test = new UserInfo();
        test.checkFirstName("j");

        //When "j", expected 2
        int result = test.getFirstNameFlag();
        int expected = 2;

        assertEquals(expected, result);
    }

    @Test
    void checkEmpID_badID()
    {
        //Given...
        UserInfo test = new UserInfo();
        test.checkEmpID("Painful");

        //When "Painful", expected 1
        int result = test.getEmpIDFlag();
        int expected = 1;

        assertEquals(expected, result);
    }

    @Test
    void checkEmpID_goodID()
    {
        //Given...
        UserInfo test = new UserInfo();
        test.checkEmpID("AB-3245");

        //When "AB-3245", expected 0
        int result = test.getEmpIDFlag();
        int expected = 0;

        assertEquals(expected, result);
    }

    @Test
    void checkZIP_goodZip()
    {
        UserInfo test = new UserInfo();
        test.checkZIP("34761");

        //When "34761", expected 0
        int result = test.getZIPflag();
        int expected = 0;

        assertEquals(expected, result);
    }

    @Test
    void checkZIP_badZip()
    {
        UserInfo test = new UserInfo();
        test.checkZIP("3476ABC");

        //When "34761ABC", expected 1
        int result = test.getZIPflag();
        int expected = 1;

        assertEquals(expected, result);
    }
}