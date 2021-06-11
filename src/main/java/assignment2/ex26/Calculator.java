package assignment2.ex26;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Miguel Nobrega
 */

/*
The formula for this is
n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
where
    n is the number of months.
    i is the daily rate (APR divided by 365).
    b is the balance.
    p is the monthly payment.
 */

public class Calculator
{
    private double balance, apr, monthlyPayment;

    public Calculator(double balance, double apr, double monthlyPayment)
    {
        this.balance = balance;
        this.apr = apr / 100;
        this.monthlyPayment = monthlyPayment;
    }

    public int calculateMonthsUntilPaidOff()
    {
        return (int) Math.ceil(-(1.0 / 30.0) * Math.log10(1 + this.balance / this.monthlyPayment * (1 - Math.pow(1 + (this.apr / 365.0), 30.0))) / Math.log10(1 + (this.apr / 365.0)));
    }
}
