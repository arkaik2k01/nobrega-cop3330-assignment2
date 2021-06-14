package assignment2.ex36;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Miguel Nobrega
 */

/*
Exercise 36 - Computing Statistics
Statistics is important in our field. When measuring response times or rendering times,
it’s helpful to collect data so you can easily spot abnormalities.
For example, the standard deviation helps you determine which values are outliers and which values are within normal ranges.

Write a program that prompts for response times from a website in milliseconds.
It should keep asking for values until the user enters “done.”

The program should print the average time (mean), the minimum time, the maximum time, and the population standard deviation.

Example Output
Enter a number: 100
Enter a number: 200
Enter a number: 1000
Enter a number: 300
Enter a number: done
Numbers: 100, 200, 1000, 300
The average is 400.0
The minimum is 100
The maximum is 1000
The standard deviation is 353.55

Constraints
Use functions called average, max, min, and std, which take in a list of numbers and return the results.
Use loops and arrays to perform the input and mathematical operations.
Be sure to exclude the "done" entry from the inputs.
Be sure to properly ignore any invalid inputs.
Keep the input separate from the processing and the output.
Challenges
Have the program read in numbers from an external file instead of prompting for the values.
*/

import java.util.Scanner;

public class App
{
    static StatsCalculator pop = new StatsCalculator();
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        App prog = new App();
        //Loop and get response time until done
        prog.getResponseTime();
        //Print results
        pop.printList();
        prog.printResult("The average is", pop.getAverage());
        prog.printResult("The minimum is", pop.getMin());
        prog.printResult("The maximum is", pop.getMax());
        prog.printResult("The standard deviation is", pop.getStdDeviation());

    }


    public void getResponseTime()
    {
        String input = "";
        while (!input.equalsIgnoreCase("done")) {
            input = getNumber();
            try {
                if (input.equalsIgnoreCase("done")) {
                    return;
                }
                pop.addToList(Integer.parseInt(input));
                continue;
            } catch (Exception e) {
                System.out.println("Sorry, that's not a valid input.");
                continue;
            }
        }
    }

    private String getNumber()
    {
        String input;
        System.out.print("Enter a number: ");
        input = in.nextLine();
        return input;
    }

    private void printResult(String prompt, int num)
    {
        System.out.println(prompt + " " + num);
    }

    private void printResult(String prompt, double num)
    {
        System.out.println(prompt + " " + num);
    }
}

