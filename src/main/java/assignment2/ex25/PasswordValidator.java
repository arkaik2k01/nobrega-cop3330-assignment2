package assignment2.ex25;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Miguel Nobrega
 */

/*
Exercise 25 - Password Strength Indicator
Functions help you abstract away complex operations, but they also help you build reusable components.

Create a program that determines the complexity of a given password based on these rules:
A very weak password contains only numbers and is fewer than eight characters. +1
A weak password contains only letters and is fewer than eight characters. +1
A strong password contains letters and at least one number and is at least eight characters. +1
A very strong password contains letters, numbers, and special characters and is at least eight characters. +1

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

public class PasswordValidator
{
    private String pass;

    public PasswordValidator(String pass)
    {
        this.pass = pass;
    }

    public String getPass()
    {
        return pass;
    }

    /*
     * Not valid according to rules = 0
     * very weak = 1
     * weak = 2
     * strong = 3
     * very strong = 4
     */
    public int checkPasswordStrength(String pass)
    {
        if (pass.length() < 8) {
            if(isNumeric(pass))
                return 1;
            else if(isAlphabetic(pass))
                return 2;
        }
        if (pass.length() >= 8){
            if(isStrongPassword(pass))
                return 3;
            else if(isVeryStrongPassword(pass))
                return 4;
        }
        return 0;
    }

    public boolean isAlphabetic(String pass)
    {
        for (int i = 0; i < pass.length(); i++) {
            if (!Character.isAlphabetic(pass.charAt(i)))
                return false;
        }
        return true;
    }

    public boolean isNumeric(String pass)
    {
        for (int i = 0; i < pass.length(); i++) {
            if (!Character.isDigit(pass.charAt(i)))
                return false;
        }
        return true;
    }

    public boolean isStrongPassword(String pass)
    {
        boolean letter = false;
        boolean num = false;
        boolean specChars = false;

        for (int i = 0; i < pass.length(); i++) {
            if (Character.isAlphabetic(pass.charAt(i)))
                letter = true;
            if (Character.isDigit(pass.charAt(i)))
                num = true;
            if ((pass.charAt(i) >= 32 && pass.charAt(i) <= 47) || (pass.charAt(i) >= 58 && pass.charAt(i) <= 64) ||
                    (pass.charAt(i) >= 91 && pass.charAt(i) <= 96) || (pass.charAt(i) >= 123 && pass.charAt(i) <= 126))
                specChars = true;
        }

        return (letter && num && !specChars);
    }

    public boolean isVeryStrongPassword(String pass)
    {
        boolean letter = false;
        boolean num = false;
        boolean specChars = false;

        for (int i = 0; i < pass.length(); i++) {
            if (Character.isAlphabetic(pass.charAt(i)))
                letter = true;
            if (Character.isDigit(pass.charAt(i)))
                num = true;
            if ((pass.charAt(i) >= 32 && pass.charAt(i) <= 47) || (pass.charAt(i) >= 58 && pass.charAt(i) <= 64) ||
                    (pass.charAt(i) >= 91 && pass.charAt(i) <= 96) || (pass.charAt(i) >= 123 && pass.charAt(i) <= 126))
                specChars = true;
        }

        return (letter && num && specChars);
    }
}
