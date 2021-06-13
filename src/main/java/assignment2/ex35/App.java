package assignment2.ex35;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Miguel Nobrega
 */

/*
Exercise 35 - Picking a Winner
Arrays don’t have to be hard-coded. You can take user input and store it in an array and then work with it.

Create a program that picks a winner for a contest or prize drawing. Prompt for names of contestants until the user leaves the entry blank.
Then randomly select a winner.

Example Output
Enter a name: Homer
Enter a name: Bart
Enter a name: Maggie
Enter a name: Lisa
Enter a name: Moe
Enter a name:
The winner is... Maggie.

Constraints
Use a loop to capture user input into an array.
Use a random number generator to pluck a value from the array.
Don’t include a blank entry in the array.
Some languages require that you define the length of the array ahead of time. You may need to find another data structure, like an ArrayList.

Challenges
When a winner is chosen, remove the winner from the list of contestants and allow more winners to be chosen.
Make a GUI program that shows the array of names being shuffled on the screen before a winner is chosen.
Create a separate contest registration application. Use this program to pull in all registered users and pick a winner.
*/

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App
{
    static boolean done = true;
    static App prog = new App();
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();
        String input;

        prog.getAllNames(names);

        System.out.print("The winner is... " + prog.decideWinner(names) +"!");
    }

    private static void getAllNames(ArrayList<String> names)
    {
        String input;
        while(done) {
            input = prog.getName();
            if(input.isEmpty()) {
                done = false;
                break;
            }
            names.add(input);
        }
    }

    private String decideWinner(ArrayList<String> names)
    {
        Random rand = new Random();
        return names.get(rand.nextInt(names.size()));
    }

    private String getName()
    {
        System.out.print("Enter a name: ");
        return in.nextLine();
    }
}
