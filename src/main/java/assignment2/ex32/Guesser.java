package assignment2.ex32;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Miguel Nobrega
 */

/*
The first level of difficulty would be a number between 1 and 10.
The second difficulty set would be between 1 and 100.
The third difficulty set would be between 1 and 1000.

Let's play Guess the Number!

Enter the difficulty level (1, 2, or 3): 1
I have my number. What's your guess? 5
Too low. Guess again: 7
Too low. Guess again: 9
You got it in 3 guesses!

Do you wish to play again (Y/N)? y

Constraints
Don’t allow any non-numeric data entry.
During the game, count non-numeric entries as wrong guesses.
*/

public class Guesser
{
    private int keyNumber; //NUMBER TO GUESS
    private int guess = 0; //Number of guesses

    public int setRandomNumber(int difficulty)
    {
        if (difficulty == 1)
            this.keyNumber = (int) (Math.random() * (10) + 1);
        if (difficulty == 2)
            this.keyNumber = (int) (Math.random() * (100) + 1);
        if (difficulty == 3)
            this.keyNumber = (int) (Math.random() * (1000) + 1);
        return 0;
    }

    //0 low. 1 higher. 2 correct
    public int assertGuess(int guess)
    {
        if (guess < keyNumber) {
            return 0;
        }
        if (guess > keyNumber) {
            return 1;
        }
        if (guess == keyNumber) {
            return 2;
        }
        return 3;
    }

    public int getKeyNumber()
    {
        return keyNumber;
    }

    public void setKeyNumber(int keyNumber)
    {
        this.keyNumber = keyNumber;
    }

    public void setGuess(int guess)
    {
        this.guess = guess;
    }

    public int getGuess()
    {
        return guess;
    }

    public void madeGuess()
    {
        this.guess++;
    }
}
