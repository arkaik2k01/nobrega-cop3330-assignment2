package assignment2.ex27;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Miguel Nobrega
 */

/*
Write a program that prompts for a first name, last name, employee ID, and ZIP code. Ensure that the input is valid according to these rules:
The first name must be filled in.
The last name must be filled in.
The first and last names must be at least two characters long.
An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
The ZIP code must be a number.

Constraints
Create a function for each type of validation you need to write. Then create a validateInput function that takes in all of the input data and invokes the specific validation functions.
Use a single output statement to display the outputs.
*/

public class UserInfo
{
    int firstNameFlag = 0, lastNameFlag = 0, empIDFlag = 0, ZIPflag = 0;

    //0 when good. 1 when empty. 2 when short. 3 when all
    public void checkFirstName(String name)
    {
        if (name.isEmpty())
            firstNameFlag = 1;
        if (name.length() < 2 && !name.isEmpty())
            firstNameFlag = 2;
        if(name.length() < 2 && name.isEmpty())
            firstNameFlag = 3;
    }

    //0 when good. 1 when empty. 2 when short. 3 when all
    public void checkLastName(String name)
    {
        if (name.isEmpty())
            lastNameFlag = 1;
        if (name.length() < 2 && !name.isEmpty())
            lastNameFlag = 2;
        if(name.length() < 2 && name.isEmpty())
            lastNameFlag = 3;
    }

    //0 when good. 1 when not a match
    public void checkEmpID(String empID)
    {
        if (empID.length() != 7) {
            empIDFlag++;
            return;
        }
        if (!(Character.isAlphabetic(empID.charAt(0)) && Character.isAlphabetic(empID.charAt(1)) && empID.charAt(2) == '-' && Character.isDigit(empID.charAt(4))
                && Character.isDigit(empID.charAt(5)) && Character.isDigit(empID.charAt(6)))) {
            empIDFlag++;
        }
    }

    //0 when good. 1 when not numeric
    public void checkZIP(String zip)
    {
        if(zip.isEmpty()) {
            ZIPflag++;
            return;
        }

        for (int i = 0; i < zip.length(); i++) {
            if (!(Character.isDigit(zip.charAt(i)))) {
                ZIPflag++;
                return;
            }
        }
    }


    public int getFirstNameFlag()
    {
        return firstNameFlag;
    }

    public int getLastNameFlag()
    {
        return lastNameFlag;
    }

    public int getEmpIDFlag()
    {
        return empIDFlag;
    }

    public int getZIPflag()
    {
        return ZIPflag;
    }

    public void setFirstNameFlag(int firstNameFlag)
    {
        this.firstNameFlag = firstNameFlag;
    }

    public void setLastNameFlag(int lastNameFlag)
    {
        this.lastNameFlag = lastNameFlag;
    }

    public void setEmpIDFlag(int empIDFlag)
    {
        this.empIDFlag = empIDFlag;
    }

    public void setZIPflag(int ZIPflag)
    {
        this.ZIPflag = ZIPflag;
    }
}
