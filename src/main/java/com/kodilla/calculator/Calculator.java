package com.kodilla.calculator;

import org.springframework.boot.SpringApplication;

public class Calculator
{
    double number1;
    double number2;
    double result = 0;
    public void adding()
    {
        result = number1 + number2;
        System.out.println("It Works!");
    }

    public void subtraction()
    {
        result = number1 - number2;
        System.out.println("It Works!");
    }

    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();
        calculator.adding();
    }
}
