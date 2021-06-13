package assignment2.ex32;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Miguel Nobrega
 */

/*
Exercise 32 - Guess the Number Game
Write a Guess the Number game that has three levels of difficulty.
The first level of difficulty would be a number between 1 and 10.
The second difficulty set would be between 1 and 100. The third difficulty set would be between 1 and 1000.
Prompt for the difficulty level, and then start the game.
The computer picks a random number in that range and prompts the player to guess that number.
Each time the player guesses, the computer should give the player a hint as to whether the number is too high or too low.
The computer should also keep track of the number of guesses. Once the player guesses the correct number,
the computer should present the number of guesses and ask if the player would like to play again.

Example Output
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
Challenges
Map the number of guesses taken to comments:
1 guess: “You’re a mind reader!”
2–4 guesses: “Most impressive.”
3–6 guesses: “You can do better than that.”
7 or more guesses: “Better luck next time.”
Keep track of previous guesses and issue an alert that the user has already guessed that number. Count this as a wrong guess.
Implement this as a graphical game with a grid of numbers. When a number is clicked or tapped, remove the number from the screen.
*/

import java.util.Scanner;

public class App
{
    private static final Scanner in = new Scanner(System.in);
    static private Guesser guesser = new Guesser();
    static boolean done = true;
    static int guess;

    public static void main(String[] args)
    {
        App prog = new App();
        int difficulty;

        while(done) {
            difficulty = prog.getDifficulty("Enter difficulty level (1, 2 or 3): ");
            guesser.setRandomNumber(difficulty);

            guess = prog.getGuess("I have my number. What's your guess? ");

            prog.tryGuess(guess);


        }
    }

    //0 low. 1 high. 2 correct
    private void tryGuess(int guess) {
        int guessAssert = guesser.assertGuess(guess);
        switch (guessAssert) {
            case 0:
                guesser.madeGuess();
                System.out.println("Too low. Guess again: ");
                break;
            case 1:
                guesser.madeGuess();
                System.out.println("Too high. Guess again: ");
                break;
            case 2:
                guesser.madeGuess();
                System.out.println("You got it in "+guesser.getGuess()+" guesses!");
                break;
            default:
                guesser.madeGuess();
                System.out.println("Invalid numeric value has been entered.");
                break;
        }

    }

    private int getDifficulty(String prompt)
    {
        String difficulty;
        while (true) {
            difficulty = promptUser(prompt);
            try {
                int num = Integer.parseInt(difficulty);
                if (num == 1 || num == 2 || num == 3) {
                    return num;
                }
            } catch (Exception e) {
                System.out.println("Sorry, thats not a valid input.");
                continue;
            }
            System.out.println("Sorry, thats not a valid input.");
        }
    }

    private int getGuess(String prompt)
    {
        String difficulty;
        while (true) {
            difficulty = promptUser(prompt);
            try {
                int num = Integer.parseInt(difficulty);
                if (num > 0) {
                    return num;
                }
            } catch (Exception e) {
                System.out.println("Sorry, thats not a valid input.");
                continue;
            }
            System.out.println("Sorry, thats not a valid input.");
        }
    }

    private String promptUser(String prompt)
    {
        System.out.print(prompt);
        return in.nextLine();
    }
}
