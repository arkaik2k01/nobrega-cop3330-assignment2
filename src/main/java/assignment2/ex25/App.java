package assignment2.ex25;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Miguel Nobrega
 */

/*
Exercise 25 - Password Strength Indicator
Functions help you abstract away complex operations, but they also help you build reusable components.

Create a program that determines the complexity of a given password based on these rules:
A very weak password contains only numbers and is fewer than eight characters.
A weak password contains only letters and is fewer than eight characters.
A strong password contains letters and at least one number and is at least eight characters.
A very strong password contains letters, numbers, and special characters and is at least eight characters.

Example Output
The password '12345' is a very weak password.
The password 'abcdef' is a weak password.
The password 'abc123xyz' is a strong password.
The password '1337h@xor!' is a very strong password.

Constraints
Create a passwordValidator function that takes in the password as its argument and returns a value you can evaluate to determine the password strength.
Do not have the function return a string—you may need to support multiple languages in the future.
Use a single output statement.
Challenge
Create a GUI application or web application that displays graphical feedback as well as text feedback in real time. As someone enters a password, determine its strength and display the result
*/

import java.util.Scanner;

public class App
{
    private static final Scanner in = new Scanner(System.in);


    public static void main(String[] args)
    {
        App prog = new App();

        String password = prog.getPassword();
        PasswordValidator passwordCheck = new PasswordValidator(password);

        System.out.println(prog.checkPasswordStrength(passwordCheck.checkPasswordStrength(password), password));
    }

    private String getPassword()
    {
        System.out.print("Enter your password: ");
        return in.next();
    }

    private String checkPasswordStrength(int value, String password)
    {
        switch(value) {
            case 0:
                return ("Invalid. Cannot evaluate strength according to rules given");
            case 1:
                return ("The password '"+ password +"' is a very weak password");
            case 2:
                return ("The password '"+ password +"' is a weak password");
            case 3:
                return ("The password '"+ password +"' is a strong password");
            case 4:
                return ("The password '"+ password +"' is a very strong password");
        }

        return ("Invalid. Cannot evaluate strength according to rules given");
    }
}
