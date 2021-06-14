package assignment2.ex36;

import java.util.ArrayList;

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

public class StatsCalculator
{
    private ArrayList<Integer> numList = new ArrayList<Integer>();
    private int max;
    private int min;
    private double stdDeviation;
    private double average;

    public ArrayList<Integer> getNumList()
    {
        return numList;
    }

    public int getMax()
    {
        setMax();
        return max;
    }

    public int getMin()
    {
        setMin();
        return min;
    }

    public double getStdDeviation()
    {
        setStdDeviation();
        return stdDeviation;
    }

    public double getAverage()
    {
        setAverage();
        return average;
    }

    public void addToList(int num)
    {
        this.numList.add(num);
    }

    public void setMax()
    {
        this.max = this.numList.get(0);
        for (int i = 1; i < this.numList.size(); i++) {
            if (this.numList.get(i) > this.max) {
                this.max = this.numList.get(i);
            }
        }
    }

    public void setMin()
    {
        this.min = this.numList.get(0);
        for (int i = 1; i < this.numList.size(); i++) {
            if (this.numList.get(i) < this.min) {
                this.min = this.numList.get(i);
            }
        }
    }

    public void setAverage()
    {
        this.average = 0;
        for (int i = 0; i < this.numList.size(); i++) {
            this.average += this.numList.get(i);
        }
        this.average = this.average / (double) this.numList.size();
    }

    public void setStdDeviation()
    {
        int sum = 0;
        for (int i = 0; i < this.numList.size(); i++) {
            sum += this.numList.get(i);
        }
        this.stdDeviation = Math.sqrt((Math.pow(sum - this.average, 2) / this.numList.size() - 1));
    }

    public void printList()
    {
        System.out.print("The numbers are: ");
        for (int i = 0; i < numList.size(); i++) {
            System.out.print(numList.get(i) +" ");
        }
        System.out.print("\n");
    }

}
