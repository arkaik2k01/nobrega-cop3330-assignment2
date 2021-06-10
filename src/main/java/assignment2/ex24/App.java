package assignment2.ex24;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Miguel Nobrega
 */

/*
Using functions to abstract the logic away from the rest of your code makes it easier to read and easier to maintain.
Create a program that compares two strings and determines if the two strings are anagrams. The program should prompt for
both input strings and display the output as shown in the example that follows.

Example Output
Enter two strings and I'll tell you if they are anagrams:
Enter the first string: note
Enter the second string: tone
"note" and "tone" are anagrams.

Constraints
Implement the program using a function called isAnagram, which takes in two words as its arguments and returns true or
false. Invoke this function from your main program.
Check that both words are the same length.
Challenge
Complete this program without using built-in language features. Use selection or repetition logic instead
and develop your own algorithm.
*/

import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App prog = new App();

        String str1 = prog.getStrings("Enter the first string: ");
        String str2 = prog.getStrings("Enter the second string: ");

        Anagrams anagram = new Anagrams(str1, str2);

        prog.printOutput(anagram);
    }

    private void printOutput(Anagrams anagram) {
        if(anagram.isAnagram())
        {
            System.out.println("\""+ anagram.getStr1() +"\" and \""+ anagram.getStr2() +"\" are anagrams.");
        }
        else
        {
            System.out.println("\""+ anagram.getStr1() +"\" and \""+ anagram.getStr2() +"\" are not anagrams.");
        }
    }

    private String getStrings(String prompt)
    {
        System.out.print(prompt);
        return in.nextLine();
    }
}
