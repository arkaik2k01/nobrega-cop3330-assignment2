package assignment2.ex32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuesserTest
{
    @Test
    void setRandomNumber()
    {
        //Given
        Guesser test = new Guesser();
        int difficulty = 3;
        test.setRandomNumber(difficulty);

        //When difficulty 3, expected keyNumber between 1 and 1000 inclusive
        if (test.getKeyNumber() >= 1 && test.getKeyNumber() <= 1000) {
            return;
        } else {
            fail();
        }
    }

    @Test
    void assertGuess()
    {
        //Given
        Guesser test = new Guesser();
        int difficulty = 3;
        test.setRandomNumber(difficulty);
        int guess = test.getKeyNumber();

        //When guessed correct number, expected 2
        int expected = 2;
        int result = test.assertGuess(guess);

        assertEquals(expected, result);

    }
}