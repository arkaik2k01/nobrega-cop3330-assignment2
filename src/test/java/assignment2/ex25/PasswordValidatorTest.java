package assignment2.ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest
{

    @Test
    void checkPasswordStrength_veryWeak()
    {
        //given
        PasswordValidator test = new PasswordValidator("1234");

        //When 1234, expected 1
        int result = test.checkPasswordStrength("1234");
        int expceted = 1;

        assertEquals(expceted, result);
    }

    @Test
    void checkPasswordStrength_weak()
    {
        //given
        PasswordValidator test = new PasswordValidator("abcd");

        //When abcd, expected 2
        int result = test.checkPasswordStrength("abcd");
        int expceted = 2;

        assertEquals(expceted, result);
    }

    @Test
    void checkPasswordStrength_strong()
    {
        //given
        PasswordValidator test = new PasswordValidator("qwertyui12");

        //When qwertyui12, expected 3
        int result = test.checkPasswordStrength("qwertyui12");
        int expceted = 3;

        assertEquals(expceted, result);
    }

    @Test
    void checkPasswordStrength_veryStrong()
    {
        //given
        PasswordValidator test = new PasswordValidator("qwertyui12@");

        //When qwertyui12@, expected 4
        int result = test.checkPasswordStrength("@!#qwertyui192");
        int expceted = 4;

        assertEquals(expceted, result);
    }
}