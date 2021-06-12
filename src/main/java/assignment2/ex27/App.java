package assignment2.ex27;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Miguel Nobrega
 */

/*
Exercise 27 - Validating Inputs
Large functions aren’t very usable or maintainable. It makes a lot of sense to break down the logic of a program into smaller functions that do one thing each.
The program can then call these functions in sequence to perform the work.

Write a program that prompts for a first name, last name, employee ID, and ZIP code. Ensure that the input is valid according to these rules:
The first name must be filled in.
The last name must be filled in.
The first and last names must be at least two characters long.
An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
The ZIP code must be a number.
Display appropriate error messages on incorrect data.
--------------------
Example Output
Enter the first name: J
Enter the last name:
Enter the ZIP code: ABCDE
Enter the employee ID: A12-1234
The first name must be at least 2 characters long.
The last name must be at least 2 characters long.
The last name must be filled in.
The employee ID must be in the format of AA-1234.
The zipcode must be a 5 digit number.
------- Or --------
Enter the first name: John
Enter the last name: Johnson
Enter the ZIP code: 55555
Enter the employee ID: TK-4321
There were no errors found.
-------------------
Constraints
Create a function for each type of validation you need to write. Then create a validateInput function that takes in all of the input data and invokes the specific validation functions.
Use a single output statement to display the outputs.
Challenges
Use regular expressions to validate the input.
Implement this as a GUI application or web application that gives immediate feedback when the fields lose focus.
Repeat the process if the input is not valid.
*/

import java.util.Scanner;

public class App
{
    private static final Scanner in = new Scanner(System.in);
    private static UserInfo validate = new UserInfo();

    public static void main(String[] args)
    {
        App prog = new App();

        String name = prog.getInput("Enter the first name: ");
        String lastName = prog.getInput("Enter the last name: ");
        String zipCode = prog.getInput("Enter the ZIP code: ");
        String employeeID = prog.getInput("Enter the employee ID: ");

        validate.checkFirstName(name);
        validate.checkLastName(lastName);
        validate.checkZIP(zipCode);
        validate.checkEmpID(employeeID);
    }

    private String getInput(String prompt)
    {
        System.out.print(prompt);
        return in.nextLine();
    }
    
    private void validateInput() {
        if(validate.getFirstNameFlag() == 0 && validate.getLastNameFlag() == 0 && validate.getZIPflag() == 0 && validate.getEmpIDFlag() == 0)
        {
            System.out.println("There were no errors found");
            return;
        }

        validateFirstName();
        validateLastName();
        validateZIP();
        validateID();
    }

    private void validateFirstName()
    {
        //0 when good. 1 when empty. 2 when short. 3 when all
        if(validate.getFirstNameFlag() == 1)
        {
            System.out.println("First name must be filled in.");
        }
        if(validate.getFirstNameFlag() == 2)
        {
            System.out.println("The First name must be at least two characters long");
        }
        if (validate.getFirstNameFlag() == 3)
        {
            System.out.println("First name must be filled in.");
            System.out.println("The first name must be at least two characters long");
        }
    }

    private void validateLastName()
    {
        //0 when good. 1 when empty. 2 when short. 3 when all
        if(validate.getLastNameFlag() == 1)
        {
            System.out.println("Last name must be filled in.");
        }
        if(validate.getLastNameFlag() == 2)
        {
            System.out.println("The last name must be at least two characters long");
        }
        if (validate.getLastNameFlag() == 3)
        {
            System.out.println("Last name must be filled in.");
            System.out.println("The last name must be at least two characters long");
        }
    }

    private void validateZIP()
    {
        if(validate.getZIPflag() == 1)
            System.out.println("Zip code must be a 5 digit number");
    }

    private void validateID()
    {
        if(validate.getEmpIDFlag() == 1)
            System.out.println("The employee ID must be in the format of AA-1234.");
    }
}
